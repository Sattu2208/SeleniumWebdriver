package basicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom_PageObjectModel.OrangeHRM_POM;

public class MouseHover_OrangeHRM{

	public static void main(String[] args) throws Exception{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	   Thread.sleep(5000);
	   
	   //Create Object of POM Model
	   OrangeHRM_POM o = new OrangeHRM_POM();
	   o.maximizeBrowser(driver);
	   o.url(driver);
	   o.username(driver, "Admin");
	   o.password(driver, "admin123");
	   o.login(driver);
	   
	   //--------- Mouse Hover
	   
	   
	   //Step 1 : Create object of Action Class
	   Actions a = new Actions(driver);
		
	   
	   //Ste2 : Create list with WEbelsement
	   List<WebElement> ls = driver.findElements(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li"));
	   
	   //Store List size
	   
	   int size = ls.size();
	   System.out.println("Number of modules"+size);
	   
	   //Step 4 For loop
	   
	   for (int i = 1;i<=size;i++)
	   {
		   
		   //wait
		   Thread.sleep(5000);
		   
		   //Display Module Name 
   System.out.println(driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li["+i+"]")).getText());
   
   
   // Perform mouse over
   
   a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li["+i+"]"))).click().perform();
   
		  
		   
				   
				   
		   
	   }

	}

}
