package org.abc;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel1 {

	public static void main(String[] args) throws Throwable {

		File excelloc = new File("C:\\Users\\SANDEEP\\Documents\\automation testing\\blank excel.xlsx");
		//converting to obj
		FileInputStream f = new FileInputStream(excelloc);
		//workbook creation
		Workbook w = new XSSFWorkbook(f);
		//Sheet
		Sheet s = w.getSheet("Data");
		Row r = s.getRow(1);
	
		Cell c = r.getCell(1);
		System.out.println(c);
		CellType type = c.getCellType();
		System.out.println(type);
		
		if (type == CellType.STRING) {
			
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		}
		
		if (type == CellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(c)) {
				SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
				String format = s1.format(c.getDateCellValue());
				System.out.println(format);
			}
			
			
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);
			System.out.println(valueOf);
		}
	}
}
