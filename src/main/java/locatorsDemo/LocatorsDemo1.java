package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver= new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");

		
		 odriver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		 
		 odriver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sajith");
		 
		 Thread.sleep(2000);
		 odriver.findElement(By.xpath(" //input[@id='LastName']")).sendKeys("saaju");
		 
		 Thread.sleep(2000);
		 
		 odriver.findElement(By.xpath(" //input[@name='Email']")).sendKeys("sajith@gmail.com");
		 
		 Thread.sleep(2000);
 
		 odriver.findElement(By.xpath("//input[@id='Company' and @name='Company']")).sendKeys("ADVANCED");
		 
		 Thread.sleep(2000);

		 odriver.findElement(By.xpath("//input[@id='Password' or @name='password']")).sendKeys("Pass@123");

		 Thread.sleep(2000);

		 odriver.findElement(By.xpath("//input[@id='ConfirmPassword' or @name='ConfirmPassword']")).sendKeys("Pass@123");

	}

}
