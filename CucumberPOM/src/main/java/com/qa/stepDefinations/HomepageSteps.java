package com.qa.stepDefinations;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends TestBase {
	LoginPage loginpage;
	HomePage homepage;	
	@Given("^user opens the browser$") 
	public void user_opens_the_browser(){
		TestBase.initialization();
				
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user log into app$")
	public void user_enters_username_and_password() {
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		
	}

	
	@Then("^home page is displayed$")
	public void home_page_is_displayed() {
		String homeTile=homepage.verifyHomePageTitle(); 
		Assert.assertEquals("CRMPRO", homeTile);
	}
	@Then("^validate homepage title$")
	public void validate_homepage_title() {
		String homeTile=homepage.verifyHomePageTitle(); 
		Assert.assertEquals("CRMPRO", homeTile);
		
	}
//	
//	@Then("^validate logged in username$")
//	public void validate_logged_in_username() {
//		boolean flag=homepage.verifyCorrectUserName();
//		Assert.assertTrue(flag);
//		
	//}

}
