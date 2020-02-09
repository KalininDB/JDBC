package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import utility.DBUtility;

public class ResultSet_Map {
	
	public static void main(String[] args) throws SQLException {
		ResultSet result = DBUtility.getResult("select * from employees");
		Map<String,Integer> EmployeeInfo = new LinkedHashMap<>();
		
		while (result.next()) {
			String firstName = result.getString("first_name");
			String lastname = result.getString("last_name");
			String fullname = firstName+" "+lastname;
			Integer salary = result.getInt("salary");
			
			EmployeeInfo.put(fullname, salary);
			
			if(salary==9000) {
				System.out.println(fullname);
			}
			
		}
		
		System.out.println(EmployeeInfo);
		
		System.out.println(EmployeeInfo.get("Steven King")==24000);
		
		String sql = "Update developers set name = 'Erhan' where name ='Madina'";
		
		
		
	}

}
