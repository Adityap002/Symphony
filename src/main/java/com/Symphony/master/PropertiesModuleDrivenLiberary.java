package com.Symphony.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertiesModuleDrivenLiberary {
	public static WebDriver driver;
	public static Alert alert;
	public static FileInputStream fis;
	public static Properties prop;

	public void openApp() throws IOException {

		String filepath = "C:\\Users\\aditya.p\\git\\Symphony\\src\\main\\java\\com\\Symphony\\properties\\Symphony.properties";

		prop = new Properties();
		fis = new FileInputStream(filepath);

		prop.load(fis);
		driver = new FirefoxDriver();

		// maximize Browser
		driver.manage().window().maximize();

		// Open URL
		
		driver.get(prop.getProperty("URL"));

		System.out.println("Open URL");
	}

	public void adminLogin(String uName, String pwd) throws IOException {

		driver.findElement(By.id(prop.getProperty("username"))).sendKeys(uName);
		driver.findElement(By.id(prop.getProperty("userpassword"))).sendKeys(
				pwd);
		driver.findElement(By.id(prop.getProperty("loginBtn"))).click();
	}

	public void addBranch(String bName, String bAddress, String bZip,
			String CDD, String SDD, String CIDD) throws Exception {
		// Branch click to see branch details
		driver.findElement(By.xpath(prop.getProperty("branchBTN")))
				.click();

		Thread.sleep(2000);

		// Add new branch
		driver.findElement(By.id(prop.getProperty("newBranchBTN"))).click();
		Thread.sleep(1000);

		// File Branch form
		driver.findElement(By.id(prop.getProperty("bName"))).sendKeys(bName);
		driver.findElement(By.id(prop.getProperty("bAddres"))).sendKeys(bAddress);
		driver.findElement(By.id(prop.getProperty("bZip"))).sendKeys(bZip);

		Select countryDD = new Select(driver.findElement(By.id(prop.getProperty("bCountry"))));
		countryDD.selectByVisibleText(CDD);
		Thread.sleep(1000);
		Select stateDD = new Select(driver.findElement(By.id(prop.getProperty("bState"))));
		stateDD.selectByVisibleText(SDD);
		Thread.sleep(1000);
		Select cityDD = new Select(driver.findElement(By.id(prop.getProperty("bCity"))));
		cityDD.selectByVisibleText(CIDD);
		driver.findElement(By.id(prop.getProperty("bSubmit"))).click();
		Thread.sleep(1000);

		alert = driver.switchTo().alert();
		alert.accept();

		// Click on home page
		driver.findElement(By.xpath(prop.getProperty("homePage"))).click();
		Thread.sleep(1000);
	}

	public void addNewRole(String rName, String rRoleType) throws Exception {
		// Click on Roles button
		driver.findElement(By.xpath(prop.getProperty("roleBtn")))
				.click();
		Thread.sleep(2000);

		// Click on new Roles Button
		driver.findElement(By.id(prop.getProperty("newRoleBTN"))).click();
		Thread.sleep(1000);

		// Fill new Roles form
		driver.findElement(By.id(prop.getProperty("rName"))).sendKeys(rName);

		Thread.sleep(1000);
		Select roletypeDD = new Select(driver.findElement(By.id(prop.getProperty("roleTypeDD"))));
		roletypeDD.selectByVisibleText(rRoleType);
		driver.findElement(By.id(prop.getProperty("rSubmitBtn"))).click();
		Thread.sleep(1000);

		alert = driver.switchTo().alert();
		alert.accept();

		// Click on home page
		driver.findElement(By.xpath(prop.getProperty("homePage"))).click();
		Thread.sleep(1000);

	}

	public void addEmp(String eName, String ePwd, String eRole, String eBranch)
			throws InterruptedException {
		// Click on Employee
		driver.findElement(By.xpath(prop.getProperty("empBtn")))
				.click();
		Thread.sleep(1000);

		// Click on New Emp
		driver.findElement(By.id(prop.getProperty("newEmpBTN"))).click();

		// Fill New emp form
		driver.findElement(By.id(prop.getProperty("empName"))).sendKeys(eName);
		driver.findElement(By.id(prop.getProperty("empPwd"))).sendKeys(ePwd);
		Thread.sleep(1000);
		Select roleDD = new Select(driver.findElement(By.id(prop.getProperty("empRoles"))));
		roleDD.selectByVisibleText(eRole);
		Thread.sleep(1000);
		Select branchDD = new Select(driver.findElement(By.id(prop.getProperty("empBranch"))));
		branchDD.selectByVisibleText(eBranch);
		driver.findElement(By.id(prop.getProperty("empSubmitBtn"))).click();
		Thread.sleep(1000);

		alert = driver.switchTo().alert();
		alert.accept();

	}

	public void logoutAndQuitBrowser() {
		// Logout with admin
		driver.findElement(By.xpath(prop.getProperty("Logout"))).click();

		// Quit browser
		driver.quit();

	}
}
