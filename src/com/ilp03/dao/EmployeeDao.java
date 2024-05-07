package com.ilp03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
import java.util.ArrayList;

//import com.ilp03.entity.AccountService;
import com.ilp03.entity.Employee;


public class EmployeeDao {
	public static Connection getConnection()
	{
		String connectionString="jdbc:mysql://localhost:3306/learning_mngmnt_db?useSSL=false";
		String username="root";
		String password ="aiswarya";
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(connectionString,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
 
	public void closeConnection(Connection connection)
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Employee> getAllEmployee(Connection connection)
	{
		Statement statement;
		ArrayList<Employee> employeeList = new ArrayList<Employee> ();
		try {
			statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employee");
			while(resultset.next())
			{
				int id = resultset.getInt(1);
				String employeeFirstName = resultset.getString(2);
				String employeeLastName = resultset.getString(8);
				String employeeEmail = resultset.getString(3);
				
				Date joinDate = resultset.getDate(5);
				long employeePhnumber= resultset.getLong(4);
				
				
				Employee employee = new Employee(id,employeeFirstName,employeeLastName,employeeEmail,
						employeePhnumber,null,null,joinDate);
				employeeList.add(employee);



			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}
}
