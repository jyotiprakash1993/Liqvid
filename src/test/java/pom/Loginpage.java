package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginpage extends Basepage {
	
	@FindBy(xpath="(//a[text()='Health Insurance'])[2]")
	private WebElement dropdown;
	
	/*@FindBy(xpath="((//span[.='Health Plans'])[1]")
    private WebElement hplan; */
	
	//health insurance detail entry page

	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
    private WebElement members; 
	
	@FindBy(id="healthCityPincode")
	private WebElement city;
	
	
	@FindBy(id="healthIncome")
	private WebElement income;
	
	@FindBy(xpath="(//select[@class='chkMemberAge'])[1]")
	private WebElement selfage;
	
	@FindBy(xpath="(//select[@class='chkMemberAge'])[2]")
	private WebElement spouseage;
	
	@FindBy(xpath="(//a[@class='done'])[2]")
	private WebElement donebutton;
	
	@FindBy(id="healthGender")
	private WebElement gender;
	
	@FindBy(id="healthName")
	private WebElement name;
	
	@FindBy(id="healthEmail")
	private WebElement email;
	
	@FindBy(id="healthMobileCountry")
	private WebElement mobilecountry;
	
	@FindBy(xpath="//input[@class='mobNumber']")
	private WebElement mobnum;
	
	@FindBy(xpath="(//input[@name='healthIsPED'])[2]")
	private WebElement medcondition;
	
	@FindBy(xpath="(//a[.='Get Free Quotes'])[2]")
	private WebElement submitbut;
	
	//for policy bazar quotes page
	@FindBy(xpath="(//button[@tabindex='0'])[6]")
	private WebElement emi;
	
	@FindBy(xpath="//button[@aria-label='bynowbutton']")
	private WebElement prceedpremium;
	
	//constructor
	public Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//methods
	public void dropdown()
	{
		dropdown.click();
	}
	public void setMembers()
	{
		members.click();
		
	}
	
	public void setselfage()
	{
		selfage.click();
	}
	public void setspouseage()
	{
		spouseage.click();
	}
	
	public void done()
	{
		donebutton.click();
	}
	public void healthcitypincode(String city1)
	{
	city.sendKeys(city1);
	}
	public void healthincome()
	{
		income.click();
	}
	public void healthgender()
	{
	gender.click();
	}
	
	public void healthname(String name1)
	{
		name.clear();
	name.sendKeys(name1);
	}
	public void healtemail(String email1)
	{
		email.sendKeys(email1);
	}
	public void healthcountry()
	{
		mobilecountry.click();
	}
	public void healthmobileno(String num1)
	{
	mobnum.sendKeys(num1);
	}
	public void healthcondition()
	{
		medcondition.click();
	}
	public void healthsubmit()
	{
		submitbut.click();
	}
	
	public void religareemi()
	{
		emi.click();
	}
	public void premium()
	{
		prceedpremium.click();
	}
}
