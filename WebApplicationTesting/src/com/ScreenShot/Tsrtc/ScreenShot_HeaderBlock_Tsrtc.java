package com.ScreenShot.Tsrtc;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_HeaderBlock_Tsrtc {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in");
		
		WebElement HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
		List<WebElement>Links=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		for(int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
			
			String LinkName=Links.get(i).getText();
			
			Links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Best Buy\\Desktop\\Prasanna Screen Shot\\"+LinkName+".png"));
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
			Links=HeaderBlock.findElements(By.tagName("a"));
			
			driver.close();
						
		}
	}

}
