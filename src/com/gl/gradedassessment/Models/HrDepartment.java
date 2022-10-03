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
	


}
