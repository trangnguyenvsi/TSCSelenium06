package com.vsii.tsc.TSCSelenium06.quyentx.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadData {
	public static String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getRow(0).getLastCellNum();
			int totalNoOfRows = sh.getPhysicalNumberOfRows();

			arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];
			Iterator<Row> rowIterator = sh.iterator();
			for (int i = 1; i < totalNoOfRows; i++) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				for (int j = 0; j < totalNoOfCols; j++) {
					Cell cell = cellIterator.next();
					// Get String only, need to convert into other types???
					arrayExcelData[i - 1][j] = cell.getStringCellValue();

				}
			}
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
		return arrayExcelData;
	}
}
