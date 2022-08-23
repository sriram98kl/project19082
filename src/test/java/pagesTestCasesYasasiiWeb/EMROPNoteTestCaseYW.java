package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVRepeatTestYasasiiWeb;
import pagesOfYasasiiWeb.IVSampleDespatch;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;
import pagesOfYasasiiWeb.EMRCPOEAdminstrationYasasiiWeb;
import pagesOfYasasiiWeb.EMROPNoteYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
import pagesOfYasasiiWeb.Outsiderappointment;

public class EMROPNoteTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000);
		
	}
	
	
	
//	@Test (dataProvider="getData" , priority=0)
	public void patientReg(String MRNo ,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String doctor,String id, String password,String Site) throws InterruptedException, IOException {
		
		
		IVRepeatTestYasasiiWeb OP = new IVRepeatTestYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		
	}
	
	
	@Test(dataProvider="getData" , priority=1)
	public void OPEMR(String MRNo ,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String doctor,String id, String password,String Site) throws InterruptedException, IOException {
		
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		//enc.takingEncounter(MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		EMROPNoteYasasiiWeb OP = new EMROPNoteYasasiiWeb(driver) ;
		OP.OP_EMRReg(MRNo);
	}
		
	@Test(dataProvider="getData" , priority=2)
	   public void cpoeadmin(String MRNo ,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String doctor,String id, String password,String Site) throws InterruptedException {
			Thread.sleep(2000);
			
			EMRCPOEAdminstrationYasasiiWeb admin = new EMRCPOEAdminstrationYasasiiWeb(driver);
	        admin.EMRCPOE(MRNo);
			}
			
		
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("opNote");
		return data;	
	}
}
