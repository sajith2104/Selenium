package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsApproach2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
	    ChromeDriver odriver = new ChromeDriver();
	    
	    odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
		String currentUrl= odriver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//odriver.findElement(By.id("FirstName")).sendKeys("sajith");
		
		WebElement firstName=odriver.findElement(By.id("FirstName"));
		
		firstName.sendKeys("sajith");
		Thread.sleep(2000);

		//	odriver.findElement(By.id("LastName")).sendKeys("sajith");
          
		  WebElement lastName=odriver.findElement(By.id("LastName"));
		  lastName.sendKeys("Saju");

		Thread.sleep(2000);
		
		//odriver.findElement(By.id("gender-male")).click();
		
	  WebElement radio=odriver.findElement(By.id("gender-male"));
	  radio.click();
		
		Thread.sleep(2000);
		
		//odriver.findElement(By.id("Email")).sendKeys("sajith@gmail");
		
		WebElement email=odriver.findElement(By.id("Email"));
		email.sendKeys("sajith@gmail");
		
		Thread.sleep(2000);

		//odriver.findElement(By.id("Company")).sendKeys("Nucot");
		
		WebElement company=odriver.findElement(By.id("Company"));
		company.sendKeys("Nucot");
	
		Thread.sleep(2000);
		
		//odriver.findElement(By.id("Password")).sendKeys("sajith123");
		
     		WebElement pswd=odriver.findElement(By.id("Password"));
     		pswd.sendKeys("sajith123");
		
		Thread.sleep(2000);
		
		//odriver.findElement(By.id("ConfirmPassword")).sendKeys("sajith123");
		
		WebElement cnfpswd=odriver.findElement(By.id("ConfirmPassword"));
		cnfpswd.sendKeys("sajith123");
		Thread.sleep(2000);

		//odriver.findElement(By.id("register-button")).click();

		WebElement register=odriver.findElement(By.id("register-button"));
		 register.click();
		

	}

}
