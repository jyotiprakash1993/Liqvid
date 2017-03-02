package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
    
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
        
    @FindBy(xpath="//span[text()='License Update']")
    public WebElement licenseUpdateLink;
    
    @FindBy(xpath="//span[text()='Create Batch']")
    public WebElement createBatchLink;
    
    @FindBy(xpath="//span[text()='Batch Report']")
    public WebElement batchReportLink;
    
    @FindBy(xpath="//span[text()='Student Upload']")
    public WebElement studentUploadLink;
    
    @FindBy(xpath="//span[text()='Resources']")
    public WebElement resourcesLink;
    
    @FindBy(xpath="//span[text()='Sign out']")
    public WebElement signOutLink;
    
    public void clickOnLicenseUpdateLinkInHomePage()
    {
    	licenseUpdateLink.click();
    }
    public void clickOnCreateBatchLinkInHomePage()
    {
    	createBatchLink.click();
    }
    public void clickOnBatchReportLinkInHomePage()
    {
    	batchReportLink.click();
    }
    public void clickOnStudentUploadLinkInHomePage()
    {
    	studentUploadLink.click();
    }
    public void clickOnResourcesLinkInHomePage()
    {
    	resourcesLink.click();
    }
    public void clickOnSignOutLinkInHomePage()
    {
    	signOutLink.click();
    }  
}