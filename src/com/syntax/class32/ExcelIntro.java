package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/seymaatasoy/Downloads/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//Accessing workbook
		
		Workbook wbook = new XSSFWorkbook(fis);
		
		//Accessing sheet
		Sheet sheet =wbook.getSheet("Sheet1");//always import apache poi sss model
		
		//Accessing row
		
		Row row1 =sheet.getRow(0);
		//Once you have access to the row you can have access to the cell
		//Accessing cell
		Cell cell = row1.getCell(1);
		
		//Get value from cell
		String r1cell2 = cell.toString();
		System.out.println(r1cell2);
		
		//how to get Newyork
		
		Row row3 = sheet.getRow(2);
		Cell cell3=row3.getCell(2);
		String r3c3 = cell3.toString();
		System.out.println(r3c3);
		
		//how to get Virginia
		// To get it with method chaining
		
		System.out.println(sheet.getRow(1).getCell(3).toString());
		
		
		//To retrieve values based on type
		//getNumericCellValue will print as it is
		double cellv = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);
		
		//how to get 20151 in a string format
		String valC = sheet.getRow(1).getCell(4).toString();
		String [] arr = valC.split("\\.");
		System.out.println(arr[0]);
	}

}
