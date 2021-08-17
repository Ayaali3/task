package maven_package.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
	
	@BeforeTest
	public void opendriver()
	{
		
		opendriver("https://admin-stage-omniful.ibtikar.sa/");
		
	}
	
	@Test
	public void testhome() throws InterruptedException
	{
		
		 LoginBage logobj = new LoginBage(driver);
    	 logobj.loginmethod("mostafa@omniful.com", "12345678");
    	 
    	 driver.manage().window().maximize();
    	
    	 Thread.sleep(10000);

		 HomePage homobj = new HomePage(driver);
    	 homobj.homemethod();
		
	}
	
	

}
