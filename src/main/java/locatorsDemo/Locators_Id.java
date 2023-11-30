package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//LOCATORS DEMO USING "id"
// By.id

public class Locators_Id {

	public static void main(String[] args) throws InterruptedException
	{
		//TO setup the webdrivers
		WebDriverManager.chromedriver().setup();
		 ChromeDriver odriver = new ChromeDriver();
		 
		 // To Pass or enter the title 
		 odriver.get("https://www.saucedemo.com/v1/");
		 
		 // To maximize the window
		 odriver.manage().deleteAllCookies();
		 odriver.manage().window().maximize();
		 
		 
		 // To get the title of the page
		String title= odriver.getTitle();
		System.out.println(title);
		
		// To pass the value to the username field
		
		odriver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		odriver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
		Thread.sleep(2000);
		
		odriver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		
		odriver.quit();
		
		 
	

	}

}
