package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ParallelExecution_BlazeDemo {
	
	WebDriver driver;
	Select s;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();		
	  }
	
	
  @Test(description= "Parallel Execution --- Orange HRM")
  public void BlazeDemo() throws InterruptedException {	
	
	//maximize browser
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//driver
	driver.get("https://blazedemo.com/");
	
	//Diaply window Title
	
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	//Dropdown ---- Tgname must be Select
	//First Dropdown
	
	//Step 1 : Create Object of select claass
	
  s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
  Thread.sleep(5000);
  s.selectByIndex(5);
  
  //Second Dropdown
  s= new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
	
  Thread.sleep(5000);
  s.selectByVisibleText("Rome");
  s.selectByIndex(5);
  
  //find flight button
  driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
  
  Thread.sleep(5000);
  
  //Display Window Title
  System.out.println(driver.getTitle());
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
