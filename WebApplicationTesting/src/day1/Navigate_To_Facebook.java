package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_To_Facebook {

	public static void main(String[] args) 
	{
		//FirefoxDriver munch = new FirefoxDriver();
		
	
			  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			  ChromeDriver driver = new ChromeDriver();
			  
		
		driver.get("http://google.com");
		
		driver.navigate().to("http://facebook.com");
		
		driver.close();
	}

}
