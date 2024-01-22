package testNG;

import org.testng.annotations.Test;

import pom_PageObjectModel.OrangeHRM_POM;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParallelExecution_OrangeHRM {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();		
	  }
	

  @Test(description= "Parallel Execution --- Orange HRM")
  public void OrangeHRM() throws Exception {
	  OrangeHRM_POM o = new OrangeHRM_POM();
	  o.maximizeBrowser(driver);
	  o.url(driver);
	  o.username(driver, "Admin");
	  o.password(driver, "admin123");
	  o.login(driver);
	  o.WelcomeAdmin(driver);
	  Thread.sleep(2000);
	  o.logout(driver);
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }


}
