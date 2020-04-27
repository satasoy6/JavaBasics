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
		
		FileInputStream obj = new FileInputStream(filePath);
		//Accessing workbook
		Workbook wbook = new XSSFWorkbook(obj);
		//Accessing sheet
		Sheet sheet =wbook.getSheet("Sheet1");//always import apache poi sss model
		//Accessing row
		Row row1 = sheet.getRow(0);
		//Accessing cell
		Cell cell = row1.getCell(1);
		//Get value from cell
		String r1cell2 = cell.toString();
		System.out.println(r1cell2);//LastName
		
		//hoe to get New york
		
	}

}
