package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_notesAuthorizationOfSeniorByJrDrYW extends PageFactoryInitYasasiiWeb{

	public EMR_notesAuthorizationOfSeniorByJrDrYW (WebDriver driver) {

		super(driver);
	}
	 
	@FindBy(xpath="//i[@class='ki ki-doctor-fill']")
	public WebElement ChangAuthDr;
	@FindBy(xpath="//input[@id='authgenuserid']")
	public WebElement Arw;
	@FindBy(xpath="//li[contains(text(),'Thomas')]")
	public WebElement SelectDr;
	
	
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SelectText;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement SelectPatient;
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArw;
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnote;	
	@FindBy(xpath = "//button[normalize-space()='Create New Note']")
	public WebElement Newnote;	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//li[normalize-space()='SOAP']")
	public WebElement Template;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")   
	public WebElement ClickOk;
	
	
	
	
	@FindBy(xpath = "//label[normalize-space()='No History']//span[@class='checkmark']")
	public WebElement UnCheckNoHist;    
	@FindBy(xpath = "//div[contains(text(),'History of Present Illness')]")
	public WebElement Presentillness;
	@FindBy(xpath = "//div[@class='fr-element fr-view']//p")
	public WebElement Textfieldpresentillness;
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='History']")
	public WebElement History;
	

	
	@FindBy(xpath = "//app-medical[@medicalflag='medicalhistoryFlag']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement MedicalHist;
	@FindBy(xpath = "//input[@id='diagnosis']")
	public WebElement Problem;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement Select;
	@FindBy(xpath = "//input[@id='onset']")
	public WebElement Onset;
	@FindBy(xpath = "//form[@class='ng-untouched ng-dirty ng-valid']//textarea[@id='remarks']")
	public WebElement Remarks;
	@FindBy(xpath = "//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement Add;
	
	
	
	
	@FindBy(xpath = "//div[@class='card-body form-inputs']//app-family//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
	public WebElement FamilyHist;
	@FindBy(xpath = "//div[@class='dropdown-datalist custom ng-star-inserted']//div[1]//div[1]")   
	public WebElement Select1;
	@FindBy(xpath = "//input[@id='relationid']")   
	public WebElement Relation;
	@FindBy(xpath = "//li[normalize-space()='Mother']")
	public WebElement RelationMother;
	
	
	@FindBy(xpath = "//input[@id='onsetuomtext']")
	public WebElement onsettext;
	
	
	
	
	
	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div")
	public WebElement Vitalsigns;
	@FindBy(xpath = "//input[@id='vital000']")
	public WebElement Height;
	@FindBy(xpath = "//input[@id='vital010']")
	public WebElement Weight;
	@FindBy(xpath = "//input[@id='vital040']")
	public WebElement temperature;


	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]")
	public WebElement Allergy;
	@FindBy(xpath = "//div[@class='card card-left']//div[@class='card-body form-inputs']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-icon']//div//button[@type='button'][normalize-space()='Add New Allergy']")
	public WebElement addnewallergy;
	@FindBy(xpath = "//input[@id='drugclassname']")
	public WebElement AddNewdrugclass;
	@FindBy(xpath = "//input[@id='severityname']")
	public WebElement drugseverity;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement reaction;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[1]/span[1]/i[1]")
	public WebElement vomiting ;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[4]/span[1]/span[1]/span[1]/i[1]")
	public WebElement diarrhia ; 
	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement description ;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/button[1]")
	public WebElement allergyadd ;
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Clinical Warning')]")
	public WebElement ClinicalWarning;
	@FindBy(xpath = "//input[@id='source']")
	public WebElement ClinicalSource;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement SignificantMedicalProblemBD;
	@FindBy(xpath = "/html/body/modal-container/div/div/div[4]/div[2]/span[1]")
	public WebElement SignificantMedicalProblemADD;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement VisitSpecificProblem;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement VisitSpecificProblemOk;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
	public WebElement clinicalwarnOK;
	
	
	
	
	@FindBy(xpath = "//div[text()='Diagnosis and Plan']")
	public WebElement DiagnosisAndPlan;
	@FindBy(xpath = "//input[@id='fav']")
	public WebElement diagnosisSearcH;
	@FindBy(xpath = "//div[contains(text(),'S42.222G 2-part disp fx of surg nk of l humer, 7thG')]")
	public WebElement diagnosisDisease;
	
	
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService ;
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CPOEsearch;
	@FindBy(xpath = "//div[@class='item-list-row']//label[@class='item-name']")
	public WebElement CPOESelect;

	
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//div[@id='section_cpoe']//div[contains(@class,'card-header pb0')]//img[1]")
	public WebElement CPOEPharmacysearch;
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement CPOESearch;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[10]/div[1]/div[2]/div[1]/div[1]/span[1]")
	public WebElement SelectMedicine;
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Freq;
	@FindBy(xpath = "//li[normalize-space()='PRN']")
	public WebElement FreqAdd;
	@FindBy(xpath = "//label[contains(@title,'First Dose STAT')]//span[contains(@class,'checkmark')]")
	public WebElement Checkbox;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	
	
	
	@FindBy(xpath = "//label[@class='icon emrpreview']")
	public WebElement emrpreview;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement emrsave;
	
	

	@FindBy(xpath = "//input[@id='minuteby']")
	public WebElement MinuteByArw;
	@FindBy(xpath = "//li[normalize-space()='My Notes']")
	public WebElement Mynotes;
	@FindBy(xpath = "//*[@id=\"droplistkey3\"]/li")
	public WebElement Nursenotes;
	@FindBy(xpath = "//input[@id='groupby']")
	public WebElement GrpbyArw;
	@FindBy(xpath = "//li[normalize-space()='Provider']")
	public WebElement Provider;
	@FindBy(xpath = "//li[normalize-space()='Department']")
	public WebElement Dpt;
	@FindBy(xpath = "//li[normalize-space()='Chief Complaint']")
	public WebElement Chiefcomplaint;
	@FindBy(xpath = "//input[@id='site']")
	public WebElement Site;
	@FindBy(xpath = "//li[normalize-space()='KIMSHEALTH TVM']")
	public WebElement SelectSite;
	

	
	
	@FindBy(xpath = "//ul[contains(@class,'navbar-nav float-right')]//a[contains(@class,'nav-link dropdown-toggle pro-pic')]")
	public WebElement LogoutSelect;
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement LogoutClick;
	@FindBy(xpath = "//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")
	public WebElement LogoutConfirmation;
	
	
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement myusername;
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement mypassword;
	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement myloginsite;
	@FindBy(xpath="//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement siteselect;
	@FindBy(xpath="//button[@class=\"btn btn-login\"]")
	public WebElement login;
	
	

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	@FindBy(xpath = "//li[normalize-space()='OP']")
	public WebElement SelectOP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Patientsearchtext;
	@FindBy(xpath = "//div[@class='pat-name']")
	public WebElement SelectOPPatientName;
	@FindBy(xpath = "//i[@class='ki ki-user-computer']")
	public WebElement CPOE;
	@FindBy(xpath = "//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement Expand;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[2]/div[1]/div[1]/span[4]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement prividerSearch;
	
	@FindBy(xpath = "//input[@id='inchargeproviderid']")
	public WebElement providerNAME;
	
	@FindBy(xpath = "//input[@id='encountersubmode']")
	public WebElement EncounterType;
	
	
	
	
	
	
//	@FindBy(xpath = "//span[@class='user-name']")
//	public WebElement Logoutdwnarw;
//	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
//	public WebElement FOLogout;
//	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
//	public WebElement confirmationLogoutmsg;
	
	
	
	
	
	public void authorization(String MRNO)throws InterruptedException {

		
//////////////Changing the doctor by clicking the change authorized doctor icon
		
		Thread.sleep(2000);
		ChangAuthDr.click(); 
		Thread.sleep(1000);
		prividerSearch.clear();
		Thread.sleep(1000);
		
		prividerSearch.click();
		Thread.sleep(1000);
		prividerSearch.sendKeys("Albert Sam");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Albert Sam(DOCAS)']")).click();
//		Arw.click();
//		Thread.sleep(500);
//		SelectDr.click();
		Thread.sleep(2000);
//////////////Selecting the patient
		SelectText.sendKeys(MRNO);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		//SelectPatient.click();
		UpArw.click();
		Thread.sleep(500);
		Lock.click();
		Thread.sleep(2000); 
///Creating the doctor note
		docnote.click();
		Thread.sleep(1000);
	
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//input[@id='inchargeproviderid']"));
		
		if(dynamicElement1.size() !=0)
		{
			  Thread.sleep(1000); 
			 providerNAME.click();
			  Thread.sleep(1000); 
			 driver.findElement(By.xpath("//li[normalize-space()='Albert Sam(DOCAS)']")).click();
			  Thread.sleep(1000); 
			 driver.findElement(By.xpath("//span[@class='btn btn-dark-green active']")).click();
			
	}
		  Thread.sleep(1000); 
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		  Thread.sleep(800); 
	//Newnote.click();
		  // EncounterType.click();
		 // driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
			  
			  EnterChiefComplaint.clear();	
			  Thread.sleep(1000); 
		EnterChiefComplaint.click();
		 Thread.sleep(1000); 
		EnterChiefComplaint.sendKeys("Fever");
		 Thread.sleep(1000); 
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		SelectTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		//	Template.click();
		Thread.sleep(1000);
		ClickOk.click();
		Thread.sleep(2000);
	}

/*	public void medicalhistory()throws InterruptedException{
		
			
		Presentillness.click();
		Thread.sleep(800);
		Textfieldpresentillness.sendKeys("Severe body pain, headache, redness in eyes");
		Thread.sleep(1000);
		History.click();
		Thread.sleep(1000);
		MedicalHist.click();
		Thread.sleep(1000);
		Problem.sendKeys("Act");
		Thread.sleep(1000);
		Problem.sendKeys(Keys.ENTER);
		Thread.sleep(600);	
		Select.click();
		Thread.sleep(500);
		Onset.sendKeys("1");
		Thread.sleep(800);
		Remarks.sendKeys("patient is suffering from Asthma" );
		Add.click();
		
		
		FamilyHist.click();
		Thread.sleep(1000);
		Problem.sendKeys("sd");
		Thread.sleep(1000);
		Problem.sendKeys(Keys.ENTER);
		Thread.sleep(600);	
		Select1.click();
		Thread.sleep(1000);
		Relation.click();
		Thread.sleep(500);
		RelationMother.click();
		Thread.sleep(500);
		Onset.sendKeys("12");
		Thread.sleep(1000);
		Remarks.sendKeys("Heriditary cardiac patients, Glucoma" );
		Add.click();	
	
	}
	
	public void vitals()throws InterruptedException{
		
		Vitalsigns.click();
		Thread.sleep(3000);
		Height.sendKeys("166");
		Weight.sendKeys("81");
		temperature.sendKeys("99");

	}
	
	public void allergy()throws InterruptedException{
		
		Thread.sleep(1000);
		Allergy.click();
		Thread.sleep(1000);
		addnewallergy.click();
		AddNewdrugclass.sendKeys("para");
		AddNewdrugclass.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		drugseverity.click();
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
		reaction.click();
		vomiting.click();
		diarrhia.click();
		reaction.click();
		description.sendKeys("test allergy description");
		allergyadd.click();

		
	}
	public void clinicalwarning()throws InterruptedException{
		ClinicalWarning.click();
		SignificantMedicalProblemBD.click();
		Onset.sendKeys("1");
		onsettext.click();
		ClinicalSource.click();
		RelationMother.click();
		Thread.sleep(500);
		description.sendKeys("Enter remarks for patient" );
		clinicalwarnOK.click();
		VisitSpecificProblem.click();	
		Onset.sendKeys("5");
		onsettext.click();
		ClinicalSource.click();
		RelationMother.click();
		description.sendKeys("Enter remarks for patient" );
		VisitSpecificProblemOk.click();
		Thread.sleep(5000);
		
	}
	   
	
	public void diagnosisandplan()throws InterruptedException{
		
		Thread.sleep(5000);
		DiagnosisAndPlan.click();
		diagnosisSearcH.sendKeys("surg");
		Thread.sleep(5000);
		diagnosisDisease.click();
		Thread.sleep(3000);
	}  */
	
	public void cpoeservice()throws InterruptedException{
		
		CPOEService.click();
		CPOEsearch.sendKeys("Potassium");
		Thread.sleep(1000);
		CPOESelect.click();

	}
	public void cpoepharmacy()throws InterruptedException{
		
		CPOEPharmacy.click();
		CPOESearch.click();
		Thread.sleep(1000);
		CPOESearch.sendKeys("Ultrazac");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),' Ultrazac D Tab')]")).click();
		Thread.sleep(1000);
    	Freq.click();
    	Thread.sleep(1000);
    	FreqAdd.click();
    	Thread.sleep(1000);
		Checkbox.click();
		Thread.sleep(1000);
		ADDMedicine.click();

		Thread.sleep(1000);
	    emrpreview.click();
	    Thread.sleep(2000);
	    emrsave.click();
	    Thread.sleep(2000);
}  
	
////////Filter the created notes
	
	public void filtering()throws InterruptedException{
		
		Thread.sleep(2000);
		MinuteByArw.click();
		Thread.sleep(3000);
		Mynotes.click();
		Thread.sleep(3000);
		MinuteByArw.click();
		Thread.sleep(1000);
		Nursenotes.click();
		Thread.sleep(3000);
		GrpbyArw.click();
		Thread.sleep(1000);
		Provider.click();
		Thread.sleep(1000);
		GrpbyArw.click();
		Thread.sleep(1000);
		Dpt.click();
		Thread.sleep(1000);
		GrpbyArw.click();
		Thread.sleep(1000);
		Chiefcomplaint.click();
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		SelectSite.click();
		Thread.sleep(1000);

		
		
	}
	
	public void newlogin()throws InterruptedException{
		
		
		
		LogoutSelect.click();
		Thread.sleep(1000);
		LogoutClick.click();
		Thread.sleep(1000);
		LogoutConfirmation.click();
		Thread.sleep(1000);
		
		myusername.clear();
		myusername.sendKeys("Admin");
		mypassword.clear();
		mypassword.sendKeys("kameda321");
		myloginsite.click();
		siteselect.click();
		login.click();
		Thread.sleep(1000);

		
		OP.click();
		Thread.sleep(1000);
		SelectOP.click();
		Thread.sleep(1000);
		Patientsearchtext.click();
		Patientsearchtext.sendKeys("Aji");
		Thread.sleep(1000);
		SelectOPPatientName.click();
		CPOE.click();
		Thread.sleep(1000);
		Expand.click();
		Thread.sleep(1000);
/*		Logoutdwnarw.click();
		FOLogout.click();
		confirmationLogoutmsg.click();*/
		
		
		
	}
	
}
