package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import utility.DBUtility;

public class MetaDate {
	public static void main(String[] args) throws SQLException {
		
	
	System.out.println("User: "+DBUtility.metadata.getUserName());
	System.out.println("Version: "+DBUtility.metadata.getDriverVersion());
	System.out.println("Data Base Type: "+DBUtility.metadata.getDatabaseProductName());
	
	ResultSet rs = DBUtility.getResult("select * from employees");
	
	ResultSetMetaData resultData = rs.getMetaData();
	System.out.println(resultData.getColumnCount());
	System.out.println(resultData.getColumnName(7));
	
	System.out.println("__________");
	
	for (int i = 1;i<resultData.getColumnCount();i++) {
		System.out.println(resultData.getColumnName(i));
	}
	
	
	}
}
