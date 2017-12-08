package com.tsrtc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Bing
	{
		public static void main(String[] args)
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://bing.com");
			
			WebElement  Headerblock= driver.findElement(By.id("sc_hdu"));
			
		    List<WebElement>Links=Headerblock.findElements(By.tagName("a"));
		    
		    System.out.println(Links.size());
		    
		    for(int i=0; i<Links.size();i++)
		    {
		    	
		    	if(Links.get(i).isDisplayed())
		    	{	
		    		System.out.println(Links.get(i).getText());
		    				    		
		    	}
		     }
		    driver.close();
		}
}
