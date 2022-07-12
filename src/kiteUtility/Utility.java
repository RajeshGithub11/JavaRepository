package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		//Why static method is created?
		//why driver and this keyword is used?
		//why call non static method inside non static method by object.
		File myfile=new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	
	}

}
