package basicprogram;


import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Login {

	//VI) XPath: XML Path--> Extensible MarkUp Language
		//Types Of XPath: 
	//1)Absolute XPath: Its prefix is '/' and it shows ROOT PATH
	//2)Relative XPath: Its prefix is '//' and it shows CURRENT PATH
	//Syntax: //TagName[@Property='PropertyValue']
	//For Example: //input[@type='submit']
		
		
	//DialogBox--> Taking Data from User At Runtime
	//String usn=JOptionPane.showInputDialog("Enter Your Username");
		
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		// Maximize window
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        Thread.sleep(5000);
        
        //Change Window Dimension
        Dimension d = new Dimension(500,600);
        driver.manage().window().setSize(d);
        
        
        String usn = JOptionPane.showInputDialog("Enter your Username");
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(usn);
        
      //*[@id="js_knome-brand"]
        
        String pwd = JOptionPane.showInputDialog("Enter your Password");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pwd);
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();
        
        
        
        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
        Thread.sleep(5000);
        driver.close();
        
        
	}

}
