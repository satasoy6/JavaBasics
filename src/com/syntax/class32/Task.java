package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Task {
	
	public static void main(String[] args) throws IOException {
		
		
		String filePath="/Users/seymaatasoy/Documents/Test.xlsx";
		String filePath1=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		FileInputStream fis =  new FileInputStream(filePath);
		
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet2");
		
		//find the number of rows
		
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		// find number of columns 
		int cols = sheet.getRow(0).getLastCellNum();
		
		// get data from all rows and all columns
		
		for(int r = 0;r<rows;r++) {
			for(int c = 0; c<cols; c++) {
				String cellVal = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
		}System.out.println();
		
		
	}

}
