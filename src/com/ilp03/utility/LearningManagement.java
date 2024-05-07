package com.ilp03.utility;

import java.util.Scanner;

//import com.ilp03.entity.StandardCustomer;
import com.ilp03.service.AssesmentServiceImp;
//import com.ilp03.service.CustomerServices;
import com.ilp03.service.EmployeeServiceImp;
import com.ilp03.service.InsertMarkImp;

public class LearningManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		char goToMainMenu ='y';
		
		
		
		do
		{
			System.out.print("1.Enter Trainee Marks \n2.View Trainee details in a program \n3.Display All Employees\nEnter a choice : ");
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1 :InsertMarkImp insertmarkimp = new InsertMarkImp();
			        insertmarkimp.insertdata();
			        break;
			case 2 :AssesmentServiceImp assesmentservice = new AssesmentServiceImp();
			        assesmentservice.getAssesmentDetails();
			        break;
			case 3 :EmployeeServiceImp employeeservice = new EmployeeServiceImp();
			        employeeservice.getAllEmployees();
			        break;
						
			default :System.out.println("Wrong Choice !!!");
			    
			}
			System.out.println("\nGo back to main menue (y/n) : " );
			goToMainMenu=scanner.next().charAt(0);
			
		}
		while(goToMainMenu == 'y');


	}

}
