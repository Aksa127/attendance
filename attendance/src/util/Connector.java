package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connector {
	private final String USERNAME = ""; // default is "root"
	private final String PASSWORD = ""; // default is ""
	private final String HOST = ""; // default is localhost:3306; port number may vary
	private final String DATABASE = ""; // name of database
	private final String CONNECTION = String.format("jdbc:mysql://%s/%s", HOST, DATABASE);
	
	private static Connector instance = null;
	private static Connection conn;
	
	private Connector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connector getInstance() {
		if (instance == null) {
			instance = new Connector();
		}
		
		return instance;
	}
	
	// TODO implement CRUD functionality
}