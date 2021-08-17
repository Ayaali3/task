package maven_package.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/ul/li[2]/a")
	WebElement client;
	
	
	public void homemethod()
	{
		
		
        client.click();
		
	}
}
