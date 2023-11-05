package tasks;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
public static void main(String[] args) throws IOException {
	
	// Set path for reading
	XSSFWorkbook book = new XSSFWorkbook("src\\test\\java\\tasks\\ReadBook.xlsx");
	
	//Get into file
	XSSFSheet sheet = book.getSheet("Sheet1");
	
	
	int rowCount = sheet.getLastRowNum();
	
	int colCount = sheet.getRow(0).getLastCellNum();
	System.out.println(rowCount);
	
	
	String [][] arrayOfData = new String [rowCount][colCount];
	
	//Getting into row
	for(int i=1;i<=rowCount;i++) {
		
		XSSFRow row = sheet.getRow(i);
		
		//Getting into cell
		for(int j =0;j<colCount;j++) {
			
			XSSFCell cell = row.getCell(j);
			// Printing data in console
			
			
			System.out.printf("%10s    |",cell.getStringCellValue());
			
			// Setting data in an array
			
			
		}
		System.out.println();
		
		
		 
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
}
