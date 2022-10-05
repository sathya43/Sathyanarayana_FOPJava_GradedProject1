package com.gl.gradedassessment.Models;

public class AdminDepartment extends SuperDepartment {
	
	public AdminDepartment() {
		super("Admin Department");
	}

	@Override
	public String departmentName() {
		return this.departmentName;
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	


}
