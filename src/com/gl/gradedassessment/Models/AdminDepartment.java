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
	
	/*
	 * This method is used to display all the functionalities available for Admin Department class
	 */
	public void displayAllFunctionalities() {
		System.out.println("Welcome to " + this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(this.isTodayAHoliday());
		System.out.println();
	}

}
