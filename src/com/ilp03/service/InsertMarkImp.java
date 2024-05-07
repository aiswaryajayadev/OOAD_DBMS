package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.ilp03.dao.InsertDao;

public class InsertMarkImp implements InsertMark {

   
	public void insertdata() {
		// TODO Auto-generated method stub
		try (Connection connection = InsertDao.getConnection()) {
            // Instantiate InsertDao
            
            
            // Call the method in InsertDao to insert data into the database
            InsertDao.updateMarks(connection);

            
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
            e.printStackTrace();
        }
	}
}
