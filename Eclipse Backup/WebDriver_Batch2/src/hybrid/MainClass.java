package hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Automation\\Browser Extension\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		ReadExcel_Class r = new ReadExcel_Class();
		r.readExcel(driver);

	}

}
