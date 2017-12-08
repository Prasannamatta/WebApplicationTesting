package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_OneRow_Static {

	public static void main(String[] args) 
	{
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.timeanddate.com/worldclock/");
        
        driver.manage().window().maximize();
        
		//https://www.timeanddate.com/worldclock/
       // html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
       // html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[1]
        
        String Part1 =  "html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
        String Part2 =  "]/td[1]";
        
         for(int i=1; i<=36; i++)
         {
        	 String TestData=driver.findElement(By.xpath(Part1+i+Part2)).getText();
        	 System.out.println(TestData);
         }   
         driver.close();
	}

}
