package selenium.sessions;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver= new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		odriver.findElement(By.xpath("//input[@id=\"RESULT_TextField-1\"]")).sendKeys("sajith");
           Thread.sleep(2000); 
		odriver.findElement(By.xpath("//input[@id=\"RESULT_TextField-2\"]")).sendKeys("saaju");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id=\"RESULT_TextField-3\"]")).sendKeys("8297763140");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id=\"RESULT_TextField-4\"]")).sendKeys("India");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id=\"RESULT_TextField-5\"]")).sendKeys("Tirupati");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@id=\"RESULT_TextField-6\"]")).sendKeys("Sajith@gmail.com");
		Thread.sleep(2000);
		
		odriver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(2000);
		
		odriver.findElement(By.xpath("//label[text()=\"Wednesday\"]")).click();
		
		
		odriver.quit();
		
		
	}
	
	

}
