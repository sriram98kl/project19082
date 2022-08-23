package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_VisitSummaryYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public EMR_VisitSummaryYasasiiWeb(WebDriver driver) {

		super(driver);

	}


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMR;
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement PatientSelection;
	@FindBy(xpath = "//*[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement ChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[normalize-space()='SOAP']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement Cpoeservice;
	@FindBy(xpath = "//label[normalize-space()='Jevity']")
	public WebElement jevityservice;
	@FindBy(xpath = "//label[normalize-space()='Jevity 1.5 cal']")
	public WebElement selectjevity;
	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement addservice;
	@FindBy(xpath = "//input[@id='feedCountDiet0']")
	public WebElement numberoffeeds;
	@FindBy(xpath="//label[normalize-space()='CPOE Service']")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement Enterservice;
	@FindBy(xpath = "//span[normalize-space()='(Na)']")
	public WebElement SelectService;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement pharmacy;
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement entermedicine;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement selectmedicine;
	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement orderingreason;
	@FindBy(xpath = "//li[normalize-space()='Therapeutic']")
	public WebElement selectreason;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement addmedicne;


	@FindBy(xpath="//label[@class='icon emrpreview']")
	public WebElement Preview;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement save;
	@FindBy(xpath = "//label[@class='icon discharesum']")
	public WebElement visitSummary;
	@FindBy(xpath="//input[@id='template']")
	public WebElement template;
	@FindBy(xpath = "//div[@role='textbox']//p")
	public WebElement EnterVisitAssessment;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/ki-calendar[1]/div[1]/input[1]")
	public WebElement DOD;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement savevisitsummary;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/app-ophthalmology[1]/div[1]/form[1]/div[1]/div[2]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement DOS;
	@FindBy(xpath = "//textarea[@id='surgeryre']")
	public WebElement RE;
	@FindBy(xpath = "//span[normalize-space()='Master']")
	public WebElement Master;
	@FindBy(xpath = "//span[normalize-space()='Diagnosis Master']")
	public WebElement Diagnosismaster;
	@FindBy(xpath = "//input[@id='code']")
	public WebElement EnterCode;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement EnterName;
	@FindBy(xpath = "//label[normalize-space()='Root']//span[@class='checkmark']")
	public WebElement RootCheckbox;
	@FindBy(xpath = "//textarea[@id='shortdescription']")
	public WebElement EnterDescription;
	@FindBy(xpath = "//label[normalize-space()='Chronic']//span[@class='checkmark']")
	public WebElement chronic;
	@FindBy(xpath = "//input[@id='educationresourselink']")
	public WebElement EnterEducationResourceLink;
	@FindBy(xpath = "//div[@class='col-md-1 col-3 mt5 ta-r']//button[@type='button']")
	public WebElement add;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement SSave;
	@FindBy(xpath = "//input[@id='inputcontrol_WVASh49QyhT']")
	public WebElement EnterICD;
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-icdmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	public WebElement ClickontheICD;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement EditIcon;
	@FindBy(xpath = "//label[contains(text(),'Valid')]")
	public WebElement Invalid;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update;
	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement deleteicon;
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yes;
	@FindBy(xpath = "//input[@id='db']")
	public WebElement searchicdintool;

	@FindBy(xpath = "//span[normalize-space()='Template Master']")
	public WebElement templatemaster;
	@FindBy(xpath = "//input[@id='dynamictemplatename']")
	public WebElement templatename;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement mainheadname;
	@FindBy(xpath = "//button[contains(@class,'templateheader btn btn-dark-green active')]")
	public WebElement Add;
	@FindBy(xpath = "//button[@id='template-save-button']")
	public WebElement SAVE;
	@FindBy(xpath = "//textarea[@id='secondopinionremarkstxt']")
	public WebElement secondopinion;
	@FindBy(xpath = "//label[@class='btn-pp-footer']//i[@class='ki ki-doctor-fill']")
	public WebElement clicktoadddoctor;
	@FindBy(xpath = "//input[@id='docsearch']")
	public WebElement enterdoctorname;
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement ADd;
	@FindBy(xpath = "//span[@class='btn btn-danger clear sm']")
	public WebElement close;
	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement CPOEadmin;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/img[1]")
	public WebElement admin;
	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement enterrejectedquantity;
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement clickonplus;
	@FindBy(xpath = "//input[@id='vital090']")
	public WebElement BPSystolic;
	@FindBy(xpath = "//input[@id='vital0100']")
	public WebElement BPDiastolic;
	@FindBy(xpath = "//img[@title='Screen Layout']")
	public WebElement screenlayout;
	@FindBy(xpath = "//i[@class='ki ki-layout-2']")
	public WebElement selectlayout;
	@FindBy(xpath = "//div[@class='btn-layout-selector']")
	public WebElement apply;
	@FindBy(xpath = "//div[@class='form-group min-clear-bottom text-white ki-dropdown']//input[@id='undefined']")
	public WebElement visit;
	@FindBy(xpath = "//li[normalize-space()='Discharge Instruction']")
	public WebElement dischargeinstru;
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF100008']")
	public WebElement entertext;
	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement emr;
	@FindBy(xpath = "//span[normalize-space()=\"Provider's Chart\"]")
	public WebElement providerscht;
	@FindBy(xpath = "//input[@id='chartname']")
	public WebElement enterchartname;
	@FindBy(xpath = "//input[@id='searchservice']")
	public WebElement servicename;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-doctorscharts[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ki-input-control[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement selectservc;
	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline ml0']")
	public WebElement pplus;
	@FindBy(xpath = "//td[@class='ng-star-inserted']//span[@class='checkmark']")
	public WebElement plotingraph;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement saveproviderchart;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-doctorscharts[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement enternameinsearch;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchbuton;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-doctorscharts[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonname;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement editicn;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement updatebutton;
	@FindBy(xpath = "//input[@id='dietAdminQty0']")
	public WebElement dietadmin;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement secondnurse;
	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement secondnursepassword;
	@FindBy(xpath = "//i[@class='fa fa-eye ng-star-inserted']")
	public WebElement eyetoviewpassword;
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='OK']")
	public WebElement secondok;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement search;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement rightArrow;

	@FindBy(xpath = "//i[@title='More']")
	public WebElement more;

	
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(27);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(11).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		SaveSuccess.click();

	}
		
	public void Createdoctornote(String ChiefComp,String template , String MRNo) throws InterruptedException, IOException {
		///////////	Select the patient and create the doctor note

		Thread.sleep(1000);
		Hamburger.click();
		EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(500);

		search.click();
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(MRNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//PatientSelection.click();
		Thread.sleep(1000);
		//UpArrow.click();
		Thread.sleep(500);
		//Lock.click();
		Thread.sleep(800);
    	DoctorNote.click();
    	Thread.sleep(1000);
//
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}
		Thread.sleep(800);
		ChiefComplaint.clear();
		Thread.sleep(800);
		ChiefComplaint.sendKeys(ChiefComp);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Template.click();
		Thread.sleep(800);
		Template.sendKeys(template);
		//	driver.findElement(By.xpath("//*[contains(text(),'\" + template + \"')]"));
		SelectTemplate.click();
		Ok.click();
		Thread.sleep(1000);

	}


	/////////Diagnosis and plan

	public void diagnosisandplan() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-name'][normalize-space()='Diagnosis and Plan']")).click();
		Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
	Thread.sleep(1000);	
//		driver.findElement(By.xpath("//div[contains(@class,'card card-sm ng-star-inserted')]//i[contains(@class,'fa fa-ellipsis-v')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
	}

	///////////////cpoe sERVICE

	public void CPOEservice() throws InterruptedException
	{
		Cpoeservice.click();
		Thread.sleep(600);
		jevityservice.click();
		Thread.sleep(600);
		//addservice.click();
		Thread.sleep(1000);
		//enterservice.clear();
		//Cpoeservice.click();
		Thread.sleep(2000);
	}

	//////////////////CPOE Pharmacy


	public void CPOEpharmacy(String service,String opinion,String doctor) throws InterruptedException
	{
//		Thread.sleep(1000);
//		CPOEPharmacy.click();
//		Thread.sleep(800);
//		Enterservice.sendKeys(service);
//		Thread.sleep(800);
//		SelectService.click();
//		Thread.sleep(500);
		/////////////////order diabeta medicine
		pharmacy.click();//label[normalize-space()='CPOE Pharmacy']
		Thread.sleep(800);
		entermedicine.sendKeys("diabeta");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Diabeta , 1 Mg  by Oral']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='frequencyid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();	
		//selectmedicine.click();
		Thread.sleep(800);
		orderingreason.click();
		Thread.sleep(800);
		selectreason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='antibioticorderingremarks']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='antibioticorderingremarks']")).sendKeys("OK");
		
		Thread.sleep(800);
		addmedicne.click();
		Thread.sleep(800);
		///////Authorizing the note
		driver.findElement(By.xpath("//label[normalize-space()='Authorize']//span[@class='checkmark']")).click();
		////////////////save the doctor note
		Preview.click();
		Thread.sleep(500);
		save.click();
		//Thread.sleep(2500);
		//////////Second opinion


		//List<WebElement> dynamicElement=driver.findElements(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container']/div[@class='note-layout ng-star-inserted layout-1']/div[@class='notelayoutcontainer']/app-emr-homescreen-landing[@class='ng-star-inserted']/div[@class='home-screen-container ng-star-inserted']/div[@class='patient-home-screen']/div[@class='hs-left-container']/app-patient-previousnotes/div[@id='hm-prevnotes']/div[@class='ng-star-inserted']/div[1]/div[1]/div[1]/label[1]/i[1]"));
		//	
		//	if(dynamicElement.size() !=0)
		//	{
		//		
		//	}
		//	else
		//	{
		//		driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container']/div[@class='note-layout ng-star-inserted layout-1']/div[@class='notelayoutcontainer']/app-emr-homescreen-landing[@class='ng-star-inserted']/div[@class='home-screen-container ng-star-inserted']/div[@class='patient-home-screen']/div[@class='hs-left-container']/app-patient-previousnotes/div[@id='hm-prevnotes']/div[@class='ng-star-inserted']/div[1]/div[1]/div[1]/label[1]/i[1]")).click();
		//	}

		Thread.sleep(800);
		//rightArrow.click();
		Thread.sleep(1200);
		more.click();//i[@title='More']
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[normalize-space()='Second Opinion']")).click();
		//secondopinion.click();
		Thread.sleep(800);
		secondopinion.sendKeys(opinion);
		Thread.sleep(500);
		clicktoadddoctor.click();
		Thread.sleep(1000);
		enterdoctorname.sendKeys("rohit");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[normalize-space()='Rohith Sharma (3)']")).click();
		//driver.findElement(By.xpath("//li[normalize-space()='"+doctor+"']")).click();
		Thread.sleep(500);
		ADd.click();
		Thread.sleep(500);
		close.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='Send']")).click();

	}


	/////////////////EMR Screen - Configurable EMR screen for clinicians for customized UI

	public void configurableEMR() throws InterruptedException
	{ Thread.sleep(800);
		screenlayout.click();
		Thread.sleep(800);
		selectlayout.click();
		Thread.sleep(800);
		apply.click();
		Thread.sleep(800);
	}




	///////////////////After Administration monitoring reminder in CPOE administration

	public void cpoadmintration() throws InterruptedException
	{
		Thread.sleep(1000);
		//UpArrow.click();
		Thread.sleep(500);
	//	Lock.click();
		Thread.sleep(800);
		CPOEadmin.click();
		Thread.sleep(2000);


		admin.click();
		
		
		//		driver.findElement(By.xpath("//input[@id='brand']"));
		//		Thread.sleep(800);
		//		driver.findElement(By.xpath("//li[normalize-space()='DIAbeta']"));		
		Thread.sleep(1000);
		enterrejectedquantity.sendKeys("0");
		Thread.sleep(1000);
		clickonplus.click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		
		


		
		
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//			Thread.sleep(500);
//		}
//		
//		else {
//			System.out.println("sri");
//			
//		}
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		secondnurse.sendKeys("Nur01");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'(Nur01)')])")).click();
		Thread.sleep(800);
		secondnursepassword.sendKeys("KAmeda123$");
		Thread.sleep(800);
		eyetoviewpassword.click();
		Thread.sleep(1000);
		secondok.click();
		Thread.sleep(1000);
	



		////////		driver.findElement(By.xpath("//label[normalize-space()='Service Administration']"));
		///////		Thread.sleep(1000);
		///////		driver.findElement(By.xpath("//label[normalize-space()='Medicine Administration']"));
		///////		Thread.sleep(1000);
		///////		driver.findElement(By.xpath("//span[@title='Task Pending']")).click();
		///////		Thread.sleep(1000);
		//////		BPSystolic.sendKeys("100");
		///////		BPDiastolic.sendKeys("110");
		//////		Thread.sleep(500);
		//////		driver.findElement(By.xpath("//span[normalize-space()='Save']"));
		//////		Thread.sleep(900);
		///////		driver.findElement(By.xpath("//button[normalize-space()='Close']"));


		/////////////Tubefeedprepration or Nutrition management module 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Tube Feed Preparation']")).click();
		Thread.sleep(1000);//label[normalize-space()='Diet Administration']
		driver.findElement(By.xpath("//i[@title='Information']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-red clear']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-info-circle']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-red clear']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Feeds']")).click();
		Thread.sleep(1000);
		numberoffeeds.clear();
		Thread.sleep(1000);
		numberoffeeds.sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='addition']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//label[@title='Expand Feeds']//i[@class='ki ki-chevron-down']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Start']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='check-container zero-right']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(2000);




		//////////////Diet Administartion

		driver.findElement(By.xpath("//label[normalize-space()='Diet Administration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-ellipsis-v']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dietAdminStatus0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Continue']")).click();
		Thread.sleep(1000);
		dietadmin.sendKeys("20");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);	
		//driver.findElement(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//i[@class='dashboard-lock ki ki-lock-open']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='icon quickview']")).click();
		Thread.sleep(1000);
	}


	////////ICD Updation	Tool and hide the note

	public void hidenoteANDIcdupdationtool(String MRNo) throws InterruptedException
	{
		/////////////Hiding or invalid the note
		//driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen/div[@class='page-container']/div[@class='note-layout ng-star-inserted ab-locked layout-2']/div[@class='notelayoutcontainer']/app-emr-homescreen-landing[@class='ng-star-inserted']/div[@class='home-screen-container ng-star-inserted']/div[@class='patient-home-screen']/div[@class='hs-left-container']/app-patient-previousnotes/div[@id='hm-prevnotes']/div[@class='ng-star-inserted']/div[1]/div[1]/div[1]/label[1]/i[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='More']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[normalize-space()='Hide Note']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Unhide Note']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(1000);
		////////////////////////ICD Updation tool
		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='ICD Updation Tool']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(800);
		WebElement d=driver.findElement(By.xpath("//input[@id='searchtext']"));
		Thread.sleep(800);
		d.sendKeys(MRNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-icd-updation-landing[1]/div[2]/app-icd-updation-tool[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/div[1]/tr[1]/td[5]/div[3]/i[1]")).click();
		Thread.sleep(800);
		
		
		driver.findElement(By.xpath("//i[@title='Update']")).click();
		Thread.sleep(800);
		//   searchicdintool.sendKeys("jaundice");
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[contains(@title,'Typhoid fever')]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@class='btn btn-dark-green active']")).click();
		Thread.sleep(1000);
	}


	/////////////////////OP visit summary


	public void visitsummary(String MRNo) throws InterruptedException
	{
		Thread.sleep(1000);
		Hamburger.click();
		//EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);

		search.click();
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(MRNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();



		///PatientSelection.click();
		Thread.sleep(1000);
		//UpArrow.click();
		Thread.sleep(500);
		//Lock.click();
		Thread.sleep(800);
		visitSummary.click();
		Thread.sleep(2000);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Visit Summary']")).click();
		Thread.sleep(1000);
		EnterVisitAssessment.clear();
		Thread.sleep(800);
		EnterVisitAssessment.sendKeys("The patient is normal");
		Thread.sleep(800);
		//DOD.click();
		//Thread.sleep(900);
		DOD.sendKeys(Keys.RETURN);
		//	driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/ki-calendar[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		savevisitsummary.click();
	}

	////////////Discharge summary

	public void dischargesummary() throws InterruptedException
	{
		//Thread.sleep(3000);
		//visitSummary.click();
		//Thread.sleep(2000);
		Thread.sleep(3000);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Ophthalmology Discharge Summary']")).click();
		Thread.sleep(1000);
		DOS.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		RE.sendKeys("Patient needs to shift to ICU");
		Thread.sleep(800);
		savevisitsummary.click();

	}

	////////////Discharge instruction

	public void dischargeInstruction() throws InterruptedException, AWTException
	{
		Thread.sleep(3000);
		//	visitSummary.click();
		//	Thread.sleep(2000);
		visit.click();
		dischargeinstru.click();
		Thread.sleep(2500);

		//List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='UnAuthorize']"));
		//	
		//	System.out.println(dynamicElement.size());
		//	if(dynamicElement.size() !=0)
		//	{
		//		driver.findElement(By.xpath("//button[normalize-space()='UnAuthorize']")).click();
		//		
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[3]/div[2]/button[1]")).click();
		//		
		//
		//	}
		//	else {
		//		System.out.println("sri");
		//	}

		Thread.sleep(2000);

		entertext.click();
		Thread.sleep(1000);
		entertext.clear();
		Thread.sleep(1000);
		entertext.sendKeys("Follow the medicines for 3 days");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		////////////////Authorise the discharge instruction
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(@class,'check-container')]//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/ki-calendar[1]/div[1]/input[1]")).click();

		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		/////////////Take print preview of discharge instruction
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[normalize-space()='Print']")).click();
		Thread.sleep(800);//button[normalize-space()='Print']
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		//////////////Unauthorize the discharge instruction

		driver.findElement(By.xpath("//button[normalize-space()='UnAuthorize']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[3]//div[2]//button[1]")).click();
		Thread.sleep(1600);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(800);//button[normalize-space()='Delete']
		driver.findElement(By.xpath("//modal-container[@role='dialog']//div[2]//div[2]//button[1]")).click();

	}


	//////////////ICD in diagnosis master

	public void Diagnosismaster(String code,String name) throws InterruptedException
	{
		Hamburger.click();
		Thread.sleep(800);
		Master.click();
		Thread.sleep(2000);
		Diagnosismaster.click();//span[normalize-space()='Diagnosis Master']
		Thread.sleep(800);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		EnterCode.sendKeys(code);
		Thread.sleep(800);
		EnterName.sendKeys(name);
		RootCheckbox.click();
		Thread.sleep(800);
		EnterDescription.sendKeys("Severe case");
		chronic.click();
		Thread.sleep(800);
		EnterEducationResourceLink.sendKeys("https://icd.who.int/en");
		Thread.sleep(1000);
		add.click();
		Thread.sleep(800);
		SSave.click();
		Thread.sleep(1000);


		////////////////////ICD edit and make it as invalid

		Thread.sleep(1500);
		//     EnterICD.sendKeys(code);
		//     Thread.sleep(800);
		//     Searchicon.click();
		//     Thread.sleep(1000);
		ClickontheICD.click();
		Thread.sleep(2000);
		EditIcon.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='Oncology']//span[@class='checkmark']"));
		Thread.sleep(800);
		Invalid.click();
		Thread.sleep(800);
		Update.click();
		Thread.sleep(1200);

		//////////////////////Delete the created ICD

		//     EnterICD.sendKeys(code);
		//     Thread.sleep(800);
		//     Searchicon.click();
		//     Thread.sleep(1000);
		ClickontheICD.click();
		Thread.sleep(800);
		deleteicon.click();
		Thread.sleep(800);
		yes.click();
	}



	////////////////////////////Template creation in template master

	public void Templatemaster(String Name,String headname) throws InterruptedException
	{
		Hamburger.click();
		Thread.sleep(1000);
		//Master.click();
		Thread.sleep(1000);
		templatemaster.click();
		Thread.sleep(800);
		templatename.sendKeys(Name);
		Thread.sleep(1500);
		mainheadname.sendKeys(headname);
		Add.click();
		Thread.sleep(800);
		Thread.sleep(500);
		SAVE.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(800);
		WebElement ele= driver.findElement(By.xpath("//div[@class='shadow-container']//div[@class='v-action-bar']"));
		Actions action=new Actions (driver);
		action.moveToElement(ele).click().perform();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='shadow-container']//i[@class='ki ki-ellipsis-v']")).click();
		Thread.sleep(2000);

		////////////////////Editing the created template

		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-dynamic-user-interface[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@title='Edit']//i[@class='ki ki-pencil']")).click();
		Thread.sleep(900);
		driver.findElement(By.xpath("//button[@id='template-save-button']")).click();
		Thread.sleep(2000);


		//////////////////////////////Deleting the created template
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-dynamic-user-interface[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@title='Delete']//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);

	}
	////////////////////ProvidersChart/Doctors chart

	public void doctorschart(String chartname,String serviceame) throws InterruptedException
	{
		Thread.sleep(900);
		Hamburger.click();
		Thread.sleep(800);
		emr.click();
		Thread.sleep(800);
		providerscht.click();
		Thread.sleep(1500);
		enterchartname.sendKeys(chartname);
		Thread.sleep(800);
		servicename.sendKeys(serviceame);
		Thread.sleep(4000);
		servicename.sendKeys(Keys.RETURN);	
		Thread.sleep(1800);
		selectservc.click();
		Thread.sleep(800);
		pplus.click();
		Thread.sleep(800);
		plotingraph.click();
		Thread.sleep(800);
		saveproviderchart.click();

		////////////////////edit created providers chart

		Thread.sleep(1500);
		enternameinsearch.sendKeys(chartname);
		Thread.sleep(800);
		searchbuton.click();
		Thread.sleep(800);
		clickonname.click();
		Thread.sleep(800);
		editicn.click();
		Thread.sleep(800);
		plotingraph.click();
		updatebutton.click();
		Thread.sleep(1500);

		////////////////////delete created providers chart

		clickonname.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-doctorscharts[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[2]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
	}
}