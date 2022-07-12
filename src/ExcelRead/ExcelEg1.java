package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//need to create object of file class
		File myfile=new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		
		// using WorkbookFactory class call create method and pass details
		// to read String type value
		String StringValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(StringValue);
		
		//to read numeric value
		double NumericValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		
		System.out.println(NumericValue);
		
		//to read boolean value
		boolean BooleanValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		
		System.out.println(BooleanValue);
		
		//to read char value
		String charValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		
		System.out.println(charValue);
		
		
		
	}

}
