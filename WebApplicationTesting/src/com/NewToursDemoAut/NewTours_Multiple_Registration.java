package com.NewToursDemoAut;

import java.io.FileInputStream;
//in this program combining both data driven and keyword frame work
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Multiple_Registration //data driven frame work
{
	FirefoxDriver driver;//globally declaring
	
	@BeforeTest
	public void Setup()
	{
		driver = new FirefoxDriver();  //creating the object for Firefox
		driver.get("http://newtours.demoaut.com");     //opening the website
		
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void Registration()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		Sleeper.sleepTightInSeconds(5);
	}
	
	@Test(priority=2)
	public void EnterUserData() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Best Buy\\Desktop\\PrasannaSelenium"
				+ "\\WebApplicationTesting\\src\\com\\Registration_Data\\RegisterTestData.xlsx"); //opening the xcel fil
		
		XSSFWorkbook workBook = new XSSFWorkbook(file); //creating object for workbook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\Best Buy\\Desktop\\PrasannaSelenium\\WebApplicationTesting"
				+ "\\NewTours_Application.properties");
		Properties pr = new Properties();
		pr.load(file2);
		 
	    int rowcount=sheet.getLastRowNum(); //have to get the total count of rows
	      
	    for(int i=1;i<=rowcount; i++)
	    {
	    	Row r=sheet.getRow(i); //starting from the i th row of first cell
	    	
	    	
	    	driver.findElement(By.name(pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
	    	
	    	double d=r.getCell(2).getNumericCellValue();
	    	  long x=(long)d;
	    	  String phonenumber=Long.toString(x);
	    	
	    	driver.findElement(By.name(pr.getProperty("Phone"))).sendKeys(phonenumber);
	    	driver.findElement(By.name(pr.getProperty("Email"))).sendKeys(r.getCell(3).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("Address1"))).sendKeys(r.getCell(4).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
	    	
	    	double f=r.getCell(7).getNumericCellValue();//converting numerical value into string 
	    	long s = (long)f;//converting double to long
	    	String postalCode = Long.toString(s); //converting into string called typecasting
	    	
	    	driver.findElement(By.name(pr.getProperty("PostalCode"))).sendKeys(postalCode);
	    	driver.findElement(By.name(pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("Username"))).sendKeys(r.getCell(9).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("password"))).sendKeys(r.getCell(10).getStringCellValue());
	    	driver.findElement(By.name(pr.getProperty("Confirmpassword"))).sendKeys(r.getCell(11).getStringCellValue());
	    	
	    	driver.findElement(By.name(pr.getProperty("Register"))).click();
	    	
	    	//driver.navigate().back();
	    	
	    	 String ExpectedData =r.getCell(9).getStringCellValue();
	    	  
	    	  String ActualData=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]"
	    	  		+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	    	  
	    	if(ActualData.contains(ExpectedData))
	    	{
	    		System.out.println("Registration completed -- Pass");
	    		  r.createCell(12).setCellValue(" Pass");
	    	}
	    	else
	    	{
	    		System.out.println("Registration failed -- fail");
	    		  r.createCell(12).setCellValue("FAIL");
	    	}
	    	
	    	 driver.navigate().back();

	    	  FileOutputStream file1 = new FileOutputStream("C:\\Users\\Best Buy\\Desktop\\PrasannaSelenium\\WebApplicationTesting\\src"
	    	  		+ "\\com\\Registration_Data\\RegisterTestDataResults1.xlsx");
	    	  workBook.write(file1);
	    	
	    	
	    }
	   
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
