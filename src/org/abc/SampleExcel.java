package org.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {

	public static void main(String[] args) throws NullPointerException, IOException {
		
		//Initiating File
		File excelloc = new File("C:\\Users\\SANDEEP\\Documents\\automation testing\\blank excel.xlsx");
		
		//converting into object type
		FileInputStream stream = new FileInputStream(excelloc);
		
		//Workbook creation
		Workbook  w = new XSSFWorkbook(stream);
		
		//Sheet
		Sheet s = w.getSheet("Data");
		
		//iterating row to get all row values
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			
			
			int physicalNumberOfRows = s.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			
			int physicalNumberOfCells = r.getPhysicalNumberOfCells();
			System.out.println(physicalNumberOfCells);
		}
		
		
	}

}
