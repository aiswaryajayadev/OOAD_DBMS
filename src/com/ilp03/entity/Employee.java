package com.ilp03.entity;

import java.sql.Date;

public class Employee {
	private int id;
	private String employeeFirstname;
	private String employeeLastName;
	private String employeeEmail;
	private long employeePhnumber;
	private Employee updatedBy;
	private Employee createdBy;
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
	private Date joinDate;
	public Employee(int id, String employeeFirstname, String employeeLastName, String employeeEmail,
			long employeePhnumber, Employee updatedBy, Employee createdBy, Date joinDate) {
		super();
		this.id = id;
		this.employeeFirstname = employeeFirstname;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
		this.employeePhnumber = employeePhnumber;
		this.updatedBy = updatedBy;
		this.createdBy = createdBy;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeFirstname() {
		return employeeFirstname;
	}
	public void setEmployeeFirstname(String employeeFirstname) {
		this.employeeFirstname = employeeFirstname;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeePhnumber() {
		return employeePhnumber;
	}
	public void setEmployeePhnumber(long employeePhnumber) {
		this.employeePhnumber = employeePhnumber;
	}
	public Employee getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
