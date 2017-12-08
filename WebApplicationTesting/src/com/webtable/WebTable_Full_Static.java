package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Full_Static {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		
		String Part1 = "html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String Part2 = "]/td[";
		String Part3 = "]";
		
		for(int i=1; i<=36; i++) //rows
		{
			for(int j=1; j<=8; j++)
			{
				String TestData=driver.findElement(By.xpath(Part1+i+Part2+j+Part3)).getText();
				
				System.out.print(TestData+ " ");
               
			}
			 System.out.println();
		}
		
	    driver.close();
	}

}
