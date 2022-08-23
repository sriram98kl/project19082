package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVImmunologyYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class IVImmunologyTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException 
	{
		
		
		IVImmunologyTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
		IVImmunologyTestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	    Thread.sleep(3000);
		
	}
	
	@Test (dataProvider="getData")
	public void immunology(String doctor,String id, String password,String Site,String MRNo,String MR1,String Immuno, String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException 
	{
		  Thread.sleep(3000);
      IVImmunologyYasasiiWeb OP = new IVImmunologyYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
	}
	@Test (dataProvider="getData")
	public void immunology1(String doctor,String id, String password,String Site,String MRNo,String MR1,String Immuno, String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException 
	{
		  Thread.sleep(3000);
		  FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		 	enc.takingEncounter(MRNo, doctor);
		
		 	LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		    log.action( id,  password, Site);
		    
		    IVImmunologyYasasiiWeb OP = new IVImmunologyYasasiiWeb(driver) ;
		    OP.immu( MRNo,MR1,Immuno);
		    
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  IVImmunologyTestCaseYW.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("Investigation Immunology");
				return data;
		  
	}
}