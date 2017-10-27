package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
	
	public WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void verifyTitle(String etitle)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	try
	{
		wait.until(ExpectedConditions.titleContains(etitle));
		Reporter.log("title is matching", true);
	}
	
	catch(Exception e)
	{
		Reporter.log("title is not matching",true);
		Assert.fail();
	}
	
}
public void verifyelementIspresent(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	try
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is present", true);
				
	}
	catch(Exception e)
	{
		Reporter.log("Element is not present", true);
		Assert.fail();
	}
}

public void selectelement(WebElement ele,String text )
{
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
}
