package pom_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_MainClass {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		// TODO Auto-generated method stub

		//Object of POM Class
		
		
		//Calling method
		o.maximizeBrowser(driver);
		Thread.sleep(5000);
		o.url(driver);
		Thread.sleep(2000);
		o.username(driver,"Admin");
		Thread.sleep(2000);
		o.password(driver,"admin123");
		Thread.sleep(2000);
		o.login(driver);
		Thread.sleep(2000);
		o.WelcomeAdmin(driver);
		o.logout(driver);
	    o.closeBrowser(driver);	
		
	}

}
