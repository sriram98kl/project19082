package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_OPadvpay_yasassiWeb extends PageFactoryInitYasasiiWeb{
	public FO_OPadvpay_yasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;
	
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;
	
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;
	//button[@id='billingsave']
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;
	
	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement category;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;
	
	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;//label[@class='icon-btn btn-dark-green inline']
	
	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOk;
	

	@FindBy(xpath = "//div[contains(@class,'page-inner-btn-group')]//button[1]")
	public WebElement Save;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-wallet icon-btn-billing btn-dark-green inline')]")
	public WebElement Wallet;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement AdvCheck;
	
	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement withdraw;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='OK']")
	public WebElement withdraw0k;
	
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-cash-transfer')]")
	public WebElement AvailedService;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox;
	
	@FindBy(xpath = "//i[@title='Request for Advance Refund']")
	public WebElement request;
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement auth;
	
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark;
	
	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Cancel Request']")
	public WebElement cancel;
	
	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement droplist;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement RCM;
	
	@FindBy(xpath = "//span[normalize-space()='Approve Request']")
	public WebElement ApproveRequest;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CHECK;
	
	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement AdvanceApproval;
	
	@FindBy(xpath = "//div[@class='row advance-approve ng-star-inserted']//th[@class='amount'][normalize-space()='Net Amount']")
	public WebElement Element;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement AmountEdit;
	
	@FindBy(xpath = "//input[@id='approvalamount0']")
	public WebElement Amount1;
	
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;
	
	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;
	
	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Request Approved']")
	public WebElement reqAPPROVE;
	
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement reqSave;
	
	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement AdvanceView;
	
	  @FindBy(xpath="//input[@id='loginemail']")
		public WebElement userid;
		
		@FindBy(xpath="//input[@id='loginpassword']")
		public WebElement password;
		
		
		@FindBy(xpath="//input[@id='loginsite']")
		public WebElement Site;

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
		
		@FindBy(xpath = "//span[@class='user-name']")
		public WebElement username;
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		public void patientreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
			
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
			//	Insurance.click();
			///Thread.sleep(1000);
			//	Inscorp.click();
			//driver.findElement(By.xpath("//li[normalize-space()='BH Company[Corp]']")).click();
			//	PlanName.click();
			//driver.findElement(By.xpath("//li[normalize-space()='BH Scheme']")).click();
			//Thread.sleep(1000);
			//	insAdd.click();
			Thread.sleep(1000);

			List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

			if(dynamicElement.size() !=0)
			{

			}

			else
			{
				driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
			}
			Thread.sleep(1000);
			howDidYouKnow.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
			OKhowDidYouKnow.click();
			Thread.sleep(1000);
			RegSave.click();
			
			Thread.sleep(3000);
	        String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
	    	System.out.println(mrno);
			
	    	String word[]=mrno.split("[ :] ");
			System.out.println("number of words: "+word.length);
			for(int i=0;i<word.length;i++)
			{
				System.out.println("word["+i+"]="+word[i]);
			}
			System.out.println(word[1]);
			
			File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb82190\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData82.xls");
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet FOFullRegTest=wb.getSheetAt(45);	
			int i=FOFullRegTest.getLastRowNum();
			System.out.println("Number of rows: " + i);		
			FOFullRegTest.getRow(i).createCell(0).setCellValue(word[1]);	
	    	FileOutputStream fout=new FileOutputStream(src);	
			wb.write(fout);
			SaveSuccess.click();
			Thread.sleep(2000);
		}
				
		
		
		
		
		
		
		
		
		
		


	
	
	public void opAdvpay(String MRNO , String PROVIDER ,String SERVICE1, String AMOUNT ,String SERVICE2 ) throws InterruptedException
	{
		//////Encounter
//		SearchField.click();
//		Thread.sleep(1000);
//		SearchField.sendKeys(MRNO);
//		Thread.sleep(2000);
//		SearchIcon.click();
//		Thread.sleep(2000);
//		patientSelect.click();
//		Thread.sleep(2000);
//		WebElement inputBox = driver.findElement(By.xpath("//input[@id='EncBillingproviders']"));
//		String textInsideInputBox = inputBox.getAttribute("value");
//
//		// Check whether input field is blank
//		if(textInsideInputBox.isEmpty())
//		{
//		   System.out.println("Input field is empty");
//		   providerName.click();
//			Thread.sleep(1000);
//			providerName.sendKeys(PROVIDER);
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
//		}
//		else {
			clear.click();
			Thread.sleep(1000);
			providerName.click();
			Thread.sleep(1000);
			providerName.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
			
		//}
		/* providerName.clear();
		 Thread.sleep(1000);
		 providerName.sendKeys(PROVIDER);
		 driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();*/
		 Thread.sleep(1000);
		 EncounterAdd.click();
		 Thread.sleep(1000);
		 EncounterSave.click();
		 Thread.sleep(1000);
		 SAvesuccess.click();
		 
		 
		 /////advancePay
		 Thread.sleep(2000);
		 Service.click();	
		 Thread.sleep(1000);
		 AddnewService.click();
		 Thread.sleep(1000);
		 category.click();
		 driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
		 servicename.click();
		 Thread.sleep(1000);
		 servicename.sendKeys(SERVICE1);
		 driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE1+"']")).click();
		 Thread.sleep(1000);
		 Amount.clear();
		 Amount.sendKeys(AMOUNT);
		 Amount.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 Add.click();
		 Thread.sleep(1000);
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",  totalpay);
		 Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		 SaveOk.click();
		 
		 //ServiceAdd
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView();",  Service);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);
		 Thread.sleep(2000);
		 //Service.click();	
		// Thread.sleep(1000);
		// AddnewService.click();
		 Thread.sleep(2000);
		servicename.click();
		Thread.sleep(2000);
		servicename.sendKeys(SERVICE2);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE2+"']")).click();
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 Add.click();
		 Thread.sleep(1000);
		
		 
		// WalletPay
		 js.executeScript("arguments[0].scrollIntoView();", Wallet );
		 Thread.sleep(1000);
		 String Amount =  driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
		 Thread.sleep(1000);
		 Wallet.click();
		 Thread.sleep(1000);
		 AdvCheck.click();
		 Thread.sleep(1000);
		 withdraw.click();
		 Thread.sleep(1000);
		 withdraw.clear();
		 Thread.sleep(1000);
		 withdraw.sendKeys(Amount);
		 Thread.sleep(1000);
		 withdraw0k.click();
		 Thread.sleep(1000);
		 Save.click();
		 Thread.sleep(1000);
		 SaveOk.click();
		 Thread.sleep(1000);
		 AvailedService.click();
		 Thread.sleep(1000);
		 AdvanceView.click();
		 
		 Thread.sleep(1000);
		 
		 List<WebElement> dynamicElement2=driver.findElements(By.xpath("//i[@class='ki ki-cash-transfer']"));
			
		    int k =	dynamicElement2.size();
			System.out.println("size of k="+k);
			
			int i = k-1;
			System.out.println(i);
		 
			 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		// Checkbox.click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]/span[2]/i[1]")).click();
		// request.click();
		 Thread.sleep(1000);
		 auth.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@title='Albert Sam(DOCAS)']")).click();
		 Thread.sleep(1000);
		 remark.click();
		 Thread.sleep(1000);
		 remark.sendKeys("Requested");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		 Thread.sleep(1000);
		 droplist.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		 Thread.sleep(1000);
		
		 cancel.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		 Thread.sleep(2000);
		 AdvanceView.click();
		 Thread.sleep(2000);
		 droplist.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[normalize-space()='Valid']")).click();
		 Thread.sleep(1000);
		 
		 
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();

		// Checkbox.click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]/span[2]/i[1]")).click();

		 //request.click();
		 Thread.sleep(1000);
		 auth.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[@title='Albert Sam(DOCAS)']")).click();
		 Thread.sleep(1000);
		 remark.click();
		 Thread.sleep(1000);
		 remark.sendKeys("Requested");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		 Thread.sleep(1000);
		 ((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(3000);
			driver.get("http://uathis.kimshealth.org/login");
			Thread.sleep(2000);
			
			   userid.click();
				Thread.sleep(1000);
				userid.sendKeys("DOCAS");
				Thread.sleep(1000);
				 password.click();
				 Thread.sleep(1000);
				 password.sendKeys("Kameda321");
				 Thread.sleep(1000);
				 Site.click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				
			
				 Thread.sleep(2000);
			
			
			
			Hamberger.click();
			Thread.sleep(1000);
			FO.click();
			Thread.sleep(1000);
			RCM.click();
			Thread.sleep(1000);
			ApproveRequest.click();
			Thread.sleep(1000);
			AdvanceApproval.click();
			Thread.sleep(1000); 
			
			List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='ki ki-file']"));
			
		    int a =	dynamicElement.size();
			System.out.println("size="+a);
			 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr["+a+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
			//CHECK.click();
			Thread.sleep(1000);
   JavascriptExecutor js1= (JavascriptExecutor) driver;
    js1.executeScript("arguments[0].scrollIntoView();", Element);
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr["+a+"]/td[16]/span[1]/i[1]")).click();	
   // AmountEdit.click();
    Thread.sleep(1000);
    Amount1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
   
    Thread.sleep(1000);
    Amount1.sendKeys("7000");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
    Thread.sleep(1000);
    Amount1.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
  	// Amount1.clear();
  	Thread.sleep(1000);
    Amount1.sendKeys("3000");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();		
    Thread.sleep(1000);
    remark1.click();
    Thread.sleep(1000);
    remark1.sendKeys("approved");
    Thread.sleep(1000);
    APPROVE.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
    Thread.sleep(1000);
	//driver.switchTo().window(tabs.get(0));
	int n =driver.getWindowHandles().size();
	Thread.sleep(1000);
	System.out.println("window handles no."+ n);
	int m= n-2;
	Thread.sleep(1000);
	System.out.println("go to window no."+ m);
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(2000);
	driver.get("http://uathis.kimshealth.org/login");
	Thread.sleep(2000);


/////////login///////////////////////////////////////


    userid.click();
	Thread.sleep(1000);
	userid.sendKeys("admin");
	Thread.sleep(1000);
	 password.click();
	 Thread.sleep(1000);
	 password.sendKeys("kameda321");
	 Thread.sleep(1000);
	 Site.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	 
	 Thread.sleep(2000);	
	 

	 SearchField.click();
	 Thread.sleep(1000);	
	 SearchField.sendKeys(MRNO);
		Thread.sleep(2000);
		SearchIcon.click();	
		Thread.sleep(2000);		
	//	patientSelect.click();
		 Thread.sleep(1000);	
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		 Thread.sleep(1000);	
	
		 AvailedService.click();
		 Thread.sleep(1000);
		 AdvanceView.click();
		 Thread.sleep(1000);	
	
	
	
	
	
	
//	
//	Set <String> window = driver.getWindowHandles();
//	List <String> handles= new ArrayList<String> (window);
//	driver.switchTo().window(handles.get(1));
//	
//	driver.switchTo().window(tabs.get(0));
	//driver.switchTo().window(originalWindow);
	Thread.sleep(1000);
	 droplist.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
	 Thread.sleep(1000);
	 
	 
	 List<WebElement> dynamicElement1=driver.findElements(By.xpath("//i[@class='ki ki-cash-transfer']"));
		
	    int b =	dynamicElement1.size();
		System.out.println("size of b="+b);
		 
		int c = b-1;
		
		System.out.println(c);
	    
	
     driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+c+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		
	// driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//tbody/tr["+c+"]/td[1]/span[2]/i[1]")).click();
	// reqAPPROVE.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-request-approval[1]/div[2]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/table[1]/tbody[1]/tr["+c+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
	// driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-request-approval[1]/div[2]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
	 Thread.sleep(1000);
	 js1.executeScript("arguments[0].scrollIntoView();", reqSave);
	 Thread.sleep(2000);
	 reqSave.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
	 Thread.sleep(1000);
			
			
			
			
	}
	
	

}