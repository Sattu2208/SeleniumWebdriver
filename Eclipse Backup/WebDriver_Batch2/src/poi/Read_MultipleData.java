package poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_MultipleData {

	public static void main(String[] args) throws IOException {
		

		FileInputStream file = new FileInputStream("D:\\Selenium Automation\\poi\\ReadData.xlsx");
		
        XSSFWorkbook w = new XSSFWorkbook(file);
		
		XSSFSheet s=w.getSheet("Username Password");
		
		//Store last row
		int rowSize = s.getLastRowNum();
		System.out.println("Number of row is "+rowSize);
		
		//for loop
		for (int i = 0;i<=rowSize;i++)
		{
			String name = s.getRow(i).getCell(0).getStringCellValue();
			String pwd = s.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(name+"\t\t"+pwd);
		}
		
	}

}
