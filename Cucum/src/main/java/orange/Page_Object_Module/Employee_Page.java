package orange.Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_Page {
	
	
	

	public WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middlename;
	
	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	private WebElement empid;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	

	public WebElement getEmpid() {
		return empid;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getMiddlename() {
		return middlename;
	}

	public WebElement getLastname() {
		return lastname;
	}
	
	public  Employee_Page(WebDriver brow) {
		
		this.driver=brow;
		PageFactory.initElements(driver, this);
		
	}
}



