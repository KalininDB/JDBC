package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import utility.DBUtility;

public class ResultSet_and_dateStructure {
	
	public static void main(String[] args) throws SQLException {
		
		
		ResultSet result = DBUtility.getResult("Select * from employees");
		List <String> EmployeeNames = new ArrayList<>();
		while(result.next()) {
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			String fullname = firstName+" "+lastName;
			EmployeeNames.add(fullname);		
		}
		System.out.println(EmployeeNames);
		
		System.out.println(EmployeeNames.contains("Steven King"));
	
	
	}

}
