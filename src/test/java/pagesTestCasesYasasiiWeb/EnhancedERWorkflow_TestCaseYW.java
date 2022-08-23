package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EnhancedERWorkflow_YasassiWeb;
import pagesOfYasasiiWeb.FO_ADT_AdmissionEditingYasasiiWeb;
import pagesOfYasasiiWeb.FO_Copay_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EnhancedERWorkflow_TestCaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ; 
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(3000);
		
	}
	
	@Test (dataProvider = "getData")
	public void cpoeADMNSTN(String TITLE ,String NAME ,String AGE ,String MBLNO,String MRNo ,String SERVICE ,String medicine, String ADDRESS ,String AADHAAR,String AdmissionType,String doctor,String Prio,String ENCdoc,String DocID , String DOCPassword) throws AWTException, InterruptedException, IOException {
		EnhancedERWorkflow_YasassiWeb cpoe  =new  EnhancedERWorkflow_YasassiWeb(driver);
		cpoe.ERpatientAdmit(TITLE ,NAME,AGE,MBLNO);
		cpoe.encounter(ENCdoc);
	}
		
		@Test (dataProvider = "getData")
		public void doctor(String TITLE ,String NAME ,String AGE ,String MBLNO,String MRNo ,String SERVICE ,String medicine, String ADDRESS ,String AADHAAR,String AdmissionType,String doctor,String Prio,String ENCdoc,String DocID , String DOCPassword) throws AWTException, InterruptedException, IOException {
			EnhancedERWorkflow_YasassiWeb cpoe  =new  EnhancedERWorkflow_YasassiWeb(driver);
		cpoe.doctorNote(MRNo,SERVICE,  medicine);
		cpoe.admitASip(MRNo, ADDRESS, AADHAAR);
		
		
		
		
		FO_ADT_AdmissionEditingYasasiiWeb adt= new FO_ADT_AdmissionEditingYasasiiWeb(driver);
		adt.admit( MRNo, AdmissionType, doctor, Prio);
		
		
		cpoe.loggingout( DocID , DOCPassword);
		cpoe.cpoeAdministration(MRNo);
		
	}
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		//driver.quit();
	}
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("ER_CPOE");
		return data;	
	}
	
	

}
