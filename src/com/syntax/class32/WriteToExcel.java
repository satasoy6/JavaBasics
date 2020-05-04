package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir")+"/testdata/Test.xlsx";//copy this part from file properties
		FileInputStream fis = new FileInputStream(filePath);
		
		//I am working with a excel file i build workbook object
		
		Workbook book = new XSSFWorkbook(fis);
		
		//writing into existing sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(5).setCellValue("Country");//If there is something is already here it will be overwritten
		
		sheet.createRow(3).createCell(0).setCellValue("Hichem");
		
		Sheet customSheet = book.createSheet("TestSheet2");
		
		FileOutputStream fos = new FileOutputStream (filePath);
		book.write(fos);
		
		//If you want to make modifications you need to load first
		
	}
}
