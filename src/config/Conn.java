package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conn {
	
	// add SET GLOBAL time_zone = '-3:00';
	
	private static java.sql.Connection conn = null;
	
	public static Connection getConnection() {
		
		if(conn == null) {
			
			try {
			    conn = DriverManager.getConnection("jdbc:mysql://localhost/garagem2","root","aluno");
			} catch (SQLException e) {
			    // handle any errors
			    System.out.println("SQLException: " + e.getMessage());
			    System.out.println("SQLState: " + e.getSQLState());
			    System.out.println("VendorError: " + e.getErrorCode());
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
			}
			
			return conn;
			
		} else {
			return conn;
		}
		
	}
	
}