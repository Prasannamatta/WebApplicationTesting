package day4;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Counting_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		List<WebElement>Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		//System.out.println(Links.get(5).getText());
		
        for(int i=0; i<Links.size(); i++)
        {
        	if(Links.get(i).isDisplayed())
        	{
        		System.out.println(Links.get(i).getText());
        	}
        }
		
		/*FirefoxDriver browse = new FirefoxDriver();
		browse.get("http://newtours.demoaut.com");
		
		List<WebElement>Name = browse.findElements(By.tagName("font"));
		
		System.out.println(Name.size());
		
		for(int i=0;i<Name.size(); i++)
		{
			System.out.println(Name.get(i).getText());
				
		}
		
		browse.close();*/
		
	}

}
