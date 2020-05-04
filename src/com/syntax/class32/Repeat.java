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

public class Repeat {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir")+"/testdata/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet1 = wbook.getSheet("TestSheet2");
		
		int row = sheet1.getPhysicalNumberOfRows();
//		System.out.println(row);
		
		int col = sheet1.getRow(0).getLastCellNum();
//		System.out.println(col);
		
		List<Map<String, String>> listMap = new ArrayList<>();	
		
		for(int r=1 ; r<row ; r++) {
			
			Map<String, String> map = new LinkedHashMap<>();
			for(int c =0 ; c<col ; c++) {
				
				String key = sheet1.getRow(0).getCell(c).toString();
				String value = sheet1.getRow(r).getCell(c).toString();
				map.put(key, value);
				
			}listMap.add(map);
		}System.out.println(listMap);
		
		
	}
}
