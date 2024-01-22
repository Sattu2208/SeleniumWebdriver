package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream("D:\\Selenium Automation\\poi\\ReadData.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(file);
		
		//XSSFSheet s = w.createSheet("WriteData");
		XSSFSheet s = w.getSheet("WriteData");
		
		
		//Create Rw
		XSSFRow r1 = s.createRow(0);
		r1.createCell(0).setCellValue("Upsurge");
		r1.createCell(1).setCellValue("Infortech");
		r1.createCell(2).setCellValue("400058");
		
		XSSFRow r2 =s.createRow(1);
		r2.createCell(0).setCellValue("Student NAme");
		r2.createCell(1).setCellValue("ID");
		r2.createCell(2).setCellValue("Location");
		r2.createCell(3).setCellValue("Passout year");
		
		XSSFRow r3 = s.createRow(2);
		r3.createCell(0).setCellValue("Anna");
		r3.createCell(1).setCellValue("102340");
		r3.createCell(2).setCellValue("Mumbai");
		r3.createCell(3).setCellValue("2006");
		
		FileOutputStream out = new FileOutputStream("D:\\Selenium Automation\\poi\\ReadData.xlsx");
		w.write(out);
		
	}

}
