package comTestNGAnnotations;

import org.testng.annotations.Test;

public class Annottions1
{
	@Test(priority= 1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to launch the browser");
	}
	
	@Test(priority= 2)
	public void Login()
	{
		System.out.println("Can You please login");
	}
}
