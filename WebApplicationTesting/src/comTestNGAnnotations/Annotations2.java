package comTestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 
{
	@BeforeMethod
	public void BrowserLaunch_Login()
	{
		System.out.println("Browser and login");
	}
	@Test(priority= 1)
	public void Inbox()
	{
		System.out.println("testing Inbox Functinality");
	}
	
	@Test(priority= 2)
	public void ComposeMail()
	{
		System.out.println("testing Compose mail");
	}
	@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("Close the browser");
	}
	
}
