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

public class FOEMR_BirthRegTwoChildYasasiiWeb extends PageFactoryInitYasasiiWeb{
	

	 public FOEMR_BirthRegTwoChildYasasiiWeb(WebDriver driver) {

		super(driver);
}

	 	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
		public WebElement Title;
		@FindBy(xpath = "//li[contains(text(),'Miss')]")
		public WebElement SelectMiss;
		@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
		public WebElement EnterFirstNME;
		@FindBy(xpath = "//input[@id='age']")
		public WebElement EnterAge;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
		public WebElement EnterMob;
		@FindBy(xpath = "//input[@id='division']")
		public WebElement EnterOrganisationLetter;
		@FindBy(xpath = "//li[contains(text(),'Others')]")
		public WebElement SelectOrganisation;
		@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
		public WebElement ContactInformation;
		@FindBy(xpath = "//input[@id='homeaddress1']")
		public WebElement EnterAddress;
		@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
		public WebElement DocumentIdentification;
		@FindBy(xpath = "//input[@id='value']")
		public WebElement EnterAadhar;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/button[1]/label[1]/i[1]")
		public WebElement Clickadd;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[2]/button[1]")
		public WebElement HowDidYouKnow;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[3]/div[1]/label[1]/span[1]")
		public WebElement TV;
		@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
		public WebElement Ok;
		@FindBy(xpath = "//button[@id='saveregistrationbutton']")
		public WebElement Save;
		@FindBy(xpath = "//button[contains(text(),'OK')]")
		public WebElement OK;
		
		@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
		public WebElement ADT;
		@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
		public WebElement EnterProviderName;
		@FindBy(xpath = "//li[normalize-space()='John Peter(docjp)']")
		public WebElement SelectProviderName;
		@FindBy(xpath = "//input[@id='reasonid']")
		public WebElement Priority;
		@FindBy(xpath = "//li[contains(text(),'Elective')]")
		public WebElement SelectPriority;
		@FindBy(xpath = "//input[@id='bedcategory']")
		public WebElement BedCategory;
		@FindBy(xpath = "//li[contains(text(),'WARD')]")
		public WebElement SelectBedCategory;
		@FindBy(xpath = "//input[@id='bedclass']")
		public WebElement RoomType;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
		public WebElement SelectRoomType;
		@FindBy(xpath = "//input[@id='bednumber']")
		public WebElement Bed;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
		public WebElement SelectBed;
		@FindBy(xpath = "//button[@id='savepatadtbutton']")
		public WebElement SAve;
		@FindBy(xpath = "//span[@class='user-name']")
		public WebElement Logoutdwnarw;
		@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
		public WebElement FOLogout;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
		public WebElement confirmationLogoutmsg;
		
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
		@FindBy(xpath = "//*[@id=\"loginsite\"]/div/span/span")
		public WebElement warningMessage;
		@FindBy(xpath = "//input[@id='maincategory']")
		public WebElement OP;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
		public WebElement SelectIP;
		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement EnterPatientName;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
		public WebElement SelectPatient;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement UpArrow;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
		public WebElement DoctorNote;
		@FindBy(xpath = "//input[@id='chiefcomplainttext']")
		public WebElement EnterChiefComplaint;
		@FindBy(xpath = "//input[@id='emrtemplateid']")
		public WebElement EnterTemplate;
		@FindBy(xpath = "//li[contains(text(),'Antenatal Assessment')]")
		public WebElement SelectTemplate;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
		public WebElement ClickOk;
		
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-antenatal-assessment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
		public WebElement Pregnant;
		@FindBy(xpath = "//input[@id='obstetricscore']")
		public WebElement EnterObstreticScore;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-antenatal-assessment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
		public WebElement MaritalStatus;
		@FindBy(xpath = "//input[@id='noofyears']")
		public WebElement EnterNoYears;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-antenatal-assessment[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[9]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
		public WebElement Conseption;
		@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
		public WebElement CPOEPharmacy;
		@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[3]/div[5]/div/div[1]")
		public WebElement SelectMedicine;
		@FindBy(xpath = "//*[@id=\"prescriptiontypeid\"]")
		public WebElement Ongoing;
		@FindBy(xpath = "//li[contains(text(),'Ongoing')]")
		public WebElement SelectOngoing;
		@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
		public WebElement Ownmedication;
		@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
		public WebElement SelectOwnMedication;
		@FindBy(xpath = "//button[@id='updatePharmacy']")
		public WebElement Cladd;
		@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[3]/div[2]/div/div[1]")
		public WebElement Medicine2;
		@FindBy(xpath = "//input[@id='prescriptiontypeid']")
		public WebElement Past;
		@FindBy(xpath = "//li[contains(text(),'Past')]")
		public WebElement SelectPast;
		@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
		public WebElement OwnMedication;
		@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
		public WebElement SelectOnMedication;
		@FindBy(xpath = "//button[@id='updatePharmacy']")
		public WebElement Cladd2;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement arrw;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
		public WebElement sAVe;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement arw;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
		public WebElement doctrnote;
		@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
		public WebElement Selectcreate;
		
		@FindBy(xpath = "//input[@id='emrtemplateid']")
		public WebElement Enteremplate;
		@FindBy(xpath = "//li[contains(text(),'Delivery Note')]")
		public WebElement Selectemplate;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
		public WebElement Clickk;	
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]")
		public WebElement SelectBirthNote;
		@FindBy(xpath = "//input[@id='gestationperiodweeks']")
		public WebElement EnterGestationalAgeInWeeks;
		@FindBy(xpath = "//li[contains(text(),'32')]")
		public WebElement Gestationalage;
		@FindBy(xpath = "//input[@id='termid']")
		public WebElement Termid;
		@FindBy(xpath = "//li[contains(text(),'Post-Term')]")
		public WebElement Term;
		@FindBy(xpath = "//input[@id='genderid']")
		public WebElement Gender;
		@FindBy(xpath = "//li[contains(text(),'Female')]")
		public WebElement SelectGender;
		@FindBy(xpath = "//input[@id='birthweight']")
		public WebElement EnterWeight;
		@FindBy(xpath = "//input[@id='presentation']")
		public WebElement Presentation;
		@FindBy(xpath = "//li[contains(text(),'Breech')]")
		public WebElement SelectPresentation;
		@FindBy(xpath = "//input[@id='typeofdeliveryid']")
		public WebElement TypeOfDelivery;
		@FindBy(xpath = "//li[contains(text(),'Normal')]")
		public WebElement SelectNormal;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-birth-notes[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[3]/div[3]/div[1]/div[2]/img[1]")
		public WebElement APGARScore;
		@FindBy(xpath = "//input[@id='score0']")
		public WebElement RespiratoryEffort;
		@FindBy(xpath = "//li[contains(text(),'Good Cry')]")
		public WebElement SelectRespiratoryEffort;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[3]/button[1]")
		public WebElement CLickOk;
		@FindBy(xpath = "//input[@id='neonatalstatus']")
		public WebElement NeonatalStatus;
		@FindBy(xpath = "//li[contains(text(),'Alive')]")
		public WebElement SelectNeonatal;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-birth-notes[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[2]/div[6]/div[3]/button[1]")
		public WebElement ADD;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement Uparw;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
		public WebElement SelectSave;
        @FindBy(xpath = "//span[@class='user-name']")
		WebElement usermenu;
		@FindBy(xpath= "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
		WebElement logOut;
		@FindBy(xpath="//body/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
		WebElement Okbutton;
						
		@FindBy(xpath = "//input[@id='maincategory']")
		public WebElement SelectBirthRegisration;
		@FindBy(xpath = "//li[contains(text(),'Birth Registration')]")
		public WebElement BirthRegitration;
		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement EnterName;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
		public WebElement Selectpatient;
		@FindBy(xpath = "//tbody/tr[2]/td[7]/button[1]/label[1]")
		public WebElement Selectselect;

		@FindBy(xpath = "//button[@id='saveregistrationbutton']")
		public WebElement clickSave;
		@FindBy(xpath = "//button[contains(text(),'OK')]")
		public WebElement ClIckOK;
		@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
		public WebElement EnterProvidername;
		@FindBy(xpath = "//li[contains(text(),'Thomas')]")
		public WebElement SelectProvidername;
		@FindBy(xpath = "//input[@id='reasonid']")
		public WebElement prioty;
		@FindBy(xpath = "//li[contains(text(),'Elective')]")
		public WebElement SelectPrirty;
		@FindBy(xpath = "//input[@id='bedcategory']")
		public WebElement BedCategory1;
		@FindBy(xpath = "//li[contains(text(),'ROOM')]")
		public WebElement SelectBedCategory1;
		@FindBy(xpath = "//input[@id='bedclass']")
		public WebElement RoomType1;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")
		public WebElement SelectRoomType1;
		@FindBy(xpath = "//input[@id='bednumber']")
		public WebElement Bed1;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[6]/li[1]")
		public WebElement SelectBed1;
		
		
		@FindBy(xpath = "//button[@id='savepatadtbutton']")
		public WebElement SAVE;
		
			
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
		public WebElement Selectselect2;
		@FindBy(xpath = "//label[normalize-space()='Select']")
		public WebElement Select;
		@FindBy(xpath = "//input[@id='reasonid']")
		public WebElement Pri2;
		@FindBy(xpath = "//li[contains(text(),'Elective')]")
		public WebElement Ele2;
		
		@FindBy(xpath = "//input[@id='maincategory']")
		public WebElement Dropdown;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
		public WebElement IP;
		@FindBy(xpath = "//input[@id='subcategory']")
		public WebElement NextDropdown;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
		public WebElement MyDeptIP;
		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement EnterPatientName1; 
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
		public WebElement SelectBaby;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement UpArrow1;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
		public WebElement Lock;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
		public WebElement DoctorNote1;
		@FindBy(xpath = "//input[@id='chiefcomplainttext']")
		public WebElement EnterChiefComplaint1;
		@FindBy(xpath = "//input[@id='emrtemplateid']")
		public WebElement EnterTemplate1;
		@FindBy(xpath = "//li[contains(text(),'SOAP')]")
		public WebElement SelectTemplate1;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
		public WebElement ClickOk1;
		
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[1]/div[1]/div[1]")
		public WebElement EMRtempmove;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/span[2]/i[1]")
		public WebElement selectbaby2;
		
		@FindBy(xpath = "//div[contains(text(),'Child Development Chart')]")
		public WebElement ChildDevelopmentChart;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-childmilestone[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][1]")
		public WebElement SocialSmile;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
		public WebElement ClickOk2;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-childmilestone[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][2]")
		public WebElement EyesFollow;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
		public WebElement ClickOk3;
				

		@FindBy(xpath = "//div[contains(text(),'Child Language Evaluation Chart')]")
		public WebElement ChildLangEval;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][1]")
		public WebElement RespondsToBell;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
		public WebElement ClickOk5;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][2]")
		public WebElement RespondsToSmile;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
		public WebElement ClickOk6;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/fusioncharts[1]/div[1]/span[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='g'][11]/*[name()='g'][9]/*[name()='g'][2]/*[name()='rect'][7]")
		public WebElement ListensWhenSpoken;
		@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
		public WebElement ClickOk7;
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
		public WebElement SelectSave1;
				
		@FindBy(xpath = "//input[@id='maincategory']")
		public WebElement FoMenu1;
		@FindBy(xpath = "//li[contains(text(),'IP')]")
		public WebElement FoDropdown;
		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement Search2;
		
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
		public WebElement SelectBaby1;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
		public WebElement SelectBaby2;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
		public WebElement Selectmother;
				
		@FindBy(xpath = "//input[@id='dischargestatus']")
		public WebElement Dischargestat;
		@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
		public WebElement SelectDischargestat;
		@FindBy(xpath = "//input[@id='disposition']")
		public WebElement Disposition;
		@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
		public WebElement SelectDisposition;
		@FindBy(xpath = "//button[normalize-space()='Save']")
		public WebElement DischargeSave;


public void Action1(String FirstName,String AadharNumber,String MRNo) throws InterruptedException, IOException {
////////////////Register a femaile patient		
	Thread.sleep(1000);
	Title.click();
	Thread.sleep(1000);
	SelectMiss.click();  
	Thread.sleep(1000);
	EnterFirstNME.sendKeys(FirstName);
	Thread.sleep(500);
	EnterAge.sendKeys("25");
	EnterMob.sendKeys("1235048789");
	EnterOrganisationLetter.sendKeys("Other");
	Thread.sleep(1000);
	SelectOrganisation.click();
	ContactInformation.click();
	EnterAddress.sendKeys("Trivandrum");
	DocumentIdentification.click();
	EnterAadhar.sendKeys(Keys.HOME  + AadharNumber );
	Clickadd.click();
	Thread.sleep(800);
	
	

	List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
	
	if(dynamicElement.size() !=0)
	{
		
	}
	
	else
	{
		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
	}
	
	Thread.sleep(500);
	HowDidYouKnow.click();
	TV.click();
	Thread.sleep(500);
	Ok.click();
	Thread.sleep(500);
	Save.click();
	Thread.sleep(3000);
//////Write MRNo into the excel sheet	
    String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
	System.out.println(mrno);
	
	String word[]=mrno.split("[ :] ");
	System.out.println("number of words: "+word.length);
	for(int i=0;i<word.length;i++)
	{
		System.out.println("word["+i+"]="+word[i]);
	}
	System.out.println(word[1]);
	
	File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
	FileInputStream fis=new FileInputStream(src);
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	HSSFSheet BirthRegSenarios=wb.getSheetAt(12);	
	int i=BirthRegSenarios.getLastRowNum();
	System.out.println("Number of rows: " + i);		
	BirthRegSenarios.getRow(i).createCell(2).setCellValue(word[1]);	
	FileOutputStream fout=new FileOutputStream(src);	
	wb.write(fout);
	
	OK.click();
	Thread.sleep(500);
///////////////Admit the patient
	ADT.click();
	Thread.sleep(500);
	EnterProviderName.sendKeys("John peter");
			Thread.sleep(500);
	SelectProviderName.click();
	Thread.sleep(500);
	Priority.click();
	Thread.sleep(500);
	SelectPriority.click();
	Thread.sleep(500);
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	BedCategory.click();
	Thread.sleep(500);
	SelectBedCategory.click();
	Thread.sleep(500);
	RoomType.click();
	Thread.sleep(500);
	SelectRoomType.click();
	Thread.sleep(500);
	Bed.click();
	Thread.sleep(500);
	SelectBed.click();
	Thread.sleep(500);
	SAve.click();
	Thread.sleep(10000);
///////////////Logout and login as doctor
	Logoutdwnarw.click();
	Thread.sleep(1000);
	FOLogout.click();
	Thread.sleep(1000);
	confirmationLogoutmsg.click();
	Thread.sleep(1000);
	

	myusername.clear();
	myusername.sendKeys("DOCJP");
	mypassword.clear();
	mypassword.sendKeys("Kameda123$");
	myloginsite.click();
	siteselect.click();
	login.click();
	Thread.sleep(10000);
	OP.click();
////////Select the IP patient and create the doctor note and select pregnant
	Thread.sleep(10000);
	SelectIP.click();
	Thread.sleep(1000);
	EnterPatientName.sendKeys(FirstName);
	Thread.sleep(1000);
	SelectPatient.click();
	Thread.sleep(1000);
	UpArrow.click();
	DoctorNote.click();
	Thread.sleep(500);
	EnterChiefComplaint.sendKeys("Pregnant");
	Thread.sleep(600);
	EnterTemplate.click();
	EnterTemplate.sendKeys("A");
	Thread.sleep(1000);
	SelectTemplate.click();
	ClickOk.click();
	Thread.sleep(500);
	Pregnant.click();
	EnterObstreticScore.sendKeys("2");
	MaritalStatus.click();
	EnterNoYears.sendKeys("3");
	Conseption.click();
	CPOEPharmacy.click();
	Thread.sleep(500);
	SelectMedicine.click();
	Thread.sleep(500);
	Ongoing.click();
	SelectOngoing.click();
	OwnMedication.click();
	SelectOwnMedication.click();
	Cladd.click();
	Thread.sleep(500);
/*	Medicine2.click();
	Thread.sleep(500);
	Past.click();
	SelectPast.click();
	OwnMedication.click();
	SelectOnMedication.click();
	Thread.sleep(500);
	Cladd2.click();*/
	Thread.sleep(1000);
	arrw.click();
	Thread.sleep(600);
	sAVe.click();
	Thread.sleep(10000);
	arw.click();
//////////////Create delivery note and add 1 baby birth details
	Thread.sleep(600);
	doctrnote.click();
	Thread.sleep(1000);
	Selectcreate.click();
	Thread.sleep(900);
	Enteremplate.click();
	Selectemplate.click();
	Clickk.click();
	Thread.sleep(500);
	SelectBirthNote.click();
	Thread.sleep(5000);
	EnterGestationalAgeInWeeks.click();
	Thread.sleep(500);
	Gestationalage.click();
	Thread.sleep(1000);
	Termid.click();
	Thread.sleep(800);
	Term.click();
	Thread.sleep(500);
	Gender.click();
	Thread.sleep(500);
	SelectGender.click();
	Thread.sleep(500);
	EnterWeight.sendKeys("3");
	Thread.sleep(500);
	Presentation.click();
	Thread.sleep(500);
	SelectPresentation.click();
	Thread.sleep(500);
	TypeOfDelivery.click();
	Thread.sleep(500);
	SelectNormal.click();
	Thread.sleep(500);
	APGARScore.click();
	Thread.sleep(500);
	RespiratoryEffort.click();
	Thread.sleep(500);
	SelectRespiratoryEffort.click();
	Thread.sleep(500);
	CLickOk.click();
	Thread.sleep(500);
	NeonatalStatus.click();
	Thread.sleep(500);
	SelectNeonatal.click();
	Thread.sleep(500);
	ADD.click();
	Thread.sleep(500);
}	
public void Secondbabyadd(String FirstName,String AadharNumber) throws InterruptedException, IOException {
//////////////Create delivery note and add 2 baby birth details	

	SelectBirthNote.click();
	Thread.sleep(5000);
	EnterGestationalAgeInWeeks.click();
	Thread.sleep(500);
	Gestationalage.click();
	Thread.sleep(1000);
	Termid.click();
	Thread.sleep(800);
	Term.click();
	Thread.sleep(500);
	Gender.click();
	Thread.sleep(500);
	SelectGender.click();
	Thread.sleep(500);
	EnterWeight.sendKeys("4");
	Thread.sleep(500);
	Presentation.click();
	Thread.sleep(500);
	SelectPresentation.click();
	Thread.sleep(500);
	TypeOfDelivery.click();
	Thread.sleep(500);
	SelectNormal.click();
	Thread.sleep(500);
	APGARScore.click();
	Thread.sleep(500);
	RespiratoryEffort.click();
	Thread.sleep(500);
	SelectRespiratoryEffort.click();
	Thread.sleep(500);
	CLickOk.click();
	Thread.sleep(500);
	NeonatalStatus.click();
	Thread.sleep(500);
	SelectNeonatal.click();
	Thread.sleep(500);
	ADD.click();
	Thread.sleep(500);
}	
	
	public void Save() throws InterruptedException, IOException {	
	
	Uparw.click();
	Thread.sleep(1000);
	SelectSave.click();
	Thread.sleep(2000);
	usermenu.click();
	Thread.sleep(3000);
	logOut.click();
	Thread.sleep(2000);
	Okbutton.click();
	
}
	
	
	public void Action2(String FirstName,String AadharNumber) throws InterruptedException, IOException {
		
//////////////////Log in as admin and register babies
		myusername.clear();
		myusername.sendKeys("Admin");
		mypassword.clear();
		mypassword.sendKeys("KAmeda123$");
		myloginsite.click();
		siteselect.click();
		login.click();
		Thread.sleep(800);
	    SelectBirthRegisration.click();
	    Thread.sleep(2000);
		BirthRegitration.click();
		Thread.sleep(800);
/////////////////Register one baby
		EnterName.sendKeys(FirstName);
		Thread.sleep(600);
		Selectpatient.click();
		Thread.sleep(800);
		Selectselect.click();
		Thread.sleep(500);
		//Mobnum.sendKeys("2563258962");
		clickSave.click();
		Thread.sleep(500);
		ClIckOK.click();
////////////////Admit first baby
		EnterProvidername.sendKeys("Jose");
		Thread.sleep(600);
		SelectProvidername.click();
		Thread.sleep(1000);
		prioty.click();
		Thread.sleep(500);
		SelectPrirty.click();
		Thread.sleep(5000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(5000);
		BedCategory1.click();
		SelectBedCategory1.click();
		RoomType1.click();
		SelectRoomType1.click();
		Bed1.click();
		Thread.sleep(500);
		Bed1.click();
		Thread.sleep(500);
		
		Bed1.click();
		Thread.sleep(500);
		SelectBed1.click();
		Thread.sleep(1000);
		SAVE.click();
		Thread.sleep(10000);	
		
	}		

public void Secondbabyadt(String FirstName,String AadharNumber) throws InterruptedException, IOException {	
//////////////////Register second baby	

		Thread.sleep(500);
		Selectselect2.click();
		Thread.sleep(500);
		Select.click();
		Thread.sleep(500);
		//Mobnum.sendKeys("2563258962");
		clickSave.click();
		Thread.sleep(500);
		ClIckOK.click();
		Thread.sleep(15000);
///////////////admit second baby
		EnterProvidername.sendKeys("jose");
		Thread.sleep(1000);
		SelectProvidername.click();
		Thread.sleep(25000);
		Pri2.click();
		Thread.sleep(1000);
		Ele2.click();
		Thread.sleep(5000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(1000);
		BedCategory1.click();
		SelectBedCategory1.click();
		RoomType1.click();
		SelectRoomType1.click();
		Bed1.click();
		Thread.sleep(500);
		Bed1.click();
		Thread.sleep(500);
		Bed1.click();
		Thread.sleep(500);
		SelectBed1.click();
		Thread.sleep(1000);
		SAVE.click();
		Thread.sleep(10000);
		
		
	}
	
public void Babyadtlogoutin() throws InterruptedException, IOException {	
/////////////////Log in as doctor	
	usermenu.click();
	Thread.sleep(3000);
	logOut.click();
	Thread.sleep(2000);
	Okbutton.click();
	Thread.sleep(1000);
	myusername.clear();
	Thread.sleep(1000);
	myusername.sendKeys("TVM00001");
	mypassword.clear();
	mypassword.sendKeys("KAmeda123$");
	myloginsite.click();
	Thread.sleep(800);
	siteselect.click();
	Thread.sleep(500);
	login.click();
	Thread.sleep(10000);    
					
}		
public void Firstbabychart(String FirstName,String AadharNumber) throws InterruptedException, IOException {			
//////////Create development chart of first baby	
	Dropdown.click();
	Thread.sleep(5000);
	IP.click();
	Thread.sleep(1000);

	EnterPatientName1.sendKeys(FirstName);
	Thread.sleep(1000);
	SelectBaby.click();
	Thread.sleep(1000);
	UpArrow1.click();
	Thread.sleep(1000);
	Lock.click();
	Thread.sleep(1000);
	DoctorNote1.click();
	Thread.sleep(500);
	EnterChiefComplaint1.sendKeys("New Born Yellow");
	Thread.sleep(600);
	EnterTemplate1.click();
	Thread.sleep(1000);
	SelectTemplate1.click();
	Thread.sleep(1000);
	ClickOk1.click();
	Thread.sleep(500);
	
	ChildDevelopmentChart.click();
	Thread.sleep(5000);
    SocialSmile.click();
    Thread.sleep(1000);
	ClickOk2.click();
	Thread.sleep(1000);
	EyesFollow.click();
	Thread.sleep(1000);
    ClickOk3.click();
	Thread.sleep(1000);
	
	

	ChildLangEval.click();
	Thread.sleep(1000);
    RespondsToBell.click();
	Thread.sleep(1000);
	ClickOk5.click();
	Thread.sleep(1000);
	RespondsToSmile.click();
	Thread.sleep(1000);
    ClickOk6.click();
	Thread.sleep(1000);
	ListensWhenSpoken.click();
	Thread.sleep(1000);
    ClickOk7.click();
	Thread.sleep(1000);
	SelectSave1.click();
	Thread.sleep(10000);
}	
public void secondbabychart(String FirstName,String AadharNumber) throws InterruptedException, IOException {				
//////////Create development chart of second baby
	Thread.sleep(500);
	EMRtempmove.click();
	Thread.sleep(500);
	selectbaby2.click();
	Thread.sleep(1000);
	UpArrow1.click();
	Thread.sleep(1000);
	Lock.click();
	Thread.sleep(1000);
	DoctorNote1.click();
	Thread.sleep(500);
	EnterChiefComplaint1.sendKeys("New Born Yellow");
	Thread.sleep(600);
	EnterTemplate1.click();
	Thread.sleep(1000);
	SelectTemplate1.click();
	Thread.sleep(1000);
	ClickOk1.click();
	Thread.sleep(500);
	
	ChildDevelopmentChart.click();
	Thread.sleep(5000);
    SocialSmile.click();
    Thread.sleep(1000);
	ClickOk2.click();
	Thread.sleep(1000);
	EyesFollow.click();
	Thread.sleep(1000);
    ClickOk3.click();
	Thread.sleep(1000);
	
	ChildLangEval.click();
	Thread.sleep(1000);
    RespondsToBell.click();
	Thread.sleep(1000);
	ClickOk5.click();
	Thread.sleep(1000);
	RespondsToSmile.click();
	Thread.sleep(1000);
    ClickOk6.click();
	Thread.sleep(1000);
	ListensWhenSpoken.click();
	Thread.sleep(1000);
    ClickOk7.click();
	Thread.sleep(1000);
	Uparw.click();
	Thread.sleep(1000);
	SelectSave.click();
//  SelectSave1.click();   
	Thread.sleep(10000);
}	
	
public void EMR_LogOut() throws InterruptedException, IOException {					
	usermenu.click();
	Thread.sleep(1000);
	logOut.click();
	Thread.sleep(500);
	Okbutton.click();
	}

public void Action3(String FirstName,String AadharNumber) throws InterruptedException, IOException {
////////Log in admin
	myusername.clear();
	myusername.sendKeys("Admin");
	mypassword.clear();
	mypassword.sendKeys("KAmeda123$");
	myloginsite.click();
	siteselect.click();
	login.click();
	FoMenu1.click();	
	Thread.sleep(1000);
	FoDropdown.click();
	Thread.sleep(1000);
	Search2.sendKeys(FirstName);
	Thread.sleep(1000);
//////////////////// Baby1 Discharge
	
	SelectBaby1.click();      
	Thread.sleep(1000);
	Dischargestat.click();
	Thread.sleep(1000);
	SelectDischargestat.click();
	Thread.sleep(1000);
	Disposition.click();
	Thread.sleep(1000);
	SelectDisposition.click();
	Thread.sleep(1000);
	DischargeSave.click();
	Thread.sleep(2000);
	
////////////////// //baby2 Discharge	
	SelectBaby2.click();        
	Thread.sleep(1000);
	Dischargestat.click();
	Thread.sleep(1000);
	SelectDischargestat.click();
	Thread.sleep(1000);
	Disposition.click();
	Thread.sleep(1000);
	SelectDisposition.click();
	Thread.sleep(1000);
	DischargeSave.click();
	Thread.sleep(3000);		
	
///////////////////patient Discharge	
	Selectmother.click();   
	Thread.sleep(1000);
	Dischargestat.click();
	Thread.sleep(1000);
	SelectDischargestat.click();
	Thread.sleep(1000);
	Disposition.click();
	Thread.sleep(1000);
	SelectDisposition.click();
	Thread.sleep(1000);
	DischargeSave.click();
	Thread.sleep(1000);
}	

}
