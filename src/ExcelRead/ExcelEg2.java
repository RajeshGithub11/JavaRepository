package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		
		Workbook work = WorkbookFactory.create(myfile);
		Sheet mysheet = work.getSheet("Sheet2");
		Row myRow = mysheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		String CellInfo = myCell.getStringCellValue();
		
		System.out.println(CellInfo);
		
		System.out.println("===========================");
		
		Sheet myresult = work.getSheet("Sheet2");
		
		for(int i=0;i<=1;i++) //outer loop for rows
		{
			for(int j=0;j<=2;j++)  //inner loop for cells
			{
				String result = myresult.getRow(i).getCell(j).getStringCellValue();
				System.out.print(result+" ");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
	}

}
