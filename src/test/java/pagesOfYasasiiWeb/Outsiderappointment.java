package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Outsiderappointment extends PageFactoryInitYasasiiWeb{

	public Outsiderappointment(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath= "//div[contains(text(),'Appointment')]")
	WebElement patientappointment;
	
	@FindBy(xpath= "//thead/tr[1]/th[1]/div[1]/input[1]")
	WebElement docsearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")
	public WebElement appselection;
	
	
	@FindBy(xpath = "//tr[@class='row-1-0 ng-star-inserted']//div[@class='appointment-info']")
	public WebElement appscroll;
	
	@FindBy(xpath = "//tr[@class='row-1-0 ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement appaddicon;

	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement appsave;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement appok;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement encountericon; 
	
	@FindBy(xpath = "//div[contains(text(),'Patient Info')]")
	public WebElement patientinfo;
	
	@FindBy(xpath= "//input[@id='maincategory']")
	WebElement maincategorySearch;
	
	@FindBy(xpath= "//li[normalize-space()='Search']")
	WebElement maincategoryoutsider;
	
	@FindBy(xpath= "//input[@id='searchtext']")
	WebElement enteroutsidername;
	
	@FindBy(xpath= "//i[@class='ki ki-search']")
	WebElement buttonsearch;
	
	@FindBy(xpath= "//div[@class='pat-name']//span[contains(text(),'Mr Ramaswamy Iyer')]")
	WebElement selectoutsider;
	
	@FindBy(xpath= "//i[@class='ki ki-reception-fill']")
	WebElement billing;
	
	@FindBy(xpath= "//input[@id='EncBillingproviders']")
	WebElement providername;
	
	@FindBy(xpath= "//span[@class='btn btn-link ng-star-inserted']")
	WebElement addneworder;
	
	@FindBy(xpath= "//input[@id='serviceidBilling']")
	WebElement enterservicename;
	
	@FindBy(xpath= "//i[@class='ki ki-debit-card icon-btn-billing btn-dark-green inline']")
	WebElement debitcard;
	
	@FindBy(xpath= "//div[@class='row pt-4 ng-star-inserted']//div[@class='col-md-6']//input[1]")
	WebElement cardprovider;
	
	@FindBy(xpath= "//input[@id='amountPayType']")
	WebElement enterAmount;
	
	@FindBy(xpath= "//input[@id='cardnoPayType']")
	WebElement entercardnumber;
	
	@FindBy(xpath= "//input[@id='apprnoPayType']")
	WebElement enterapprovalnumber;
	
	@FindBy(xpath= "//label[@title='Add']//i[@class='ki ki-plus']")
	WebElement addcarddetails;
	
	@FindBy(xpath= "//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")
	WebElement okcard;
	
	@FindBy(xpath= "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/button[1]")
	WebElement checkin;
	
//	
//	@FindBy(xpath= "")
//	WebElement maincategorySearch;
  
    public void Outsiderappointment(String doctor) throws InterruptedException
	{
    	
    	
    	
    	
    	
    	
 ////////////////Take appoinment for the outsider patient
    	Thread.sleep(3000);
    	patientappointment.click();
    	docsearch.sendKeys(doctor);
    	appselection.click();
		Thread.sleep(5000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//td[@class='slot-list ng-star-inserted']/div/span[1]"));

		for(WebElement element:li){
		if(Integer.parseInt(element.getText())>0){
			element.click();
			break;
		
		}
		
    }
		
		Thread.sleep(5000);
		
		List<WebElement> li2=new ArrayList<WebElement>(); 
		
		WebElement plusDiv=driver.findElement(By.xpath("//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[2]/lib-schedule-view[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]"));
		WebElement appointmentPlus=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/label[1]/i[1]"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(5000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(8000);
		appsave.click();
    	Thread.sleep(3000);
    	appok.click();
		
	}
    
    public void encounterappCheckIn() throws InterruptedException, IOException {
 ///////////Take encounter   	
		//Thread.sleep(9000);
		//encountericon.click();
		Thread.sleep(5000);
		patientinfo.click();
	}
    
    public void outsiderpatientselection(String Secondname,String MRNo) throws InterruptedException
    {   Thread.sleep(800);
    	maincategorySearch.click();
    	Thread.sleep(800);
    	maincategoryoutsider.click();
    	Thread.sleep(800);
    	enteroutsidername.sendKeys(Secondname);
    	Thread.sleep(800);
    	buttonsearch.click();
    	Thread.sleep(800);
    	//selectoutsider.click();  
    	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
    	Thread.sleep(800);
    }
    
    public void outsiderbilling(String provider,String Servicename) throws InterruptedException
    {
    	billing.click();
    	Thread.sleep(1500);
    	driver.findElement(By.xpath("//span[normalize-space()='Service']")).click();
    	
    //	act.moveToElement(checkin).click().build().perform();
    	//button[normalize-space()='Check-In']
    	providername.sendKeys(provider);
    	Thread.sleep(800);
    	driver.findElement(By.xpath("//*[contains(text(),'" + provider + "')]")).click();
    	Thread.sleep(800);
    	addneworder.click();
    	Thread.sleep(800);
    	enterservicename.sendKeys(Servicename);
    	Thread.sleep(800);
    	driver.findElement(By.xpath("//*[contains(text(),'" + Servicename + "')]")).click();
    	Thread.sleep(800);
    	driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
    	Thread.sleep(800);
    }
    public void card(String cardname) throws InterruptedException
    {
    	debitcard.click();
    	Thread.sleep(800);
    	cardprovider.sendKeys(cardname);
    	driver.findElement(By.xpath("//*[contains(text(),'" + cardname + "')]")).click();
    	enterAmount.clear();
    	enterAmount.sendKeys("209");
    	entercardnumber.sendKeys("125421542");
    	enterapprovalnumber.sendKeys("32502");
    	addcarddetails.click();
    	okcard.click();
    }
    public void savebill() throws InterruptedException
    {
    	
    	driver.findElement(By.xpath("//div[@class='page-inner-btn-group']//button[1]"));
    	Thread.sleep(800);
    	
    }
	}
    

