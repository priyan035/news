package orange.Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	

	public WebDriver driver;
	

	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
	
	private WebElement pim;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
	
	private WebElement addemp;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPim() {
		return pim;
	}

	public WebElement getAddemp() {
		return addemp;
	}
	
	public Select_Page (WebDriver brow) {
		
		driver=brow;
		PageFactory.initElements(driver, this);
	}
	
	
	

}
