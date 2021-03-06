package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePagetesting 
{
	@Test
	 public void HomePageTesting()
	 {
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  driver.manage().window().maximize();
		
		WelcomeMercuryTours wmt = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		wmt.Register();
		driver.navigate().back();
		
		wmt.Support();
		driver.navigate().back();
		
		wmt.Contact();
		driver.navigate().back();
		
		wmt.FindAFlight("tutorial", "tutorial");
		driver.navigate().back();
		
		wmt.Destinations();
		driver.navigate().back();
		
		wmt.Vacations();
		driver.navigate().back();
		
		/*wmt.register();
		driver.navigate().back();*/
		
		wmt.HOTELS();
		driver.navigate().back();
		
		wmt.RENTALS();
		driver.navigate().back();
		
		wmt.CRUISES();
		driver.navigate().back();
		
		wmt.destinations();
		driver.navigate().back();
		
		wmt.vacations();
		driver.navigate().back();
		
		driver.close();
		
	 }  
	
	  
}
