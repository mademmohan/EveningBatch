package com.automationframework.seleniumbasicconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderPractice {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("C:\\Users\\gurum\\Desktop\\Practice.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fi);

		XSSFSheet sh = wb.getSheet("Test");
		int RollNumber = (int) sh.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(RollNumber);

	}

}
