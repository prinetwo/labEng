package curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso.entity.Credito;
import curso.entity.Faturamento;
import curso.entity.Faturamento;

public class FaturamentoDAOImpl implements FaturamentoDAO{

	@Override
	public void adicionar(Faturamento f) {
		Connection con = DBUtil.instance().getConnection();
		String sql = "INSERT INTO TB_Faturamento (id_Faturamento, formaPagamento, dataVencimento, canalDeVendas, responsavel, produto) "
					+ "VALUES (1, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  f.getFormaPagamento());
			stmt.setString(2,  f.getDataVencimento());
			stmt.setString(3,  f.getCanalDeVendas());
			stmt.setString(4,  f.getResponsavel());
			stmt.setString(5,  f.getProduto());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Faturamento> pesquisarPorProduto(String faturamento) {
		List<Faturamento> faturamentos = new ArrayList<Faturamento>();
		Connection con = DBUtil.instance().getConnection();
		String sql = "SELECT * FROM TB_Faturamento WHERE produto like ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  "%" + faturamento + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { 
				Faturamento f = new Faturamento();
				stmt.setString(1,  f.getFormaPagamento());
				stmt.setString(2,  f.getDataVencimento());
				stmt.setString(3,  f.getCanalDeVendas());
				stmt.setString(4,  f.getResponsavel());
				stmt.setString(5,  f.getProduto());
				faturamentos.add( f );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return faturamentos;
	}

}
