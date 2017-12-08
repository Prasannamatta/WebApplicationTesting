package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Complete_Data {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Best Buy\\Desktop\\PrasannatestDataFile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		  for(int i=0;i<=RowCount;i++)
		  {
		   Row r=sheet.getRow(i);
		   
		   int CellCount=r.getLastCellNum();
		   for(int k=0;k<CellCount;k++)
		   {
		    String testData=r.getCell(k).getStringCellValue();
		    System.out.print(testData+"  ");
		   }
		   System.out.println();
		  }
		  
		 }

	

}
