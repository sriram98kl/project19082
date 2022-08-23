package pagesTestCasesYasasiiWeb;



import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVPanelServiceYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class IVPanelServiceTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
		IVPanelServiceTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
		IVPanelServiceTestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	}
	@Test (dataProvider="getData" , priority=0)
	public void IVPanel1 (String MRNo,String MR1,String panel,String doctor,String id, String password,String Site,String r1,String r2,String r3,String r4,String r5,String r6, String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		
		IVPanelServiceYasasiiWeb OP = new IVPanelServiceYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
	}
	
	
	
	@Test (dataProvider="getData" , priority=1)
	public void IVPanel(String MRNo,String MR1,String panel,String doctor,String id, String password,String Site,String r1,String r2,String r3,String r4,String r5,String r6, String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		enc.takingEncounter(MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		IVPanelServiceYasasiiWeb OP = new IVPanelServiceYasasiiWeb(driver) ;
		OP.pan( MRNo,MR1,panel,r1,r2,r3,r4,r5,r6);
		
	}
	
		
	@AfterClass public void logout() throws Exception { 
		IVPanelServiceTestCaseYW.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("Panel");
				return data;
		  
	}
}