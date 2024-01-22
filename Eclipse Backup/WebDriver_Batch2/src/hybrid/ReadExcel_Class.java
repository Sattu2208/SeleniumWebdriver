package hybrid;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class ReadExcel_Class {
	
	public void readExcel(WebDriver driver)throws Exception
	{
		
		FileInputStream file = new FileInputStream("D:\\Selenium Automation\\poi\\POI.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(file);
		XSSFSheet s = w.getSheet("hybrid");
		
		int rowSize = s.getLastRowNum();
		System.out.println("No of rows :" +rowSize);
		
		Operational_Class o = new Operational_Class();
		
		for(int i = 1;i<=rowSize;i++)//Data driven Testing
		{
			
		String username = s.getRow(i).getCell(1).getStringCellValue();
		String password = s.getRow(1).getCell(2).getStringCellValue();
		System.out.println(username+"\t\t"+password);
		
		try
		{
			for (int j = 1; j<= rowSize;j++) // Keyword Driver Testing
			
			{
				String key=s.getRow(j).getCell(0).getStringCellValue();
				System.out.println(key);
				
				if(key.equals("Enter Url"))
				{
					o.url(driver);
					Thread.sleep(2000);	
				}	
				
				else if(key.equals("Maximize Browser"))
				{
					o.maximizeBrowser(driver);
					Thread.sleep(2000);
				}
				
				else if(key.equals("Enter Username"))
				{
					o.username(driver, username);
					Thread.sleep(2000);
				}
				
				if(key.equals("Enter Password"))
				{
					o.password(driver, password);
					Thread.sleep(2000);
				}
				
				else if(key.equals("Login Button"))
				{
					o.login(driver);
					Thread.sleep(2000);
				}
				else if(key.equals("Click on welcome Admin"))
				{
					o.WelcomeAdmin(driver);
					Thread.sleep(2000);
				}
				else if(key.equals("Click on Logout"))
				{
					o.logout(driver);
					Thread.sleep(2000);
					
					System.out.println("Valid Username and PAssword");
					
				System.out.println("");
				
				s.getRow(i).createCell(3).setCellValue("Valid Username and password");
					
				}
				
				
			}
			
		}
		
		catch (Exception e)
		
		{
			
			System.out.println("Invalid username and PAssword");
			System.out.println("");
			s.getRow(i).createCell(3).setCellValue("Invalid username and password");
			
			
		}
		
		}
		
     FileOutputStream out = new FileOutputStream("D:\\Selenium Automation\\poi\\POI.xlsx");	
		w.write(out);
		
	}

}
