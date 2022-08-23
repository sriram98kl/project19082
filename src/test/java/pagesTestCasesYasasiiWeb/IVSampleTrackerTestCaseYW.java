package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVSampleTrackerYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class IVSampleTrackerTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	   
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	IVSampleTrackerTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
	IVSampleTrackerTestCaseYW.hm = login.enterloginDetails("admin", "kameda321","KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	@Test (dataProvider="getData" , priority=0)
	public void IVSampletracker1(String doctor,String id, String password,String Site,String MRNo,String MR1,String resultvalue,String resultvaluecri,String reason , String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String Sampleno ) throws InterruptedException, IOException {
				
		IVSampleTrackerYasasiiWeb OP = new IVSampleTrackerYasasiiWeb(driver) ;
		
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		
	}
	
	
	
	@Test (dataProvider="getData" ,  priority=1)
	public void IVSampletracker(String doctor,String id, String password,String Site,String MRNo,String MR1,String resultvalue,String resultvaluecri,String reason ,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String Sampleno ) throws InterruptedException, IOException {
		 FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
			enc.takingEncounter(MRNo, doctor);
				
			LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		    log.action( id,  password, Site);
		
		IVSampleTrackerYasasiiWeb OP = new IVSampleTrackerYasasiiWeb(driver) ;
		OP.Invest(MRNo,MR1,resultvalue,resultvaluecri,reason);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  IVSampleTrackerTestCaseYW.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("Investigation");
				return data;
		  
	}
}