package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVAdditionalTestYasasiiWeb;
import pagesOfYasasiiWeb.IVImmunologyYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class IVAdditionalTestTestCasesYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
		IVAdditionalTestTestCasesYW.login =new LoginPageYasasiiWeb(driver) ;
		IVAdditionalTestTestCasesYW.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(2000);
		
	}
	
	@Test (dataProvider="getData" , priority=0)
	public void additional(String MRNo,String MR1,String doctor,String id, String password,String Site,String re,String doc,String readditional,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException 
	{
		  Thread.sleep(3000);
		  IVAdditionalTestYasasiiWeb OP = new IVAdditionalTestYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
	}
	
	@Test (dataProvider="getData" , priority=1)
	public void IV(String MRNo,String MR1,String doctor,String id, String password,String Site,String re,String doc,String readditional,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		enc.takingEncounter(MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		IVAdditionalTestYasasiiWeb OP = new IVAdditionalTestYasasiiWeb(driver) ;
		OP.Additional( MRNo,MR1,re,doc,readditional);
		
	}
	
		
	@AfterClass public void logout() throws Exception { 
		IVAdditionalTestTestCasesYW.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("Add");
				return data;
		  
	}
}