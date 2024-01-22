package keyword_Driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationClass {

	public void url(WebDriver driver) 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void username(WebDriver driver, String usn) 
	{
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(usn);
		
	}
	public void password(WebDriver driver, String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pwd);
		
	}
	
	public void login (WebDriver driver) 
	{
	  driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();	
	}
	public void WelcomeAdmin(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		Thread.sleep(5000);
		
	}
	public void logout(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		
	}
	public void closeBrowser(WebDriver driver) 
	{
		driver.close();
		
	}		


	
}
