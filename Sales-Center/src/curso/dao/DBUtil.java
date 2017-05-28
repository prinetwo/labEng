package curso.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static DBUtil instancia;
	private Connection con;
	
	private DBUtil() { 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static synchronized DBUtil instance() {
		if (instancia == null) {
			instancia = new DBUtil();
		}
		return instancia;
	}
	public Connection getConnection() { 
		return con;
	}

}
