package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMLogoutandQuitBro {
	@FindBy(xpath = "//a[@href='home.aspx']")
	WebElement logout;
	
	public void logout(){
		logout.click();
	}

}
