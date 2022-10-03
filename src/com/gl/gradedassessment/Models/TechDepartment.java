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
	
	/*
	 * This method is used to display all the functionalities available for Tech Department class
	 */
	public void displayAllFunctionalities() {
		System.out.println("Welcome to " + this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(this.getTechStackInformation());
		System.out.println(this.isTodayAHoliday());
		System.out.println();
	}
	
}
