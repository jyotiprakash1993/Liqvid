package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySignInPage 
{
	public WebDriver driver;
    
    public VerifySignInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="LoginForm_username")
    public WebElement usernameTextField;
    
    @FindBy(id="LoginForm_password")
    public WebElement passwordTextField;
    
    @FindBy(xpath="//input[@value='Sign in']")
    public WebElement signinButton;
    
    public void SignInMethod()
    {
    	usernameTextField.sendKeys("SCHOLAR82");
    	passwordTextField.sendKeys("035f8f2");
    	signinButton.sendKeys(Keys.ENTER);
    	//signinButton.click();
    }
}