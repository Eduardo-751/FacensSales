package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAL {
	private final String Drive = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/...";
	private final String User = "root";
	private final String Pass = "";

	public Connection getConnection() {
		try {
			Class.forName(Drive);
			return DriverManager.getConnection(URL, User, Pass);
		} catch (ClassNotFoundException | SQLException ex) {
			throw new RuntimeException("Erro na conexão", ex);
		}
	}

	public static void closeConnection(Connection con) {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
