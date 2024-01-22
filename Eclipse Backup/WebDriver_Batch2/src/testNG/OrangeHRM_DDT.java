package testNG;

import org.testng.annotations.Test;

import pom_PageObjectModel.OrangeHRM_POM;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRM_DDT {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
	  }
	
	
  @Test(dataProvider = "dp")
  public void orangeHRM(String usn, String pwd) throws Exception {
  
   OrangeHRM_POM o = new OrangeHRM_POM();
   o.maximizeBrowser(driver);
   o.url(driver);
   o.username(driver, usn);
   o.password(driver, pwd);
   o.login(driver);
   Thread.sleep(2000);
   o.WelcomeAdmin(driver);
   Thread.sleep(2000);
   o.logout(driver);
  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "xyz", "xyz" },
      new Object[] { "Admin", "admin" },
      new Object[] { "Admin", "pqr" },
      new Object[] { "Admin", "admin123" },
      new Object[] { "abc", "abc" },
    };
  }
  

  @AfterTest
  public void afterTest() {
  driver.close();
  }

}
