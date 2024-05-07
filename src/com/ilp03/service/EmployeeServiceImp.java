package com.ilp03.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.ilp03.dao.EmployeeDao;
import com.ilp03.entity.Employee;

public class EmployeeServiceImp implements EmployeeService {

	public void getAllEmployees() {
		// TODO Auto-generated method stub

		Connection connection;
		try {
			connection = EmployeeDao.getConnection();
			ArrayList<Employee> employeeList = EmployeeDao.getAllEmployee(connection);
			System.out.println("+------+-------------+---------------+-------------------------------+---------------+---------------+");
			System.out.println("|  ID  |  First Name |  Last Name    |             Email             |  Phn Number   |   Join Date   |");
			System.out.println("+------+-------------+---------------+-------------------------------+---------------+---------------+");

			for (Employee employee : employeeList) {
			    System.out.printf("| %-4s | %-11s | %-12s  | %-29s | %-13s | %-13s |\n",
				        employee.getId(), 
				        employee.getEmployeeFirstname(), 
				        employee.getEmployeeLastName(), 
				        employee.getEmployeeEmail(), 
				        employee.getEmployeePhnumber(), 
				        employee.getJoinDate());
				}
			System.out.println("+------+-------------+---------------+-------------------------------+---------------+---------------+");



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
