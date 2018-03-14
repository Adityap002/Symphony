package com.Symphony.master;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LiberaryModule {
	public static WebDriver driver;
	public static Alert alert;

	public void openApp(String URL) {
		driver = new FirefoxDriver();

		// maximize Browser
		driver.manage().window().maximize();

		// Open URL
		// String URL = "http://srssprojects.in/home.aspx";
		driver.get(URL);

		System.out.println("Open URL");
	}

	public void adminLogin(String uName, String pwd) {
		driver.findElement(By.id("txtuId")).sendKeys(uName);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
	}

	public void addBranch(String bName, String bAddress, String bZip,
			String CDD, String SDD, String CIDD) throws Exception {
		// Branch click to see branch details
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']"))
				.click();
		
		Thread.sleep(2000);

		// Add new branch
		driver.findElement(By.id("BtnNewBR")).click();
		Thread.sleep(1000);

		// File Branch form
		driver.findElement(By.id("txtbName")).sendKeys(bName);
		driver.findElement(By.id("txtAdd1")).sendKeys(bAddress);
		driver.findElement(By.id("txtZip")).sendKeys(bZip);

		Select countryDD = new Select(driver.findElement(By.id("lst_counrtyU")));
		countryDD.selectByVisibleText(CDD);
		Thread.sleep(1000);
		Select stateDD = new Select(driver.findElement(By.id("lst_stateI")));
		stateDD.selectByVisibleText(SDD);
		Thread.sleep(1000);
		Select cityDD = new Select(driver.findElement(By.id("lst_cityI")));
		cityDD.selectByVisibleText(CIDD);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(1000);

		alert = driver.switchTo().alert();
		alert.accept();

		// Click on home page
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']")).click();
		Thread.sleep(1000);
	}

	public void addNewRole(String rName, String rRoleType) throws Exception {
		// Click on Roles button
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']"))
				.click();
		Thread.sleep(2000);

		// Click on new Roles Button
		driver.findElement(By.id("btnRoles")).click();
		Thread.sleep(1000);

		// Fill new Roles form
		driver.findElement(By.id("txtRname")).sendKeys(rName);

		Thread.sleep(1000);
		Select roletypeDD = new Select(driver.findElement(By.id("lstRtypeN")));
		roletypeDD.selectByVisibleText(rRoleType);
		driver.findElement(By.id("btninsert")).click();
		Thread.sleep(1000);

		alert = driver.switchTo().alert();
		alert.accept();

		// Click on home page
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']")).click();
		Thread.sleep(1000);

	}

	public void addEmp(String eName, String ePwd, String eRole, String eBranch) throws InterruptedException {
		// Click on Employee
		driver.findElement(By.xpath("//a[@href='Admin_Emp_details.aspx']"))
				.click();
		Thread.sleep(1000);

		// Click on New Emp
		driver.findElement(By.id("BtnNew")).click();

		// Fill New emp form
		driver.findElement(By.id("txtUname")).sendKeys(eName);
		driver.findElement(By.id("txtLpwd")).sendKeys(ePwd);
		Thread.sleep(1000);
		Select roleDD = new Select(driver.findElement(By.id("lst_Roles")));
		roleDD.selectByVisibleText(eRole);
		Thread.sleep(1000);
		Select branchDD = new Select(driver.findElement(By.id("lst_Branch")));
		branchDD.selectByVisibleText(eBranch);
		driver.findElement(By.id("BtnSubmit")).click();
		Thread.sleep(1000);

		alert = driver.switchTo().alert();
		alert.accept();

	}

	public void logoutAndQuitBrowser() {
		// Logout with admin
		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();

		// Quit browser
		driver.quit();

	}
}
