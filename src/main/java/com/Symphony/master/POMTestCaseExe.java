package com.Symphony.master;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class POMTestCaseExe {

	public static void main(String[] args) {
		String URL = "http://srssprojects.in/home.aspx";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		//pageFactory method
		POMLoginHP login = PageFactory.initElements(driver, POMLoginHP.class);
		POMLogoutandQuitBro logoutandQuitBro = PageFactory.initElements(driver, POMLogoutandQuitBro.class);
		POMKeximBankHP homepageButton = PageFactory.initElements(driver, POMKeximBankHP.class);
		POMNewBranchHP newBranchCreate	= PageFactory.initElements(driver, POMNewBranchHP.class);
		
		/*
		 * adding test case
		*/
		
		//Login with Admin
		login.userName("Admin");
		login.password("Admin");
		login.loginBtn();
		
		//click on BranchButton
		homepageButton.clickOnBranchBtn();
		
		//Fill Form of Branch Button/ Create new branch
		newBranchCreate.clickOnNewBranchBtn();
		newBranchCreate.EnterBranchName("Madhapur1");
		newBranchCreate.EnterAddress("K Hills1");
		newBranchCreate.EnterZip("50004");
		newBranchCreate.selectCountry("INDIA");
		newBranchCreate.selectState("Delhi");
		newBranchCreate.selectCity("Delhi");
		newBranchCreate.clickBranchSubmitBtn();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Logout
		logoutandQuitBro.logout();
		
		driver.quit();
		
	}

}
