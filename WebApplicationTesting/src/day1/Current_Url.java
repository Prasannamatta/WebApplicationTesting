package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Current_Url {

	public static void main(String[] args) {
		
		FirefoxDriver browser = new FirefoxDriver();
		
	     browser.get("http://sunlife.ca");
	  System.out.println(browser.getCurrentUrl());
	     
	     browser.close();
	}

}
