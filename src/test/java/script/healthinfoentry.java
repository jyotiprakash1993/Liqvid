package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Basepage;

public class healthinfoentry extends BaseTest {
	
	@Test
	public void verifypolicyhomepage()
		{
		String policytitle = driver.getTitle();
		System.out.println(policytitle);
		//if(policytitle.equals("Insurance - Compare Insurance Policy Quotes - Life, Car, Health, Travel"))
		Basepage bp=new Basepage(driver);
		bp.verifyTitle("Insurance - Compare Insurance Policy Quotes - Life, Car, Health, Travel");
	}

}
