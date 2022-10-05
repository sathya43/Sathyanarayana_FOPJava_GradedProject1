package com.gl.gradedassessment.Utilities;

import com.gl.gradedassessment.Models.AdminDepartment;
import com.gl.gradedassessment.Models.HrDepartment;
import com.gl.gradedassessment.Models.TechDepartment;

/*
 * This class contains utility methods of classes that print out the available functionality 
 * for that corresponding class. Whenever new functionality added as part of classes. We 
 * can add that entry hear and verify the new functionality
 */
public class Utility {
	
	/*
	 * Prints all the functionality available for AdminDepartment Class
	 */
	public void displayAdminClassFunctionalities(AdminDepartment admin) {
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
	}
	
	/*
	 * Prints all the functionality available for HRDepartment Class
	 */
	public void displayHRClassFunctionalities(HrDepartment hr) {
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
	}
	
	/*
	 * Prints all the functionality available for TechDepartment Class
	 */
	public void displayTechClassFunctionalities(TechDepartment tech) {
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
	}

}
