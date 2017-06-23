package curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso.entity.Endereco;

public class EnderecoDAOImpl implements EnderecoDAO{

	@Override
	public void adicionar(Endereco l) {
		Connection con = DBUtil.instance().getConnection();
		String sql = "INSERT INTO TB_Endereco (id_Endereco, cep, rua, numero, complemento1, complemento2, cidade, estado, bairro) "
					+ "VALUES (1, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  l.getCep());
			stmt.setString(2,  l.getRua());
			stmt.setString(3,  l.getNumero());
			stmt.setString(4,  l.getComplemento1());
			stmt.setString(5,  l.getComplemento2());
			stmt.setString(6,  l.getCidade());
			stmt.setString(7,  l.getEstado());
			stmt.setString(8,  l.getBairro());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<Endereco> pesquisarPorCep(String cep) {
		List<Endereco> enderecos = new ArrayList<Endereco>();
		Connection con = DBUtil.instance().getConnection();
		String sql = "SELECT * FROM TB_Endereco WHERE cep like ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  "%" + cep + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { 
				Endereco l = new Endereco();
				stmt.setString(1,  l.getCep());
				stmt.setString(2,  l.getRua());
				stmt.setString(3,  l.getNumero());
				stmt.setString(4,  l.getComplemento1());
				stmt.setString(5,  l.getComplemento2());
				stmt.setString(6,  l.getCidade());
				stmt.setString(7,  l.getEstado());
				stmt.setString(8,  l.getBairro());
				enderecos.add( l );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return enderecos;
	}

}
