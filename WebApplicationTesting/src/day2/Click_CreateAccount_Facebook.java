package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_CreateAccount_Facebook {
	
	public static void main(String[] args) {
		
		FirefoxDriver browser = new FirefoxDriver();
		
		browser.get("http://facebook.com");
		
		browser.findElement(By.id("u_0_r")).click();//inspect the elements by id locator
		 
		browser.close();
		
		
	}

}
