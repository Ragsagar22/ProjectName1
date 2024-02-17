package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage_POM {

	WebDriver driver;
	
	
	@FindBy(xpath = "//span[text()='Login']")
	WebElement login;

	@FindBy(xpath = "//p[@class=\"brand-hero-subtitle content--centered qa-brand-hero-subtitle\"]")
	WebElement community;

	@FindBy(xpath = "//a[text()='Terms and Conditions']")
	WebElement shiftSync;

	@FindBy(xpath = "//span[@style=\"width:100%; font-size:15px; font-weight:500!important\"]")
	WebElement askTheCom;

	@FindBy(xpath = "//h3[text()='Latest Conversations']")
	WebElement latCon;

	@FindBy(xpath = "//div[@class=\"event__date\"]")
	WebElement monDate;

	@FindBy(xpath = "//span[text()='Feedback']")
	WebElement feedBack;

	public FrontPage_POM() {

		PageFactory.initElements(driver, this);
	}




	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getCommunity() {
		return community;
	}

	public WebElement getShiftSync() {
		return shiftSync;
	}

	public WebElement getAskTheCom() {
		return askTheCom;
	}

	public WebElement getLatCon() {
		return latCon;
	}

	public WebElement getMonDate() {
		return monDate;
	}

	public WebElement getFeedBack() {
		return feedBack;
	}




	public void loginDisplayed() {
		login.isDisplayed();
	}

	public void communityDisplayed() {
		community.isDisplayed();

	}

	public void shiftSyncDisplayed() {
		shiftSync.isDisplayed();
	}

	public void askTheComDisplayed() {
		askTheCom.isDisplayed();
	}

	public void latConvoDisplayed() {
		latCon.isDisplayed();
	}

	public void monthDateDisplayed() {
		monDate.isDisplayed();
	}

	public void feedBackDisplayed() {
		feedBack.isDisplayed();
	}



























}
