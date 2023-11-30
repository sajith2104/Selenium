package selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypeOfXpath {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver= new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.amazon.com/");
    
		   // 1.tagName[@attribute='Value']
		
		odriver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]")).click();
	 
		//2.tagname[contains(text(),'value')]
		odriver.findElement(By.xpath("//span[contains(text(),'Sign up now')]")).click();
		
		
		//3.
        //-->//tagname[@attribute='vaue' and @attribute='vaue']
        //-->//tagname[@attribute='vaue' and text()='value']
        //-->//tagname[@attribute='vaue' or text()='value']
		
		odriver.findElement(By.xpath("//input[@type=\"text\" and @id=\"ap_customer_name\"]")).sendKeys("sajith");
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@type=\"email\" or @id=\"ap_email\"]")).sendKeys("Sajith123@gmail.com");
  	}
	
	

}
