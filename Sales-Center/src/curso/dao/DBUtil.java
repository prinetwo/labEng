package curso.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static DBUtil instancia;
	private Connection con;
	
	private static String serverName = "localhost";
	private static String portNumber = "1521";
	private static String servico = "xe";
	private static String userName = "system";
	private static String password = "1234";

	private static String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + servico;

	
	
	private DBUtil() { 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userName, password);
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
