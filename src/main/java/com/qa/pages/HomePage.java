package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testBase.TestBase;
import com.qa.utils.TestUtil;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//i[@class='users icon']")
	WebElement contactsLink;
	
	@FindBy(xpath = "(//div[@class='menu-item-wrapper']/button)[2]")
	WebElement newContactPlusBtn;
	
	@FindBy(linkText = "Deals")
	WebElement dealsLink;
	
	@FindBy(linkText = "Tasks")
	WebElement tasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public void clickOnNewContactPlusBtn() {
		TestUtil.mouseHover(contactsLink);
		//newContactPlusBtn.click();
	}
}
