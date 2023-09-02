package orange.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_New {

	
	
	
	
	
public static WebDriver driver;
	
	public static WebDriver browserlaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
				
			
		}
		
		return driver;
		
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void inputonElement(WebElement input,String value) {
		input.sendKeys(value);	
	}
	
	public static void clickonElement(WebElement input) {
		input.click();
	}
	
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	
	}
	public static void close() {
		driver.close();
	}
	public static void navigateto(String url) {
		 driver.navigate().to(url);
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void quit() {
		driver.quit();
	}
	public static void switchto(String url) {
		driver.switchTo().window(url);
	}
	
	public static void selectbyintex(WebElement input,int value) {
		Select se = new Select(input);
		se.selectByIndex(value);	
	}
	public static void selectbyvalue(WebElement input,String value) {
		Select se = new Select(input);
		se.selectByValue(value);
	}
	public static void selectbytext(WebElement input,String value) {
		Select se = new Select(input);
		se.selectByVisibleText(value);
	}
	public static void selectwebelement(WebElement input) {
		input.isSelected();
		
	}
	public static void deSelectByIntex(WebElement input, int value) {
		Select sc = new Select(input);
		sc.deselectByIndex(value);
	}
	public static void deSelectBytext(WebElement input,String value) {
		Select sc = new Select(input);
		sc.deselectByVisibleText(value);
	}
	public static void deSelectByValue(WebElement input,String value) {
		Select sc = new Select(input);
		sc.deselectByValue(value);
	}
	
	public static void clearwebelement(WebElement input) {
		input.clear();
	}

	
	public static void wait1() throws InterruptedException {
		Thread.sleep(3000);

	}
	
}


