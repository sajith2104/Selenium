package navigationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationDemo1 {
	
	static WebDriver odriver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		odriver =new ChromeDriver();
		
		odriver.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(2000);
		
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		 String title=odriver.getTitle();
		 System.out.println(title);
		 
		 Thread.sleep(2000);
		 
		 odriver.navigate().to("https://www.myntra.com/");
		 
		 Thread.sleep(2000);
		 
		 odriver.navigate().to("https://www.ajio.com/");
		 
		 Thread.sleep(2000);
		 
		 odriver.navigate().back();
		 
		 Thread.sleep(2000);
		 odriver.navigate().forward();
		 
		 Thread.sleep(2000);
		 
		 odriver.navigate().refresh();
		 
		 Thread.sleep(2000);
		 
		 
		 
		 
		
		

	}

}
