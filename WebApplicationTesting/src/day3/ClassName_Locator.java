package day3;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName_Locator {

	public static void main(String[] args)
	{
        FirefoxDriver browse = new FirefoxDriver();
        
        browse.get("http://google.com");
        
      /*  browse.findElement(By.className("gb_P")).click();
        
        System.out.println(browse.getCurrentUrl());*/
        
        browse.findElement(By.linkText("Images")).click();
        
        System.out.println(browse.getTitle());
        
       // browse.findElement(By.id("gs_htif0"));
        
        //browse.close();
        
        
        

	}

}
