package pagesOfYasasiiWeb;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMRUnlockPageYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRUnlockPageYasasiiWeb(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement toggle;
	
	@FindBy(xpath="//span[normalize-space()='Unlock EMR']")
	public WebElement unlockemr;
	
	@FindBy(xpath="//label[@class='check-container dark-bg']//span[@class='checkmark']")
	public WebElement selectall;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement save;
	
	@FindBy(xpath="//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;
	
	
	
	public void unlock() throws InterruptedException {
		
///////////////Select the EMR unlock screen and click on select all and save it
		 Thread.sleep(1000);
		 toggle.click();
		 Thread.sleep(1000);
		 EMR.click();
		 Thread.sleep(1000);
		   unlockemr.click();
		    Thread.sleep(1000);
		    selectall.click();
		    Thread.sleep(1000);
		    save.click();
		    Thread.sleep(1000);
		    
		    
		    
		    
		    
		    
		    
		    
	}
	
	
	
}