package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class POMNewRoleHP {
	
	@FindBy(id = "btnRoles")
	WebElement newRoleBTN;
	
	public void clickOnNewRoleBtn() {
		newRoleBTN.click();
	}
	
	@FindBy(id = "txtRname")
	WebElement rName;

	@FindBy(id = "lstRtypeN")
	WebElement roleTypeDD;

	@FindBy(id = "btninsert")
	WebElement rSubmitBtn;
	
	public void enterRoleName(String roleName) {
		rName.sendKeys(roleName);
	}
	
	public void selectRoleType(String roletypeVisibleText) {
		Select roleType = new Select(roleTypeDD);
		roleType.selectByVisibleText(roletypeVisibleText);
	}

	public void submitRoleButton() {
		rSubmitBtn.click();
	}

}
