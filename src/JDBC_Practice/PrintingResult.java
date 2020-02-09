package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeSet;

public class PrintingResult {

	public static void main(String[] args) throws SQLException {
		
		String userName = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@52.91.94.225:1521:xe";

		Connection connection = DriverManager.getConnection(url, userName, password);

		Statement statement = connection.createStatement();

		ResultSet result = statement.executeQuery("Select * From employees");
		
		while (result.next()) {
			//String firstName = result.getString("first_name");
			
			String firstName = result.getString(2);
			String lastname = result.getString(3);
			int salary = result.getInt("salary");
			
			System.out.println(firstName+" "+lastname+" salary: $"+salary);
			
			
			
		}

	}

	
}
