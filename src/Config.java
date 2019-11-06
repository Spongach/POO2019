import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import config.Conn;

public class Config {
	
	public static void main(String[] args) {
		
		
		//  SET GLOBAL time_zone = '-3:00';
		
		Connection conn = Conn.getConnection();
		
		try {
		    PreparedStatement preparedStatement = conn.prepareStatement("show databases");
		    ResultSet resultSet = preparedStatement.executeQuery();
		    while (resultSet.next()) {
		    	String name =  resultSet.getString("DATABASE");
		    	System.out.println(name);
		    }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		    
	}

}
	