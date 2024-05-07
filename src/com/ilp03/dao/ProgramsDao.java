package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Scanner;

//import com.ilp03.entity.Account;
//import com.ilp03.entity.Customer;
import com.ilp03.entity.Assesment;
import com.ilp03.entity.AssesmentType;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Programs;

public class ProgramsDao {
	
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
	
	
	public static ArrayList<Assesment> getProgramDetail(Connection connection, int status) {
	    Statement statement;
	    ArrayList<Assesment> programList = new ArrayList<>();
	   // ArrayList <Employee> employeeList=new ArrayList<>();
	    ArrayList <AssesmentType> assesmenttypeList=new ArrayList<>();
	    ArrayList <Assesment> assesmentList=new ArrayList<>();
	    

	    try {
	    	statement = connection.createStatement();
	    	ResultSet resultset = statement.executeQuery("SELECT " +
	    	        "trainee.id AS trainee_id, "+
	    	        "trainee.employee_firstname AS trainee_name, " +
	    	        "trainer.employee_firstname AS trainer_name, " +
	    	        "remarks, programs.program_name, assesmentType.assesment_name, " + // Added a comma after assesment_name
	    	        "assesment.pass_fail_status, overall_result " +
	    	        "FROM " +
	    	        "assesment " +
	    	        "INNER JOIN " +
	    	        "programs ON assesment.program_id = programs.id " +
	    	        "INNER JOIN "+ // Added a space after INNER JOIN
	    	        "assesment_type AS assesmentType ON assesment.assesment_type = assesmentType.id "+ // Added AS keyword and spaces
	    	        "INNER JOIN " +
	    	        "employee AS trainee ON trainee.id = assesment.trainee_id " +
	    	        "INNER JOIN " +
	    	        "employee AS trainer ON trainer.id = assesment.trainer_id " +
	    	        "WHERE " +
	    	        "program_id = "+status+";");


	        while (resultset.next()) {
	        	int id = resultset.getInt("trainee_id");
	            String traineeName = resultset.getString("trainee_name");
	            String trainerName = resultset.getString("trainer_name");
	            String remarks = resultset.getString("remarks");
	            String programName = resultset.getString("program_name");
	            String assesmentName = resultset.getString("assesment_name");
	            String passFailStatus = resultset.getString("pass_fail_status");
	            int overallResult = resultset.getInt("overall_result");
	            

	            // Assuming you have necessary data to create Employee and AssesmentType objects
	            Employee createdBy = new Employee(overallResult, passFailStatus, passFailStatus, passFailStatus, overallResult, null,null, null/* fill in parameters for createdBy */);
	            Employee updatedBy = new Employee(overallResult, passFailStatus, passFailStatus, passFailStatus, overallResult, null, null, null/* fill in parameters for updatedBy */);
	            Employee traineeId = new Employee(overallResult, traineeName, passFailStatus, passFailStatus, overallResult, null, null, null/* fill in parameters for traineeId */);
	            Employee trainerId = new Employee(overallResult, trainerName, passFailStatus, passFailStatus, overallResult, null, null, null/* fill in parameters for trainerId */);

	            AssesmentType assesmentId = new AssesmentType(overallResult, assesmentName, null, trainerId, trainerId/* fill in parameters */);

	            Programs program = new Programs(overallResult, programName, null, null, null, createdBy, updatedBy);
	            Assesment assesment = new Assesment(id, traineeName,trainerName, remarks, overallResult,passFailStatus , program, traineeId, trainerId, traineeId, trainerId,assesmentId/* fill in parameters */);
	             // Set trainee name
	            programList.add(assesment);
	            //employeeList.addAll(overallResult, employeeList);
	            assesmenttypeList.add(assesmentId);
	            assesmentList.add(assesment);
	            
	        }

	    } catch (SQLException e) {
	        // Handle the exception appropriately
	        e.printStackTrace();
	    }

	    return programList;
	}


}
