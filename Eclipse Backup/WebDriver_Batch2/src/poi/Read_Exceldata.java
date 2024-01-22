package poi;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read_Exceldata 
{

	public static void main(String[] args) throws Exception
	{
	
        //Step 1 : Create an object of file input stream --- To store excel path
		
		FileInputStream file = new FileInputStream("D:\\Selenium Automation\\poi\\ReadData.xlsx");
		
		// Step 2 : Create Object of XSSFWorkBook
        XSSFWorkbook w = new XSSFWorkbook(file);
		//Step 3 : Create Object of XSSFsheet
		
		XSSFSheet s=w.getSheet("ReadData");
		
		//Store Data in Variable
		String a= s.getRow(0).getCell(0).getStringCellValue();
		String b = s.getRow(0).getCell(1).getStringCellValue();
		int c =(int)s.getRow(0).getCell(2).getNumericCellValue();
		
		//Step 5 :Display Data on Console
		System.out.println(a+"\t\t"+b+"\t\t"+c);	
		
	}

}
