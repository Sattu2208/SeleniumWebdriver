package ddt_DataDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_PageObjectModel.OrangeHRM_POM;

public class DDT_OrangeHRM {

	public static void main(String[] args) throws Exception {
		
		// Create Object of Final Input Stream
		FileInputStream file = new FileInputStream("D:\\Selenium Automation\\poi\\POI.xlsx");
				
		//	Creae Object of XSSFWorkbook
		XSSFWorkbook w = new XSSFWorkbook(file);
		
		//Creste bject of XSSFSheet
		
		XSSFSheet s = w.getSheet("DataDrivenTesting");
		
		//store last row in one variable --- used in for loop 
		int rowSize =s.getLastRowNum();
		System.out.println("No of username and pwd"+rowSize);
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Automation\\Browser Extension\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Create Object of POM Class
		OrangeHRM_POM o = new OrangeHRM_POM();
		
		//Loop	
	    for(int i = 1;i<=rowSize;i++)
	    {
	    	//Store Username and Password
	    	
	    	String username = s.getRow(i).getCell(0).getStringCellValue();
	    	String password = s.getRow(i).getCell(1).getStringCellValue();
	    	
	    	System.out.println(username+"\t\t"+password);//Display uername and password on console
	    	
	    	
	    	try // Handle Runtime error exception
	    	
	    	{ //Login Script
	    		
	    		o.url(driver);
	    		Thread.sleep(2000);
	    		o.maximizeBrowser(driver);
	    		Thread.sleep(2000);
	    		o.username(driver, username);
	    		Thread.sleep(2000);
	    		o.password(driver, password);
	    		Thread.sleep(2000);
	    		o.login(driver);
	    		o.WelcomeAdmin(driver);
	    		Thread.sleep(2000);
	    		o.logout(driver);
	    		
	    		System.out.println("Valid Username and PAssword");//update test result
	    		System.out.println("");
	    		s.getRow(i).createCell(2).setCellValue("Valid username and password");
	    				
	    		}
	    	
	    	catch (Exception e)
	    	{
	    		 System.out.println("Invalid username and password");
	    		 System.out.println("");
		    	 s.getRow(i).createCell(2).setCellValue("Invalid username and password");
	    		 
	    	}
	    	
	    	//Createobject of file output strea
	    	
	    	FileOutputStream out = new FileOutputStream("D:\\Selenium Automation\\poi\\POI.xlsx");
			w.write(out);
	    	
	}

}

}