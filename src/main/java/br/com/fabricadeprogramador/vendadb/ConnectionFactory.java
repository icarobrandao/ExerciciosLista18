package br.com.fabricadeprogramador.vendadb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/vendadb" ,"postgres" , "postgres");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}
}
