package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRoleHPPOM {
	@FindBy(id = "btnRoles")
	WebElement newRoleBTN;

	public void clickOnNewRoleBtn() {
		newRoleBTN.click();
	}

}
