package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orange.Page_Object_Manager.Page_Object_Manager;
import orange.baseclass.Baseclass_New;
import runner.Test_Runner;

public class step_definition extends Baseclass_New {

	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	/*
	 * @Given("^user Launch the url$") public void user_Launch_the_url() throws
	 * Throwable {
	 * 
	 * getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * 
	 * }
	 * 
	 * // * @When("^user enter the  UserName in UserName Field$") public void
	 * user_enter_the_UserName_in_UserName_Field() throws Throwable {
	 * 
	 * wait1(); inputonElement(pom.getLp().getUsername(), "Admin"); }
	 * 
	 * @When("^user enter the password in password Field$") public void
	 * user_enter_the_password_in_password_Field() throws Throwable {
	 * 
	 * inputonElement(pom.getLp().getPassword(), "admin123"); }
	 * 
	 * @Then("^user click the Loginbutton$") public void
	 * user_click_the_Loginbutton() throws Throwable {
	 * 
	 * clickonElement(pom.getLp().getLogin()); }
	 * 
	 */

	@Given("^user Launch the url$")
	public void user_Launch_the_url() throws Throwable {

		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait1();
	}

	@When("^user enter the \"([^\"]*)\" in UserName Field$")
	public void user_enter_the_in_UserName_Field(String user) throws Throwable {

		
		inputonElement(pom.getLp().getUsername(), user);
		wait1();
	}

	@When("^user enter the \"([^\"]*)\" in password Field$")
	public void user_enter_the_in_password_Field(String pass) throws Throwable {

		inputonElement(pom.getLp().getPassword(), pass);
		wait1();

	}

	@Then("^user click the Login Button And It Navigate To Home Page$")
	public void user_click_the_Login_Button_And_It_Navigate_To_Home_Page() throws Throwable {

		clickonElement(pom.getLp().getLogin());

	}
}
