
package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;

public class FORegEditYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public FORegEditYasasiiWeb(WebDriver driver) {
		super(driver);
	} 
	
	
	@FindBy(xpath="//i[contains(@class,'ki ki-pencil')]")
	public WebElement foediticon;
	
	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='alternatephone']")
	public WebElement altphoneno;
	
	
	  @FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[1]/div[1]/div[1]/span[1]")
	  public WebElement foRelatedMrnotab;
	  
	  @FindBy(xpath="//input[@id='relatedmrno']") 
	  public WebElement relatedmrno;
	  
	  @FindBy(xpath="//input[@id='relation']") 
	  public WebElement relation;
	  
	  @FindBy(xpath="//button[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']") 
	  public WebElement add;
	  
	  @FindBy(xpath="//span[normalize-space()='Emergency Contact']") 
	  public WebElement emcontact;
	
	  @FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/ki-dialog-confirm[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	  public WebElement emcontactConfirmation;
	  
	  @FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[6]/div[1]/div[1]/div[1]/div[1]")
	  public WebElement emergencycontact;
	
	  @FindBy(xpath = "//button[contains(text(),'Update')]")
	  public WebElement foupdate;
	  
	  @FindBy(xpath = "//button[contains(text(),'OK')]")
	  public WebElement foupdateok;
	
public void FOEditYasasiiWeb(String myaltphoneno) throws InterruptedException {
	/////////////From patient info screen click on edit icon	
		foediticon.click();
		Thread.sleep(2000);
		
		altphoneno.click();
		Thread.sleep(1000);
		altphoneno.sendKeys(myaltphoneno);
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",foRelatedMrnotab);
		   Thread.sleep(2000);
		foRelatedMrnotab.click();
		Thread.sleep(1000);
	   relatedmrno.sendKeys("G00000030822"); 
	   relatedmrno.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click(); 
		add.click();
		Thread.sleep(1000);
	
		
		foupdate.click();
		Thread.sleep(3000);
		foupdateok.click();
		
	}
}
