package maven_package.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

	
	@BeforeTest
	public void opendriver()
	{
		
		opendriver("https://admin-stage-omniful.ibtikar.sa/pages/login");
		
	}
	
	@Test
	public void testlogin() throws InterruptedException
	{
		
		
		 LoginBage logobj = new LoginBage(driver);
    	 logobj.loginmethod("mostafa@omniful.com", "12345678");
    	 
    	 Thread.sleep(10000);
    	 driver.manage().window().maximize();
	}
	
	
	
}
