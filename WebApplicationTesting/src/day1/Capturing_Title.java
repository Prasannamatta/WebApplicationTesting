package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_Title {

	public static void main(String[] args) 
	{
		/*FirefoxDriver browser = new FirefoxDriver();
		
	     browser.get("http://sunlife.ca");
	     
	     System.out.println(browser.getTitle());*/
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.indeed.ca/");
		driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();

	}

}
