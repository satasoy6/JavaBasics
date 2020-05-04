package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {
	
	public static void main(String[] args) throws IOException {
		
		
		String filePath = System.getProperty("user.dir")+"/testdata/Test.xlsx";//copy this part from file properties
		System.out.println(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		
		//I am working with a excel file i build workbook object
		
		Workbook book = new XSSFWorkbook(fis);
		
		//writing into existing sheet
		Sheet sheet = book.getSheet("TestSheet");
		
		//We need to find out how many rows and columns are there
		
		int rows = sheet.getPhysicalNumberOfRows();//Returns me number of rows
		int cols = sheet.getRow(0).getLastCellNum();
		//usually first row decides how many columns are there that's why we use it in the code
		
		System.out.println("Rows ="+rows);
		System.out.println("Columns ="+cols);
		List<Map<String, String>> listMap = new ArrayList<>();	
		
		//Every map will be an individual map
		for(int r= 1; r<rows ; r++) {// we start from the 1st row because actual value start from row 1
			Map<String,String> map = new LinkedHashMap<>();
			
			for (int c=0; c<cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			listMap.add(map);
		}System.out.println(listMap);
			
	}

}
