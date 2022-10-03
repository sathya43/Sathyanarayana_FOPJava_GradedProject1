package com.gl.gradedassessment.Models;

public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		super("HR Department");
	}
	
	@Override
	public String departmentName() {
		return this.departmentName;
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
	
	/*
	 * This method is used to display all the functionalities available for HR Department class
	 */
	public void displayAllFunctionalities() {
		System.out.println("Welcome to " + this.departmentName());
		System.out.println(this.doActivity());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(this.isTodayAHoliday());
		System.out.println();
	}

}
