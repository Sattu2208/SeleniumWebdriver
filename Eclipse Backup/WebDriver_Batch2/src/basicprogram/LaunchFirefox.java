package basicprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException
	
	{
		//Step 1 : select Browser
		//key --- Browser NAme -> webdriver.gecko.driver
		//value --- browser path
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Automation\\Browser Extension\\geckodriver.exe");
		
		// Step 2 : import webdriver with browser constructor
		WebDriver driver = new FirefoxDriver();
		//wait
		Thread.sleep(5000);

		//step 3 : url
		driver.get("https:\\www.google.com");
		
		//step 4 - -display websitetitle
		System.out.println("Home page title is"+driver.getTitle());
		
		
	}

}
