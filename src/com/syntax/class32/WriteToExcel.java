package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir")+"/testdata/Test.xlsx";//copy this part from file properties
		FileInputStream fis = new FileInputStream(filePath);
		
		//I am working with a excel file i build workbook object
		
		Workbook book = new XSSFWorkbook(fis);
		
		//writing into existing sheet
		Sheet sheet2=book.getSheet("Sheet1");
		
		
		
		
	}
}
