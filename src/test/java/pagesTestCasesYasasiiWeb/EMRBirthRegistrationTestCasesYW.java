package pagesTestCasesYasasiiWeb;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.EMRBirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRBirthRegistrationTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword,String URL) throws InterruptedException, IOException {
		Thread.sleep(2000);
		
		EMRBirthRegistrationYasasiiWeb Schedule1 = new EMRBirthRegistrationYasasiiWeb(driver);
		Schedule1.enterFOpatientBirthRegistrationSelectn(Name, AadharNumber, MRNo, Provider , ADTprovider);
		}

@Test(dataProvider="getData" , priority =1)
public void Doctornote(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword,String URL) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMRBirthRegistrationYasasiiWeb Schedule1 = new EMRBirthRegistrationYasasiiWeb(driver);
		Schedule1.pregnantNOTE(Name, MRNo,Provider,DOCuser , DOCpassword,URL);
		Schedule1 .DeliveryNOTE();
		Schedule1.Birthreg(MRNo, Provider, ADTprovider, MRNo1,URL);
	
		}

@Test(dataProvider="getData" , priority=2)
public void babynote(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword,String URL) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMRBirthRegistrationYasasiiWeb Schedule1 = new EMRBirthRegistrationYasasiiWeb(driver);
		
		Schedule1.babyNote(MRNo1 , DOCuser ,  DOCpassword,URL);
		}

@Test(dataProvider="getData" , priority=3)
public void Babydischarge(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword,String URL) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMRBirthRegistrationYasasiiWeb Schedule1 = new EMRBirthRegistrationYasasiiWeb(driver);
		
		Schedule1.dischargeRecommendationBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.dischargeApprovalBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.LaboratoryClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.radiologyClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.medicalClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.pharmacyClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.ADTapproval(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.financialClearance(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule1.physicalDischarge(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword ,DOCuser , DOCpassword,URL);
}

@Test(dataProvider="getData" , priority=4)
public void MOMdischarge(String Name,String AadharNumber,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword,String URL) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMRBirthRegistrationYasasiiWeb Schedule = new EMRBirthRegistrationYasasiiWeb(driver);
		
		Schedule.dischargeRecommendationMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.dischargeApprovalMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.laboratoryclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.RadiologyclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.MedicalclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.pharmacyClearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.ADTapprovalMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.financialClearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		Schedule.physicalDischargeMOM(MRNo, nurseUser, password, depUser, RADuser, meduser);
		
}


@AfterClass
public void logout() throws Exception
{
	
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("BirthRegistration");
	return data;	
}


}