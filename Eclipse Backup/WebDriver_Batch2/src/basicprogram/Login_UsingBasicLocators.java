package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_UsingBasicLocators {
	
	//Locators: It is a term an address to identify web elements uniquely on web pages
	//I) Name---> By.name("value")	
	//II) Id---> By.id("value")	
	//III) ClassName--> By.className("value")	
	//IV) LinkText---> By.linkText("Display Text")----> tag name should be <a> + hyperlink

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(5000);
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	//username
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	//Password
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");

	  // Login Button
	driver.findElement(By.className("Button")).click();
	
	//Welcome Admin
	driver.findElement(By.linkText("Welcome Harshika")).click();
	
	// logout
	
    driver.findElement(By.linkText("Logout")).click();

  Thread.sleep(2000);
  
   driver.close();
	}

}
