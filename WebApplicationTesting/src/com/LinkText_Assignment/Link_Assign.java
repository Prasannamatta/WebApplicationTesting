package com.LinkText_Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Link_Assign 
{
	FirefoxDriver driver;//globally declaring
	
	@BeforeTest
	public void Setup()
	{
		driver = new FirefoxDriver();  
		driver.get("http://newtours.demoaut.com");     
		
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void Link_Test() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Best Buy\\Desktop\\PrasannaSelenium\\"
				+ "WebApplicationTesting\\src\\com\\Registration_Data\\DataDrivenLinksTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		for(int i=1; i<=rowcount; i++)
		{
			Row r = sheet.getRow(i);
			
			driver.findElement(By.linkText(r.getCell(0).getStringCellValue())).click();
			
			String ExpectedData = r.getCell(1).getStringCellValue();
			String ActualData = driver.getCurrentUrl();
			r.createCell(2).setCellValue(driver.getCurrentUrl());
			
			if(ActualData.equals(ExpectedData))
			{
				System.out.println("Pass");
				r.createCell(3).setCellValue("Pass");
			}
			else
			{
				System.out.print("Fail");
				r.createCell(3).setCellValue("Fail");
			}
			 driver.navigate().back();
			 
			 FileOutputStream file1 = new FileOutputStream("C:\\Users\\Best Buy\\Desktop\\PrasannaSelenium\\WebApplicationTesting\\src"
		    	  		+ "\\com\\Registration_Data\\DataDrivenLinksTestDataResults4.xlsx");
		    	  workbook.write(file1);
			
		}
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
