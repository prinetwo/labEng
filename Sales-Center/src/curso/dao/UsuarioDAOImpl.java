package curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso.entity.Usuario;


public class UsuarioDAOImpl implements UsuarioDAO{

	@Override
	public void adicionar(Usuario u) {
		Connection con = DBUtil.instance().getConnection();
		String sql = "INSERT INTO quarto (id, numero, tipo, descricao, preco, area) "
					+ "VALUES (1, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  u.getNome());
			stmt.setString(2,  u.getUsuario());
			stmt.setString(3,  u.getSenha());
			stmt.setString(4,  u.getEmail());
			stmt.setString(5,  u.getPerfil());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Usuario> pesquisarPorUsuario(String usuario) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Connection con = DBUtil.instance().getConnection();
		String sql = "SELECT * FROM contato WHERE usuario like ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  "%" + usuario + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { 
				Usuario u = new Usuario();
				stmt.setString(1,  u.getNome());
				stmt.setString(2,  u.getUsuario());
				stmt.setString(3,  u.getSenha());
				stmt.setString(4,  u.getEmail());
				stmt.setString(5,  u.getPerfil());
				usuarios.add( u );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
}
