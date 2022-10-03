package com.gl.gradedassessment.Models;

public class SuperDepartment {
	
	protected String departmentName;
	
	public SuperDepartment() {
		this.departmentName = "Super Department";
	}
	
	public SuperDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	public String departmentName() {
		return this.departmentName;
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
