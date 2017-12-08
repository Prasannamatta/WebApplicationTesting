package com.eiprasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Employee_Ins {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://srv265.hrdc-drhc.gc.ca/interdec/ouverturedesession-login/ouverturedesession-login.aspx?lang=eng");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("SIN")).sendKeys("136-275-286");
		
		driver.findElement(By.id("AccessCode")).sendKeys("0294");
		
		driver.findElement(By.id("ProvinceID")).sendKeys("British Columbia");
		
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("RightButton")).click();
	}

}
