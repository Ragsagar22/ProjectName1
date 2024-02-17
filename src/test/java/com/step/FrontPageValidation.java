package com.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.projectmanager.ProjectManager;

import io.cucumber.java.en.*;

public class FrontPageValidation extends BaseClass  {
	
	ProjectManager manager = new ProjectManager();
	WebDriver driver;
	
	
 
	@Given("Browser is open")
	public void browser_is_open() {
		
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	@When("user is on the front page")
	public void user_is_on_the_front_page() {
		loadUrl();
		
				
	}
	@When("Verify login field is displayed")
	public void verify_login_field_is_displayed() {
		
	
	
	}
	@When("Verify the community for developers, testers & devOps specialists is displayed")
	public void verify_the_community_for_developers_testers_dev_ops_specialists_is_displayed() {
		
	}
	@When("Verify shiftsync terms and conditions are displayed")
	public void verify_shiftsync_terms_and_conditions_are_displayed() {
		
	}
	@When("verify ask the community is displayed")
	public void verify_ask_the_community_is_displayed() {
		
	}
	@When("Verify latest conversations displayed")
	public void verify_latest_conversations_displayed() {
		
	}
	@When("Verify month date displayed")
	public void verify_month_date_displayed() {
		
	}
	@Then("Verify feedback button is displayed")
	public void verify_feedback_button_is_displayed() {
		
	}




	

}
