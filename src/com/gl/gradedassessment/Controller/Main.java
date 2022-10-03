package com.gl.gradedassessment.Controller;

import com.gl.gradedassessment.Models.AdminDepartment;
import com.gl.gradedassessment.Models.HrDepartment;
import com.gl.gradedassessment.Models.TechDepartment;
import com.gl.gradedassessment.Utilities.Utility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility utility = new Utility();
		
		AdminDepartment admin = new AdminDepartment();
		utility.getAdminClassFunctionalities(admin);
		
		
		HrDepartment hr = new HrDepartment();
		utility.getHRClassFunctionalities(hr);
		
		
		
		TechDepartment tech = new TechDepartment();
		utility.getTechClassFunctionalities(tech);
		

	}

}
