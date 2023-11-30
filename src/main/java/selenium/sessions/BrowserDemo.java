package selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDemo 
{
	static WebDriver odriver;
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		String browser = "edge";
		
		
		
		if(browser.equals("chrome"))
		{
			System.out.println("launching Chrome browse");
			
			WebDriverManager.chromedriver().setup();
			
			 odriver= new ChromeDriver();	
			
		}
		else if(browser.equals("edge"))
		{
			System.out.println("Launching Edge browser");
			
			WebDriverManager.edgedriver().setup();
			
		 odriver= new EdgeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launching Firefox browser");
			
			WebDriverManager.firefoxdriver().setup();
			
		 odriver = new FirefoxDriver();
					
		}
		
		else
		{
              System.out.println("Enter Valid Browser");
	    }
		
		
		// To pass the Url
			odriver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		//To delete cookies
		odriver.manage().deleteAllCookies();
       //To get full screen
		odriver.manage().window().fullscreen(); 
		
		Thread.sleep(2000);
		
		System.out.println(odriver.getTitle()); 
		
		System.out.println(odriver.getCurrentUrl());
		
		
		// To close the browser
		Thread.sleep(2000);
		odriver.close();
		
		
		
		
	}
	
}
