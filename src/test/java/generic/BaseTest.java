package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst{

	public WebDriver driver;
	
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(GECHO_KEY, GECHO_VALUE);
		driver=new FirefoxDriver();
		driver.get("https://www.policybazaar.com/");
		
	}
	
	@AfterMethod
	public void closeAppln()
	{
		//driver.quit();
	}
	
}
