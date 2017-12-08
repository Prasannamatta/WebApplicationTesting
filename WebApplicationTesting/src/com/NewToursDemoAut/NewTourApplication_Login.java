package com.NewToursDemoAut;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTourApplication_Login 
{
	FirefoxDriver driver;
	 
	 @BeforeTest
	 public void setUp()
	 {
	   driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize();
	  
	  Sleeper.sleepTightInSeconds(10);
	 
	 }
	 
	 @Test(priority=1)
	 public void LogIn()
	 {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  
	  driver.navigate().back();
	  
	 }
	 
	 @Test(priority=2)
	 public void Register()
	 {
	  driver.findElement(By.linkText("REGISTER")).click();
	 }
	 
	 
	 @AfterTest
	 public void ApplicationClose()
	 {
	  
	  driver.close();
	 }
	
}
