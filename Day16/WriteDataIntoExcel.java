/*
 * Create a Java program to write data 
 * into Excel using Apache POI
 */



package tasks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
	
	
	// 1) Creating a new Workbook
	XSSFWorkbook book = new XSSFWorkbook();
	
	// 2) Creating new Sheet
	
	 XSSFSheet sheet = book.createSheet("Firstsheet");
	
	// 3) the Data 
	Object [][] data = {
			{"Name","Age","Email"},
			{"John Doe",30,"john@test.com"},
			{"Jane Doe",28,"jane@test.com"},
			{"Bob Smith",35,"jacky@example.com"},
			{"Swapnil",37,"joe@example.com"}
			};
	
	// Program to writ data into Excel
	
	int rowCount =0;
	
	for(Object [] rows: data) {
		
		XSSFRow row = sheet.createRow(rowCount++);
		int columnCount = 0;
		for(Object col : rows) {
			XSSFCell cell = row.createCell(columnCount++);
			 if(col instanceof String) {
				 cell.setCellValue((String)col);
			 }else if(col instanceof Integer){
				 cell.setCellValue((Integer)col);
			 }
		}
		
		
	}
	
	try(FileOutputStream output = new FileOutputStream("FirstFile.xlsx")){
		book.write(output);
		System.out.println("File Sucessfully Created");
	}catch(Exception e) {
		System.out.println(e);
	}
	
}	

}
