package day3;

//import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText_NewTours_DemoAut {

	public static void main(String[] args) 
	{
		FirefoxDriver browse = new FirefoxDriver();
		
		browse.get("http://newtours.demoaut.com");
		
		browse.findElement(By.linkText("REGISTER")).click();
		
		browse.findElement(By.linkText("Vacations")).click();
		
		browse.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();

		System.out.println(browse.getTitle());
		
		System.out.println(browse.getCurrentUrl());
		
		browse.close();
	}

}
