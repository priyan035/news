package orange.Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
public static WebDriver driver;
	
    @FindBy (xpath="//input[@name='username']")
     private WebElement username;
	
    @FindBy(xpath="//input[@name='password']")
    
    private WebElement password;
    
    @FindBy(xpath="//button[@type='submit']")
    
    
    private WebElement login;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
    public Login_Page(WebDriver brow) {
    	driver=brow;
    	
    	PageFactory.initElements(driver, this);
    }
    
    
	


}
