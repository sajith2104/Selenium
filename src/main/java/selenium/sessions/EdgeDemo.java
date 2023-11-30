package selenium.sessions;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDemo {

	public static void main(String[] args) 
	{
		// To setup the browser
		WebDriverManager.edgedriver().setup();
		EdgeDriver odriver = new EdgeDriver();
		
		//2.To enter the Url of the website
		
		odriver.get("https://www.amazon.com/");
		
		//3.To get the title of the page
		
		String actualtitle=odriver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		//4. To get current Url
		
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
			
			// To close the browser
			
			odriver.close();
	}
	

}
