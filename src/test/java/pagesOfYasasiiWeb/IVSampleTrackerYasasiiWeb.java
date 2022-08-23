package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class IVSampleTrackerYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public IVSampleTrackerYasasiiWeb(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	 
	}
	@FindBy(xpath="//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement toggle;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement emr;
	@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Menudropdown;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectop;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectPatient;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement patienthomepageicon;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement patienthomepagelock;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement docnote;
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
    public WebElement createnote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEServices;
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement cpoesearch;
//SaveNote
	@FindBy(xpath="//label[@class='icon emrsave']")
	public WebElement savenote;
//login
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement login;
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;
	@FindBy(xpath="//input[@id='loginsite']")
    public WebElement site;	
	@FindBy(xpath="//button[@id='login_spinner']")
	public WebElement login1;
//Investigationmodule
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menu;
	@FindBy(xpath="//i[@class='ki ki-beaker']")
	public WebElement inves;
	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement exceutionlo;
	@FindBy(xpath="//button[@class='btn btn-dark-green active btn-sm m0']")
	public WebElement okin;
//searchbymrd/name
	@FindBy(xpath="//input[@id='mrno']")
	public WebElement mrno;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectpatient;
	@FindBy(xpath="//button[@id='onsaveid']")
	public WebElement Save;
///Samplecollection-status
	@FindBy(xpath="//input[@id='status']")
	public WebElement pendingbilled;
	
	
	
	
	
	
	
//SampleTracker
	@FindBy(xpath="//span[normalize-space()='Sample Tracker']")
	public WebElement sampletracker;
    @FindBy(xpath="//img[@title='Execution Location']")
    public WebElement location;
	@FindBy(xpath="//button[normalize-space()='Create Trip']")
	public WebElement createtrip;
	@FindBy(xpath="//div[@class='row pt5']//div[1]//div[1]//div[3]//div[1]//i[1]")
	public WebElement Bag;
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-samplecreatetrip[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[7]/div[1]/div[3]/div[1]/i[1]")
    public WebElement carrier;
	@FindBy(xpath="//button[normalize-space()='Add Samples']")
	public WebElement addsamples;
	@FindBy(xpath="//input[@id='lissampleno']")
	public WebElement entersamplenumber;
	@FindBy(xpath="//button[@id='tripStartsSave']")
	public WebElement starttrip;
	@FindBy(xpath="//button[normalize-space()='Receive Trip']")
	public WebElement Receive;
	@FindBy(xpath="//button[@id='onsaveid']")
	public WebElement Closetrip;
	@FindBy(xpath="//button[@class=' btn btn-dark-green active btn-sm clear']")
	public WebElement Back;
//SampleProcessing
	@FindBy(xpath="//span[normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
	public WebElement selectpatient1;
	@FindBy(xpath="//label[normalize-space()='Select All']//span[@class='checkmark']")
	public WebElement selectservices;
	@FindBy(xpath="//i[@title='Centrifugation']")
	public WebElement Centrifugation;
	@FindBy(xpath="//i[@title='Centrifugation Undo']")
	public WebElement Centrifugationundo;
	@FindBy(xpath="//i[@class='ki ki-sample-check']")
	public WebElement accept;
	@FindBy(xpath="//i[@class='ki ki-sample-check-undo mr-1 ng-star-inserted']")
	public WebElement acceptundo;
	@FindBy(xpath="//button[normalize-space()='Accept Undo']")
	public WebElement acceptundo1;
//Result Entry
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement result;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement range;
	@FindBy(xpath="//button[@id='onSaveid']")
	public WebElement savetheresult;
//Result Cancellation
	@FindBy(xpath="//input[@id='status']")
	public WebElement statusresult;
	@FindBy(xpath="//button[@id='onResultSaveid']")
	public WebElement resultcancel;
	@FindBy(xpath="//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yes;
////informing doctor by clicking call icon
	@FindBy(xpath="//i[@title='Critical result not informed']")
	public WebElement call;
//feedback
	@FindBy(xpath="//input[@id='callstatusid']")
	public WebElement callstatus;
	@FindBy(xpath="//label[normalize-space()='Reminder']//span[@class='checkmark']")
	public WebElement Remainder;
	@FindBy(xpath="//button[@id='crcall']")
	public WebElement savecall;
	@FindBy(xpath="//textarea[@id='feedback']")
	public WebElement doctorfeedback;
//Result Authorization
	@FindBy(xpath="//span[normalize-space()='Result Authorization']")
	public WebElement resultauthorize;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement authorize;
	@FindBy(xpath="//button[@id='onSaveid']")
	public WebElement savere;
//Homepage
	@FindBy(xpath="//img[@title='Home Page']")
	public WebElement homepage;
	@FindBy(xpath="//button[@class='rounded-1 btn btn-sm btn-red clear']")
	public WebElement backre;
	
//Preview
	@FindBy(xpath="//button[normalize-space()='Preview']")
	public WebElement preview;
	@FindBy(xpath="//button[normalize-space()='Close']")
	public WebElement close;
	
	
	
	
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(65);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(4).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		SaveSuccess.click();

	}
		
		
	
	
	
	
	
	
	
	
	
	
	public void  Invest(String MRNo,String MR,String resultvalue,String resultvaluecri,String reason) throws InterruptedException, IOException {	
	
		 Thread.sleep(1000);
		 EnterPatientName.sendKeys(MRNo);
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		/// SelectPatient.click();
		 Thread.sleep(2000);
		// patienthomepageicon.click();
		 Thread.sleep(1000);
		// patienthomepagelock.click();
//////////////DocNote 
		  Thread.sleep(1000);
  	      docnote.click();
			Thread.sleep(1000);
	    //   createnote.click();
			Thread.sleep(1000);
//////TemplateSelection
 	 	   encreate.clear();
	       encreate.click();
		   Thread.sleep(1000);
		   encreate.sendKeys("Fever");
		   Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK.click();
			Thread.sleep(1000);
//CPOEService
			CPOEServices.click();
			Thread.sleep(1000);
			cpoesearch.click();
			Thread.sleep(1000);
			cpoesearch.sendKeys("Sodium");
			Thread.sleep(1000);
		    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[3]/div[5]/div[1]/label[2]")).click();
		   Thread.sleep(1000);
//Savenote		
		  // driver.findElement(By.xpath(" //i[@class='dashboard-lock-arrow ki ki-chevron-up']")).click();
		   Thread.sleep(1000);
		   savenote.click();	
		   Thread.sleep(3000);
		
//logout
		   driver.findElement(By.xpath("//span[@class='user-name']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		   Thread.sleep(1000);
//login		
		   login.click();
		   Thread.sleep(1000);
		   login.sendKeys("admin");
		   password.click();
		   Thread.sleep(1000);
		   password.sendKeys("kameda321");
		   Thread.sleep(1000);
		   site.click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		  Thread.sleep(1000);
		  login1.click();
//Investigation module-Sample Collection
		  menu.click();
		  Thread.sleep(1000);
		  inves.click();
		  Thread.sleep(3000);
		  exceutionlo.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='7th Level Execution']")).click();
		  Thread.sleep(1000);
		  okin.click();
		  Thread.sleep(1000);
	//	  driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient.click();
		  Thread.sleep(1000);
//serum already collected.
		//  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		  Thread.sleep(1000);
		  Save.click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		  Thread.sleep(2000);

/////writtensamplenumberinexcel 
		/*  Thread.sleep(3000);
	        String Mrno= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]")).getText();
	    	System.out.println(Mrno);
			
	    	String word[]=Mrno.split("[ :] ");
			System.out.println("number of words: "+word.length);
			for(int i=0;i<word.length;i++)
			{
				System.out.println("word["+i+"]="+word[i]);
			}
			System.out.println(word[1]);*/
			
			/*File src=new File("C:\\Users\\haritha\\eclipse-workspace\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\TestDataYasasiiWeb.xls");
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet FOFullRegTest=wb.getSheetAt(1);	
			int i=FOFullRegTest.getLastRowNum();
			System.out.println("Number of rows: " + i);		
			FOFullRegTest.getRow(i).createCell(11).setCellValue(word[1]);	
	    	FileOutputStream fout=new FileOutputStream(src);	
			wb.write(fout);
			//word[1]=word[1].replaceAll("[^a-zA-Z0-9]","");
			//System.out.println(word[1]); */
			
		/*File src=new File("D:\\\\HHCYasasiiWeb\\\\src\\\\test\\\\resources\\\\excelYasasiiWeb\\\\sprint4 testData.xls");
				FileInputStream fis=new FileInputStream(src);
				HSSFWorkbook wb=new HSSFWorkbook(fis);
				HSSFSheet FOFullRegTest=wb.getSheetAt(66);	
				int i=FOFullRegTest.getLastRowNum();
				System.out.println("Number of rows: " + i);		
				FOFullRegTest.getRow(i).createCell(15).setCellValue(word[1]);	
		    	FileOutputStream fout=new FileOutputStream(src);	
				wb.write(fout);
				Thread.sleep(1000); */
		  
///////Sample Collection-order view
	  pendingbilled.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Sample Collected (Order View)']")).click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient.click();
		  Thread.sleep(3000); 
		  
	  
	///////Sample Collection-order view		  
		  
		  pendingbilled.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  
	String SampleNo =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
	Thread.sleep(2000);
	System.out.println(SampleNo);
	Thread.sleep(1000);
		  
/////sample Tracker
		  menu.click();
		  Thread.sleep(1000);
		  sampletracker.click();
		  Thread.sleep(2000);
		  location.click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[@class='executindrop ng-star-inserted'][normalize-space()='7th Level Execution']")).click();
	      Thread.sleep(1000);
	      createtrip.click();
	      Thread.sleep(1000);
	      Bag.click();
	      Thread.sleep(1000);
	      
	      carrier.click();
	      Thread.sleep(1000);
	      addsamples.click();
	      Thread.sleep(1000);
	      entersamplenumber.click();
	      Thread.sleep(1000);
	      entersamplenumber.sendKeys(SampleNo);
	      Thread.sleep(1000);
	      entersamplenumber.sendKeys(Keys.ENTER);
	      Thread.sleep(1000);
	      starttrip.click();
	      Thread.sleep(2000);
	      location.click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[normalize-space()='Biochemistry']")).click();
	      Thread.sleep(1000);
	      Receive.click();
	      Thread.sleep(1000);
//Clicking on dots for 12 hrs
	      driver.findElement(By.xpath("//i[@class='ki ki-ellipsis-v cust-ellipse']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//label[normalize-space()='Last 12 Hr']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@title='Biochemistry']")).click();
	      Thread.sleep(1000);
	      entersamplenumber.click();
	      Thread.sleep(1000);
	      entersamplenumber.sendKeys(SampleNo);
	      Thread.sleep(1000);
	      entersamplenumber.sendKeys(Keys.ENTER);
	      Thread.sleep(1000);
	      Closetrip.click();
	      Thread.sleep(1000);
	      Back.click();
	      Thread.sleep(1000);
/////Sample Processing
	      menu.click();
		  Thread.sleep(1000);
		  SampleProcessing.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(1000);
		  statusresult.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Sample Received']")).click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  selectservices.click();
		  Thread.sleep(2000);
		  Centrifugation.click();
		  Thread.sleep(3000);
		  Centrifugationundo.click();
		  Thread.sleep(3000);
		  accept.click();
		  Thread.sleep(2000);   
		  acceptundo.click(); 
		  Thread.sleep(1000);
		  acceptundo1.click();
		  Thread.sleep(1000);
		   accept.click();
		  Thread.sleep(1000);
//////Result Entry
		  result.click();
		  Thread.sleep(1000);
		  result.sendKeys(resultvalue);
		  Thread.sleep(1000);
		  result.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
///Range
		  range.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
		  Thread.sleep(1000);
		  savetheresult.click();
		  Thread.sleep(3000);
//////Result Cancellation
		  statusresult.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Result Entered']")).click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  selectservices.click();
		  Thread.sleep(1000);
		  resultcancel.click();
		  Thread.sleep(1000);
		  yes.click();
		  Thread.sleep(3000);
///////Entering the Critical Value for informing doctor.
		  statusresult.click();
		  Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  selectservices.click();
		  Thread.sleep(1000);
		  result.click();
		  Thread.sleep(1000);
		  result.sendKeys(resultvaluecri);
		  Thread.sleep(1000);
		  result.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  range.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
		  Thread.sleep(1000);
		  savetheresult.click();
		  Thread.sleep(3000);
/////informing doctor by clicking call icon
		  statusresult.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  selectservices.click();
		  Thread.sleep(1000);
		  call.click();
		  Thread.sleep(1000);
//1.Feedback 
		  callstatus.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Called but not picked up']")).click();
		  Thread.sleep(1000);
		  Remainder.click();
		  Thread.sleep(1000);
		  savecall.click();
		  Thread.sleep(3000);
//2.Feedback
		  call.click();
		  Thread.sleep(1000);
		  callstatus.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Got the feed back']")).click();
		  Thread.sleep(1000);
		  doctorfeedback.click();
		  Thread.sleep(1000);
		  doctorfeedback.sendKeys(reason);
		  Thread.sleep(1000);
		  doctorfeedback.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  savecall.click();
		  Thread.sleep(3000);
//////Result Authorization
		  menu.click();
		  Thread.sleep(1000);
		  resultauthorize.click();
		  Thread.sleep(2000);
		  statusresult.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  selectservices.click();
		  Thread.sleep(1000);
		  authorize.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		  Thread.sleep(1000);
		  savere.click();
		  Thread.sleep(3000);
//////secondlevelAuthorization
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  selectservices.click();
		  Thread.sleep(1000);
		  authorize.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		  Thread.sleep(1000);
		  savere.click();
		  Thread.sleep(3000);
//////////HomepageView
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient1.click();
		  Thread.sleep(1000);
		  homepage.click();
		  Thread.sleep(2000);
		  backre.click();
		  Thread.sleep(1000);
		  
//////Preview/Print
		  preview.click();
		  Thread.sleep(2000);
		  close.click();
		  Thread.sleep(1000);
		  
		  
	}
	
	
	
	
	
	
	
	
	
	
	}