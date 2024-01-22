package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Xpath_login {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.className("button")).click();
	    
	    
	}

}
