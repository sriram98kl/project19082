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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMROPNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMROPNoteYasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement EnterPatientname;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	
	public WebElement patientselect;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement patienthomepagelock;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
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
	
	@FindBy(xpath="//div[contains(text(),'Vital Signs')]")
	public WebElement vitalsigns;
	
	@FindBy (xpath="//input[@id='vital000']")
	public WebElement height;
	
	@FindBy(xpath="//input[@id='vital010']")
	public WebElement Weight;
	
	@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEServices;
	
	
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch1;
	
	
	
	@FindBy(xpath="//*[@id='component_cpoe']/app-cpoe-container/div/div/div[2]/div/app-cpoe-order-view/div/div[3]/div/div/div/div/div/div/div[2]/div[1]/i")
	public WebElement point1;
	
	@FindBy(xpath="//span[contains(text(),'Schedule')]")
	public WebElement schedule;
	
	@FindBy(xpath="//span[contains(text(),'Weekly')]")
	public WebElement Weekly;
	@FindBy(xpath="//input[@id='weekcount']")
	public WebElement reoccur;
	@FindBy(xpath="//label[normalize-space()='Tuesday']")
	public WebElement tuesday;
	@FindBy(xpath="//label[normalize-space()='Friday']")
	public WebElement Friday;
	@FindBy(xpath="//input[@id='occurrenceCount']")
	public WebElement occurcount;
	@FindBy(xpath="//button[@class='icon-btn btn-dark-green inline min-clear-btm m0']//i[@class='ki ki-plus']")
	public WebElement scheduleadd;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public WebElement update;
	
	@FindBy(xpath="//i[@class='ki ki-reset']")
	public WebElement refresh;
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch2;
	
	@FindBy(xpath="//i[@class='ki ki-reset']")
	public WebElement refresh1;
	
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch3;
	
	
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch;
	
	
    
			
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	
	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement CPOEPharmacysearch1;
	
	
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine1;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch2;
	
		@FindBy(xpath="//input[@id='MedicineName']")
	public WebElement medicinename;
	
	@FindBy(xpath="//span[contains(@title,'Add Additive')]//i[contains(@class,'fa fa-plus')]")
	public WebElement Add;
	
	@FindBy(xpath="//div[contains(@class,'col-md-12 pr0 ta-r')]//button[contains(@type,'button')][normalize-space()='OK']")
	public WebElement ok;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine2;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch3;
	
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose;
	
	@FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit;
	
	@FindBy(xpath="//i[@class='ki ki-calculator-dose']")
	public WebElement dosage;
	
	@FindBy(xpath="//form[@class='ng-untouched ng-pristine ng-valid']//button[@type='button'][normalize-space()='OK']")
	public WebElement doseok;
	
	@FindBy(xpath="//app-cpoe-pharmacy-prescription//ki-select-control[@id='routeid']//input[1]")
	public WebElement routeid;
		
	@FindBy(xpath="//input[@id='formid']")
    public WebElement form;	
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency1;
	
	@FindBy(xpath="//input[@id='durationunitid']")
	public WebElement durationinsulin;
	
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/app-cpoe-frequency-details[1]/form[1]/div[2]/div[1]/div[1]/button[1]")
	public WebElement okay;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine3;
	
	// Linked Medicine
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch4;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency2;
	
	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='frequencyvalue']")
	public WebElement days;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine4;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch5;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement Frequecylink;
	
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarks;
	
	@FindBy(xpath="//input[@id='antibioticorderingreasonid']")
	public WebElement reason;
	@FindBy(xpath="//label[normalize-space()='Linked Medicine']//span[contains(@class,'checkmark')]")
	public WebElement linkedmedicine;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine5;
	
	@FindBy (xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-cpoe-linkedmedicine[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement checkbox;
	
	@FindBy(xpath="//button[normalize-space()='Ok']")
	public WebElement ok1;
	
	//Tapering
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch6;
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose1;
    @FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit1;
    @FindBy(xpath="//div[contains(@class,'col-md-4')]//input[@id='routeid']")
	public WebElement routeid1;
	@FindBy(xpath="//input[@id='formid']")
    public WebElement form1;	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency3;
	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement duration;
    @FindBy(xpath="//input[@id='antibioticorderingreasonid']")
	public WebElement OrderingReason;
	@FindBy(xpath="//label[normalize-space()='Add as Tapering']")
	public WebElement tapering;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency4;
	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='frequencyvalue']")
	public WebElement dayss;
	@FindBy(xpath="//label[normalize-space()='Add as Tapering']")
	public WebElement tapering1;
	
		
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine6;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch7;
	
	@FindBy(xpath="//i[@class='ki ki-calculator-dose']")
	public WebElement doseicon;
	
	@FindBy(xpath="//form[@class='ng-untouched ng-pristine ng-valid']//button[@type='button'][normalize-space()='OK']")
	public WebElement OKK;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency5;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine7;
		
	
	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement emrsave;
	
//create new note for Discontinue the Medicine 
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnote1;
	
    @FindBy(xpath = "//button[contains(text(),'Create New Note')]")
    public WebElement createnote1;
		
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate1;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template1;
	
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP1;
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK1 ;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy1;
	
	@FindBy(xpath="//label[normalize-space()='Active']")
	public WebElement active;
	
	@FindBy(xpath="//div[@id='section_cpoe']//div[9]//div[1]//div[1]//label[1]//span[1]")
	public WebElement Check;
	
	
	@FindBy(xpath="//div[@class='card card-sm left-border card-pharmacy ng-star-inserted']//div[@class='multi-action']")
	public WebElement point;
	
	@FindBy(xpath="//div[@class='card card-right']//button[@type='button'][normalize-space()='OK']")
	public WebElement ok2;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement emrsave1;
	
	@FindBy(xpath="//label[@class='ellipsis w-100']//i[@class='ki ki-chevron-down']")
	public WebElement inactive;
	
	@FindBy(xpath="//div[normalize-space()='Inactive Medicines']")
	public WebElement inactive1;
	
	@FindBy(xpath="//div[normalize-space()='Antibiotic Medicines']")
	public WebElement antibiotic;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/app-patient-pharmacy-result[1]/div[1]/label[1]/label[2]/i[1]")
	public WebElement diplaydots;
	
	@FindBy(xpath="//span[contains(text(),'Calculator')]")
	public WebElement calculator;
		
	@FindBy(xpath="//input[@id='reqdose']")
	public WebElement reqdose;
	
	@FindBy(xpath="(//i[@class='fa fa-ellipsis-v'])[1]")
	public WebElement editmedicine;
	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement id;
	
	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement Updatepharmacy;
	
	@FindBy(xpath="//label[@class='icon adtview']")
	public WebElement admittingpatient;
	@FindBy(xpath="//button[normalize-space()='OK']")
	public WebElement clickonwarning;
	@FindBy(xpath="//input[@id='admittype']")
	public WebElement admittype;
	@FindBy(xpath="//input[@id='recomproviderdisplayname']")
	public WebElement providertype;
	@FindBy(xpath="//input[@id='reasonid']")
	public WebElement priority;
	@FindBy(xpath="//input[@id='admittedproviderdisplayname']")
	public WebElement admissionprovider;
	@FindBy(xpath="//input[@id='bedcategory']")
	public WebElement roomcategy;
	@FindBy(xpath="//input[@id='bedclass']")
	public WebElement roomtype;
	@FindBy(xpath="//input[@id='bednumber']")
	public WebElement bednumber;
	@FindBy(xpath="//button[@id='savepatadtbutton']")
	public WebElement saveadmit;
	
//ip admitting
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement emrmenu;
	@FindBy(xpath="//div[contains(@class,'btn-module-back')]//i[contains(@class,'ki ki-chevron-down')]")
	public WebElement modules;
	
	@FindBy(xpath="//i[@class='ki ki-sthethescope']")
	public WebElement sethescope;
	@FindBy(xpath="//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement emrscreen;
	
	
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement categoryselect;
	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement subcategory;
	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement searchtextip;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement patientselectip;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
	public WebElement patienthomepageiconip;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelockip;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnoteip;

    @FindBy(xpath = "//button[contains(text(),'Create New Note')]")
    public WebElement createnoteip;
    
    @FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreateip;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement templateip;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement clickOKip ;
	@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEServicesip;
	
	
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearchip;
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEPharmacyip;
	
	@FindBy(xpath="//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement nocurrentadmission;
	@FindBy(xpath="//i[contains(@class,'ki ki-admission-reconciliation')]")
	public WebElement admission;
	@FindBy(xpath="//i[@class='ki ki-continue']")
	public WebElement tickmark;
	
	@FindBy(xpath="//i[@class='ki ki-reconciliation']")
	public WebElement Recon;
	@FindBy(xpath="//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement yes;
	
	@FindBy(xpath = "//input[@class='form-control search-bar ng-pristine ng-valid ng-touched']")
	public WebElement CPOEPharmacysearchip;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequencyip;
	@FindBy(xpath="//input[@id='injectionsiteid']")
	public WebElement site;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicineip;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement emrsaveip;
	
	
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement rateadd;
	
	@FindBy(xpath="//input[@id='ivrate']")
	public WebElement addrate;
	
	@FindBy(xpath="//input[@id='ivrateunitid']")
	public WebElement idadd;
	@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement yesadd;
	
	
	
	//handover
		
		@FindBy(xpath="//div[@class='item-name'][normalize-space()='Referral/Handover/Handoff']")
		public WebElement handoverip;
		@FindBy(xpath="//div[contains(@class,'tab-body mt10')]//input[@id='rhtodeptname']")
		public WebElement departmenthandover;
		@FindBy(xpath="//div[contains(@class,'tab-body mt10')]//input[@id='rhtospecialtyname']")
		public WebElement spehandover;
		@FindBy(xpath="//tab[@id='2']//ki-select-control[@id='timeframeid']//input[1]")
		public WebElement timeframe;
		@FindBy (xpath="//div[@class='tab-body mt10']//textarea[@id='reason']")
		public WebElement remarkshandover;
		@FindBy(xpath="//button[normalize-space()='Add']")
		public WebElement addhandover;
	
		@FindBy(xpath="//div[@class='col-md-6']//input[@id='rhtonamewithid']")
		public WebElement providerName;
		@FindBy(xpath="//div[contains(@class,'tab-body mt10')]//input[@id='timeframeid']")
		public WebElement Timeframe;
	
	
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

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
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
			HSSFSheet FOFullRegTest=wb.getSheetAt(74);	
			int i=FOFullRegTest.getLastRowNum();
			System.out.println("Number of rows: " + i);		
			FOFullRegTest.getRow(i).createCell(0).setCellValue(word[1]);	
	    	FileOutputStream fout=new FileOutputStream(src);	
			wb.write(fout);
			
			Thread.sleep(2000);
			SaveSuccess.click();
			Thread.sleep(2000);

		}
			
			
		
		
		
		
		
		
	public  EMRCPOEAdminstrationYasasiiWeb OP_EMRReg(String MRNo) throws InterruptedException {

		 Thread.sleep(1000);
		 EnterPatientname.sendKeys(MRNo);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
//   	     // patientselect.click();
//   	   Thread.sleep(2000);
		  patienthomepageicon.click();
		  patienthomepagelock.click();
//		  
//		  
//		  
		  Thread.sleep(2000);
	      docnote.click();
			Thread.sleep(1000);
	     	createnote.click();
	 	Thread.sleep(1000);
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
//////////////vitalsigns			
//			vitalsigns.click();
//			Thread.sleep(1000);
//			height.click();
//			height.sendKeys("165");
//			height.sendKeys(Keys.ENTER);
//			Thread.sleep(1000);
//			Weight.click();
//			Weight.sendKeys("75");
//			Thread.sleep(1000);
//////////CPOEService
			CPOEServices.click();
			Thread.sleep(1000);
			CPOESearch1.click();
			CPOESearch1.sendKeys("Potassium");
			Thread.sleep(1000);
			//CPOESearch1.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//div[@id='cpoeservicelist_1']//label[@class='item-name']")).click();
			Thread.sleep(1000);
			point1.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
			Thread.sleep(1000);
			schedule.click();
			Thread.sleep(1000);
			Weekly.click();
			Thread.sleep(1000);
			reoccur.click();
			reoccur.sendKeys("2");
			reoccur.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			tuesday.click();
			Thread.sleep(1000);
			Friday.click();
			Thread.sleep(1000);
			occurcount.click();
			occurcount.sendKeys("4");
			occurcount.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			scheduleadd.click();
			Thread.sleep(1000);
			update.click();
			Thread.sleep(1000);
		//	driver.findElement(By.xpath("//input[@id='cpoeSearchText']")).click();
			refresh.click();
			Thread.sleep(1000);
			CPOESearch2.click();
			CPOESearch2.clear();
			CPOESearch2.sendKeys("Lipid Panel");
			//CPOESearch2.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[normalize-space()='Lipid Panel']")).click();
			Thread.sleep(1000);
////////Instructions
			refresh1.click();
			Thread.sleep(500);
			CPOESearch3.click();
			CPOESearch3.clear();
			//CPOESearch3.sendKeys("check Blood Pressure");
			//CPOESearch3.sendKeys(Keys.ENTER);
			///Thread.sleep(1000);
		//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[2]/div[1]/div[1]/label[2]")).click();
			//Thread.sleep(500);
////////////////Cpoe Pharmacy
			CPOEPharmacy.click();
			Thread.sleep(1000);
//			
////////////////ongoing- patient own medication	
//////remove fav
////			driver.findElement(By.xpath("//div[contains(@class,'col-md-7 mbl-pr5')]//img[1]")).click();
////////prescriptiontype
			driver.findElement(By.xpath("//i[@class='ki ki-rx']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Ongoing']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Patient own medication']")).click();
			Thread.sleep(1000);
			CPOEPharmacysearch.sendKeys("Augmentin");
			//Thread.sleep(1000);
			//CPOEPharmacysearch.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
	     	driver.findElement(By.xpath("//*[contains(text(),'Augmentin 1000Mg Duo Tab, 1 Tab(s)  by Oral')]")).click();
	    	Thread.sleep(2000);
	  		ADDMedicine.click();
	    	Thread.sleep(1000);
////	  
////////////////////////Past-outsidehospital	    	
	
	    	driver.findElement(By.xpath("//i[@class='ki ki-rx']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[normalize-space()='Past']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Outside hospital']")).click();
			Thread.sleep(1000);
			CPOEPharmacysearch1.click();
			Thread.sleep(1000);
			CPOEPharmacysearch1.clear();
			Thread.sleep(1000);
			CPOEPharmacysearch1.sendKeys("Dolopar");
			Thread.sleep(1000);
			CPOEPharmacysearch1.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'Dolopar 125Mg Susp 60Ml, 60 Ml  by Oral')]")).click();
			Thread.sleep(1000);
			
//////////////Date
			driver.findElement(By.xpath("//ki-calender-time-military[contains(@formcontrolname,'enddate')]")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
			Thread.sleep(1000);
			ADDMedicine1.click();
			Thread.sleep(1000);
////////////////////Additive Medicine	
	    	driver.findElement(By.xpath("(//i[@class='ki ki-reset'])[2]")).click();
	    	Thread.sleep(1000);
			CPOEPharmacysearch2.click();
			Thread.sleep(1000);
			CPOEPharmacysearch2.clear();
			Thread.sleep(1000);
			CPOEPharmacysearch2.sendKeys("Dextrose");
			Thread.sleep(1000);
			//CPOEPharmacysearch2.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Dextrose + 0.45% Normal Saline 500Ml - Claris, 500 Ml  by Intravenous')]")).click();
			Thread.sleep(1000);
			//mindose1.click();
			
			driver.findElement(By.xpath("//i[@class='ki ki-additive custom-additive']")).click();
			Thread.sleep(1000);
			medicinename.click();
			Thread.sleep(1000);
			medicinename.sendKeys("Deriphyllin Inj");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Deriphyllin Inj']")).click();
			Thread.sleep(500);
			Add.click();
			Thread.sleep(500);
			ok.click();
			Thread.sleep(500);
			frequency.click();
			driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
			Thread.sleep(1000);
			//rateadd.click();
		//	rateadd.sendKeys("5");
			Thread.sleep(500);
			 addrate.click();
			 addrate.sendKeys("500");
			 Thread.sleep(500);
			 idadd.click();
			 driver.findElement(By.xpath("//li[normalize-space()='ml/Hr']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//input[@name='remarks']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("ok");
			 Thread.sleep(1000);
			ADDMedicine2.click();
		//	yesadd.click();
			Thread.sleep(3000);
			
////////////////sliding scale
			driver.findElement(By.xpath("(//i[@class='ki ki-reset'])[2]")).click();
			Thread.sleep(1000);
			CPOEPharmacysearch3.click();
			Thread.sleep(1000);
			CPOEPharmacysearch3.clear();
			Thread.sleep(1000);
			CPOEPharmacysearch3.sendKeys("Insulin");
			Thread.sleep(1000);
			//CPOEPharmacysearch3.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Human Insulin')]")).click();
			Thread.sleep(1000);
			mindose.click();
			mindose.sendKeys("2");
			Thread.sleep(1000);
			doseunit.click();
			Thread.sleep(500);
			doseunit.sendKeys("%");
			driver.findElement(By.xpath("//li[contains(text(),'%')]")).click();
			Thread.sleep(1000);
		 //   dosage.click();
		    Thread.sleep(1000);
		  //  doseok.click();
		    Thread.sleep(1000);
			routeid.click();
			driver.findElement(By.xpath("//li[normalize-space()='Intravenous']")).click();
			Thread.sleep(1000);
			form.click();
			driver.findElement(By.xpath("//li[normalize-space()='Injection']")).click();
			Thread.sleep(1000);
			frequency1.click();
			driver.findElement(By.xpath("//li[normalize-space()='Continuous Infusion']")).click();
			Thread.sleep(1000);
			durationinsulin.click();
			driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
			Thread.sleep(1000);
			ADDMedicine3.click();
			Thread.sleep(3000);
//////////////linked Medicine
	
			driver.findElement(By.xpath("(//i[@class='ki ki-reset'])[2]")).click();
			Thread.sleep(1000);
			CPOEPharmacysearch4.clear();
			CPOEPharmacysearch4.click();
			CPOEPharmacysearch4.sendKeys("calpol");
			//CPOEPharmacysearch4.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[contains(text(),'Calpol 120Mg Suspension 60Ml, 60 Ml  by Oral')]")).click();
			Thread.sleep(500);
			frequency2.click();
			driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
			Thread.sleep(500);
			days.click();
			days.sendKeys("3");
			Thread.sleep(1000);
			ADDMedicine4.click();
			Thread.sleep(500);
////////			
			CPOEPharmacysearch1.clear();
			CPOEPharmacysearch1.click();
			CPOEPharmacysearch1.sendKeys("Diabeta");
			//CPOEPharmacysearch5.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[contains(text(),'Diabeta , 1 Mg  by Oral')]")).click();
			Thread.sleep(1000);
			Frequecylink.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
			 Thread.sleep(1000);
			JavascriptExecutor js8 = (JavascriptExecutor) driver;
			 js8.executeScript("arguments[0].scrollIntoView();", remarks);
			 remarks.click();
			 remarks.sendKeys("MEdicine");
			 remarks.sendKeys(Keys.ENTER);
			 Thread.sleep(1000);
			 reason.click();
			 Thread.sleep(1000);
			 
		 driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
			linkedmedicine.click();
         Thread.sleep(1000);
			ADDMedicine5.click();
			Thread.sleep(1000);
			checkbox.click();
			Thread.sleep(500);
			ok1.click();
			Thread.sleep(1500);
////////////tapering medicine 1			
			CPOEPharmacysearch1.clear();
			CPOEPharmacysearch1.click();
			CPOEPharmacysearch1.sendKeys("Amoxicillin");
			//CPOEPharmacysearch6.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'Amoxicillin')]")).click();
			Thread.sleep(1000);
			mindose1.click();
			mindose1.sendKeys("2");
			Thread.sleep(1000);
			doseunit1.click();
			Thread.sleep(1000);
			doseunit1.sendKeys("%");
			driver.findElement(By.xpath("//li[normalize-space()='Mg']")).click();
			Thread.sleep(1000);
			 routeid1.click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//li[normalize-space()='Ear']")).click();
			Thread.sleep(1000);
			form1.click();
			driver.findElement(By.xpath("//li[normalize-space()='Drops']")).click();
			frequency2.click();
			driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
			Thread.sleep(1000);
			duration.click();
			 duration.clear();
		     duration.sendKeys("3");
		 	durationinsulin.click();
			driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 js1.executeScript("arguments[0].scrollIntoView();", OrderingReason);
			 OrderingReason.click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
			 Thread.sleep(1000);
			 tapering.click();
			 Thread.sleep(1000);
			 frequency4.click();
			 driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
			 Thread.sleep(1000);
			 dayss.click();
			 dayss.sendKeys("3");
			 Thread.sleep(1000);
			 tapering1.click();
			 Thread.sleep(1000);
			 ADDMedicine6.click();
			 Thread.sleep(1000);
		   CPOEPharmacysearch1.clear();
			 Thread.sleep(1000);
		  	CPOEPharmacysearch1.click();
			 Thread.sleep(1000);
			CPOEPharmacysearch1.sendKeys("Urifast");
			 Thread.sleep(1000);
			CPOEPharmacysearch1.sendKeys(Keys.ENTER);//html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Urifast 100Mg Cap, 1 Cap(s)  by Oral')]")).click();
			Thread.sleep(1000);
			doseicon.click();
			Thread.sleep(1000);
			calculator.click();
			Thread.sleep(1000);
			reqdose.click();
			Thread.sleep(1000);
			reqdose.sendKeys("2");
			reqdose.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			OKK.click();
		    Thread.sleep(1000);
		    frequency5.click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//li[normalize-space()='OD']")).click();
		    Thread.sleep(1000);
		     ADDMedicine7.click();  
//////////////Edit the adding Medicine.
		     Thread.sleep(1000);
		     editmedicine.click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
		     Thread.sleep(1000);
		     id.click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		     Thread.sleep(1000);
		          
		     Updatepharmacy.click();
		     Thread.sleep(1000);
		  	 emrsave.click();
		     Thread.sleep(20000); 
//////NewNote
		    docnote1.click();
			Thread.sleep(1000);
		    createnote1.click();
	 	    Thread.sleep(1000);
	 	    encreate1.clear();
	        encreate1.click();
		    Thread.sleep(1000);
			encreate1.sendKeys("Fever");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template1.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK1.click();
			Thread.sleep(1000);
			CPOEPharmacy1.click();
			Thread.sleep(1000);
			 active.click();
			Thread.sleep(1000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].scrollIntoView();", Check);
			Check.click();
			Thread.sleep(1000);
////////Discontinue//hold
			point.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='multi-action']//div[2]")).click();
			Thread.sleep(1000);
			ok2.click();
			Thread.sleep(1000);
			emrsave.click();
			Thread.sleep(8000);
			inactive.click();
			Thread.sleep(1000);
////////Inactive List
			driver.findElement(By.xpath("//div[normalize-space()='Inactive Medicines']")).click();
			Thread.sleep(2000);
			inactive1.click();
			Thread.sleep(1000);
////////Antibiotic 
			antibiotic.click();
			Thread.sleep(1000);
			diplaydots.click();
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen/div[@class='page-container']/div[@class='note-layout ng-star-inserted ab-locked layout-2']/div[@class='notelayoutcontainer']/app-emr-homescreen-landing[@class='ng-star-inserted']/div[@class='home-screen-container ng-star-inserted']/div[@class='patient-home-screen']/div[@class='hs-right-container']/div[@class='pat-med-info ng-star-inserted']/div[@class='diagnosis-info']/div[@class='all-medications']/app-patient-pharmacy-result[@class='ng-star-inserted']/div[@class='hsc-md-header']/label[@class='hsc-filter ng-star-inserted']/label[@class='multi-action']/div[@class='action-list ng-star-inserted']/div[1]")).click();
            Thread.sleep(1000);
/////Admitting the Patient
			
			admittingpatient.click();
			Thread.sleep(500);
			clickonwarning.click();
			Thread.sleep(500);
			admittype.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		    providertype.click();
			Thread.sleep(2000);
			providertype.sendKeys("Albert Sam");
			driver.findElement(By.xpath("//li[normalize-space()='Albert Sam(DOCAS)']")).click();
			Thread.sleep(1000);
			priority.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
			Thread.sleep(1000);
			JavascriptExecutor js21 = (JavascriptExecutor) driver;
			 js21.executeScript("arguments[0].scrollIntoView();", roomcategy);
			 roomcategy.click();
			 driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
			 roomtype.click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();
			 bednumber.click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[1]")).click();
			 Thread.sleep(1000);
			 saveadmit.click();
			 Thread.sleep(10000);
//IP Patient Selecting
			 emrmenu.click();
			 Thread.sleep(1000);
			 sethescope.click();
			 Thread.sleep(1000);
			 emrscreen.click();
			 Thread.sleep(1000);
			 categoryselect.click();
			 Thread.sleep(500);
		     driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
			 Thread.sleep(1000);
			 subcategory.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='My IP']")).click();
			Thread.sleep(1000);
			 searchtextip.click();
			 searchtextip.sendKeys(MRNo);
			 searchtextip.sendKeys(Keys.ENTER);
		     Thread.sleep(1000);
				
		   patientselectip.click();
				 Thread.sleep(1000);
				// patienthomepageiconip.click();
				 Thread.sleep(1000);
				// patienthomepagelockip.click();
				 Thread.sleep(1000);
				 docnoteip.click();
				 Thread.sleep(1000);
				encreateip.click();
				 encreateip.sendKeys("Fever");
				driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
				 Thread.sleep(1000);
				 templateip.click();
			    Thread.sleep(2000);
				 driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
			     clickOKip.click();
		     
			     
			   //Handover
					handoverip.click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[normalize-space()='Handover']")).click();
					Thread.sleep(1000);
					departmenthandover.click();
					Thread.sleep(1000);
					departmenthandover.sendKeys("Cardiology");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//li[normalize-space()='Cardiology']")).click();
					Thread.sleep(1000);
					 spehandover.click();
					 driver.findElement(By.xpath("//li[normalize-space()='Cardiology.']")).click();
					 Thread.sleep(1000);
					 timeframe.click();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//li[normalize-space()='Within 1 Day']")).click();
					Thread.sleep(1000);
					remarkshandover.click();
					Thread.sleep(1000);
					remarkshandover.sendKeys("admitt");
					 Thread.sleep(1000);
					providerName.click();
					 providerName.sendKeys("Rakesh Rao");
					 driver.findElement(By.xpath("//li[normalize-space()='Rakesh Rao(RAK811)']")).click();
					 Thread.sleep(1000);
					addhandover.click();
					 Thread.sleep(1000);
////IP Service Adding					 
     
				Thread.sleep(1000);
				CPOEServicesip.click();
				Thread.sleep(1000);
				CPOESearchip.click();
				Thread.sleep(1000);
				CPOESearchip.sendKeys("Sodium");
				CPOESearchip.sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//div[@id='cpoeservicelist_3']//label[@class='item-name']")).click();
				Thread.sleep(1000);
				
				CPOEPharmacyip.click();
				Thread.sleep(1000);
		     	admission.click();
				Thread.sleep(1000);
				tickmark.click();
				Thread.sleep(1000);
			
				Recon.click();
				Thread.sleep(1000);
				yes.click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//div[@class='col-md-7 mbl-pr5']//img[1]")).click();
///IP Pharmacy adding
				
//				
//				//CPOEPharmacy.click();
//				Thread.sleep(1000);
//				CPOEPharmacysearchip.click();
//				Thread.sleep(1000);
//				CPOEPharmacysearchip.sendKeys("cyclopam");
//				Thread.sleep(1000);
//				CPOEPharmacysearchip.sendKeys(Keys.ENTER);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[contains(text(),'Cyclopam 20Mg Inj, 2 Ml  by Intramuscular')]")).click();
//				Thread.sleep(1000);
//				frequencyip.click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//li[normalize-space()='Continuous Infusion']")).click();
//				Thread.sleep(1000);
//			//	site.click();
//				Thread.sleep(1000);
//				//driver.findElement(By.xpath("//li[contains(text(),'Deltoid muscle')]")).click();
//				ADDMedicineip.click();
//				Thread.sleep(1000);
				emrsave.click();
				Thread.sleep(1000);
				
			
			
			
			
			
			
			
		return new EMRCPOEAdminstrationYasasiiWeb(driver);
			
			
	}

	
	
}

