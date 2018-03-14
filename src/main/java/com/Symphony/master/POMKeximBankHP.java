package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMKeximBankHP {

	@FindBy(xpath = "//a[@href='adminflow.aspx']")
	WebElement homePage;


	@FindBy(xpath = "//a[@href='admin_banker_master.aspx']")
	WebElement branchBTN;

	@FindBy(xpath = "//a[@href='Admin_Roles_details.aspx']")
	WebElement roleBtn;

	@FindBy(xpath = "//a[@href='Admin_Emp_details.aspx']")
	WebElement empBtn;

	@FindBy(xpath = "//a[@href='home.aspx']")
	WebElement Logout;

	public void clickOnHomePage() {
		homePage.click();
	}

	public void clickOnBranchBtn() {
		branchBTN.click();
	}

	public void clickOnRoleBtn() {
		roleBtn.click();
	}

	public void clickOnEmpBtn() {
		empBtn.click();
	}

	public void clickOnLogotBtn() {
		Logout.click();
	}

}
