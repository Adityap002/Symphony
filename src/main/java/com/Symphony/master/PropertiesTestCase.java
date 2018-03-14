package com.Symphony.master;

public class PropertiesTestCase {

	public static void main(String[] args) throws Exception {
		PropertiesLiberaryModule propLib = new PropertiesLiberaryModule();
		
		propLib.openApp();
		
		propLib.adminLogin("Admin", "Admin");
		
		propLib.addBranch("Madhapur1", "K Hills1", "50004", "INDIA", "Delhi", "Delhi");
		
		propLib.addNewRole("Admin1", "E");
		
		propLib.addEmp("anna", "anna@123", "Admin1", "Madhapur1");
		
		propLib.logoutAndQuitBrowser();

	}

}
