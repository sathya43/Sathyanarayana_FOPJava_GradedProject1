package com.gl.gradedassessment.Controller;

import com.gl.gradedassessment.Models.Departments.AdminDepartment;
import com.gl.gradedassessment.Models.Departments.HrDepartment;
import com.gl.gradedassessment.Models.Departments.TechDepartment;
import com.gl.gradedassessment.Services.DisplayService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		DisplayService displayService = new DisplayService();
		
		AdminDepartment admin = new AdminDepartment();
		displayService.printFunctionality(admin);
		          
		
		HrDepartment hr = new HrDepartment();
		displayService.printFunctionality(hr);
		
		
		TechDepartment tech = new TechDepartment();
		displayService.printFunctionality(tech);
		

	}

}
