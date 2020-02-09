package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sinmple_connection {
public static void main(String[] args) throws SQLException{
	String userName = "hr";
	String password = "hr";
	
	//jdbc:DataBaseType:thin@Host:port:SID
	String url = "jdbc:oracle:thin:@52.91.94.225:1521:xe";
	
	//Connection connection = DriverManager.getConnection(url,userName, password);
	Connection connection = DriverManager.getConnection(url, userName, password);;

	System.out.println("Connection done");
	
	//statement
			Statement statement = connection.createStatement();
			
			System.out.println("Statement created");
			
	//Result Set
		ResultSet result=	statement.executeQuery("Select * From employees");
			System.out.println("result set si completed succesfully");
			
}
}
