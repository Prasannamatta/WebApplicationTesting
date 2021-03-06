package com.DropdownFunction;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown_Newtours 
{
	FirefoxDriver driver;
	
   @BeforeTest
   public void SetUp()
   {
	   driver = new FirefoxDriver();
	   driver.get("http://newtours.demoaut.com");
	   driver.manage().window().maximize();
   }
   
   @Test(priority=1)
   public void Register()
   {
	   driver.findElement(By.linkText("REGISTER")).click();
   }
   
   @Test(priority=2)
   public void DropDown()
   {
	  WebElement Country=driver.findElement(By.name("country"));
	  
	  List<WebElement>CountryNames=Country.findElements(By.tagName(" option"));
	  
	  System.out.println(CountryNames.size());
		
		for(int i=0;i<CountryNames.size(); i++)
		{
			System.out.println(CountryNames.get(i).getText());
		}
			 
   }
   
   @AfterTest
   public void TearDown()
   {
	   driver.close();
   }
   
}
