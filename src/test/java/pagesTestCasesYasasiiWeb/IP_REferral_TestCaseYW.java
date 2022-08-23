package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IP_Referral_YasassiWeb;
import pagesOfYasasiiWeb.IVRepeatTestYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class IP_REferral_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	}
	
	
	
	@Test (dataProvider="getData" , priority=0)
	public void patientreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNo,String remarks ,String doctor,String id, String password,String Site, String adminid , String adminpassword  ) throws InterruptedException, IOException {
		
		
		IP_Referral_YasassiWeb  OP = new IP_Referral_YasassiWeb (driver) ;
		OP.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		
	}
	
		@Test (dataProvider="getData" , priority=1) 
	public void ref(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNo,String remarks ,String doctor,String id, String password,String Site, String adminid , String adminpassword  ) throws InterruptedException, IOException {
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		enc.takingEncounter(MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		IP_Referral_YasassiWeb  OP = new IP_Referral_YasassiWeb (driver) ;
		OP.DoctorReferral(MRNo, remarks);
		
		LogingOutAndLogingIn_YasasiiWeb log1 = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log1.action( adminid,  adminpassword, Site);
		
		OP.CheckIn(MRNo);
		
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("Referral");
				return data;
		  
	}
	
	
	

}
