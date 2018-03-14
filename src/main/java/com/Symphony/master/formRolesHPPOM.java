package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class formRolesHPPOM {
	@FindBy(id = "lstRtypeN")
	WebElement roleTypeDD;

	@FindBy(id = "txtRname")
	WebElement rName;

	@FindBy(id = "btninsert")
	WebElement rSubmitBtn;

	public void enterRoleType(String roleT) {
		roleTypeDD.sendKeys(roleT);
	}

	public void clickOnSubmitBTN() {
		rSubmitBtn.click();

	}

	public void enterText(String roleName) {
		rName.sendKeys(roleName);
		
	}
}
