package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_SingleBill_MultipleServices_YasassiWeb extends PageFactoryInitYasasiiWeb{
	public FO_SingleBill_MultipleServices_YasassiWeb (WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement provider;
	
	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement AddNewService;
	
	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Category;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName;
	
	@FindBy(xpath = "//label[contains(@class,'icon-btn btn-dark-green inline')]")
	public WebElement serviceAdd ;
	
	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement savebill ;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement transcDone;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	
	
	public void SingleBillforMultipleServices(String MRNO , String PROVIDER , String SERVICE1 ,String  SERVICE2) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO);
		Thread.sleep(2000);
		SearchIcon.click();
		Thread.sleep(2000);
		patientSelect.click();
		Thread.sleep(2000);
		Service.click();
		Thread.sleep(3000);
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='EncBillingproviders']"));
		String textInsideInputBox = inputBox.getAttribute("value");

		// Check whether input field is blank
		if(textInsideInputBox.isEmpty())
		{
		   System.out.println("Input field is empty");
		    provider.click();
			Thread.sleep(1000);
			provider.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
		}
		else {
			clear.click();
			Thread.sleep(1000);
			provider.click();
			Thread.sleep(1000);
			provider.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
			
		}
		
		
		//provider.click();
		//Thread.sleep(1000);
		//provider.sendKeys(PROVIDER);
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();
		Thread.sleep(1000);
		AddNewService.click();
		Thread.sleep(1000);
	Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
		ServiceName.click();
		Thread.sleep(1000);
		ServiceName.sendKeys(SERVICE1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'" +SERVICE1+ "')]")).click();
		Thread.sleep(1000);
		serviceAdd.click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Radiology']")).click();
		ServiceName.click();
		Thread.sleep(2000);
		ServiceName.sendKeys(SERVICE2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'" +SERVICE2 + "')]")).click();
		Thread.sleep(1000);
		serviceAdd.click();
		Thread.sleep(1000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",totalpay );

	//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_END);
		Thread.sleep(800);	
		r.keyRelease(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(800);	
		Thread.sleep(1000);
		savebill.click();
		Thread.sleep(2000);
		transcDone.click();
		Thread.sleep(2000);
		
	}


	
	
}
