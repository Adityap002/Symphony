package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEmpHPPOM {
	@FindBy(id = "BtnNew")
	WebElement newEmpBTN;

	public void clickOnNewEmpBtn() {
		newEmpBTN.click();
	}
}
