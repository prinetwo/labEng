package curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import curso.entity.Quarto;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public void adicionar(Quarto q) {
		Connection con = DBUtil.instance().getConnection();
		String sql = "INSERT INTO quarto (id, numero, tipo, descricao, preco, area) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1,  q.getId());
			stmt.setString(2,  q.getNumero());
			stmt.setString(3,  q.getTipo());
			stmt.setString(4,  q.getDescricao());
			stmt.setDouble(5,  q.getPreco());
			stmt.setDouble(6,  q.getArea());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Quarto> pesquisarPorNumero(String numero) {
		List<Quarto> quartos = new ArrayList<Quarto>();
		Connection con = DBUtil.instance().getConnection();
		String sql = "SELECT * FROM quarto WHERE numero like ?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,  "%" + numero + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { 
				Quarto q = new Quarto();
				q.setId(rs.getLong("id"));
				q.setNumero(rs.getString("numero"));
				q.setDescricao(rs.getString("descricao"));
				q.setTipo(rs.getString("tipo"));
				q.setPreco(rs.getDouble("preco"));
				q.setArea(rs.getDouble("area"));
				quartos.add( q );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return quartos;
	}

}
