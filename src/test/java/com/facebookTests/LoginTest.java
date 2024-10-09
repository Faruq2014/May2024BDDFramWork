package com.facebookTests;

import com.facebookBase.BaseTest;
import com.facebookPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest {
	LoginPage lp;

	@Given("I open facebook")
	public void i_open_facebook() {

		openApplication();
	}

	@When("I enter userName")
	public void i_enter_user_name() {

		lp = new LoginPage(driver);
		lp.userName("tlklk");
	}

	@When("I enter password")
	public void i_enter_password() {
		lp.password("jkhjjh");
	}

	@Then("I logged in on Facebook")
	public void i_logged_in_on_facebook() {
		System.out.println("login button is disabled");
		//lp.loginButton();
	}

	@Then("I can not validate Facebook title")
	public void i_can_not_validate_facebook_title() {
		validteFacebookTitle("Facebook - log in or sign up");
		
	}
	@Then("I close the facebook")
	public void i_close_the_facebook() {
		closeApplication();
	}

}
