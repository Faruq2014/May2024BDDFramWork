package com.facebookTests;

import com.facebookBase.BaseTest;
import com.facebookPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StringDataTest extends BaseTest{

	LoginPage lp;
@Given("I open chrome with url {string}")
public void i_open_chrome_with_url(String url) {
	openApplication();
}

@When("I enter userName {string} on facebook")
public void i_enter_user_name_on_facebook(String userName) {
   lp = new LoginPage(driver);
   lp.userName(userName);
}

@When("I enter password {string} on facebook")
public void i_enter_password_on_facebook(String enterPassword) {
    lp.password(enterPassword);
}

@Then("I validate the title {string} of the page")
public void i_validate_the_title_of_the_page(String actualTitle) {
	validteFacebookTitle(actualTitle); 
}

@Then("I colose the application")
public void i_colose_the_application() {
	closeApplication();
}



}
