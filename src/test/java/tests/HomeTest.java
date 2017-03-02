package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.VerifySignInPage;

public class HomeTest extends BaseClass
{
	@Test
	  public void HomePage() throws InterruptedException 
	{
		VerifySignInPage signInPage=new VerifySignInPage(driver);
		signInPage.SignInMethod();
	    Thread.sleep(2000);
		
		HomePage homePage=new HomePage(driver);
		homePage.clickOnCreateBatchLinkInHomePage();
	    Thread.sleep(2000);
	}
}