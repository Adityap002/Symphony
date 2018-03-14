package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMLoginHP {

	@FindBy(id = "txtuId")
	WebElement username;

	@FindBy(id = "txtPword")
	WebElement userpassword;

	@FindBy(id = "login")
	WebElement loginBtn;

	public void userName(String uName) {
		username.sendKeys(uName);
	}

	public void password(String pwd) {
		userpassword.sendKeys(pwd);
	}

	public void loginBtn() {
		loginBtn.click();
	}

}
