package Practise_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_URL {

		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub

			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    Thread.sleep(2000);
		    
		  
		}

	


}
