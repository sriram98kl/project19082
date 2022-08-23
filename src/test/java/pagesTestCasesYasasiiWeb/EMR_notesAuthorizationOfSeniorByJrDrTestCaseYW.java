package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRDoctorsNote;
import pagesOfYasasiiWeb.EMRDoctorsNoteSOAPYasasiiWeb;
import pagesOfYasasiiWeb.EMRHSLogYasasiiWeb;
import pagesOfYasasiiWeb.EMRHomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMR_notesAuthorizationOfSeniorByJrDrYW;
import pagesOfYasasiiWeb.EMReditDoctorsNoteYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_notesAuthorizationOfSeniorByJrDrTestCaseYW extends TestBaseYasasiiWeb {

	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm; 

	@BeforeClass
	public void navigateEMRPage() throws InterruptedException {

		this.login = new LoginPageYasasiiWeb(driver);
		this.hm = login.enterloginDetails("jur01", "KAmeda123$", "KIMSHEALTH TVM");
		Thread.sleep(4000);
 
	}

	@Test(dataProvider="getData")
	public void EMRscreen(String MRNO,String URL) throws InterruptedException, IOException {
		EMR_notesAuthorizationOfSeniorByJrDrYW doctorAuth = new EMR_notesAuthorizationOfSeniorByJrDrYW (driver);
		doctorAuth.authorization(MRNO);
//		doctorAuth.medicalhistory();
//		doctorAuth.vitals();
//		doctorAuth.allergy();
//		doctorAuth.clinicalwarning();
//		doctorAuth.diagnosisandplan();
		doctorAuth.cpoeservice();
		doctorAuth.cpoepharmacy();
		doctorAuth.filtering();		
		
	}
	
	
	  @AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
		  }
	  
	 

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("juniorseniorVerify");
		return data;
	}

}
