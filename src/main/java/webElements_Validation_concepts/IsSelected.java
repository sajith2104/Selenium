package webElements_Validation_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {
	
	static WebDriver odriver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		Thread.sleep(3000);
		
		odriver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(2000);
		
		boolean radio=odriver.findElement(By.xpath("//label[text()='Male']")).isSelected();
    
		if(radio)
		{
			System.out.println("radio button selected  ----- pass");
			
			System.out.println(radio);
		}
		else
		{
			System.out.println("radio button not selected ------ Fail");
			
		

		}
		
		boolean checkbox=odriver.findElement(By.xpath("//label[text()='Wednesday']")).isSelected();
	    
		if(checkbox)
		{
			System.out.println("selected week is Wednesday ----- pass");
			System.out.println(checkbox);
		}
		else
		{
			
			
			System.out.println("Nothing has selected ------ Fail");
			
			
			odriver.findElement(By.xpath("//label[text()=\"Wednesday\"]")).click();

		}
		
		
		//odriver.findElement(By.xpath("//label[text()=\"Wednesday\"]")).click();
		
		
		
		
		
		
	}

}
