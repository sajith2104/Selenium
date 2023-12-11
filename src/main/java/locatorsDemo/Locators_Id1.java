package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Id1 {
	
public static void main(String []args) throws InterruptedException
{
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver odriver= new ChromeDriver();
	
	odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
	
	odriver.manage().deleteAllCookies();
	odriver.manage().window().maximize();
	
	String title=odriver.getTitle();
	System.out.println(title);
	
	
	String currentUrl= odriver.getCurrentUrl();
	System.out.println(currentUrl);
	
	odriver.findElement(By.id("FirstName")).sendKeys("sajith");
	
	Thread.sleep(2000);
	
	odriver.findElement(By.id("LastName")).sendKeys("sajith");
	
	Thread.sleep(2000);

	odriver.findElement(By.id("gender-male")).click();
	
	Thread.sleep(2000);
	
	odriver.findElement(By.id("Email")).sendKeys("sajith@gmail");
	
	Thread.sleep(2000);

	odriver.findElement(By.id("Company")).sendKeys("Nucot");
	
	Thread.sleep(2000);
	
	odriver.findElement(By.id("Password")).sendKeys("sajith123");

	Thread.sleep(2000);
	
	odriver.findElement(By.id("ConfirmPassword")).sendKeys("sajith123");
	Thread.sleep(2000);

	odriver.findElement(By.id("register-button")).click();



	
}

}
