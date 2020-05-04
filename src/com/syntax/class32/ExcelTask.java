package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelTask {
	
	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		
		FileInputStream fis =  new FileInputStream(filePath);
		
		Workbook wbook = new XSSFWorkbook(fis);
		
		Sheet sheet1 = wbook.getSheet("Sheet2");
		
		int rows = sheet1.getPhysicalNumberOfRows();
		int cols = sheet1.getRow(0).getLastCellNum();
		
		for(int r=0 ; r<rows ; r++) {
			for(int c=0; c<cols ; c++) {
				String cellVal=sheet1.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}System.out.println();
		}
		
		
		
	}

}
