package com.stepdefinition_reader;

import org.openqa.selenium.WebDriver;

import com.helper.Data_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orange.Page_Object_Manager.Page_Object_Manager;
import orange.baseclass.Baseclass_New;
import runner.Test_Runner;

public class Stepdefinition_Report extends Baseclass_New{
	  public static WebDriver driver = Test_Runner.driver;
	  public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
//	@Given("^user Launch the url$")
//	public void user_Launch_the_url() throws Throwable {
//     
//		String getprourl = Data_Reader_Manager.getDRM().getDr().getprourl();
//		getUrl(getprourl);
//		wait1();
//	}
//
//	@When("^user enter the \"([^\"]*)\" in UserName Field$")
//	public void user_enter_the_in_UserName_Field(String user) throws Throwable {
//		inputonElement(pom.getLp().getUsername(), user);
//		
//	}
//
//	@When("^user enter the \"([^\"]*)\" in password Field$")
//	public void user_enter_the_in_password_Field(String pass) throws Throwable {
//		
//		inputonElement(pom.getLp().getPassword(), pass);
//	}
//
//	@Then("^user click the Login Button And It Navigate To Home Page$")
//	public void user_click_the_Login_Button_And_It_Navigate_To_Home_Page() throws Throwable {
//		clickonElement(pom.getLp().getLogin());
//	}
	  @Given("^user Launch the url$")
	  public void user_Launch_the_url() throws Throwable {
		  String getprourl = Data_Reader_Manager.getDRM().getDr().getprourl();
			getUrl(getprourl);
			wait1();
	  }

	  @When("^user enter the \"([^\"]*)\" in UserName Field$")
	  public void user_enter_the_in_UserName_Field(String user) throws Throwable {
		  inputonElement(pom.getLp().getUsername(), user);
		  
	  }

	  @When("^user enter the \"([^\"]*)\" in password Field$")
	  public void user_enter_the_in_password_Field(String pass) throws Throwable {
		  inputonElement(pom.getLp().getPassword(), pass);
	  }

	  @Then("^user click the Login Button And It Navigate To Home Page$")
	  public void user_click_the_Login_Button_And_It_Navigate_To_Home_Page() throws Throwable {
		  clickonElement(pom.getLp().getLogin());
	  }




}
