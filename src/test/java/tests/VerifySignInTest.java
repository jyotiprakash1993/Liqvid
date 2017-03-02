package tests;

import org.testng.annotations.Test;
import pages.VerifySignInPage;

public class VerifySignInTest extends BaseClass
{
	 @Test
	  public void VerifySignInPage() throws InterruptedException 
	{
		  VerifySignInPage signInPage=new VerifySignInPage(driver);
		  signInPage.SignInMethod();
	      Thread.sleep(5000);
	}
}