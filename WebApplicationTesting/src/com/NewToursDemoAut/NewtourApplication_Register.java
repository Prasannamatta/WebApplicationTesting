package com.NewToursDemoAut;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewtourApplication_Register
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		Sleeper.sleepTight(10);
	}
	
	@Test
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Loki");
		driver.findElement(By.name("lastName")).sendKeys("David");
		driver.findElement(By.name("phone")).sendKeys("9022105957");
		driver.findElement(By.name("userName")).sendKeys("lokidavid@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("2001");
		driver.findElement(By.name("address2")).sendKeys("Brunswick");
		driver.findElement(By.name("city")).sendKeys("Halifax");
		driver.findElement(By.name("state")).sendKeys("NS");
		driver.findElement(By.name("postalCode")).sendKeys("v5b4s4");
		//driver.findElement(By.name("country")).click();
		driver.findElement(By.name("country")).sendKeys("Canada");
		driver.findElement(By.name("email")).sendKeys("LokiDavid");
		driver.findElement(By.name("password")).sendKeys("dustin");
		driver.findElement(By.name("confirmPassword")).sendKeys("dustin");
		driver.findElement(By.name("register")).click();
		
		String ExpectedData="LokiDavid";
		
		
		String ActualData=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table"
				+ "/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(ActualData.contains(ExpectedData))
		{
			System.out.println("Test case is passed -- Pass");
		}
		else
		{
			System.out.println("Test case is Failed -- Fail");
		}
		
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
	}
	
	
	@AfterTest
	 public void ApplicationClose()
	 {
	  
	  driver.close();
	 }

}
