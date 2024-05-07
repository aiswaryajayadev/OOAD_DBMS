package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.entity.Assesment;


public class InsertDao {
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
	
	public static void updateMarks(Connection connection) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Trainee ID: ");
        int traineeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Program ID: ");
        int programId = scanner.nextInt();

        System.out.print("Enter New Overall Marks: ");
        int newMarks = scanner.nextInt();
        
        String newStatus = (newMarks > 59) ? "pass" : "fail";

        String sql = "UPDATE assesment SET overall_result = ?, pass_fail_status = ? WHERE trainee_id = ? AND program_id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, newMarks);
            statement.setString(2, newStatus);
            statement.setInt(3, traineeId);
            statement.setInt(4, programId);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Assessment data updated successfully!");
            } else {
                System.out.println("No matching record found for the provided trainee ID and program ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
