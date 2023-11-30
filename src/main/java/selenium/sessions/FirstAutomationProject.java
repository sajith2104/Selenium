package selenium.sessions;



import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationProject {

	public static void main(String[] args) {
		//1st step
		//Opening the browser with the help of script
		//To launch the browser
	  WebDriverManager.chromedriver().setup();
	
	   ChromeDriver odriver=new ChromeDriver();
	   
	   
	   //2. Enter the URL
	   odriver.get("https://www.flipkart.com/");
	   
	   		
	   
	   	
	   
	   //3.to get the title of the page
	    
	   String actualtitle=odriver.getTitle();
	   System.out.println(actualtitle);
	   
	  if(actualtitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	   
	   
	   
	   //4.T0 get the current url
	    
	   String actualurl=odriver.getCurrentUrl();
	   System.out.println(actualurl);
	   
	   if(actualurl.equals("https://www.flipkart.com/"))
	   {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
	   

	   
	   //5. close the browser
	   odriver.close();

	}

}
