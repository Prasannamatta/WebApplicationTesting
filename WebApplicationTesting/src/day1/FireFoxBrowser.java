package day1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver munch = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		
		driver.close();

	}

}
