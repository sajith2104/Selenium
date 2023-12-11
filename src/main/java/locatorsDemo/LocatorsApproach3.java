package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsApproach3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver= new ChromeDriver();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
		String currentUrl= odriver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//odriver.findElement(By.id("FirstName")).sendKeys("sajith");
		
		By fname=(By.id("FirstName"));
		WebElement fName=odriver.findElement(fname);
		fName.sendKeys("sachin");
	
		
		
		
		Thread.sleep(2000);
		
		//odriver.findElement(By.id("LastName")).sendKeys("sajith");
		
		By lastName=(By.id("LastName"));
	  WebElement lastN=	odriver.findElement(lastName);
	  lastN.sendKeys("Tendulkar");
	  
		Thread.sleep(2000);

		//odriver.findElement(By.id("gender-male")).click();
		
		By radio=(By.id("gender-male"));
		WebElement radiobtn=odriver.findElement(radio);
		radiobtn.click();
		
		Thread.sleep(2000);
		
		//odriver.findElement(By.id("Email")).sendKeys("sajith@gmail");
		
		By email=(By.id("Email"));
		WebElement emailid=odriver.findElement(email);
		emailid.sendKeys("Tendulkar@icc.com");
		
		
		Thread.sleep(2000);

		//odriver.findElement(By.id("Company")).sendKeys("Nucot");
		
		By cmpny=(By.id("Company"));
		WebElement company=odriver.findElement(cmpny);
		company.sendKeys("BCCI");
		
		
		
		
		Thread.sleep(2000);
		
		//odriver.findElement(By.id("Password")).sendKeys("sajith123");
		
		By psw=(By.id("Password"));
		WebElement pswd=odriver.findElement(psw);
		pswd.sendKeys("sajith123");

		Thread.sleep(2000);
		
		//odriver.findElement(By.id("ConfirmPassword")).sendKeys("sajith123");
		
		By cnfpsd=(By.id("ConfirmPassword"));
		WebElement pwd=odriver.findElement(cnfpsd);
		pwd.sendKeys("sajith123");
		
		Thread.sleep(2000);

		//odriver.findElement(By.id("register-button")).click();
		
		By register=(By.id("register-button"));
		WebElement regBtn=odriver.findElement(register);
		regBtn.click();
		
		


		
		
		

	}

}
