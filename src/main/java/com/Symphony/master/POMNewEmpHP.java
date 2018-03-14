package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class POMNewEmpHP {
	
	@FindBy(id = "BtnNew")
	WebElement newEmpBTN;

	public void clickOnNewEmpBtn() {
		newEmpBTN.click();
	}
	
	@FindBy(id = "txtUname")
	WebElement empName;
	
	@FindBy(id = "txtLpwd")
	WebElement empPwd;
	
	@FindBy(id = "lst_Roles")
	WebElement empRoles;
	
	@FindBy(id = "lst_Branch")
	WebElement empBranch;
	
	@FindBy(id = "BtnSubmit")
	WebElement empSubmitBtn;
	
	public void enterEmpName(String employeeName) {
		empName.sendKeys(employeeName);
	}
	
	public void enterEmployeeName(String ePwd) {
		empPwd.sendKeys(ePwd);
	}
	
	public void selectRole(String roleVisibleText) {
		Select role = new Select(empRoles);
		role.selectByVisibleText(roleVisibleText);
	}
	
	public void selectBranch(String branchVisibleText) {
		Select branch = new Select(empBranch);
		branch.selectByVisibleText(branchVisibleText);
	}

	public void submitEmpButton() {
		empSubmitBtn.click();
	}

}
