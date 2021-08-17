package maven_package.Omniful;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClientTest extends TestBase {

	

	@BeforeTest
	public void opendriver()
	{
		
		opendriver("https://admin-stage-omniful.ibtikar.sa/");
		
	}
	
	@Test
	public void testnewclient() throws InterruptedException
	{
		
		 LoginBage logobj = new LoginBage(driver);
    	 logobj.loginmethod("mostafa@omniful.com", "12345678");
    	 
    	 driver.manage().window().maximize();
    	 
		 HomePage homobj = new HomePage(driver);
    	 homobj.homemethod();
    	 
    	 Thread.sleep(10000);
    	 
    	 Clientpage1 cliobj= new Clientpage1(driver);
    	 cliobj.clientmethod();
    	 
    	 
    	 Thread.sleep(10000);
    	 
		 NewClient newcliobj = new NewClient(driver);
    	 newcliobj.newclientmethod("aya","aya41918@gmail.com","ibtikar", "01126512082");
	     
	}
	
}
