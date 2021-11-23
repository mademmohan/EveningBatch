package com.automationframework.seleniumbasicconcepts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndwriteExcelData {

	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("TestData");

		sheet.createRow(1);

		sheet.getRow(1).createCell(0).setCellValue("MrTesting@gmail.com");
		sheet.getRow(1).createCell(1).setCellValue("Testing@123");

		sheet.createRow(2);

		sheet.getRow(2).createCell(0).setCellValue("EveningBatch@gmail.com");

		sheet.getRow(2).createCell(1).setCellValue("evening@123");

		File file = new File("C:\\Users\\gurum\\Desktop\\Tested.xlsx");

		FileOutputStream fi = new FileOutputStream(file);

		workbook.write(fi);

		System.out.println("Execution completed");
	}

}
