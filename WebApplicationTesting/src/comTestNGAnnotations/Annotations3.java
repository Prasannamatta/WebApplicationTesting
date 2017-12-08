package comTestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{
	@BeforeTest
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
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("Close the browser");
	}
}
