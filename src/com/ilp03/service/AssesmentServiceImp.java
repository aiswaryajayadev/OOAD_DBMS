package com.ilp03.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.ProgramsDao;
import com.ilp03.entity.Assesment;

public class AssesmentServiceImp implements AssesmentService {

	
	public void getAssesmentDetails() {
		// TODO Auto-generated method stub
		Connection connection;
		try {
		connection = ProgramsDao.getConnection();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Program ID : ");
		int status = scanner.nextInt();
		ArrayList<Assesment> programList = ProgramsDao.getProgramDetail(connection,status);
		System.out.println("+--------------+--------------+------------------+-------------------+--------------------+--------------------+-------------------+-------------------+");
		System.out.println("|Trainee Id    | Trainee Name |   Trainer Name   | Remarks           | Program Name       |Assesment Name      | Overall Result    | Pass/Fail Status  |");
		System.out.println("+--------------+--------------+------------------+-------------------+--------------------+--------------------+-------------------+-------------------+");

		for (Assesment program : programList) {
		    System.out.printf("|%-13s |%-12s  |%-16s  |%-18s |%-19s |%-19s |%-18s |%-16s   |\n",
                    program.getId(),
                   
		            program.getTraineeId().getEmployeeFirstname(),
		            program.getTrainerId().getEmployeeFirstname(),
		            program.getRemarks(),
		            program.getProgramId().getProgramName(),
		            program.getAssesmentId().getAssesmentName(),
		            program.getOverallResult(),
		            program.getPassFailStatus()		            
		    		);
		}

		System.out.println("+--------------+-------------+-------------------+-------------------+--------------------+--------------------+-------------------+-------------------+");

		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
