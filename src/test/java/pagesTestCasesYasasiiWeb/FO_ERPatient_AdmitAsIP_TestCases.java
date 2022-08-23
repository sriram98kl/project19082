package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_ERPatient_AdmitAsIP_YasassiWeb;
import pagesOfYasasiiWeb.FO_combinationalPAY_DiscRaise_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_ERPatient_AdmitAsIP_TestCases  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000); 
	}
	
	@Test (dataProvider = "getData")
	public void combinePay(String TITLE ,String NAME ,String AGE ,String MBLNO,String MRNO , String ADDRESS ,String AADHAAR , String PROVIDER , String SERVICE) throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(8000); 
		
		FO_ERPatient_AdmitAsIP_YasassiWeb  ERIP = new FO_ERPatient_AdmitAsIP_YasassiWeb(driver);
		ERIP.ERpatientAdmit(TITLE, NAME, AGE, MBLNO);
		ERIP.encounter(PROVIDER);
		ERIP.AdmitAsER();
	}
	@Test (dataProvider = "getData")
	public void combinePay1(String TITLE ,String NAME ,String AGE ,String MBLNO,String MRNO , String ADDRESS ,String AADHAAR , String PROVIDER , String SERVICE) throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(8000); 
		
		FO_ERPatient_AdmitAsIP_YasassiWeb  ERIP = new FO_ERPatient_AdmitAsIP_YasassiWeb(driver);
		ERIP.patientInfo(MRNO, ADDRESS, AADHAAR);
		ERIP.transferToIP(MRNO, PROVIDER);
		ERIP.ServiceAdd(SERVICE);
	}
	
	
	
	@AfterClass
	
	public void logout() throws Exception
	{

		this.hm.clickLogout();
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("ER-IPAdmit");
		return data;	
	}
	
	
	
	
	
	
	
	

}

