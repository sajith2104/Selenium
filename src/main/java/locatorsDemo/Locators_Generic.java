package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Generic 
{
	
	static WebDriver odriver;
	
	public static WebElement getElement(By locator)
	{
		return odriver.findElement(locator);
	}
	
	public static void dosendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doclick(By locator)
	{
		getElement(locator).click();
	}

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		
		 odriver= new ChromeDriver();
		
		odriver.get("https://www.saucedemo.com/v1/");
     
		odriver.manage().deleteAllCookies();
		odriver.manage().window().fullscreen();
		
	    String title = odriver.getTitle();
	   
	    System.out.println(title);
	    
	     By uid=By.id("user-name");
	     By pid= By.id("password");
	     
	     By lbtn= By.id("login-button");
	     
	     
	     
	    // getElement(uid).sendKeys("standard_user");//Calling getElement() method.
	     
	    // getElement(pid).sendKeys("secret_sauce");////Calling getElement() method.
	     
	     //getElement(lbtn).click();
	     
	     
	     dosendkeys(uid,"standard_user");
	     dosendkeys(pid,"secret_sauce");//calling dosendkeys() method
	     doclick(lbtn);// calling doclick() method.

	     
	   
	}

}
