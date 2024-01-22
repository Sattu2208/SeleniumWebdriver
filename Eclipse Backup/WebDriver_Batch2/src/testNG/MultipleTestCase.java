package testNG;

import org.testng.annotations.Test;

import pom_PageObjectModel.OrangeHRM_POM;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultipleTestCase {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();		
	  }
	

  @Test(priority= 1)
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
  
  @Test(priority= 2)
  public void google() throws Exception {
	  driver.get("https://www.google.com/");//URL
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("What is selenium webdriver");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).sendKeys(Keys.ENTER);
	  
	  
	  
  }
 
 
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

  
}
