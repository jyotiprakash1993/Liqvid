package script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Basepage;
import pom.Loginpage;

public class validdetailentry extends BaseTest {


	@Test
	public void entry() throws InterruptedException, AWTException
	{
		Loginpage lp=new Loginpage(driver);
		//lp.setselfage();
	driver.findElement(By.xpath("(//a[text()='Health Insurance'])[2]")).click();;
		Basepage bp=new Basepage(driver);
		lp.setMembers();
		Thread.sleep(10000);
		//WebElement wb=driver.findElement(By.xpath("//i[@class='fa fa-plus'])[1]"));
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		      	
		        // driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	
		
	//	driver.findElement(By.xpath("((//select[@class='chkMemberAge'])[1]/option[14]")).click();
	
		   WebElement ele=driver.findElement(By.xpath("(//select[@class='chkMemberAge'])[1]"));
			bp.selectelement(ele,"30 Years");
			Thread.sleep(2000);
			WebElement ele1=driver.findElement(By.xpath("(//select[@class='chkMemberAge'])[2]"));
			bp.selectelement(ele1,"36 Years");
		
		lp.done();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	//lp.healthcitypincode("Ben");
	 WebElement ele4 = driver.findElement(By.xpath("//input[@id='healthCityPincode']"));
	 ele4.sendKeys("Ban");
	 
	List<WebElement> auto = driver.findElements(By.id("ui-id-1"));
			
			int count=auto.size();
			System.out.println(count);
			//for(int i=0;i<count;i++)
			//{
			//	WebElement b = auto.get(i);
			//	String text = b.getText();
			//	System.out.println(text);
			//}
			
			Thread.sleep(2000);
			auto.get(count-1).click();
	//Actions act=new Actions(driver);
	//WebElement ele5 = driver.findElement(By.xpath("html/body/ul/li[2]/a"));
//	act.moveToElement(ele5).perform();
	//ele5.click();
     
	/*Thread.sleep(5000);
	Robot r =new Robot();
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	*/
	Thread.sleep(1000);
	lp.healthincome();
	WebElement ele2=driver.findElement(By.xpath("//select[@id='healthIncome']"));
	bp.selectelement(ele2, "3 to 5 Lacs");
	Thread.sleep(1000);
	
	lp.healthname("Ajay");
	Thread.sleep(1000);
	lp.healtemail("ajay.c@gmail.com");
	Thread.sleep(1000);
	lp.healthmobileno("9987656543");
	Thread.sleep(1000);
	lp.healthcondition();
	Thread.sleep(2000);
	lp.healthsubmit();
	//driver.findElement(By.xpath("(//a[.='Get Free Quotes'])[2]")).click();
	Thread.sleep(20000);
	lp.religareemi();
	Thread.sleep(20000);
	lp.premium();
	}


}
