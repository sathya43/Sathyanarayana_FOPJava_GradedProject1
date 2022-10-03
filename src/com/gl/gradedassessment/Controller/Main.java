package com.gl.gradedassessment.Controller;

import com.gl.gradedassessment.Models.AdminDepartment;
import com.gl.gradedassessment.Models.HrDepartment;
import com.gl.gradedassessment.Models.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin = new AdminDepartment();
		admin.displayAllFunctionalities();
		
		HrDepartment hr = new HrDepartment();
		hr.displayAllFunctionalities();
		
		
		TechDepartment tech = new TechDepartment();
		tech.displayAllFunctionalities();

	}

}
