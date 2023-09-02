package orange.Page_Object_Manager;

import org.openqa.selenium.WebDriver;

import orange.Page_Object_Module.Employee_Page;
import orange.Page_Object_Module.Login_Page;
import orange.Page_Object_Module.Select_Page;


public class Page_Object_Manager {
	
	
	
	public static WebDriver driver;
	
	private Login_Page lp;
	private Select_Page sp;
	private Employee_Page ep;
	public static WebDriver getDriver() {
		return driver;
	}
	public Login_Page getLp() {
		
		lp=new Login_Page(driver);
		return lp;
	}
	public Select_Page getSp() {
		
		sp = new Select_Page(driver);
		return sp;
	}
	public Employee_Page getEp() {
		
		ep =new Employee_Page(driver);
		return ep;
	}
   public Page_Object_Manager(WebDriver brow) {
	   driver=brow;
	   
   }

}
