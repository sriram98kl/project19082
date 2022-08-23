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

public class FO_Copay_YasassiWeb  extends PageFactoryInitYasasiiWeb{
	
	public FO_Copay_YasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;
	
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;
	
	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;
	
	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;
	
	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;
	
	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;
	
	@FindBy(xpath = "//label[@class='ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement docAdd;
	
	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;
	
	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;
	
	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;
	
	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;
	
	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement OKhowDidYouKnow;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;
	
	@FindBy(xpath = "//label[contains(@title,'Add')]")
	public WebElement addEncounter;
	
	@FindBy(xpath = "//p[contains(@class,'mb-0 ng-star-inserted')]")
	public WebElement ExpandGrid;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]")
	public WebElement payment;
	
	@FindBy(xpath = "//div[contains(@class,'card scroll')]//div[1]//div[1]//div[2]//div[1]//div[2]//div[4]//i[1]")
	public WebElement GPtaxView;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-card[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/i[1]")
	public WebElement twoyearTaxView;
	
	@FindBy(xpath = "//button[@id='billingsave']")//button[@id='billingsave']
	public WebElement saveBilling;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/div[2]/span[2]/button[1]")
	public WebElement RefNo;
	
	@FindBy(xpath = "//input[@id='refno']")
	public WebElement number;
	
	@FindBy(xpath = "//ki-calendar[contains(@placeholder,'From Date')]//input[contains(@type,'text')]")
	public WebElement fromDate;
	
	@FindBy(xpath = "//ki-calendar[contains(@placeholder,'To Date')]//input[contains(@type,'text')]")
	public WebElement ToDate;
	
	@FindBy(xpath = "//span[contains(@class,'icon-btn btn-dark-green inline ng-star-inserted')]//i[contains(@class,'ki ki-plus')]")
	public WebElement AddLetter;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")
	public WebElement letterOk;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement TransactionOK;
	
	
	
	
	
	
	
	
	
	
	
	
	public void insuranceCopay(String NAME, String AGE, String MBLNO , String ORGANISATION , String ADDRESS  ,String AADHAAR ,String PROVIDER , String REFNO ) throws AWTException, InterruptedException {
		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		
List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			System.out.println("sri");
		}

		
		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		
		Organisation.click();
		Organisation.sendKeys(ORGANISATION);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		docAdd.click();
		Thread.sleep(1000);
		Insurance.click();
		Thread.sleep(1000);
		Inscorp.click();
		driver.findElement(By.xpath("//li[normalize-space()='Berkshire Hathaway[Corp]']")).click();
		PlanName.click();
		driver.findElement(By.xpath("//li[normalize-space()='BH Premium']")).click();
		Thread.sleep(1000);
		insAdd.click();
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(1000);
		SaveSuccess.click();
		
		//Encounter
		Thread.sleep(3000);
		providerName.click();
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + PROVIDER + "')]")).click();
		Thread.sleep(2000);
		addEncounter.click();
		Thread.sleep(1000);
		ExpandGrid.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",twoyearTaxView);
		Thread.sleep(2000);
		act.moveToElement(GPtaxView).build().perform();
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();",payment);
		Thread.sleep(1000);
		//js.executeScript("arguments[0].scrollIntoView();",twoyearTaxView);
		act.moveToElement(twoyearTaxView).build().perform();
		Thread.sleep(5000);
		
		
		
			
		
		
		
		//Reference letter
		
		RefNo.click();
		Thread.sleep(1000);
		number.sendKeys(REFNO);
		Robot r=new Robot();
		fromDate.click();
		Thread.sleep(1000); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		ToDate.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		AddLetter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		letterOk.click();
		Thread.sleep(1000);
		
		saveBilling.click();
		Thread.sleep(1000);
		TransactionOK.click();
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	

}