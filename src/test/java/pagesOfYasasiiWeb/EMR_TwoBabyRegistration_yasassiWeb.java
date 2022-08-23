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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_TwoBabyRegistration_yasassiWeb extends PageFactoryInitYasasiiWeb{

	public EMR_TwoBabyRegistration_yasassiWeb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Hamburger;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement FOModule;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement Registration;
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
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Ok;
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement OK;
	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement checkbox;



	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProviderName;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;



	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "//li[contains(text(),'Antenatal Assessment')]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk;



	@FindBy(xpath = "//label[normalize-space()='Pregnant']//span[@class='checkmark']")
	public WebElement Pregnant;
	@FindBy(xpath = "//input[@id='obstetricscore']")
	public WebElement EnterObstreticScore;
	@FindBy(xpath = "//label[normalize-space()='Marital History']//span[@class='checkmark']")
	public WebElement MaritalStatus;
	@FindBy(xpath = "//input[@id='noofyears']")
	public WebElement EnterNoYears;
	@FindBy(xpath = "//label[normalize-space()='Conception']//span[@class='checkmark']")
	public WebElement Conseption;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement SelectMedicine;
	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Ongoing;
	@FindBy(xpath = "//li[normalize-space()='Ongoing']")
	public WebElement SelectOngoing;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement Ownmedication;
	@FindBy(xpath = "//li[normalize-space()='Patient own medication']")
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
	@FindBy(xpath = "//label[@class='icon emrsave']")
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
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Birth Notes']")
	public WebElement SelectBirthNote;
	@FindBy(xpath = "//input[@id='gestationperiodweeks']")
	public WebElement EnterGestationalAgeInWeeks;
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
	@FindBy(xpath = "//img[contains(@src,'../../../assets/img/icons/AddNewIcon.png')]")
	public WebElement APGARScore;
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[2]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement RespiratoryEffort;
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[2]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectRespiratoryEffort;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[3]/button[1]")
	public WebElement CLickOk;
	@FindBy(xpath = "//input[@id='neonatalstatus']")
	public WebElement NeonatalStatus;
	@FindBy(xpath = "//li[contains(text(),'Alive')]")
	public WebElement SelectNeonatal;
	@FindBy(xpath = "//div[contains(@class,'col-md-3 ta-r')]//button[contains(@type,'button')][normalize-space()='Add']")
	public WebElement ADD;

	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement SelectSave;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement mentogle;
	@FindBy(xpath = "//div[@class='btn-module-back']")
	public WebElement modles;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement fomod;
	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement registran;



	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement SelectBirthRegisration;
	@FindBy(xpath = "//li[contains(text(),'Birth Registration')]")
	public WebElement BirthRegitration;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient;
	@FindBy(xpath = "//label[contains(text(),'Select')]")
	public WebElement Selectselect;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mobnum;
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
	public WebElement Roomcatgry;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement Selectcategry;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement BEd;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectBEd;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BEDno;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBEDno;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAVE;



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Menu;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MODules;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement EMR1;
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen1;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement Dropdown;

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

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote1;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint1;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate1;
	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SelectTemplate1;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk1;


	@FindBy(xpath = "//div[contains(text(),'Child Development Chart')]")
	public WebElement ChildDevelopmentChart;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-childmilestone[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][9]/*[name()='g'][1]/*[name()='g'][1]/*[name()='rect'][1]")
	public WebElement SocialSmile;
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk2;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-childmilestone[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][9]/*[name()='g'][1]/*[name()='g'][2]/*[name()='rect'][1]")
	public WebElement EyesFollow;
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk3;


	@FindBy(xpath = "//div[contains(text(),'Child Language Evaluation Chart')]")
	public WebElement ChildLangEval;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][9]/*[name()='g'][1]/*[name()='g'][1]/*[name()='rect'][1]")
	public WebElement RespondsToBell;
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk5;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][9]/*[name()='g'][1]/*[name()='g'][2]/*[name()='rect'][1]")
	public WebElement RespondsToSmile;
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk6;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-childlanguageevaluationchart[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][9]/*[name()='g'][1]/*[name()='g'][7]/*[name()='rect'][1]")
	public WebElement ListensWhenSpoken;
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk7;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement SelectSave1;


	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement mentogle1;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement modles1;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement fomod1;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement registran1;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement FoMenu1;
	@FindBy(xpath = "//li[contains(text(),'IP')]")
	public WebElement FoDropdown;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search2;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby1;
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


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient2;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat1;
	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat1;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition1;
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition1;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave1;



	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement Logoutarw;
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement Logoutbutton;
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Logoutconfrm;

	@FindBy(xpath = "//input[contains(@placeholder,'Search Medicines')]")
	public WebElement medicineSearch;

	@FindBy(xpath = "//app-cpoe-pharmacy-list//div[contains(@class,'card-header pb0')]//img[1]")
	public WebElement Star;



	@FindBy(xpath = "//i[contains(@class,'dashboard-lock ki ki-lock')]")
	public WebElement lock;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement DOB;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	@FindBy(xpath = "//input[@id='gestperiodmonths']")
	public WebElement Week;

	@FindBy(xpath = "//input[@id='gestperioddays']")
	public WebElement Days;

	@FindBy(xpath = "//input[@id='Term']")
	public WebElement Term;

	@FindBy(xpath = "//input[@id='Present']")
	public WebElement Prsntatn;

	@FindBy(xpath = "//input[@id='delv']")
	public WebElement TypeofDel;

	@FindBy(xpath = "//input[@id='neostatus']")
	public WebElement neoStatus;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement BabyREGSave;

	@FindBy(xpath = "//input[@id='numbaby']")
	public WebElement nObaby;

	@FindBy(xpath = "//input[@id='score0']")
	public WebElement Score;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT1;



	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;


	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "(//i[@class='ki ki-trash p0'])[1]")
	public WebElement deleteconsult;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EmrSave;

	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;

	@FindBy(xpath = "//span[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EmrIcon;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']")//button[normalize-space()='Department Clearance']
	public WebElement Depclearance;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement laboratoryCheckbox;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement radiologyCheckbox;

	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement FinancialClearance;

	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement pysicalDischarge;




	public void enterFOpatientBirthRegistrationSelectn(String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException {

		///////////////////Register a female patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(500);
		Registration.click();
		Thread.sleep(500);
		Title.click();
		SelectMiss.click();
		EnterFirstNME.sendKeys(Name);
		EnterAge.sendKeys("25");
		EnterMob.sendKeys("1222248789");
		EnterOrganisationLetter.sendKeys("Other");
		Thread.sleep(1000);
		SelectOrganisation.click();
		ContactInformation.click();
		EnterAddress.sendKeys("Trivandrum");
		DocumentIdentification.click();
		EnterAadhar.sendKeys(Keys.HOME  + AadharNumber );
		Thread.sleep(600);
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

		//checkbox.click();
		HowDidYouKnow.click();
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);


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
		HSSFSheet BirthRegistration=wb.getSheetAt(72);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(2).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);


		OK.click();
		Thread.sleep(2000);

		///////////////encounter

		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		deleteconsult.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		/////Admit the patient
		ADT.click();
		Thread.sleep(1500);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		//driver.findElement(By.xpath("//li[normalize-space()='John Peter(docjp)']")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();


		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(1000);
		SelectPriority.click();
		Thread.sleep(1000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		/*	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//ul[@id='check']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}*/

		driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[1]")).click();
		//SelectBed.click();
		SAve.click();
		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();

	}





	///////////Enter into EMR page

	public void pregnantNOTE(String Name , String MRNo ,String Provider , String DOCuser , String DOCpassword,String URL) throws InterruptedException {


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(5000);

		userid.click();
		userid.sendKeys(DOCuser);
		password.click();
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



	
		MenuToggle.click();
		Thread.sleep(1000);
		//MOdules.click();
		//EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(500);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(500);
		UpArrow.click();
		Thread.sleep(500);
		lock.click();
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);
		EnterChiefComplaint.clear();
		Thread.sleep(1000);
		EnterChiefComplaint.sendKeys("Pregnant");
		Thread.sleep(600);
		EnterTemplate.click();
		EnterTemplate.sendKeys("A");
		Thread.sleep(1000);
		SelectTemplate.click();
		ClickOk.click();
		Thread.sleep(500);
		Pregnant.click();
		Thread.sleep(500);
		EnterObstreticScore.sendKeys("2");
		Thread.sleep(500);
		MaritalStatus.click();
		Thread.sleep(500);
		EnterNoYears.sendKeys("3");
		Thread.sleep(500);
		Conseption.click();
		Thread.sleep(500);
		CPOEPharmacy.click();
		Thread.sleep(500);
		Star.click();
		Thread.sleep(500);
		medicineSearch.click();
		Thread.sleep(500);
		medicineSearch.sendKeys("dolo");
		Thread.sleep(500);

		SelectMedicine.click();
		Thread.sleep(500);
		Ongoing.click();
		Thread.sleep(1000);
		SelectOngoing.click();
		Thread.sleep(1000);
		OwnMedication.click();
		Thread.sleep(1000);
		SelectOwnMedication.click();
		Thread.sleep(1000);
		Cladd.click();
		Thread.sleep(1000);
		/*	Medicine2.click();
	Thread.sleep(500);
	Past.click();
	SelectPast.click();
	OwnMedication.click();
	SelectOnMedication.click();
	Thread.sleep(500);
	Cladd2.click();      */

		Thread.sleep(1000);
		//arrw.click();
		//UpArrow.click();
		Thread.sleep(600);
		sAVe.click();
		Thread.sleep(10000);
		//arw.click();
		Thread.sleep(600);



	}
	/////////Select the delivery note template and add the details

	public void DeliveryNOTE() throws InterruptedException {

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);

		Thread.sleep(900);
		Enteremplate.click();
		Selectemplate.click();
		ClickOk.click();
		Thread.sleep(1000);
		SelectBirthNote.click();
		Thread.sleep(500);
		EnterGestationalAgeInWeeks.sendKeys("32");
		Thread.sleep(1000);
		Gender.click();
		Thread.sleep(1000);
		SelectGender.click();
		Thread.sleep(1000);
		EnterWeight.sendKeys("3");
		Thread.sleep(1000);
		Presentation.click();
		Thread.sleep(1000);
		SelectPresentation.click();
		Thread.sleep(500);
		TypeOfDelivery.click();
		Thread.sleep(500);
		SelectNormal.click();
		Thread.sleep(500);
		APGARScore.click();
		Thread.sleep(500);
		Score.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='score1']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Less than 100']")).click();
		Thread.sleep(500);

		
		SelectRespiratoryEffort.click();
		//	Thread.sleep(1000);
		CLickOk.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		NeonatalStatus.click();
		Thread.sleep(500);
		SelectNeonatal.click();
		ADD.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='termid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Full-Term']")).click();
		
		Thread.sleep(2000);
		Gender.click();
		Thread.sleep(1000);
		SelectGender.click();
		Thread.sleep(1000);
		EnterWeight.sendKeys("3");
		Thread.sleep(1000);
		Presentation.click();
		Thread.sleep(1000);
		SelectPresentation.click();
		Thread.sleep(500);
		TypeOfDelivery.click();
		Thread.sleep(500);
		SelectNormal.click();
		Thread.sleep(500);
		APGARScore.click();
		Thread.sleep(500);
		Score.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='score1']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Less than 100']")).click();
		Thread.sleep(500);

		//	RespiratoryEffort.click();//img[@src='../../../assets/img/icons/AddNewIcon.png']
		//Thread.sleep(2000);
		SelectRespiratoryEffort.click();
		//	Thread.sleep(1000);
		CLickOk.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		NeonatalStatus.click();
		Thread.sleep(500);
		SelectNeonatal.click();
		Thread.sleep(1000);
		ADD.click();
		Thread.sleep(1000);
		
	//	UpArrow.click();
		Thread.sleep(1000);
		SelectSave.click();
		Thread.sleep(5000); 


	}
	public void Birthreg(String MRNo ,String Provider, String ADTprovider , String Mrno1,String URL) throws InterruptedException, IOException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(5000);

		userid.click();
		userid.sendKeys("admin");
		password.click();
		password.sendKeys("kameda321");
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);




		////////////Take Fo and select Birth registration and register the baby
		MenuToggle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		//modles.click();
		Thread.sleep(1000);
		//fomod.click();
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']"));

		if(dynamicElement2.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		}

		Thread.sleep(1000);

		
		registran.click();//span[normalize-space()='Registration']


		Thread.sleep(500);
		SelectBirthRegisration.click();
		Thread.sleep(1000);
		BirthRegitration.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		//driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();

		EnterName.sendKeys(MRNo);
		Thread.sleep(1000);
		EnterName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Female']")).click();
		Thread.sleep(1000);
	//	DOB.click();
		Thread.sleep(1000);
	//	Set.click();
		Thread.sleep(1000);
		//Week.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		BabyREGSave.click();
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
		HSSFSheet BirthRegistration=wb.getSheetAt(72);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(4).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		billSave.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();




		//////////Admit the baby
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-patient-bed-fill']")).click();

		EnterProvidername.sendKeys(ADTprovider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider+"')])")).click();
		//SelectProvidername.click();
		prioty.click();
		SelectPrirty.click();
		Thread.sleep(500);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		Roomcatgry.click();
		Selectcategry.click();
		Thread.sleep(500);
		BEd.click();
		Thread.sleep(800);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		//SelectBEd.click();
		Thread.sleep(1000);
		BEDno.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[2]")).click();
		//SelectBEDno.click();
		Thread.sleep(3000);
		SAVE.click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();

	}
	
	public void Birthreg2(String MRNo ,String Provider, String ADTprovider , String Mrno1) throws InterruptedException, IOException {
	
		/////////////////////////2nd baby Registration
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[normalize-space()='Select'])[1]")).click();
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Female']")).click();
		Thread.sleep(1000);
		//DOB.click();
		Thread.sleep(1000);
		//Set.click();
		Thread.sleep(1000);
		//Week.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		BabyREGSave.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
		System.out.println(mrno);

		String words[]=mrno.split("[ :] ");
		System.out.println("number of words: "+words.length);
		for(int i=0;i<words.length;i++)
		{
			System.out.println("word["+i+"]="+words[i]);
		}
		System.out.println(words[1]);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb82190\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData82.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(72);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(15).setCellValue(words[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();




		//////////Admit the baby
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-patient-bed-fill']")).click();

		EnterProvidername.sendKeys(ADTprovider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider+"')])")).click();
		//SelectProvidername.click();
		prioty.click();
		SelectPrirty.click();
		Thread.sleep(500);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		Roomcatgry.click();
		Selectcategry.click();
		Thread.sleep(500);
		BEd.click();
		Thread.sleep(800);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		//SelectBEd.click();
		Thread.sleep(1000);
		BEDno.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[2]")).click();
		//SelectBEDno.click();
		Thread.sleep(3000);
		SAVE.click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();



	}

	public void babyNote(String MRNo1 , String MRNo2 , String DOCuser , String DOCpassword,String URL) throws InterruptedException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		driver.switchTo().window(tabs.get(3));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(5000);

		userid.click();
		userid.sendKeys(DOCuser);
		password.click();
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);




		///////Create doctor note for the baby	
		Menu.click();
		Thread.sleep(5000);
		//MODules.click();
		Thread.sleep(1000);
		//EMR1.click();
		Thread.sleep(1000);
		EMRHomeScreen1.click();
		Thread.sleep(1000);
		Dropdown.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		//	NextDropdown.click();
		Thread.sleep(1000);
		//	MyDeptIP.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(@class,'pat-list-lock ki ki-lock-open')]")).click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo1);
		EnterPatientName1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo1+"')])[1]")).click();
		Thread.sleep(1000);

		//SelectBaby.click();
		Thread.sleep(1000);
		UpArrow.click();
		Thread.sleep(1000);
		lock.click();
		Thread.sleep(1000);
		DoctorNote1.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement4=driver.findElements(By.xpath("//input[@id='inchargeproviderid']"));

		if(dynamicElement4.size() !=0)
		{
			driver.findElement(By.xpath("//input[@id='inchargeproviderid']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='btn btn-dark-green active']")).click();
			Thread.sleep(2000);

		}
		Thread.sleep(800); 

		//input[@id='inchargeproviderid']



		EnterChiefComplaint1.sendKeys("New Born Yellow");
		Thread.sleep(600);
		EnterTemplate1.click();
		Thread.sleep(1000);
		SelectTemplate1.click();
		Thread.sleep(1000);
		ClickOk1.click();
		Thread.sleep(500);
		//////////Enter data in child development chart	
		ChildDevelopmentChart.click();
		Thread.sleep(5000);
		SocialSmile.click();
		Thread.sleep(1600);
		ClickOk2.click();
		Thread.sleep(1000);
		EyesFollow.click();
		Thread.sleep(1000);
		ClickOk3.click();
		Thread.sleep(1000);
		/*TransferObj.click();
	Thread.sleep(1000);
    ClickOk4.click();
	Thread.sleep(1000);*/


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
		//UpArrow.click();
		Thread.sleep(1000);
		SelectSave1.click();
		Thread.sleep(2000);

		
		
		
		
		///////2nd baby Note
		EnterPatientName1.clear();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo2);
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo2+"')])[1]")).click();
		Thread.sleep(1000);

		//SelectBaby.click();
		Thread.sleep(1000);
	//	UpArrow.click();
		Thread.sleep(1000);
		//lock.click();
		Thread.sleep(1000);
		DoctorNote1.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement5=driver.findElements(By.xpath("//input[@id='inchargeproviderid']"));

		if(dynamicElement5.size() !=0)
		{
			driver.findElement(By.xpath("//input[@id='inchargeproviderid']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='btn btn-dark-green active']")).click();
			Thread.sleep(2000);

		}
		Thread.sleep(800); 

		//input[@id='inchargeproviderid']



		EnterChiefComplaint1.sendKeys("New Born Yellow");
		Thread.sleep(600);
		EnterTemplate1.click();
		Thread.sleep(1000);
		SelectTemplate1.click();
		Thread.sleep(1000);
		ClickOk1.click();
		Thread.sleep(500);
		//////////Enter data in child development chart	
		ChildDevelopmentChart.click();
		Thread.sleep(5000);
		SocialSmile.click();
		Thread.sleep(1600);
		ClickOk2.click();
		Thread.sleep(1000);
		EyesFollow.click();
		Thread.sleep(1000);
		ClickOk3.click();
		Thread.sleep(1000);
		/*TransferObj.click();
	Thread.sleep(1000);
    ClickOk4.click();
	Thread.sleep(1000);*/


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
		//UpArrow.click();
		Thread.sleep(1000);
		SelectSave1.click();
		Thread.sleep(2000);

		
	}

	public void  dischargeRecommendationBaby1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

////////////////////////baby1 
		//driver.navigate().refresh();
		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo1+"')])[1]")).click();
		Thread.sleep(1000);
		//UParrow.click();
		//Lock.click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		diagnosis.click();
		Thread.sleep(1000);
		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000); 
		
		
		
		
		
		
		

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(4));
		driver.switchTo().window(tabs.get(4));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		
		
		
		
		
		
		
	}
	public void  dischargeApprovalBaby1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

		///////////////dischargeApproval


		driver.navigate().refresh();
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(5000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(3000);
		//act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//element.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(1000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(5));
		driver.switchTo().window(tabs.get(5));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(depUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


	}

	public void  LaboratoryClearanceBaby1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

		//////////////////////////////////laboratory clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(2000);
		laboratoryCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(depUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+depUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(6));
		driver.switchTo().window(tabs.get(6));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(RADuser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}

	public void  radiologyClearanceBaby1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {
		////////////////////////////radiology clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();;
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(RADuser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+RADuser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(7));
		driver.switchTo().window(tabs.get(7));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(meduser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}

	public void  medicalClearanceBaby1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		/////////////////////////medical Clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(meduser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+meduser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(8));
		driver.switchTo().window(tabs.get(8));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}


	public void  pharmacyClearanceBaby1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

		//////////////////////////////////pharmacy clearance

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
		Thread.sleep(3000);
		act.moveToElement( pharmacyClearance).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(9));
		driver.switchTo().window(tabs.get(9));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}


	public void  ADTapproval1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		///////////////////////////////ADT aPProval
		Thread.sleep(1000);
		FOSearchField.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo1);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo1+"')])[1]")).click();
		Thread.sleep(1000);
		ADT.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);


		Thread.sleep(2000);
		dischargeStatus.click();//input[@id='dischargestatus']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
		Thread.sleep(1000);
		ADTSave.click();
		Thread.sleep(1000);

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(10));
		driver.switchTo().window(tabs.get(10));//7
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}


	public void  financialClearance1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		///////////////////////////////////////////financial clearance 

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
		Thread.sleep(3000);
		act.moveToElement( FinancialClearance).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(11));
		driver.switchTo().window(tabs.get(11));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}

	public void  physicalDischarge1(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String DOCuser,  String  DOCpassword,String URL) throws InterruptedException

	{

		//////////////////////////physical Discharge

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);

		//driver.navigate().refresh();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();

		//driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
		Thread.sleep(3000);
		act.moveToElement( pysicalDischarge).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(12));
		driver.switchTo().window(tabs.get(12));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(DOCuser); 
		password.click();
		password.sendKeys(DOCpassword);   

		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);




	}
	
	
	public void  dischargeRecommendationBaby2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

////////////////////////baby1 
//driver.navigate().refresh();
Thread.sleep(3000);
Hamberger.click();
Thread.sleep(1000);
EMRhomescreen.click();
Thread.sleep(1000);
mainCategory.click();
IP.click();
Searchfield.click();
Thread.sleep(1000);
Searchfield.sendKeys(MRNo2);
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo2+"')])[1]")).click();
Thread.sleep(1000);
UParrow.click();
Lock.click();
Thread.sleep(1000);
DoctorNote.click();
Thread.sleep(1000);
List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

if(dynamicElement.size() !=0)
{
driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
}
Thread.sleep(800); 
cheifComplaint.clear();
cheifComplaint.sendKeys("Fever");
Thread.sleep(1000);
driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
template.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
tempOk.click();
Thread.sleep(1000);
diagnosis.click();
Thread.sleep(1000);
DisRecom.click();
Thread.sleep(2000);
Dischargecheckbox.click();
Thread.sleep(1000);
EmrSave.click();
Thread.sleep(1000); 








//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(13));
driver.switchTo().window(tabs.get(13));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(nurseUser);
password.click();
password.sendKeys(Password); 
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);








}
public void  dischargeApprovalBaby2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

///////////////dischargeApproval


//driver.navigate().refresh();
Thread.sleep(2000);
Hamberger.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(1000);
WhiteBoard.click();
Thread.sleep(5000);
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
Thread.sleep(3000);
//act.moveToElement(element).click().build().perform();
Thread.sleep(1000);
//element.click();
Thread.sleep(1000);
//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
Thread.sleep(1000);
act.moveToElement(REadyForDischarge).click().build().perform();
Thread.sleep(1000);

verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(nurseUser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();


//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(14));
driver.switchTo().window(tabs.get(14));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(depUser);
password.click();
password.sendKeys(Password);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);


}

public void  LaboratoryClearanceBaby2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

//////////////////////////////////laboratory clearance

Hamberger.click();
Thread.sleep(1000);
EmrIcon.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(2000);
WhiteBoard.click();
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
Thread.sleep(2000);
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", Depclearance);
Thread.sleep(3000);
act.moveToElement(Depclearance).click().build().perform();
//Depclearance.click();
Thread.sleep(1000);
laboratoryCheckbox.click();
Thread.sleep(1000);
verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(depUser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+depUser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();


//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(15));
driver.switchTo().window(tabs.get(15));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(RADuser);
password.click();
password.sendKeys(Password);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);

}

public void  radiologyClearanceBaby2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {
////////////////////////////radiology clearance

Hamberger.click();
Thread.sleep(1000);
EmrIcon.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(1000);
WhiteBoard.click();
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();;
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", Depclearance);
Thread.sleep(3000);
act.moveToElement(Depclearance).click().build().perform();
//Depclearance.click();
Thread.sleep(1000);
radiologyCheckbox.click();
Thread.sleep(1000);
verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(RADuser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+RADuser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();


//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(16));
driver.switchTo().window(tabs.get(16));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(meduser);
password.click();
password.sendKeys(Password);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);
}

public void  medicalClearanceBaby2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


/////////////////////////medical Clearance

Hamberger.click();
Thread.sleep(1000);
EmrIcon.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(1000);
WhiteBoard.click();
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", Depclearance);
Thread.sleep(3000);
act.moveToElement(Depclearance).click().build().perform();
//Depclearance.click();
Thread.sleep(1000);
radiologyCheckbox.click();
Thread.sleep(1000);
verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(meduser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+meduser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();


//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(17));
driver.switchTo().window(tabs.get(17));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(nurseUser);
password.click();
password.sendKeys(Password);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);
}


public void  pharmacyClearanceBaby2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

//////////////////////////////////pharmacy clearance

Thread.sleep(1000);
Hamberger.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(2000);
WhiteBoard.click();
Thread.sleep(1000);
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
Thread.sleep(3000);
act.moveToElement( pharmacyClearance).click().build().perform();

Thread.sleep(1000);

Thread.sleep(1000);
verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(nurseUser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();

//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(18));
driver.switchTo().window(tabs.get(18));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(AdminUser);
password.click();
password.sendKeys(AdminPassword);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);

}


public void  ADTapproval2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


///////////////////////////////ADT aPProval
Thread.sleep(1000);
FOSearchField.click();
Thread.sleep(1000);
Thread.sleep(1000);
FOSearchField.sendKeys(MRNo2);
Thread.sleep(1000);
FOSearchField.sendKeys(Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo2+"')])[1]")).click();
Thread.sleep(1000);
ADT.click();
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);


Thread.sleep(2000);
dischargeStatus.click();//input[@id='dischargestatus']
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
Thread.sleep(1000);
disposition.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
Thread.sleep(1000);
ADTSave.click();
Thread.sleep(1000);

//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(19));
driver.switchTo().window(tabs.get(19));//7
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(nurseUser);
password.click();
password.sendKeys(Password);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);

}


public void  financialClearance2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


///////////////////////////////////////////financial clearance 

Thread.sleep(1000);
Hamberger.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(2000);
WhiteBoard.click();
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
Thread.sleep(3000);
act.moveToElement( FinancialClearance).click().build().perform();

Thread.sleep(1000);

Thread.sleep(1000);
verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(nurseUser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();

//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(20));
driver.switchTo().window(tabs.get(20));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(nurseUser);
password.click();
password.sendKeys(Password);
Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);

}

public void  physicalDischarge2(String MRNo2 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String DOCuser,  String  DOCpassword,String URL) throws InterruptedException

{

//////////////////////////physical Discharge

Thread.sleep(1000);
Hamberger.click();
Thread.sleep(1000);
EMR.click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
Thread.sleep(2000);
WhiteBoard.click();
Thread.sleep(1000);

//driver.navigate().refresh();
Thread.sleep(1000);
NameSearch.click();
Thread.sleep(1000);
NameSearch.sendKeys(MRNo2);
Thread.sleep(1000);
SearchIcon.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();

//driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
Thread.sleep(3000);
act.moveToElement( pysicalDischarge).click().build().perform();

Thread.sleep(1000);

Thread.sleep(1000);
verifiedBy.click();
Thread.sleep(1000);
verifiedBy.sendKeys(nurseUser);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
Thread.sleep(1000);
verifyPassword.click();
verifyPassword.sendKeys(Password);
Thread.sleep(1000);
verifySave.click();

//openNewTab

Thread.sleep(3000);
((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(21));
driver.switchTo().window(tabs.get(21));
Thread.sleep(5000);
driver.get(URL);
Thread.sleep(3000);

//login
userid.click();
userid.sendKeys(DOCuser); 
password.click();
password.sendKeys(DOCpassword);   

Thread.sleep(1000);
site.click();
driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
Thread.sleep(5000);




}

/////////////////////////////discharge mom

	public void dischargeRecommendationMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {

		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		//UParrow.click();
		//Lock.click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		diagnosis.click();
		Thread.sleep(1000);
		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000); 

		//openNewTab



		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(22));
		driver.switchTo().window(tabs.get(22));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}

	public void dischargeApprovalMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		///////////////dischargeApproval


		driver.navigate().refresh();
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(5000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(3000);
		//act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//element.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(1000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(23));
		driver.switchTo().window(tabs.get(23));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(depUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}

	public void laboratoryclearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		//////////////////////////////////laboratory clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		laboratoryCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(depUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+depUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(24));
		driver.switchTo().window(tabs.get(24));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(RADuser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}
	public void RadiologyclearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {



		////////////////////////////radiology clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();;
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(RADuser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+RADuser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(25));
		driver.switchTo().window(tabs.get(25));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(meduser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}

	public void MedicalclearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		/////////////////////////medical Clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(meduser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+meduser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(26));
		driver.switchTo().window(tabs.get(26));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}

	public void pharmacyClearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		//////////////////////////////////pharmacy clearance

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
		Thread.sleep(3000);
		act.moveToElement( pharmacyClearance).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(2000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(27));
		driver.switchTo().window(tabs.get(27));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


	}

	public void ADTapprovalMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		///////////////////////////////ADT aPProval
		Thread.sleep(1000);
		FOSearchField.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		ADT.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);


		Thread.sleep(2000);
		dischargeStatus.click();//input[@id='dischargestatus']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
		Thread.sleep(1000);
		ADTSave.click();
		Thread.sleep(1000);

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(28));
		driver.switchTo().window(tabs.get(28));//7
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}

	public void financialClearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {



		///////////////////////////////////////////financial clearance 

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
		Thread.sleep(3000);
		act.moveToElement( FinancialClearance).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(29));
		driver.switchTo().window(tabs.get(29));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


	}
	public void physicalDischargeMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException {


		//////////////////////////physical Discharge

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);

		//driver.navigate().refresh();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();

		//driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
		Thread.sleep(3000);
		act.moveToElement( pysicalDischarge).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
	}






}



	
	
	
	

