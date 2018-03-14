package com.Symphony.master;

public class ModuleDrivenTestCase {

	public static void main(String[] args) throws Exception {
		ModuleDrivenLiberary lib = new ModuleDrivenLiberary();
		
		lib.openApp("http://srssprojects.in/home.aspx");
		
		lib.adminLogin("Admin", "Admin");
		
		lib.addBranch("Madhapur1", "K Hills1", "50004", "INDIA", "Delhi", "Delhi");
		
		lib.addNewRole("Admin1", "E");
		
		lib.addEmp("anna", "anna@123", "Admin1", "Madhapur1");
		
		lib.logoutAndQuitBrowser();

	}

}
