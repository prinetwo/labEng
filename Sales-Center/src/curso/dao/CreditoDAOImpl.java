package curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso.entity.Contato;
import curso.entity.Credito;

public class CreditoDAOImpl implements CreditoDAO{

	@Override
	public void adicionar(Credito c) {
		Connection con = DBUtil.instance().getConnection();
		String sql = "INSERT INTO TB_Credito (id_Credito, plano, quantidade, responsavel, nome) "
					+ "VALUES (1, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  c.getPlano());
			stmt.setInt(2,  c.getQuantidade());
			stmt.setString(3,  c.getResponsavel());
			stmt.setString(4,  c.getNome());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Credito> pesquisarPorNome(String nome) {
		List<Credito> creditos = new ArrayList<Credito>();
		Connection con = DBUtil.instance().getConnection();
		String sql = "SELECT * FROM TB_Credito WHERE nome like ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  "%" + nome + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { 
				Credito c = new Credito();
				stmt.setString(1,  c.getPlano());
				stmt.setInt(2,  c.getQuantidade());
				stmt.setString(3,  c.getResponsavel());
				stmt.setString(4,  c.getNome());
				creditos.add( c );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return creditos;
	}

}
