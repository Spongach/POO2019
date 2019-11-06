import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.Conn;

public class Principal {

	public static void main(String[] args) {
		
		Connection conn = Conn.getConnection();
		
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("SHOW DATABASES;  ");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			
			while(resultSet.next()) {
					String name = resultSet.getString("DATABASE");
					
					System.out.println(name);
				}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		Principal principal = new Principal();
		principal.menu();
				

	}
	
	public void menu() {
		System.out.println("#__! Garagem Tabajara !__#");
	}

}
