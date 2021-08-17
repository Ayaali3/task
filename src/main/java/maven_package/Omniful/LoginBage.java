package maven_package.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBage extends PageBase {

	public LoginBage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
      @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/main/div/div/div/div/div[2]/div/div/form/div[1]/input")
      WebElement email;
      
      
      @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div/div/main/div/div/div/div/div[2]/div/div/form/div[2]/input")
      WebElement password;
      
      
      @FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div/div/div/div/main/div/div/div/div/div[2]/div/div/form/div[3]/button" )
      WebElement btn;
    
      
      public void loginmethod(String mail,String passw)
      {
    	  
    	email.sendKeys(mail);
    	password.sendKeys(passw);
    	btn.click();
    	  
    	  
    	  
    	  
    	  
    	  
      }
      
      
      
      
      
      
      
      
      
}
