package basicprogram;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Login_UsingCSS_Selector_Scanner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter your name");
		String usn = s.next();
		System.out.println("Enter your password");
		String pwd = s.next();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys(usn);
		
		driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys(pwd);
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='welcome']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("a[href=\"/index.php/auth/logout\"])")).click();
		

	}

}
