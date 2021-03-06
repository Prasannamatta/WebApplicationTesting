package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	public void Support()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	public void Contact()
	{
		contact.click();
	}
	
	@FindBy(name="userName")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement signin;
	
	public void FindAFlight(String Uname, String pwd)
	{
		Username.sendKeys(Uname);
		Password.sendKeys(pwd);
		
		signin.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement Yourdestination;
	
	public void Destinations()
	{
		Yourdestination.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement vacations;
	public void Vacations()
	{
		vacations.click();
		Sleeper.sleepTightInSeconds(5);
	}

	
	/*@FindBy(linkText="Register                      here")
	WebElement Register;
	public void register()
	{
		Register.click();
	}*/
	
	@FindBy(linkText="Hotels")
	WebElement hotels;
	public void HOTELS()
	{
		hotels.click();
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement rentals;
	public void RENTALS()
	{
		rentals.click();
	}
	
	@FindBy(linkText="Cruises")
	WebElement cruises;
	public void CRUISES()
	{
		cruises.click();
	}
	
	@FindBy(linkText="Destinations")
	WebElement destination;
	public void destinations()
	{
		destination.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	public void vacations()
	{
		Vacations.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
