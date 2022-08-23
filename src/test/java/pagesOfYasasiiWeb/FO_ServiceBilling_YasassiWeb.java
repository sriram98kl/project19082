package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_ServiceBilling_YasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public FO_ServiceBilling_YasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement searchField;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement searchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement patientSelect;
	
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement upArrow;
	
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement lock;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement doctornote;
	
	@FindBy(xpath = "//input[@id='inchargeproviderid']")
	public WebElement visitList;
	
	@FindBy(xpath = "//span[@class='btn btn-dark-green active']")
	public WebElement OK;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;
	
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement docnoteSave;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement service;
	
	@FindBy(xpath = "//span[@class='pay-style']")
	public WebElement payment; 
	
	@FindBy(xpath = "//i[@class='ki ki-debit-card icon-btn-billing btn-dark-green inline']")
	public WebElement cardpayment;
	
	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Card Provider')]//input[@id='undefined']")
	public WebElement cardprovider;
	
	@FindBy(xpath = "//li[normalize-space()='ICICI']")
	public WebElement union;
	
	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;
	
	@FindBy(xpath = "//input[@id='cardnoPayType']")
	public WebElement CardNo;
	
	@FindBy(xpath = "//input[@id='apprnoPayType']")
	public WebElement approveNo;
	
	@FindBy(xpath = "//label[@title='Add']")
	public WebElement Add;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='OK']")
	public WebElement CardDetailsOk;
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement savePayment;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement transactionOk;
	
	@FindBy(xpath = "//i[@title='Order Details']")
	public WebElement orderDetails;
	
	
	
	
	public void cpoeService(String MRNO, String CHEIFCOMPLAINT , String SERVICE ) throws InterruptedException {
		
		//Doctor note adding one service to the patient
		
		Thread.sleep(2000);
		//mainCategory.click();
		//driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		searchField.click();
		Thread.sleep(1000);
		searchField.sendKeys(MRNO);
		//searchicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		//patientSelect.click();
		Thread.sleep(1000);
		//upArrow.click();
		//lock.click();
		Thread.sleep(2000);
		doctornote.click();
		Thread.sleep(2000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
			 Thread.sleep(800); 
		}
		 
		    else {
			  
			  System.out.println("sri");
		  }

		//visitList.click();
		//driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		cheifComplaint.clear();
		cheifComplaint.sendKeys(CHEIFCOMPLAINT);
		driver.findElement(By.xpath("//strong[normalize-space()='"+CHEIFCOMPLAINT+"']")).click();
		Thread.sleep(1000);
		template.click();
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		cpoeService.click();
		Thread.sleep(1000);
		cpoeServiceSearch.click();
		cpoeServiceSearch.sendKeys( SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		Thread.sleep(1000);
		docnoteSave.click();
		Thread.sleep(3000);
		
	}	
		
		
		

	
	
	public void serviceBilling(String MRNO, String CARDNO , String APPROVENO , String URL ) throws InterruptedException, IOException {
		
		///opening newtab
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);
		
		//login
		userid.click();
		userid.sendKeys("admin");
		password.click();
		password.sendKeys("kameda321");
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
		searchField.click();
		searchField.sendKeys(MRNO);
		searchicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		service.click();
		Thread.sleep(1000);
		
		orderDetails.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", cardpayment);
		Thread.sleep(2000);
		
		//writing amount into excel
	

		 String amount= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
		 System.out.println(amount);
		 
		//card details
		Thread.sleep(2000);
		cardpayment.click();
		Thread.sleep(2000);
		cardprovider.click();
		Thread.sleep(1000);
		union.click();
		Amount.click();
		Thread.sleep(1000);
		Amount.sendKeys(amount);
		CardNo.click();
		Thread.sleep(1000);
		CardNo.sendKeys(CARDNO);
		approveNo.click();
		approveNo.sendKeys(APPROVENO);
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(1000);
		CardDetailsOk.click();
		Thread.sleep(2000);
		savePayment.click();
		Thread.sleep(3000);
		transactionOk.click();
		 
		
		
	}
}
