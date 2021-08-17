package maven_package.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewClient extends PageBase {

	public NewClient(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(id = "workspaceName")	
	    WebElement workspace;
		
		
		@FindBy(id = "email")
		WebElement email;
		
		
		@FindBy(id = "companyName")
		WebElement companyname;
		
		
		@FindBy(id = "phoneNumber")
		WebElement phonenumber;
		
		
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[3]/div[3]/div[2]/div[2]/form/div[2]/div/div/div[2]/button")
		WebElement savebtn;
		
		
		public void newclientmethod(String word1,String word2,String word3,String word4)
		{
					
	        workspace.sendKeys(word1);
	        email.sendKeys(word2);
	        companyname.sendKeys(word3);
	        phonenumber.sendKeys(word4);
	        savebtn.click();
		}
}
