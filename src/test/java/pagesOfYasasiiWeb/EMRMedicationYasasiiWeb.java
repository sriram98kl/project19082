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
public class EMRMedicationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRMedicationYasasiiWeb(WebDriver driver) {
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
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectPatient;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement patienthomepagelock;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnote;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement ChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[normalize-space()='SOAP']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;
	
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
	@FindBy(xpath="//div[@class='row ng-star-inserted']//div[1]//div[1]//div[2]//div[1]//i[1]")
	public WebElement editpoint;
	@FindBy(xpath="//textarea[@id='reasonfororder']")
	public WebElement reasonforedit;
	@FindBy(xpath="//button[normalize-space()='Update']")
	public WebElement updateservice;
	@FindBy(xpath="//label[normalize-space()='Select All']//span[@class='checkmark']")
	public WebElement selectallservice;
	@FindBy(xpath="//span[@title='Delete Service']//i[@class='ki ki-trash']")
	public WebElement deleteservice;
    @FindBy(xpath="//button[@class='btn btn-primary sm active']")
    public WebElement yesdelete;
    @FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
    
    @FindBy(xpath = "//input[@id='prescriptiontypeid']//input[@class='form-control search-bar ng-valid ng-touched ng-dirty']")
   	public WebElement medicineSearch;//input[@placeholder='Search Medicines']
    
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch;
	
	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement CPOEPharmacysearch1;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	@FindBy(xpath="//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement editpharmacy;
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarkedit;
	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement updatepharmacy;
	@FindBy(xpath="//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement yesdeletepharmacy;
	@FindBy(xpath="//input[@id='MedicineName']")
	public WebElement medicinename;
	@FindBy(xpath="//span[contains(@title,'Add Additive')]//i[contains(@class,'fa fa-plus')]")
	public WebElement Add;
	@FindBy(xpath="//div[contains(@class,'col-md-12 pr0 ta-r')]//button[contains(@type,'button')][normalize-space()='OK']")
	public WebElement ok;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency;
	@FindBy(xpath="//input[@id='ivrate']")
	public WebElement addrate;
	@FindBy(xpath="//input[@id='ivrateunitid']")
	public WebElement idadd;
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
	@FindBy(xpath="//input[@id='duration']")
	public WebElement durationinsulin;
	@FindBy(xpath="//input[@id='durationunitid']")
	public WebElement unitid;
	@FindBy(xpath="//input[@id='duration']")
	public WebElement durationpast;
	@FindBy(xpath="//div[@class='order-details']//div[@class='multi-action']")
	public WebElement editpharmacy1;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency2;
	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='frequencyvalue']")
	public WebElement days;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement Frequecylink;
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarks;
	@FindBy(xpath="//input[@id='antibioticorderingreasonid']")
	public WebElement reason;
	@FindBy(xpath="//label[normalize-space()='Linked Medicine']//span[contains(@class,'checkmark')]")
	public WebElement linkedmedicine;
	@FindBy (xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-cpoe-linkedmedicine[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement checkbox;
	@FindBy(xpath="//button[normalize-space()='Ok']")
	public WebElement ok1;
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose1;
    @FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit1;
    @FindBy(xpath="//input[@id='routeid']")
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
	@FindBy(xpath="(//div[@class='multi-action'])[3]")
	public WebElement editpharmacy3;
    @FindBy(xpath="//input[@id='doseunitid']")
    public WebElement dose;
	@FindBy(xpath="//input[@id='durationunitid']")
	public WebElement id;
	@FindBy(xpath="//div[@class='col-md-12']//div[1]//div[1]//div[5]//div[2]//label[1]//i[1]")
	public WebElement taperingedit;
	
	@FindBy(xpath="//label[normalize-space()='Update Tapering']")
	public WebElement updatetapering;
	
//Vitalsigns
	@FindBy(xpath="//div[contains(text(),'Vital Signs and Measurement')]")
	public WebElement vital;
	@FindBy(xpath="//label[@class='cat-type-label gen']//i[@class='ki ki-ellipsis-v']")
	public WebElement dotsvital;
	@FindBy(xpath="//input[@id='vital011']")
	public WebElement Height;
	@FindBy(xpath="//input[@id='vital021']")
	public WebElement Weight;

//Allergy
	@FindBy(xpath="//div[@class='item-name'][normalize-space()='Allergy']")
	public WebElement allergy;
	@FindBy(xpath="//div[@class='card card-left']//div[@class='card-body form-inputs']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-icon']//div//button[@type='button'][normalize-space()='Add New Allergy']")
	public WebElement addnewallergy;
	@FindBy(xpath="//input[@id='drugclassname']")//input[@id='otherallergyname']
	public WebElement searchname;
	@FindBy(xpath="//input[@id='severityname']")
	public WebElement severity;
	@FindBy(xpath="//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement addallergy;
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	public WebElement allergypoint;
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement editdescrip;
	@FindBy(xpath="//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement editadd;
//savenote
	@FindBy(xpath="//label[@class='icon emrsave']")
	public WebElement savenote;
//allergy_log,delete& Revoke
	@FindBy(xpath="//div[@class='card card-left']//i[@class='fa fa-ellipsis-v']")
	public WebElement allergypoint1;
	@FindBy(xpath="//body/modal-container[@role='dialog']/div[@role='document']/div[@class='modal-content']/div[2]/div[2]/span[1]")
	public WebElement closelog;
	@FindBy(xpath="//textarea[@id='deletedreason']")
	public WebElement deletereason;
	@FindBy(xpath="//span[@class='btn btn-dark-green active']")
	public WebElement okdelete;
	@FindBy(xpath="//div[@class='card card-sm left-border is-deleted mild']//i[@class='fa fa-ellipsis-v']")
	public WebElement allergypoint2;
//otherAllergy	
	@FindBy(xpath="//button[normalize-space()='Add New Allergy']")
	public WebElement otherallergy;
	@FindBy(xpath="//input[@id='otherallergyname']")
	public WebElement serviceother;
	@FindBy(xpath="//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement addother;
	@FindBy(xpath="//div[@class='card card-right']//i[@class='fa fa-ellipsis-v']")
	public WebElement othereditpoint;
	@FindBy(xpath="//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement otherdelete;
//ClicnicalWarning
	@FindBy(xpath="//div[contains(text(),'Clinical Warning')]")
	public WebElement clinical;
	
	
	@FindBy(xpath="//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")
	public WebElement bleedingCheckbox;
	
	
	
	@FindBy(xpath="//input[@id='onset']")
    public WebElement onsetclinical;	
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement okclinical;
//Diagnosis&Plan
	@FindBy(xpath="//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;
	@FindBy(xpath="//input[@id='db']")
	public WebElement searchdignosis;
	@FindBy(xpath="//div[@class='card card-sm ng-star-inserted']//i[@class='fa fa-ellipsis-v']")
	public WebElement editdignosis;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement onsetdig;
	@FindBy(xpath="//button[@aria-label='Close'][normalize-space()='OK']")
	public WebElement okdig;
	
	@FindBy(xpath="//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement Arrow;
	
	@FindBy(xpath="//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template1;
	
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;
	
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

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;
	
	
	
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
System.out.println("sri");
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(28);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		SaveSuccess.click();
		Thread.sleep(2000);

	}
	
	
	
	
	
	public void  medication(String MRNo,String allergys,String editallergys,String deletere,String otheraller,String editdep,String edp,String sd,String cpoe1,String cpoe2,String cpoe3,String red,String cpoep,String rem,String cpoep2,String rem1,String ad1,String ad,String rm2,String side,String rm3,String p3,String p4,String rr ,String re,String p5) throws InterruptedException {

		 Thread.sleep(1000);
		 EnterPatientName.sendKeys(MRNo);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		 Thread.sleep(1000);
		  //patienthomepageicon.click();
		  Thread.sleep(1000);
		//  patienthomepagelock.click();
////////DocNote 
		  Thread.sleep(2000);
  	      docnote.click();
  	    Thread.sleep(1000);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//		
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}
//	  Thread.sleep(800); 
		 cheifComplaint.clear();
		  Thread.sleep(800); 
		cheifComplaint.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Template1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
//////Vital Signs
			vital.click();
			Thread.sleep(1000);
			//dotsvital.click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//span[normalize-space()='Default View']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='Add new']")).click();
			Thread.sleep(1000);
			Height.click();
			Thread.sleep(1000);
			Height.clear();
			Height.sendKeys("170");
			Thread.sleep(1000);
			Weight.click();
			Thread.sleep(1000);
			Weight.clear();
			Weight.sendKeys("76");
			Thread.sleep(1000);
//Allergy
			allergy.click();
			Thread.sleep(1000);
//			List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='header-action ng-star-inserted']//i[@class='fa fa-plus']"));
//			
//			System.out.println(dynamicElement1.size());
//			if(dynamicElement1.size() !=0)
//			{
//				driver.findElement(By.xpath("//div[@class='header-action ng-star-inserted']//i[@class='fa fa-plus']")).click();
//
//			}
//			else {
//				Thread.sleep(1000);
//				System.out.println("sri");
				addnewallergy.click();
		//	}
			
		
			
		
			Thread.sleep(1000);
		
			Thread.sleep(1000);
			searchname.click();
			Thread.sleep(1000);
			searchname.sendKeys(allergys);
			searchname.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Parathyroid Hormone And Analogs']//div[@id='list0']")).click();
			severity.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Mild']")).click();
			Thread.sleep(1000);
			addallergy.click();
			Thread.sleep(1000);
//Editallergy
			allergypoint.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			Thread.sleep(1000);
			editdescrip.click();
			Thread.sleep(1000);
			editdescrip.sendKeys(editallergys);
			Thread.sleep(1000);
			editadd.click();
			Thread.sleep(1000);
//savethenote 
			
		   // Arrow.click();
			Thread.sleep(1000);
			//Lock.click();
			savenote.click();
			Thread.sleep(1000);
////////DocNote 
			  Thread.sleep(1000);
	  	      docnote.click();
				Thread.sleep(1000);
		      createnote.click();
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
				
//Allergy-Log view, Delete & Revoke			
				allergy.click();
				Thread.sleep(1000);
				allergypoint1.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[normalize-space()='Log']")).click();
				Thread.sleep(1000);
				closelog.click();
				Thread.sleep(1000);
				allergypoint1.click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    deletereason.click();
			    Thread.sleep(1000);
			    deletereason.sendKeys(deletere);
			    Thread.sleep(1000);
			    okdelete.click();
			    Thread.sleep(1000);
			    allergypoint2.click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Revoke']")).click();
			    Thread.sleep(1000);
//Other Allergy			
			    otherallergy.click();
			    Thread.sleep(1000);
			    serviceother.click();
			    Thread.sleep(1000);
			    serviceother.sendKeys(otheraller);
			    serviceother.sendKeys(Keys.ENTER);
			    Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Chicken']//div[@id='list0']")).click();
			Thread.sleep(1000);
			addother.click();//button[@id='otherallergyaddbtn']
			Thread.sleep(1000);
//Edit other Allergy
			othereditpoint.click();//div[@class='card card-right']//i[@class='fa fa-ellipsis-v']
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			Thread.sleep(1000);
			editdescrip.click();
			Thread.sleep(1000);
			editdescrip.sendKeys(editdep);
			Thread.sleep(1000);
			editadd.click();
			Thread.sleep(1000);
//DeleteOtherallergy		
			othereditpoint.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			Thread.sleep(1000);
			otherdelete.click();
			Thread.sleep(1000);
			
//Clinical Warning:
				clinical.click();
				Thread.sleep(1000);
			driver.findElement(By.xpath("//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			onsetclinical.click();
			onsetclinical.sendKeys("2");
			Thread.sleep(1000);
			okclinical.click();
			Thread.sleep(1000);
//Edit_Clinical Warning
		     act.moveToElement(bleedingCheckbox).build().perform();	
		     Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
			Thread.sleep(1000);
			editdescrip.click();
			Thread.sleep(1000);
			editdescrip.sendKeys(edp);
			Thread.sleep(1000);
			okclinical.click();
			Thread.sleep(1000);
//DeleteClinicalWarning
			driver.findElement(By.xpath("//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			yesdelete.click();
			Thread.sleep(1000);
//Diagnosis&Plan
			diagnosis.click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//label[@class='fav-icon']//img[@class='favorite ng-star-inserted']")).click();
			//searchdignosis.click();
			Thread.sleep(1000);
			//searchdignosis.sendKeys(sd);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
			Thread.sleep(1000);
//Edit Diagnosis&plan
			editdignosis.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Add Note']")).click();
			Thread.sleep(1000);
			onsetdig.click();
			Thread.sleep(1000);
			onsetdig.sendKeys("1");
			Thread.sleep(1000);
			okdig.click();
			Thread.sleep(1000);
//DeleteDiagnosis&plan
			editdignosis.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
			//yesdelete.click();
			Thread.sleep(1000);
//			 
			 
			 
			 
/////Services Adding
////////////CPOEService
				CPOEServices.click();
				Thread.sleep(1000);
				CPOESearch1.click();
				CPOESearch1.sendKeys(cpoe1);
				Thread.sleep(1000);
				//CPOESearch1.sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("(//label[@class='item-name'])[4]")).click();
				Thread.sleep(1000);
				point1.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
				Thread.sleep(1000);
//ScheduleSetting
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
////Panel Service
			//	CPOESearch2.click();
				Thread.sleep(1000);
				CPOESearch2.clear();
				//CPOESearch2.sendKeys(cpoe2);
				Thread.sleep(1000);
			//	CPOESearch2.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//label[normalize-space()='Lipid Panel']")).click();
				Thread.sleep(1000);
////////Instructions
			//	refresh1.click();
//				Thread.sleep(500);
//				CPOESearch3.click();
//				CPOESearch3.clear();
//				CPOESearch3.sendKeys(cpoe3);
//				CPOESearch3.sendKeys(Keys.ENTER);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//label[normalize-space()='Check Blood Pressure']")).click();
//				Thread.sleep(1000);
//Service Editing 			
				editpoint.click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			    Thread.sleep(1000);
			    reasonforedit.click();
			    Thread.sleep(1000);
			    reasonforedit.sendKeys(red);
			    Thread.sleep(1000);
			    updateservice.click();
			    Thread.sleep(1000);
			    editpoint.click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath(" //button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
			 
			    //yesdelete.click();
			    Thread.sleep(1000);
	    
//DeleteAlltheAddedService
			    selectallservice.click();
			    Thread.sleep(1000);
			    deleteservice.click();//span[@title='Delete Service']//i[@class='ki ki-trash']
			    Thread.sleep(1000);
			    
			    driver.findElement(By.xpath(" //button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
			 
			    
			    
			  //  yesdelete.click();
			    Thread.sleep(1000);
////CPOE Pharmacy
			    CPOEPharmacy.click();
				Thread.sleep(1000);
//				medicineSearch.click();
//				 Thread.sleep(1000);
//				medicineSearch.sendKeys("calpol");
//				 Thread.sleep(1000);
//				driver.findElement(By.xpath("//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted ab-locked layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'col-md-7 mbl-pr5')]/div[contains(@class,'ng-star-inserted')]/div/div[contains(@class,'ng-star-inserted')]/div/div/app-cpoe-pharmacy-list/form[contains(@class,'ng-valid ng-touched ng-dirty')]/div[contains(@class,'card card-left list-container pharmacy-list')]/div[contains(@class,'card-body item-list-container')]/div[1]/div[1]/div[1]")).click();
//				
//				
////1.ongoing- patient own medication	
//////////prescriptiontype
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class='ki ki-rx']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[normalize-space()='Ongoing']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[normalize-space()='Patient own medication']")).click();
				CPOEPharmacysearch.sendKeys(cpoep);
				Thread.sleep(1000);
			//	CPOEPharmacysearch.sendKeys(Keys.ENTER);
				Thread.sleep(3000);//*[contains(text(),'Augmentin 1000Mg Duo Tab, 1 Tab(s)  by Oral')]
		     	driver.findElement(By.xpath("//*[contains(text(),'Augmentin 1000Mg Duo Tab, 1 Tab(s)  by Oral')]")).click();
		    	Thread.sleep(1000);//*[contains(text(),'Augmentin 1000Mg Duo Tab, 1 Tab(s)  by Oral')]
		    	frequency.click();//div[@title="Augmentin 1000Mg Duo Tab, 1 Tab(s)  by Oral"]
		    	driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		  		ADDMedicine.click();
		    	Thread.sleep(1000);
//Edit_ongoing-patient own medication
		    	editpharmacy.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			    Thread.sleep(1000);
			    remarkedit.click();
			    Thread.sleep(1000);
			    remarkedit.sendKeys(rem);
			    Thread.sleep(1000);
			    updatepharmacy.click();
			    Thread.sleep(1000);
//Delete-ongoing-patient own medication			    
			    editpharmacy.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    yesdeletepharmacy.click();
			    Thread.sleep(1000);
    
//2.Past-Outside Hospital.
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
				CPOEPharmacysearch1.sendKeys(cpoep2);
				Thread.sleep(1000);
				CPOEPharmacysearch1.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),'Dolopar 125Mg Susp 60Ml, 60 Ml  by Oral')]")).click();
				Thread.sleep(1000);
				frequency.click();
				driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
//				durationpast.click();
//				durationpast.clear();
//				durationpast.sendKeys("3");
				Thread.sleep(1000);
				
////////////////Date
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[5]/ki-calender-time-military[1]/div[1]/input[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[4]/td[6]/span[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
//				Thread.sleep(1000);
				ADDMedicine.click();
				Thread.sleep(1000);
//Edit-past Outside hospital			    
				editpharmacy1.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			    Thread.sleep(1000);
			    remarkedit.click();
			    Thread.sleep(1000);
			    remarkedit.sendKeys(rem1);
			    Thread.sleep(1000);
			    updatepharmacy.click();
			    Thread.sleep(1000);
//Delete-Past outside hospital			    
			    editpharmacy1.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    yesdeletepharmacy.click();
			    Thread.sleep(1000);
			    
//3.Additive Medicine	
		driver.findElement(By.xpath("//div[@class='btn-pharmacy-group cust-grp']//i[@class='ki ki-reset']")).click();
		Thread.sleep(1000);
		CPOEPharmacysearch.click();
		Thread.sleep(1000);
		CPOEPharmacysearch.clear();
		Thread.sleep(1000);
		CPOEPharmacysearch.sendKeys(ad1);
		//CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@title,'by Intravenous')]")).click();
		Thread.sleep(1000);
		//mindose1.click();
		driver.findElement(By.xpath("//input[@id='frequencyid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();
		Thread.sleep(1000);
		///////////////////
		driver.findElement(By.xpath("//i[@class='ki ki-additive custom-additive']")).click();
		Thread.sleep(1000);
		medicinename.click();
		Thread.sleep(1000);
		medicinename.sendKeys(ad);
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
		ADDMedicine.click();
	//	yesadd.click();
		Thread.sleep(3000);			    
//Edit-Additivemedicine
		editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
	    Thread.sleep(1000);
	    remarkedit.click();
	    Thread.sleep(1000);
	    remarkedit.sendKeys(rm2);
	    Thread.sleep(1000);
	    updatepharmacy.click();
	    Thread.sleep(1000);
//Delete-AdditiveMedicine			    
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000);

	    ///4. sliding scale
		//driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		CPOEPharmacysearch1.click();
		CPOEPharmacysearch1.clear();
		CPOEPharmacysearch1.sendKeys(side);
		CPOEPharmacysearch1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Human Insulin']")).click();
		Thread.sleep(1000);
	mindose.click();
		mindose.sendKeys("2");
		Thread.sleep(1000);
		doseunit.click();	
		Thread.sleep(500);
		doseunit.sendKeys("%");
		driver.findElement(By.xpath("//li[contains(text(),'%')]")).click();
		Thread.sleep(1000);

	    
		routeid.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Intravenous']")).click();
		Thread.sleep(1000);
		form.click();
		driver.findElement(By.xpath("//li[normalize-space()='Injection']")).click();
		Thread.sleep(1000);
		frequency1.click();
		driver.findElement(By.xpath("//li[normalize-space()='Continuous Infusion']")).click();
		Thread.sleep(1000);
		//durationinsulin.click();
		Thread.sleep(1000);
		unitid.click();//input[@id='durationunitid']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		ADDMedicine.click();
		Thread.sleep(3000);
//Edit-SlidingScale
		editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
	    Thread.sleep(1000);
	    remarkedit.click();
	    Thread.sleep(1000);
	    remarkedit.sendKeys(rm3);
	    Thread.sleep(1000);
	    updatepharmacy.click();
	    Thread.sleep(1000);
//Delete-SlidingScale			    
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000);	    

//5.linked Medicine
		driver.findElement(By.xpath("//div[@class='btn-pharmacy-group cust-grp']//i[@class='ki ki-reset']")).click();//div[@class='btn-pharmacy-group cust-grp']//i[@class='ki ki-reset']
		Thread.sleep(1000);
		CPOEPharmacysearch.clear();
		CPOEPharmacysearch.click();
		CPOEPharmacysearch.sendKeys(p3);
		//CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[contains(text(),'Calpol 120Mg Suspension 60Ml, 60 Ml  by Oral')]")).click();
		Thread.sleep(500);
		frequency2.click();
		driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
		Thread.sleep(500);
		days.click();
		days.sendKeys("3");
		Thread.sleep(1000);
		ADDMedicine.click();
		Thread.sleep(500);
//////// linkedMedicine-2	
		Thread.sleep(1000);
		CPOEPharmacysearch1.clear();
		Thread.sleep(1000);
		CPOEPharmacysearch1.click();
		Thread.sleep(1000);
		CPOEPharmacysearch1.sendKeys(p4);
		CPOEPharmacysearch1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'by Oral')]")).click();
		Thread.sleep(1000);
		Frequecylink.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		 Thread.sleep(1000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		 js8.executeScript("arguments[0].scrollIntoView();", remarks);
		 remarks.click();
		 remarks.sendKeys(rr);
		 remarks.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 reason.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
		 Thread.sleep(1000);
		 justification.click();
		 Thread.sleep(1000);
		 justification.sendKeys("ok");
		 linkedmedicine.click();
        Thread.sleep(1000);
		ADDMedicine.click();
		
		checkbox.click();
		Thread.sleep(500);
		ok1.click();
		Thread.sleep(500);
//Edit-Linked medicine	    
		editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
	    Thread.sleep(1000);
	    remarkedit.click();
	    Thread.sleep(1000);
	    remarkedit.sendKeys(re);
	    Thread.sleep(1000);
	    updatepharmacy.click();
	    Thread.sleep(1000);
	    ok1.click();
		Thread.sleep(500);
//Delete-Linkedmedicine	1    
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000);
//Delete-Linkedmedicine2
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(2000); 
//6.Tapering Medicine
	    CPOEPharmacysearch1.clear();
		CPOEPharmacysearch1.click();
		CPOEPharmacysearch1.sendKeys(p5);
		CPOEPharmacysearch1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Amoxicillin']")).click();
		Thread.sleep(1000);
		mindose1.click();
		mindose1.sendKeys("2");
		Thread.sleep(1000);
		dose.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mg']")).click();
		Thread.sleep(1000);
		 routeid.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Ear']")).click();
		Thread.sleep(1000);
		form1.click();
		driver.findElement(By.xpath("//li[normalize-space()='Drops']")).click();
		frequency2.click();
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		Thread.sleep(1000);
		duration.click();
		// duration.clear();
	     duration.sendKeys("3");
	     Thread.sleep(1000);
	     frequency2.click();
	     driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].scrollIntoView();", OrderingReason);
		 OrderingReason.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
		 Thread.sleep(1000);
		 unitid.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		 dayss.click();
		 dayss.sendKeys("3");
		 Thread.sleep(1000);
		 tapering1.click();
		 Thread.sleep(1000);
		 frequency2.click();
		  driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		 Thread.sleep(1000);
		 tapering1.click();
		 Thread.sleep(1000);
		 ADDMedicine.click();
//Edit-Tapering Medicine
		    editpharmacy3.click();
	    	Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
		    Thread.sleep(1000);
		    JavascriptExecutor js11 = (JavascriptExecutor) driver;
			 js11.executeScript("arguments[0].scrollIntoView();", taperingedit);
			 taperingedit.click();
		  	 Thread.sleep(1000);
		  	duration.click();
			 duration.clear();
		     duration.sendKeys("3");
		     Thread.sleep(1000);
		     JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 js2.executeScript("arguments[0].scrollIntoView();", updatetapering);
			updatetapering.click();
		     Thread.sleep(1000);
		      updatepharmacy.click();
		    Thread.sleep(1000);
	    
//Delete-Tapering Medicine
		    editpharmacy3.click();
	    	Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		    Thread.sleep(1000);
		    yesdeletepharmacy.click();
		    Thread.sleep(1000);    
	    
	}
}
