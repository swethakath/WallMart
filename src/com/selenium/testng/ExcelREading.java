package com.selenium.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelREading 
{
	
	@Test
	public void tc001() throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Documents\\Swetha\\Eclipse Projects\\WallMart\\TestData\\WallMartTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("TestCases");
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		
		
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());

	}

}
