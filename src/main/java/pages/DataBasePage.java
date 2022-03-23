package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {

	String columnValue = null;
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	public String getData(String columnLabel) throws SQLException {
		
		try {
		//setting properties from mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/june2021";
			String sqlUsername = "root";
			String sqlPassword="root";
			String query = "select * from users";
			
			//create connection to local database
			 connection = DriverManager.getConnection(sqlUrl , sqlUsername,sqlPassword);
			//empowering the connection reference variable to execute the queries
			 statement = connection.createStatement();
			//delivering the query
			 rs = statement.executeQuery(query);
			while (rs.next()) {
			 columnValue = rs.getString(columnLabel);
				return columnValue;
			}
			
		}catch(Exception e) {
		e.printStackTrace();	
		}finally {
			if (rs !=null) {
				rs.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
		return columnValue;
		
		
	}
}
