package com.Symphony;

import com.Symphony.master.LiberaryModule;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * @throws Exception 
	 */
	public void testApp() throws Exception {
		LiberaryModule lib = new LiberaryModule();

		lib.openApp("http://srssprojects.in/home.aspx");

		lib.adminLogin("Admin", "Admin");

		lib.addBranch("Madhapur1", "K Hills1", "50004", "INDIA", "Delhi",
				"Delhi");

		lib.addNewRole("Admin1", "E");

		lib.addEmp("anna", "anna@123", "Admin1", "Madhapur1");

		lib.logoutAndQuitBrowser();
		assertTrue(true);
	}
}
