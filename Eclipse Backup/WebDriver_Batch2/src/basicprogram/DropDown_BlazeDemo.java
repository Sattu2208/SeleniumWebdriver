package basicprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_BlazeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);

		org.openqa.selenium.support.ui.Select s;
		
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
	    
	    
		//close window
	    driver.close();
	}

}
