package Practise_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
		
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("moresatish140");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Satish@140");
		driver.findElement(By.cssSelector("#wp-submit")).click();
		Thread.sleep(20);
		driver.findElement(By.cssSelector("img[alt='My Profile']")).click();
		Thread.sleep(2000);
		
	}

}
