

package jdbcPractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/Studentsdb";
	private static final String USER = "root";
	private static final String PASSWORD = "LepeliM@123";
	
	
	public static void main(String[] args) throws SQLException{
		
		Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
		
		System.out.println("Connected to MySQL successfully!");
		
		Statement statement = connection.createStatement();
		
		String sql = "SELECT * FROM students";
		String deleteSql = "DELETE FROM students WHERE id = 3";
		
		String updateSql = "UPDATE students SET course = 'Advanced Java' WHERE id = 2";
		
		int rowsUpdated = statement.executeUpdate(updateSql);
		
		System.out.println("Rows updated: " + rowsUpdated);
		int rowsDeleted = statement.executeUpdate(deleteSql);
		
		System.out.println("Rows deleted: " + rowsDeleted);
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
		    System.out.println(resultSet.getInt("id"));
		    System.out.println(resultSet.getString("name"));
		    System.out.println(resultSet.getString("course"));
		    
		}
		resultSet.close();
		statement.close();
		connection.close();
	}

}
