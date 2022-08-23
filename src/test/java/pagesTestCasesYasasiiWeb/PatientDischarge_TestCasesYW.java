package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_DoctorNote_CategoryFilters_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.PatientDischarge_YasassiWeb;

public class PatientDischarge_TestCasesYW  extends TestBaseYasasiiWeb{

	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
		Thread.sleep(2000); 
	}
	
	@Test (dataProvider = "getData")
	public void patientdischarge1 (String MRNO , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL) throws InterruptedException, IOException, AWTException {

		Thread.sleep(4000); 

		PatientDischarge_YasassiWeb dis = new PatientDischarge_YasassiWeb(driver);

		dis.dischargeRecommendation(MRNO, nurseUser, Password,URL);
		dis.dischargeApproval(MRNO, nurseUser, Password, depUser,URL);
		dis.laboratoryClearance(MRNO, Password, depUser, RADuser,URL);
		dis.radiologyClearance(MRNO, RADuser, Password, meduser,URL);
		dis.medicalClearance(MRNO,Password, meduser, nurseUser,URL);
		dis.PharmacyClearance(MRNO, nurseUser, Password, AdminUser, AdminPassword,URL);
		dis.ADTAppoval(MRNO, nurseUser, Password,URL);
		dis.financialClearance(MRNO, nurseUser, Password,URL);
		dis.physicalDischarge(MRNO, nurseUser, Password);

	}

	@AfterClass
	public void logout() throws Exception
	{
		Thread.sleep(2000); 
		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("PatientDischarge");
		return data;	
	} 





}

