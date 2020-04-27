package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/seymaatasoy/Documents/Test.xlsx";
		FileInputStream fis = new FileInputStream (filePath);
		
		//to get an object of Workbook type
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");//to get access to the sheet
		//When you import Sheet select apache poi ss that is matching with Workbook
		
		//need to find numbers or rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		//find number of columns
		int colls = sheet.getRow(0).getLastCellNum();
		
		for(int r = 0;r<rows ; r++) {//iterates over rows
			for(int c=0; c<colls ; c++) {
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	
	
	

}
}