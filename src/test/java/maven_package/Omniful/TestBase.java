package maven_package.Omniful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public void opendriver(String url)
	{
		
		
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		driver.navigate().to(url);
		
	}
}
