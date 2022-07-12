package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("E:\\Rajesh\\Testing\\Automation Testing\\Selenium\\ExcelFiles\\Book1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet3"+ "");
		int NoofRow = sheet.getLastRowNum();
		short NoofColumn = sheet.getRow(NoofRow).getLastCellNum();
		int Actualcolumn = NoofColumn-1;
		
		for(int i=0;i<=NoofRow;i++)
		{
			for(int j=0;j<=Actualcolumn;j++)
			{
				Cell mycell = sheet.getRow(i).getCell(j);
				CellType cellresult = mycell.getCellType();
				
				if(cellresult==CellType.STRING)
				{
					String result = mycell.getStringCellValue();
					System.out.print(result);
				}
				else if(cellresult==CellType.BOOLEAN)
				{
					boolean booleanresult = mycell.getBooleanCellValue();
					System.out.print(booleanresult);
				}
				else if(cellresult==CellType.NUMERIC)
				{
					double numericresult = mycell.getNumericCellValue();
					System.out.print(numericresult);
				}
				else if(cellresult==CellType.BLANK)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		
	}

}
