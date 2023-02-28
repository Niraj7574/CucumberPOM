package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	public HomePageSteps() {
		super();
	}
		
	@Given("^user opens browser$")
	public void user_opens_browser() {
		TestBase.initilization();
		lp = new LoginPage();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		Assert.assertEquals("Cogmento CRM", lp.validateLoginPageTitle());
	 
	}

	@Then("^user login in app$")
	public void user_login_in_app()  {
		hp = lp.login(prop.getProperty("Email"), prop.getProperty("Password"));
	}

	@Then("^Validate homepage title$")
	public void validate_homepage_title() {
		Assert.assertEquals("Cogmento CRM", hp.verifyHomePageTitle());
	}

	@Then("^Validate logged in user$")
	public void validate_logged_in_user() {
		Assert.assertTrue(hp.verifyUserName());
	}


}
