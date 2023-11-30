package selenium.sessions;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDemo {

	public static void main(String[] args) 
	{
		// 1.To open the browser
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver odriver= new FirefoxDriver();
		
		//2.To pass the Url
		odriver.get("https://www.flipkart.com/");
		
		//3.To get title of the webpage
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		//To close the browser
		
		odriver.close();
		
		
		
		

	}

}
