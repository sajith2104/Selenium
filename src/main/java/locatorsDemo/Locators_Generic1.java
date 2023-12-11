package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Generic1 
{
	
	static WebDriver odriver;
	
	public static WebElement getElement(By locator)//Get element method
	{
		return odriver.findElement(locator);
	}
	
	public static void dosendkeys(By locator,String value)// Sendkeys method
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	
	

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup();
		
		 odriver= new ChromeDriver();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
		String currentUrl= odriver.getCurrentUrl();
		System.out.println(currentUrl);
		
		By fname=(By.id("FirstName"));
		
		//getElement(fname).sendKeys("sajith");
		
		dosendkeys(fname,"Sajith"); //calling dosendkeys() method
		
		Thread.sleep(2000);

		
		
		By lastName=(By.id("LastName"));
		
		//getElement(lastName).sendKeys("saju");
		
		dosendkeys(lastName,"Saju");
		
		Thread.sleep(2000);

		
		
		By radio=(By.id("gender-male"));
		//getElement(radio).click();
		
		doClick(radio);  //calling doclick() method
		
		Thread.sleep(2000);

		
		By email=(By.id("Email"));
		//getElement(email).sendKeys("saju@gmail.com");
		
		dosendkeys(email,"saju@gamail.com");
		
		Thread.sleep(2000);

		
		
		By cmpny=(By.id("Company"));
		//getElement(cmpny).sendKeys("NUCOT");
		
		dosendkeys(cmpny,"Nucot");
		
		
		Thread.sleep(2000);

		
		
		By psw=(By.id("Password"));
		//getElement(psw).sendKeys("sajith@123");
		
		dosendkeys(psw,"12Three");
		
		
		Thread.sleep(2000);

		
		
		By cnfpsd=(By.id("ConfirmPassword"));
		//getElement(cnfpsd).sendKeys("sajith@123");
		
		dosendkeys(cnfpsd,"12Three");
		
		
		Thread.sleep(2000);

		
		
		By register=(By.id("register-button"));
        //getElement(register).click();
		
		doClick(register);//calling doclick() method
		
		Thread.sleep(2000);
		
	   odriver.quit(); 
	

	}

}
