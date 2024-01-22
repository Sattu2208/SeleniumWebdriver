package keyword_Driven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcelClass {
	
	public void readExcel(WebDriver driver)throws Exception
	{
		FileInputStream file = new FileInputStream("D:\\Selenium Automation\\poi\\POI.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(file);
		XSSFSheet s=w.getSheet("KeyWordDriven Testing");
		
		int rowSize = s.getLastRowNum();
		System.out.println("No of Keywords" +rowSize);
		
		OperationClass o = new OperationClass();
		
		for(int i=1;i<=rowSize;i++)//Keyword Driven
			
		{
			String key = s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(key);
			
			if(key.equals("Enter Url"))
			{
				o.url(driver);
			}
			
			else if(key.equals("Maximize Browser"))
			{
				o.maximizeBrowser(driver);
			}
			
			else if(key.equals("Enter Username"))
			{
				o.username(driver, "Admin");
			}
			
			if(key.equals("Enter Password"))
			{
				o.password(driver, "admin123");
			}
			else if(key.equals("Login Button"))
			{
				o.login(driver);
			}
			else if(key.equals("Click on welcome Admin"))
			{
				o.WelcomeAdmin(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("Click on Logout"))
			{
				o.logout(driver);
			}
			else if(key.equals("Close Broser"))
			{
				o.closeBrowser(driver);
			}
			
		}
							
		
	}
	

}
