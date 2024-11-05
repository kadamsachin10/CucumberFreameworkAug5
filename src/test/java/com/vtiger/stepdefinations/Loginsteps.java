package com.vtiger.stepdefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginsteps extends BaseSteps
{


    @Given("user should be on login page")
    public void user_should_be_on_login_page()
    {
       launchapp();


    }
    @When("user enter the valid credentials and click on login button")
    public void user_enter_the_valid_credentials_and_click_on_login_button()
    {
       lp.login();

    }
    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page()
    {

        ldp.VerifyHome();
    }
    @Then("user can see the logout link right corner")
    public void user_can_see_the_logout_link_right_corner()
    {
       ldp.VerifyLogout();


    }

    @When("user enter the Invalid credentials and click on login button")
    public void user_enter_the_invalid_credentials_and_click_on_login_button()
    {

        lp.login("admin12","admin34");

    }
    @Then("user can see the error message on login page")
    public void user_can_see_the_error_message_on_login_page()
    {
      lp.verifyErrorMessage();


    }
    @When("user enter the Invalid credentials username as {string} and password as {string} click on login button")
    public void user_enter_the_invalid_credentials_username_as_and_password_as_click_on_login_button(String uid, String pwd)
    {



        lp.login();


    }





}