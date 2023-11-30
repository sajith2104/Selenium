package GettingElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//PROGRAM TO GET ALL THE WEBELEMENTS PRESENT IN THE WEB PAGE

public class GetAllWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver = new ChromeDriver();
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement uname=odriver.findElement(By.name("username"));
         uname.sendKeys("Admin");
         
         Thread.sleep(3000);
		
		WebElement upwd=odriver.findElement(By.name("password"));
		upwd.sendKeys("admin123");
		
		Thread.sleep(3000);
		
		WebElement lbtn=odriver.findElement(By.xpath("//button[@type='submit']"));
		lbtn.click();
		
		
		Thread.sleep(3000);
		
		List<WebElement> olist = odriver.findElements(By.xpath("//*"));
		
		System.out.println(olist.size());// To print the Size of list(web elements)
		
      /*  for(int i=0;i<olist.size();i++)// using for loop
        {
        	String elements=olist.get(i).getText();// To get the webelements using get.Text()method
        	
        	System.out.printlm("Web Elements present in the Web page are:)
        	System.out.println(elements);
        	
        	
        
        }
        */
        
        System.out.println("printing WebElements using For Each Loop");
        int count=0;
        for(WebElement ele:olist)
      
        {
        	
        	String elements = ele.getText();
        	
        	if(elements.length()>0) 
        	{
        		

            	System.out.println(count + ": "+elements);
            	
            	count++;	
        	}
        	
        	
        	
        }
        
	}

}
