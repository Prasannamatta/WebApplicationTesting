package com.Keyword_Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Login_keyword //keyword driven framework
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Login() throws IOException
	{
		FileInputStream  file = new FileInputStream("C:\\Users\\Best Buy\\Desktop\\PrasannaSelenium\\WebApplicationTesting"
				+ "\\NewTours_Application.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Signin"))).click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
