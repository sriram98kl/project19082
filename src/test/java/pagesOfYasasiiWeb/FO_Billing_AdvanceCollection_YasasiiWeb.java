package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_Billing_AdvanceCollection_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_Billing_AdvanceCollection_YasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providername;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement addneworder;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement plus;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement save;
	
	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'servicetypeid')]//input[@id='undefined']")
	public WebElement category;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement amount;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-cash-transfer')]")
	public WebElement availedservice;
	
	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement advanceview;
	
	@FindBy(xpath = "//i[@class='ki ki-user-encounter']")
	public WebElement services;
	
	@FindBy(xpath = "//*[@CLASS='ki ki-wallet icon-btn-billing btn-dark-green inline']")
	public WebElement wallet;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-payment-types[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkbox;
	
	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement withdrawlamoount;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[2]/i[1]")
	public WebElement Advancerefund;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selctcheckbox;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement authorizer;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement entername;
	
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement enterremark;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement emr;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement fo;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/i[1]")
	public WebElement rcm;
	
	@FindBy(xpath = "//span[normalize-space()='Approve Request']")
	public WebElement refundreq;
	
	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement advancerefund;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;
	
	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement yes;
	
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks;
	
	
	
	
	
	
//	@FindBy(xpath = "")
//	public WebElement servicename;
//	
//	@FindBy(xpath = "")
//	public WebElement servicename;
//	
//	@FindBy(xpath = "")
//	public WebElement servicename;
	
/////////////Giving Advance payment	
	
	public void billing(String Providername, String service,String selectcategory,String Amount) throws InterruptedException
	{
		Service.click();
		Thread.sleep(800);
//		providername.sendKeys(Providername);
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//*[contains(text(),'" + Providername + "')]")).click();
//		Thread.sleep(800);
		addneworder.click();
		Thread.sleep(800);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
	//	driver.findElement(By.xpath("//*[contains(text(),'" + selectcategory + "')]")).click();	
		Thread.sleep(800);
		servicename.sendKeys(service);
	    Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + service + "')]")).click();
		Thread.sleep(800);
		amount.clear();
		Thread.sleep(800);
		amount.sendKeys("1000");
		Thread.sleep(800);
		//amount.sendKeys(Amount);
		Thread.sleep(800);
		plus.click();
		Thread.sleep(800);
	}
	public void save() throws InterruptedException
	{
		save.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
	}
	
	public void advanceview() throws InterruptedException
	{
		availedservice.click();
		Thread.sleep(1000);
		advanceview.click();
		Thread.sleep(2000);
	}
	
	public void advanceutilizing(String Providername,String SErvice) throws InterruptedException
	{
		driver.findElement(By.xpath("//i[@class='ki ki-user-encounter']")).click();
		Service.click();
		Thread.sleep(800);
		providername.sendKeys(Providername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + Providername + "')]")).click();
		Thread.sleep(800);
		addneworder.click();
		Thread.sleep(800);
		Thread.sleep(800);
		servicename.sendKeys(SErvice);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + SErvice + "')]")).click();
		Thread.sleep(800);
		plus.click();
		Thread.sleep(1500);
	
	}
	
public void wallet() throws InterruptedException
{
	
	Thread.sleep(1000);
	
	
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//i[@class='ki ki-wallet icon-btn-billing btn-dark-green inline']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	
	
	
	
	WebElement P=driver.findElement(By.xpath("//input[@id='cash']"));
	Thread.sleep(1000);
	
	
	String rs=P.getAttribute("value");
	Thread.sleep(800);
	System.out.println("Total Amount is " +rs);
	Thread.sleep(1000);
	wallet.click();
	Thread.sleep(800);
	checkbox.click();
	Thread.sleep(800);
	withdrawlamoount.clear();
	Thread.sleep(800);
	withdrawlamoount.sendKeys(rs);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-dark-green active'][normalize-space()='OK']")).click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
	Thread.sleep(800);
	
	
}
	
/////////////Advance refunding	
	public void refund(String authorisername,String remarks) throws InterruptedException
	{
		selctcheckbox.click();
		Thread.sleep(800);
		Advancerefund.click();
		Thread.sleep(800);
		authorizer.click();
		Thread.sleep(800);
		entername.sendKeys(authorisername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + authorisername + "')]")).click();
		Thread.sleep(800);
		enterremark.sendKeys(remarks);
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);
		
	}
	public void requestaccept() throws InterruptedException
	{
		Thread.sleep(1000);
		emr.click();
		Thread.sleep(800);
		fo.click();
		Thread.sleep(800);
		rcm.click();
		Thread.sleep(800);
		refundreq.click();
		Thread.sleep(1000);
		advancerefund.click();
		Thread.sleep(800);
		firstcheckbox.click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);
	}
	
}

