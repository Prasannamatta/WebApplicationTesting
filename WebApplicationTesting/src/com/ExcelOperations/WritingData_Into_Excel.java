package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData_Into_Excel {

	public static void main(String[] args) throws IOException
	{
		  FileInputStream file = new FileInputStream("C:\\Users\\Best Buy\\Desktop\\PrasannatestDataFile.xlsx");
		  XSSFWorkbook workBook = new XSSFWorkbook(file);
		  XSSFSheet sheet = workBook.getSheet("Sheet1");

		  Row r=sheet.createRow(4);
		  Cell c=r.createCell(5);
		  
		  c.setCellValue("Prasanna");
		  
		  FileOutputStream file1 = new FileOutputStream("C:\\Users\\Best Buy\\Desktop\\PrasannatestDataFile.xlsx");
		  workBook.write(file1);
		  
		 }

		

	}


