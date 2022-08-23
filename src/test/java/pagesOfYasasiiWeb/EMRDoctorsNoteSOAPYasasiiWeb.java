package pagesOfYasasiiWeb;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRDoctorsNoteSOAPYasasiiWeb extends PageFactoryInitYasasiiWeb{
	public EMRDoctorsNoteSOAPYasasiiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"emrtemplateid\"]")
	public WebElement TemplateSOAP;


	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;

	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;

	//	@FindBy(xpath = "//div[@class='fr-element fr-view']//p")
	//	public WebElement EnterHPI;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF411']")
	public WebElement EnterHPI;



	//	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='History']")
	//	public WebElement History;
	//	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]")
	public WebElement PresentHistory;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF414']")
	public WebElement SocialHistory;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF413']")
	public WebElement FamilyHistory;

	@FindBy(xpath = "(//div[@class='item-name'][normalize-space()='History'])[1]")
	public WebElement History;

	@FindBy(xpath = "//app-medical[@medicalflag='medicalhistoryFlag']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement medicalhistory ;

	@FindBy(xpath = "//input[@id='diagnosis']")
	public WebElement meddiagnosis;

	@FindBy(xpath = "//input[@id='onset']")
	public WebElement onset;


	@FindBy(xpath = "//input[@id='onsetuomtext']")
	public WebElement onsettext;

	@FindBy(xpath = "//form[@class='ng-untouched ng-dirty ng-valid']//textarea[@id='remarks']")
	public WebElement remarks;

	@FindBy(xpath = "//button[@id='addbtn']")
	public WebElement medicalhisadd;

	@FindBy(xpath = "//div[@class='card-body form-inputs']//app-family//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement familyhistorynew;

	@FindBy(xpath = "//input[@id='relationid']")
	public WebElement relation;

	@FindBy(xpath = "//textarea[@id='genetics']")
	public WebElement genetics;

	@FindBy(xpath = "//div[@class='form-group wrap-input']//textarea[@id='remarks']")
	public WebElement famremarks;

	@FindBy(xpath = "(//form[@class='ng-untouched ng-dirty ng-valid']//button[@class='btn btn-primary sm'])[2]")
	public WebElement familyhisadd;

	@FindBy(xpath = "//div[@class='card-body form-inputs overflow-visible']//app-surgical//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement surgerynewadd;

	@FindBy(xpath = "//input[@id='servicename']")
	public WebElement surgeryname;

	@FindBy(xpath = "//input[@id='onsetid']")
	public WebElement onsetid;



	@FindBy(xpath = "//button[@id='addbtn']")
	public WebElement surgeryadd;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]")
	public WebElement Vitalsigns;

	@FindBy(xpath = "//input[@id='vital011']")
	public WebElement Height;

	@FindBy(xpath = "//input[@id='vital021']")
	public WebElement Weight;

	@FindBy(xpath = "//input[@id='vital0111']")
	public WebElement temperature;


	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-vitalsigns[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/app-vitalfields[1]/div[1]/div[1]/form[1]/span[1]/img[1]")
	public WebElement temperatureremarks;

	@FindBy(xpath = "//input[@id='propertyrefid']")
	public WebElement temperatureproperty;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	public WebElement temperaturepropertyok;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Allergy']")
	public WebElement Allergy;

	@FindBy(xpath = "//div[@class='card card-left']//div[@class='card-body form-inputs']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-icon']//div//button[@type='button'][normalize-space()='Add New Allergy']")
	public WebElement addnewallergy ;

	@FindBy(xpath = "//input[@id='drugid-1']")
	public WebElement genericradiobutton;

	@FindBy(xpath = "//input[@id='drugclassname']")
	public WebElement AddNewdrugclass;

	@FindBy(xpath = "//input[@id='severityname']")
	public WebElement drugseverity;

	@FindBy(xpath = "//button[@class='dropdown-toggle form-control multiselect-list']")
	public WebElement reaction;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[1]/span[1]/i[1]")
	public WebElement vomiting ;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[4]/span[1]/span[1]/span[1]/i[1]")
	public WebElement diarrhia ; 

	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement description ;

	@FindBy(xpath = "//button[@id='drugallergyaddbtn']")
	public WebElement allergyadd ;


	@FindBy(xpath = "//button[normalize-space()='Add New Allergy']")
	public WebElement otherallergy ;

	@FindBy(xpath = "//input[@id='otherallergyname']")
	public WebElement otherallergyname ;

	@FindBy(xpath = "//input[@id='otherallergyname']")
	public WebElement SEArch ;

	@FindBy(xpath = "//button[@id='otherallergyaddbtn']")
	public WebElement otherallergyADD;

	@FindBy(xpath = "//div[contains(text(),'Clinical Warning')]")
	public WebElement ClinicalWarning;

	@FindBy(xpath = "//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")
	public WebElement SignificantMedicalProblemBD;

	@FindBy(xpath = "/html/body/modal-container/div/div/div[4]/div[2]/span[1]")
	public WebElement SignificantMedicalProblemADD;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement VisitSpecificProblem;

	@FindBy(xpath = "//modal-container[@role='dialog']//div[4]//div[2]//span[1]")
	public WebElement VisitSpecificProblemOk;


	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement clinicalwarnOK ;

	@FindBy(xpath = "//div[text()='Diagnosis and Plan']")
	public WebElement DiagnosisAndPlan;

	@FindBy(xpath = "//input[@id='fav']")
	public WebElement diagnosisSearcH;

	@FindBy(xpath = "//*[@id=\"component_TMH37\"]/app-diagnosis-plan/form/div/div/div[1]/div/div[1]/div/label[2]/i")
	public WebElement SearcHButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement diagnosisDisease;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral']")
	public WebElement referral;

	@FindBy(xpath = "//input[@id='rhtodeptname']")
	public WebElement referraldepartment;

	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeframe;

	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement reasonremarks;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement addreferral;


	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService ;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CPOEsearch;

	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement CPOEedit;

	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement CPOEclinicalindication;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[3]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement CPOEservicediagnosis;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement CPOEupdate;

	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;

	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
	public WebElement AddNoCurrentMedication;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement AddReconcillation;


	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement dssclose;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[5]/label[1]/span[1]/i[1]")
	public WebElement Recon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[3]/label[2]/span[1]/i[1]")
	public WebElement Reconcilationicon;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ReconcilationConfirmation;



	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[2]/div/div/div[1]")
	public WebElement SelectMedicine;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;

	@FindBy(xpath = "//input[@id='recommeddose']")
	public WebElement recommendeddose;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement recommendeddoseselection;



	@FindBy(xpath = "//label[contains(@class,'icon emrpreview')]")
	public WebElement emrpreview;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement emrsave;



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

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//i[contains(@class,'dashboard-lock-arrow ki ki-chevron-up')]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement lock;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement enccreate;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnote;

	@FindBy(xpath = "//div[@class='card-body form-inputs']//app-obstetric//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement ObsAdd;


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
		HSSFSheet FOFullRegTest=wb.getSheetAt(57);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(10).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		SaveSuccess.click();

	}





	public void medicalhistory( String MRNo , String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn)throws InterruptedException{
		///////Enter History

		Thread.sleep(3000);
		EnterPatientName.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1200);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(2000);
	//	patienthomepageicon.click();
		Thread.sleep(1000);
	//	lock.click();
		docnote.click();
		Thread.sleep(1000);


		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		//			
		//			if(dynamicElement.size() !=0)
		//			{
		//				driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		//			}
		//			  Thread.sleep(800); 

		//			enccreate.click();
		//			Thread.sleep(3000);
		Thread.sleep(1000);
		enccreate.clear();
		enccreate.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
		Thread.sleep(1000);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
		Thread.sleep(1000);
		clickOK.click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'History of Present Illness')]")).click();

		Thread.sleep(1000);
		EnterHPI.sendKeys(pasth);
		Thread.sleep(1000);
		PresentHistory.sendKeys(presenth);
		Thread.sleep(1000);
		SocialHistory.sendKeys(sh);
		Thread.sleep(1000);
		FamilyHistory.sendKeys(fh);
		Thread.sleep(1000);
		History.click();
		Thread.sleep(2000);


		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='card medical-history']//i[@class='fa fa-plus']"));
		//		
		//		System.out.println(dynamicElement.size());
		//		if(dynamicElement.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//div[@class='card medical-history']//i[@class='fa fa-plus']")).click();
		//
		//		}
		//		else {

		medicalhistory.click();
		Thread.sleep(1000);
		//}


		meddiagnosis.sendKeys(md);
		Thread.sleep(600);
		meddiagnosis.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dropdown-datalist custom ng-star-inserted']//div[1]//div[1]")).click();
		Thread.sleep(1000);
		onset.click();
		Thread.sleep(1000);
		onset.sendKeys("2");
		Thread.sleep(1000);
		//onsettext.click();
		//driver.findElement(By.xpath("//li[contains(text(),'Months')]")).click();
		remarks.sendKeys("patient is suffering from severe Sarcoidosis of lung disease" );
		Thread.sleep(1000);
		medicalhisadd.click();
		Thread.sleep(1000);


		//List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='card family-history']//i[@class='fa fa-plus']"));
		//		
		//		System.out.println(dynamicElement1.size());
		//		if(dynamicElement1.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//div[@class='card family-history']//i[@class='fa fa-plus']")).click();
		//
		//		}
		//		else {
		//			
		familyhistorynew.click();
		Thread.sleep(1000);
		//}




		Thread.sleep(1000);
		meddiagnosis.sendKeys(fhn);
		Thread.sleep(800);
		meddiagnosis.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dropdown-datalist custom ng-star-inserted']//div[1]//div[1]")).click();
		Thread.sleep(1000);
		relation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click();
		Thread.sleep(1000);
		onset.sendKeys("5");
		onsettext.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Year(s)']")).click();
		Thread.sleep(300);
		genetics.sendKeys(gen);
		Thread.sleep(1000);
		famremarks.sendKeys(fam);
		Thread.sleep(1000);
		//familyhisadd.click();
		Thread.sleep(1000);

		//List<WebElement> dynamicElement2=driver.findElements(By.xpath("//div[@class='card surgical-history']//i[@class='fa fa-plus']"));
		//		
		//		System.out.println(dynamicElement2.size());
		//		if(dynamicElement2.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//div[@class='card surgical-history']//i[@class='fa fa-plus']")).click();
		//
		//		}
		//		else {

		surgerynewadd.click();
		Thread.sleep(1000);
		//}

		Thread.sleep(1000);
		surgeryname.sendKeys(sn);
		Thread.sleep(1000);
		onsetid.sendKeys("7");
		Thread.sleep(1000);
		onsettext.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Month(s)']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", ObsAdd);
		//	 js.executeScript("window.scrollBy(1588,660)");
		Thread.sleep(2000);
		//	surgeryadd.click();
		Thread.sleep(2000);
	}

	public void vitals(String ht,String wt,String temp)throws InterruptedException{
		////////////Enter vitals		
		Vitalsigns.click();
		//driver.findElement(By.xpath("//div[text()='Vital Signs and Measurement']")).click();

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-vitalsigns[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/label[1]/i[1]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[contains(text(),'Default View')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Add new']")).click();
		Thread.sleep(800);
		Height.clear();//input[@id='vital011']
		Thread.sleep(800);
		Height.sendKeys(ht);    
		Thread.sleep(800);
		Weight.clear();//input[@id='vital020']
		Thread.sleep(800);
		Weight.sendKeys(wt);
		Thread.sleep(800);
		temperature.clear();//input[@id='vital0110']
		Thread.sleep(800);
		temperature.sendKeys(temp);
		Thread.sleep(800);
		//	temperatureremarks.click();
		//	temperatureproperty.click();
		//	driver.findElement(By.xpath("//li[contains(text(),'Oral')]")).click();
		Thread.sleep(500);
		//	temperaturepropertyok.click();
	}

	public void allergy(String addnd,String des,String oa)throws InterruptedException{
		///////////Enter allergy details

		Allergy.click();
		Thread.sleep(1000);


		//		List<WebElement> add=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]"));
		//		
		//		System.out.println(add.size());
		//		if(add.size() !=0)
		//		{
		//			
		//			Thread.sleep(2500);
		//			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
		//
		//		}
		//		else {
		//			
		//			Thread.sleep(1000);
		addnewallergy.click();
		Thread.sleep(500);

		//}


		Thread.sleep(1000);

		genericradiobutton.click();
		Thread.sleep(1000);

		AddNewdrugclass.sendKeys(addnd);
		Thread.sleep(1000);
		AddNewdrugclass.sendKeys(Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		Thread.sleep(1000);
		drugseverity.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
		Thread.sleep(1000);
		reaction.click();
		Thread.sleep(1000);
		vomiting.click();
		Thread.sleep(1000);
		diarrhia.click();
		Thread.sleep(1000);
		reaction.click();
		Thread.sleep(1000);
		description.clear();
		Thread.sleep(1000);
		description.sendKeys(des);
		Thread.sleep(1000);
		allergyadd.click();
		Thread.sleep(1000);


		otherallergy.click();
		Thread.sleep(1000);
		otherallergyname.sendKeys(oa);
		Thread.sleep(1000);
		otherallergyname.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		drugseverity.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
		Thread.sleep(1000);
		//		reaction.click();
		//		vomiting.click();
		otherallergyADD.click();
		Thread.sleep(1000);
	}
	public void clinicalwarning(String cdes)throws InterruptedException{
		//////////////////Enter clinical warning
		ClinicalWarning.click();
		Thread.sleep(1000);
		SignificantMedicalProblemBD.click();
		Thread.sleep(1000);
		onset.sendKeys("3");
		Thread.sleep(1000);
		onsettext.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Month(s)')]")).click();
		Thread.sleep(1000);
		description.sendKeys(cdes );
		Thread.sleep(1000);
		clinicalwarnOK.click();
		Thread.sleep(1000);
		//		VisitSpecificProblem.click();	
		//		onset.sendKeys("3");
		//		onsettext.click();
		//		driver.findElement(By.xpath("//li[contains(text(),'Month(s)')]")).click();
		//		description.sendKeys("patient remarks" );
		//		VisitSpecificProblemOk.click();
	}

	public void diagnosisandplan(String dig)throws InterruptedException{
		///////////Enter diagnosis and plan		
		Thread.sleep(2000);
		DiagnosisAndPlan.click();
		Thread.sleep(1000);
		diagnosisSearcH.sendKeys(dig);
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		//IPrecommendation.click();
		//Thread.sleep(5000);
		//diagnosisDisease.click();
		Thread.sleep(1000);
	}

	public void referral(String ref,String reremarks)throws InterruptedException{
		///////////Select referral		
		referral.click();
		referraldepartment.sendKeys(ref);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Cardiology']")).click();
		Thread.sleep(2000);
		timeframe.click();
		driver.findElement(By.xpath("//li[contains(text(),'Within 1 Week')]")).click();
		Thread.sleep(2000);
		reasonremarks.sendKeys(reremarks);
		addreferral.click();
		Thread.sleep(3000);
	}

	public void cpoeservice(String search)throws InterruptedException{
		/////////////////Add services		
		CPOEService.click();
		//		CPOEsearch.sendKeys("Complete");
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//div[@id='cpoeservicelist_0']//label[@class='item-name']")).click();
		//		Thread.sleep(3000);
		//		//CPOEsearch.clear();
		//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[1]/div[2]/span[3]/i[1]")).click();
		//		CPOEsearch.clear();
		CPOEsearch.sendKeys(search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Sodium')]")).click();
		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//i[@class='fa fa-ellipsis-v']")).click();
		//		Thread.sleep(3000);
		//		CPOEedit.click();
		//		Thread.sleep(3000);
		//		CPOEclinicalindication.click();
		//		CPOEclinicalindication.sendKeys("TEST Clinical Indication");
		//		//CPOEservicediagnosis.click();
		//		Thread.sleep(3000);
		//		CPOEupdate.click();
	}

	//	public void  cpoepharmacy(String phsearch)throws InterruptedException{


	public EMRHSLogYasasiiWeb cpoepharmacy(String phsearch)throws InterruptedException{
		//////////////////Add pharmacy		
		CPOEPharmacy.click();
		Thread.sleep(900);
		CPOEPharmacysearch.sendKeys(phsearch);
		Thread.sleep(1000);
		//    	AddNoCurrentMedication.click();
		//    	AddReconcillation.click();
		driver.findElement(By.xpath("//div[contains(text(),'by Oral')]")).click();
		Thread.sleep(1000);
		//	dssclose.click();
		//    	Recon.click();
		//		Reconcilationicon.click();
		//		Thread.sleep(2000);
		//		ReconcilationConfirmation.click();

		driver.findElement(By.xpath("//input[@id='frequencyid']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();

		Thread.sleep(1000);
		ADDMedicine.click();
		Thread.sleep(1000);
		//CPOEPharmacy.clear();
		//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[2]/span[4]/i[1]")).click();
		//		CPOEPharmacy.sendKeys("amoxicillin");
		//		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		//	 	recommendeddose.click();
		//		recommendeddoseselection.click();
		//		ADDMedicine.click();
		/////////////////Save the doctor note		
		emrpreview.click();
		Thread.sleep(2000);
		emrsave.click();
		Thread.sleep(3000);
		return new EMRHSLogYasasiiWeb(driver);

	}
}