package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParallelExecution_Guru99 {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		driver = new ChromeDriver();		
	  }
	
	
  @Test(description= "Parallel Execution --- Orange HRM")
  public void Guru99() throws InterruptedException
  {	
	// Maximize window
  driver.manage().window().maximize();
  
  //URL 
  driver.get("http://demo.guru99.com/test/delete_customer.php");
  Thread.sleep(2000);
  
  //Customer Id :
  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("69753");
  Thread.sleep(2000);
  
  
  //Submit Button
  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
  
  //Alert:
  //Confirmation Alert
  //Step1 : Display Alert Message
  System.out.println("Confirmation Alert"+driver.switchTo().alert().getText());
  Thread.sleep(2000);
  
  //Step 2 : Click on Ok Button
  driver.switchTo().alert().accept();
  Thread.sleep(2000);
     //or
  //driver.switchTo().alert().dismiss();--- Click to cancel button
  
  // Simple Alert
  //Step 1 : Display alert message
  System.out.println("Simple Alert: "+driver.switchTo().alert().getText());
  Thread.sleep(2000);
  
  //Step 2 : Click on Ok Button
  driver.switchTo().alert().accept();
  Thread.sleep(2000);
  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
