package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOERPatientEncounterYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public FOERPatientEncounterYasasiiWeb(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath= "//input[@id='EncBillingproviders']")
	WebElement encproviderclick;
	
	@FindBy(xpath= "//li[contains(text(),'Thomas')]")
	WebElement encprovider;
			
    @FindBy(xpath= "//button[contains(text(),'Save')]")
	WebElement encsave;
	
	@FindBy(xpath="//div[contains(text(),'Patient Info')]")
	WebElement patInfo;
	
	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement encountersave; 
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement encountersaveok; 
	
  
    public ER2OPRegistration FoERencounter(String myerprovider) throws InterruptedException
	{
    	
    	Thread.sleep(2000);
		encproviderclick.click();
		Thread.sleep(1000);
		encproviderclick.sendKeys(myerprovider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+myerprovider+"')])[1]")).click();
		//driver.findElement(By.xpath("//li[normalize-space()='"+myerprovider+"']"));
		//encprovider.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		docadd.click();
		Thread.sleep(1000);
		encountersave.click();
		Thread.sleep(500);
		encountersaveok.click();
		 
		return new ER2OPRegistration(driver);
		
	}
    
    
    
    
    
    
    
}
