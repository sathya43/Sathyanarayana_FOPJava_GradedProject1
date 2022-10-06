package com.gl.gradedassessment.Services;

import com.gl.gradedassessment.Models.AdminDepartment;
import com.gl.gradedassessment.Models.HrDepartment;
import com.gl.gradedassessment.Models.TechDepartment;
import com.gl.gradedassessment.Utilities.Utility;

/*
 * This is a service class that is used to print the output to the output stream by calling the utility methods
 * 
 * The printFunctionality( ) is overloaded for different objects.
 */
public class DisplayService {
	
	Utility utility = new Utility();
	
    	public void printFunctionality(AdminDepartment admin) {
		        utility.displayAdminClassFunctionalities(admin);
	}

        public void printFunctionality(HrDepartment hr) {
		        utility.displayHRClassFunctionalities(hr);
	}
    
        public void printFunctionality(TechDepartment tech) {
    	        utility.displayTechClassFunctionalities(tech);
        }
}
