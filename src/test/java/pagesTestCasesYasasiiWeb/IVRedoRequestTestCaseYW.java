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
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class IVRedoRequestTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
		IVRedoRequestTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
		IVRedoRequestTestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	
	@Test (dataProvider="getData" , priority=0)
	public void IVRedo1(String doctor,String id, String password,String Site,String MRNo,String MR1,String reason,String remarks,String resultvalue,String add,String unauthorized,String newvalue , String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		
		IVRedoRequestYasasiiWeb OP = new IVRedoRequestYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		}
	

	@Test (dataProvider="getData" , priority=1)
	public void IVRedo(String doctor,String id, String password,String Site,String MRNo,String MR1,String reason,String remarks,String resultvalue,String add,String unauthorized,String newvalue , String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
   enc.takingEncounter(MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		IVRedoRequestYasasiiWeb OP = new IVRedoRequestYasasiiWeb(driver) ;
		OP.Redo(MRNo,MR1,reason,remarks,resultvalue,add,unauthorized,newvalue);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		IVRedoRequestTestCaseYW.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("InvestigationRedo");
				return data;
		  
	}
}