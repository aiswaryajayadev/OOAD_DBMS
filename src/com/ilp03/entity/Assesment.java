package com.ilp03.entity;

public class Assesment {

	private int id;
	private String remarks;
	private int overallResult;
	private String passFailStatus;
	private Programs programId;
	private Employee updatedBy;
	private Employee createdBy;
	private Employee traineeId;
	private Employee trainerId;
	private String trainerName;
	private String traineeName;
	
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTraineeName() {
		return traineeName;
	}
	private AssesmentType assesmentId;
	public Assesment(int id, String trainee_name, String trainer_name,String remarks,int overallResult, String passFailStatus, Programs programId,
			Employee updatedBy, Employee createdBy, Employee traineeId, Employee trainerId, AssesmentType assesmentId) {
		super();
		this.id = id;
		this.remarks = remarks;
		this.overallResult = overallResult;
		this.passFailStatus = passFailStatus;
		this.programId = programId;
		this.updatedBy = updatedBy;
		this.createdBy = createdBy;
		this.traineeId = traineeId;
		this.trainerId = trainerId;
		this.assesmentId = assesmentId;
		this.trainerName = trainerName;
		this.traineeName = traineeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getOverallResult() {
		return overallResult;
	}
	public void setOverallResult(int overallResult) {
		this.overallResult = overallResult;
	}
	public String getPassFailStatus() {
		return passFailStatus;
	}
	public void setPassFailStatus(String passFailStatus) {
		this.passFailStatus = passFailStatus;
	}
	public Programs getProgramId() {
		return programId;
	}
	public void setProgramId(Programs programId) {
		this.programId = programId;
	}
	public Employee getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Employee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}
	public Employee getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Employee traineeId) {
		this.traineeId = traineeId;
	}
	public Employee getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Employee trainerId) {
		this.trainerId = trainerId;
	}
	public AssesmentType getAssesmentId() {
		return assesmentId;
	}
	public void setAssesmentId(AssesmentType assesmentId) {
		this.assesmentId = assesmentId;
	}
	public void setTraineeName(String traineeName) {
		// TODO Auto-generated method stub
		
	}
	
	
}
