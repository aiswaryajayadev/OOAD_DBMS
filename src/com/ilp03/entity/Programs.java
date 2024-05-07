package com.ilp03.entity;

import java.sql.Date;

public class Programs {

	private int id;
	private String programName;
	private String duration;
	private Date startDate;	
	private Date endDate;
	private Employee courseCreatedBy;
	private Employee updatedBy;
	
	public Programs(int id, String programName, String duration, Date startDate, Date endDate, Employee courseCreatedBy,
			Employee updatedBy) {
		super();
		this.id = id;
		this.programName = programName;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseCreatedBy = courseCreatedBy;
		this.updatedBy = updatedBy;		
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Employee getCourseCreatedBy() {
		return courseCreatedBy;
	}

	public void setCourseCreatedBy(Employee courseCreatedBy) {
		this.courseCreatedBy = courseCreatedBy;
	}

	public Employee getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
}
