package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_ligin_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=2gwE_0lrd7I&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiMmd3RV8wbHJkN0kiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2OTA4ODAwNCwiaWF0IjoxNjY5MDg2ODA0LCJqdGkiOiJhNWZiNmZjYS0zZWU0LTQwYjctYThjNi1jNDBiMzk0NDNjMmMiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.lj6odAo_ZMa24zXFLNYrG4x6q1OD6ohP0p41sxKxhG91caphfN_6Ueoq46zJUqlz97Vla6PKNbGNucb8a83dhpY-1EeaIvIxyJhN9hkvbk1tAFjaWcKQ7zYAKS_gDWQP7tXENaKlhnml6JTMZnvfxEzYYu19LH4i-MoQZ_LpUdZVWlLToP4YA9254baEk27TPPfcXJgI_SDgE0yKsHIx36q7eN5AcCSqTSLQdtCQI-4_lMruynJNZq11WlyBZTx8lDVS3E7dP88n5OoGZ46eaTC4TiiOosfZQ3XVGNQaZGbb3QjXPC2PXcTsTNCxDuNVg3B_ACqMPX1-SIlsBcVHZw&preferred_environment=");
}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String Title) throws Throwable {	    
		String expectedTitle = Title;
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);;
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String a, String b) throws Throwable {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.id("password-input")).sendKeys(b);   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("signIn")).click();	   
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		Assert.assertEquals(expectedErr, actualErr);	   
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
	    driver.close();	  
	}


}
