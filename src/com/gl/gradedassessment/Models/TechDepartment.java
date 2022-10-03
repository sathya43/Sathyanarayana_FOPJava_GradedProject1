package com.gl.gradedassessment.Models;

public class TechDepartment extends SuperDepartment {
	
	public TechDepartment() {
		super("Tech Department");
	}
	
	@Override
	public String departmentName() {
		return this.departmentName;
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}
	

	
}
