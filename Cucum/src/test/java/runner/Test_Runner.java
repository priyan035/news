package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import orange.baseclass.Baseclass_New;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//feature",
glue="com.stepdefinition_reader",
monochrome = true,
plugin= {"html:HtmlReport/OrangeHtml.html",
		"pretty",
		"json:JsonReport/OrangeJson.json",
		"com.cucumber.listener.ExtentCucumberFormatter:ExtendReport/Adactin.html"})


public class Test_Runner extends Baseclass_New{
	
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver = browserlaunch("chrome");
		
	}

	
	
	
	@AfterClass
	public static void tear_Down() {
		
		
		quit();
	}
}
