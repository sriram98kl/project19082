package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRMedicationYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;



public class EMRMedicationTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	}
	
	@Test (dataProvider="getData" , priority=0)
	public void patientReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNo,String allergys,String editallergys,String deletere,String otheraller,String editdep,String edp,String sd,String cpoe1,String cpoe2,String cpoe3,String red,String cpoep,String rem,String cpoep2,String rem1,String ad1,String ad,String rm2,String side,String rm3,String p3,String p4,String rr,String re,String p5 , String doctor , String id, String password,String Site) throws InterruptedException, IOException {
		EMRMedicationYasasiiWeb OP = new EMRMedicationYasasiiWeb(driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
	}
	
	@Test (dataProvider="getData", priority=1)
	public void OPEMR(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNo,String allergys,String editallergys,String deletere,String otheraller,String editdep,String edp,String sd,String cpoe1,String cpoe2,String cpoe3,String red,String cpoep,String rem,String cpoep2,String rem1,String ad1,String ad,String rm2,String side,String rm3,String p3,String p4,String rr,String re,String p5, String doctor , String id, String password,String Site) throws InterruptedException, IOException {
		
		
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		 	enc.takingEncounter(MRNo, doctor);
		
		 	LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		    log.action( id,  password, Site);
		
		EMRMedicationYasasiiWeb OP = new EMRMedicationYasasiiWeb(driver) ;
		OP.medication( MRNo,allergys,editallergys,deletere,otheraller,editdep,edp,sd,cpoe1,cpoe2,cpoe3,red,cpoep,rem,cpoep2,rem1,ad1,ad,rm2,side,rm3,p3,p4,rr,re,p5);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
		  
	}
		   
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("EMROPNote");
				return data;
		  
	}
}
