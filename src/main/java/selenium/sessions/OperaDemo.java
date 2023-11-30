package selenium.sessions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperaDemo {
	 

	public static void main(String[] args) {
		// TO setup the Browser
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver= new ChromeDriver();
		
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
	
		
		
				

	}

}
