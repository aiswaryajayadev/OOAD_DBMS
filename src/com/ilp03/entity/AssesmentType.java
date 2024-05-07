package com.ilp03.entity;

import java.sql.Date;

public class AssesmentType {

	private int id;
	private String assesmentName;
	private Date assesmentDate;
	private Employee createdBy;
	private Employee updatedBy;
	public AssesmentType(int id, String assesmentName, Date assesmentDate, Employee createdBy, Employee updatedBy) {
		super();
		this.id = id;
		this.assesmentName = assesmentName;
		this.assesmentDate = assesmentDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssesmentName() {
		return assesmentName;
	}
	public void setAssesmentName(String assesmentName) {
		this.assesmentName = assesmentName;
	}
	public Date getAssesmentDate() {
		return assesmentDate;
	}
	public void setAssesmentDate(Date assesmentDate) {
		this.assesmentDate = assesmentDate;
	}
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
	public Employee getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
}
