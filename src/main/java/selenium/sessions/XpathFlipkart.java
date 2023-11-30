package selenium.sessions;

import org.openqa.selenium.By;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver= new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://www.flipkart.com/");
		
		// 1.tagName[@attribute='Value']
		odriver.findElement(By.xpath("//span[@role='button']")).click();
		
		// 2. tagName[text()='Value']
		
		Thread.sleep(000);
		
		odriver.findElement(By.xpath("//span[text()='Grocery']")).click();
		
		
		//3.
        //-->//tagname[@attribute='vaue' and @attribute='vaue']
        //-->//tagname[@attribute='vaue' and text()='value']
        //-->//tagname[@attribute='vaue' or text()='value']
		
		
		odriver.findElement(By.xpath("//input[@title='Enter pincode' and @name='pincode']")).sendKeys("560017");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.xpath("//input[@title='Enter pincode' and @name='pincode']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		//5.using index
		
		odriver.findElement(By.xpath("(//a[@class='_1iDLNA'])[1]")).click();
		
	   
		Thread.sleep(3000);
		
		odriver.findElement(By.xpath("//div[text() ='Saffola Gold Refined Cooking Rice Bran & Sunflower Blended Oil Can'] ")).click();
		
		//Thread.sleep(3000);
 		 
		//odriver.findElement(By.xpath("//button[contains(text(), 'ADD')]")).click();
		
		
		
		
		  
	   
		  
        //contains
        //syntax-->//tagNmae[contains(@attribute,'value')]
        
        //tagName[contains(text(),'value')]
        //tagName[contains(@id,'value')]
        //tagName[contains(@name,'value')]
        //tagName[contains(@class,'value')]
   
	}

}
