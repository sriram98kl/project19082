package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterTypes_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
//import pagesOfYasasiiWeb.PatientDischarge_YasassiWeb;

public class FO_EncounterTypes_TestCases_YW extends TestBaseYasasiiWeb{
	
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000); 
	}
	
	@Test (dataProvider = "getData")
	public void EncType (String TITLE ,String NAME , String AGE , String MBLNO ,String PROVIDER) throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(2000); 
		
		FO_EncounterTypes_YasassiWeb ET = new FO_EncounterTypes_YasassiWeb(driver);
		ET.ERpatientReg(TITLE, NAME, AGE, MBLNO);
		ET.ERencounter(PROVIDER);
		ET.opencounter();
		
	
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		
		this.hm.clickLogout();
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("EncTypes");
		return data;	
	} 

	
	
	
	
	

}
