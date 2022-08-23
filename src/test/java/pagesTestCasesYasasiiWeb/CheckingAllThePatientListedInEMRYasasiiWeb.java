package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.CheckingWhetherPatientListedYasasiiWeb;
import pagesOfYasasiiWeb.EMRMedicationYasasiiWeb;
import pagesOfYasasiiWeb.EmployeeAuthorizationYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.FO_PatientRegistrationWithMandatoryFields;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;



public class CheckingAllThePatientListedInEMRYasasiiWeb  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	@Test(dataProvider="getData",priority=1)
	public void OP(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn,String MRNo,String doctor) throws InterruptedException, IOException {
		CheckingWhetherPatientListedYasasiiWeb OP = new CheckingWhetherPatientListedYasasiiWeb(driver) ;
		OP.EnterPatientDetails( Firstname, Lastname , Gender, Phoneno, Age, Documentno, HAddress, Organisatn);
		OP.returning();
	}
	
	
//	@Test (dataProvider="getData",priority=2)
	public void ENC(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn,String MRNo,String doctor) throws InterruptedException, IOException {
		FO_EncounterCreationScreenYasasiiWeb OP = new FO_EncounterCreationScreenYasasiiWeb(driver) ;
		OP.takingEncounter( MRNo, doctor );
	}
	
	
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}


@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("Checking");
		return data;

}
}
