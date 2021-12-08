package Seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("//Users//aarav//Downloads//EmployeeList_TestCases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet  = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row firstrow  = row.next();
				Iterator<Cell> ce= firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
			
				{
					Cell value  = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Expected Result"))
							{
							column=k;
							}
				k++;	
				}
				System.out.println("column is " + column);
		}
		
		}
	}

}
