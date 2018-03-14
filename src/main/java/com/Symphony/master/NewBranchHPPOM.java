package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewBranchHPPOM {
	@FindBy(id = "txtbName")
	WebElement bName;

	public void clickOnNewBranchBtn() {
		bName.click();
	}
}
