package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVRedoRequestYasasiiWeb;
import pagesOfYasasiiWeb.IVRepeatTestYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class IVRepeatTestTestCaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
		IVRepeatTestTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
		IVRepeatTestTestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000);
		
	}
	
	
	
	@Test (dataProvider="getData" , priority=0)
	public void IVRepeat1(String doctor,String id, String password,String Site,String MRNo,String MR1,String reason,String remarks , String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		
		IVRepeatTestYasasiiWeb OP = new IVRepeatTestYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		
	}
	
		@Test (dataProvider="getData" , priority=1)
	public void IVRepeat(String doctor,String id, String password,String Site,String MRNo,String MR1,String reason,String remarks ,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR  ) throws InterruptedException, IOException {
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		enc.takingEncounter(MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		IVRepeatTestYasasiiWeb OP = new IVRepeatTestYasasiiWeb(driver) ;
		OP.Repeat(MRNo,MR1,reason,remarks);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  IVRepeatTestTestCaseYW.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("InvestigationRepeat");
				return data;
		  
	}
}