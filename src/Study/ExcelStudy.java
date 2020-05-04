package Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelStudy {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath =System.getProperty("user.dir")+"testdata/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet2");
		
		
		
		
	}
}
