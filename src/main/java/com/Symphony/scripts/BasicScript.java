package com.Symphony.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate browser
		WebDriver driver = new FirefoxDriver();

		// maximize Browser
		driver.manage().window().maximize();

		// Open URL
		String URL = "http://srssprojects.in/home.aspx";
		driver.get(URL);

		System.out.println("Open URL");

		/*
		 * below code is for Login with Admin
		*/
		// Login with admin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();

		Thread.sleep(2000);

		/*
		 * below code is for adding new branch details
		*/
		// Branch click to see branch details
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']"))
				.click();

		// Add new branch
		driver.findElement(By.id("BtnNewBR")).click();

		// File Branch form
		driver.findElement(By.id("txtbName")).sendKeys("Madhapur");
		driver.findElement(By.id("txtAdd1")).sendKeys("Kaveri Hills");
		driver.findElement(By.id("txtZip")).sendKeys("50003");

		Select countryDD = new Select(driver.findElement(By.id("lst_counrtyU")));
		countryDD.selectByVisibleText("INDIA");
		Select stateDD = new Select(driver.findElement(By.id("lst_stateI")));
		stateDD.selectByVisibleText("Delhi");
		Select cityDD = new Select(driver.findElement(By.id("lst_cityI")));
		cityDD.selectByVisibleText("Delhi");
		driver.findElement(By.id("btn_insert")).click();

		Alert a1 = driver.switchTo().alert();
		a1.accept();

		// Click on home page
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']")).click();
		
		/*
		 * below code is for adding new Roles
		*/

		// Click on Roles button
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']"))
				.click();

		// Click on new Roles Button
		driver.findElement(By.id("btnRoles")).click();

		// Fill new Roles form
		driver.findElement(By.id("txtRname")).sendKeys("Admin");

		Select roletypeDD = new Select(driver.findElement(By.id("lstRtypeN")));
		roletypeDD.selectByVisibleText("E");
		driver.findElement(By.id("btninsert")).click();

		a1.accept();

		// Click on home page
		driver.findElement(By.xpath("//a[@href='adminflow.aspx']")).click();
		
		/*
		 * below code is for adding new Employee
		*/

		// Click on Employee
		driver.findElement(By.xpath("//a[@href='Admin_Emp_details.aspx']"))
				.click();
		
		//Click on New Emp
		driver.findElement(By.id("BtnNew")).click();
		
		//Fill New emp form
		driver.findElement(By.id("txtUname")).sendKeys("anna");
		driver.findElement(By.id("txtLpwd")).sendKeys("anna@123");
		Select roleDD = new Select(driver.findElement(By.id("lst_Roles")));
		roleDD.selectByVisibleText("manager");
		Select branchDD = new Select(driver.findElement(By.id("lst_Branch")));
		branchDD.selectByVisibleText("1");
		driver.findElement(By.id("BtnSubmit")).click();
		
		a1.accept();

		// Logout with admin
		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();

		// Quit browser
		driver.quit();

	}

}
