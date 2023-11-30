package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_name {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver odriver = new ChromeDriver();
	   
	   odriver.get("https://www.saucedemo.com/v1/");
	   
	  odriver.manage().deleteAllCookies();
	  odriver.manage().window().maximize();
	   
	  String title= odriver.getTitle();
	  
	  System.out.println(title);
	  
		odriver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		odriver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		odriver.quit();

	  
	  
	  
	  
	  
	   
	  

	}

}
