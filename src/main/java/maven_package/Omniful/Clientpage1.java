package maven_package.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Clientpage1 extends PageBase {

	public Clientpage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div/div/header/div/div/button")
	WebElement newclient;
	
	public void clientmethod()
	{
		
		
	newclient.click();	
		
		
	}
	
}
