package com.facebookTests;

import com.facebookBase.BaseTest;
import com.facebookPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineTest extends BaseTest{
	LoginPage lp;
	@Given("I open facebook url with chrome {string}")
	public void i_open_facebook_url_with_chrome(String url) {
		openApplication();  
	}

	@When("I enter user name for the {string} in facebook")
	public void i_enter_user_name_for_the_in_facebook(String userName) {
	   lp= new LoginPage(driver);
	   lp.userName(userName);
	}

	@When("I enter the password {string} for facebook")
	public void i_enter_the_password_for_facebook(String password) {
	  lp.password(password); 
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
	   //lp.loginButton();
		closeApplication();
	}


}
