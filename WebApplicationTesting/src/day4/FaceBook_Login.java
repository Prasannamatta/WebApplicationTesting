package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_Login {

	public static void main(String[] args) 
	{
		FirefoxDriver browse = new FirefoxDriver();
		browse.get("http://facebook");
		
		browse.findElement(By.name("email")).sendKeys("prasanna.matta11@gmail.com");
		
		browse.findElement(By.name("pass")).sendKeys("mattaanji");
		
		browse.findElement(By.id("u_0_5")).click();
		
		/*FirefoxDriver browse = new FirefoxDriver();
		browse.get("http://newtours.demoaut.com");
		
        browse.findElement(By.name("userName")).sendKeys("tutorial");
		
		browse.findElement(By.name("password")).sendKeys("tutorial");
		
		browse.findElement(By.name("login")).click();
		
		browse.findElement(By.linkText("SIGN-OFF")).click();*/
		
		browse.close();
		
				
		
	}

}
