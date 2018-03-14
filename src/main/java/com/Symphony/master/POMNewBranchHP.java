package com.Symphony.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class POMNewBranchHP {

	@FindBy(id = "BtnNewBR")
	WebElement newBranchBTN;

	public void clickOnNewBranchBtn() {
		newBranchBTN.click();
	}

	@FindBy(id = "txtbName")
	WebElement bName;

	@FindBy(id = "txtAdd1")
	WebElement bAddres;
	
	@FindBy(id = "txtZip")
	WebElement bZip;
	
	@FindBy(id = "lst_counrtyU")
	WebElement bCountry;
	
	@FindBy(id = "lst_stateI")
	WebElement bState;
	
	@FindBy(id = "lst_cityI")
	WebElement bCity;
	
	@FindBy(id = "btn_insert")
	WebElement bSubmit;
	
	public void EnterBranchName(String branchName) {
		bName.sendKeys(branchName);
	}
	
	public void EnterAddress(String address1) {
		bAddres.sendKeys(address1);
	}
	
	public void EnterZip(String zipCode) {
		bZip.sendKeys(zipCode);
	}
	
	public void selectCountry(String CountryVisibleText) {
		Select country = new Select(bCountry);
		country.selectByVisibleText(CountryVisibleText);
	}
	
	public void selectState(String stateVisibleText) {
		Select state = new Select(bState);
		state.selectByVisibleText(stateVisibleText);
	}

	public void selectCity(String cityVisibleText) {
		Select city = new Select(bCity);
		city.selectByVisibleText(cityVisibleText);
	}
	
	public void clickBranchSubmitBtn() {
		bSubmit.click();
	}
}
