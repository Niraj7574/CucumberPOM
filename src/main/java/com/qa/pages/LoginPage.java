package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testBase.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUpBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String e, String pwd) {
		email.sendKeys(e);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}

