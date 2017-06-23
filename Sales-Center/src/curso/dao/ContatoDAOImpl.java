package curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso.entity.Contato;


public class ContatoDAOImpl implements ContatoDAO{

	@Override
	public void adicionar(Contato c) {
		Connection con = DBUtil.instance().getConnection();
		String sql = "INSERT INTO TB_Contato (id_Contato, nome, nascimento, cpf, telefone, celular, email) "
					+ "VALUES (1, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  c.getNome());
			stmt.setString(2,  c.getNascimento());
			stmt.setString(3,  c.getCpf());
			stmt.setString(4,  c.getTelefone());
			stmt.setString(5,  c.getCelular());
			stmt.setString(6,  c.getEmail());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Contato> pesquisarPorCpf(String cpf) {
		List<Contato> contatos = new ArrayList<Contato>();
		Connection con = DBUtil.instance().getConnection();
		String sql = "SELECT * FROM TB_Contato WHERE cpf like ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  "%" + cpf + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { 
				Contato c = new Contato();
				stmt.setString(1,  c.getNome());
				stmt.setString(2,  c.getNascimento());
				stmt.setString(3,  c.getCpf());
				stmt.setString(4,  c.getTelefone());
				stmt.setString(5,  c.getCelular());
				stmt.setString(6,  c.getEmail());
				contatos.add( c );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contatos;
	}
}
