package selenium.sessions;



import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchSessionException 
{

	public static void main(String[] args) {
		//1.Step
		//Opening the browser using the script
		//To launch the browser
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		
		//2.Enter the URl
		odriver.get("https://www.amazon.com");
		
		//3.getting the title of the page
		
		String actualTitle=odriver.getTitle();
		System.out.println(actualTitle);
		
		//validation point/check point
		//Automation script/code+validations/assertions=AT
		
		if(actualTitle.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
			
		}
		
		//4.close browser
		
			odriver.close();
		
		//5.getting the current url of the page
		
		String actualUrl=odriver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualUrl.equals("https://www.amazon.com/"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}	


	}
}
