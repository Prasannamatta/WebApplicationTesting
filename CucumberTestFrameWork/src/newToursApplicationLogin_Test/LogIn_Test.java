package newToursApplicationLogin_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn_Test 
{
	FirefoxDriver driver;
	
	@Given("^Open FireFox Browser and Navigate to NewTours Application$")
	public void Open_FireFox_Browser_and_Navigate_to_NewTours_Application() throws Throwable 
	{
		 driver = new FirefoxDriver();
	     driver.get("http://newtours.demoaut.com");
	   
	}

	@When("^User Enters Valid UserName and Password and click on SignIn Button$")
	public void User_Enters_Valid_UserName_and_Password_and_click_on_SignIn_Button() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		  driver.findElement(By.name("password")).sendKeys("tutorial");
		  
		  driver.findElement(By.name("login")).click();
	}

	@Then("^User should be successful able to SignIn to the Application$")
	public void User_should_be_successful_able_to_SignIn_to_the_Application() throws Throwable
	{
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
	}

	@Then("^User Should SignOff and close the Apllication$")
	public void User_Should_SignOff_and_close_the_Apllication() throws Throwable
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
		  driver.close();
	}

}
