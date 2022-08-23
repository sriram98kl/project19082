package pagesTestCasesYasasiiWeb;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
//import pagesOfYasasiiWeb.IVSampleDespatch;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRDietNoteYasasiiWeb;
//import pagesOfYasasiiWeb.EMRCPOEAdminstrationYasasiiWeb;
//import pagesOfYasasiiWeb.EMROPNoteYasasiiWeb;
//import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
//import pagesOfYasasiiWeb.Outsiderappointment;

public class EMRDietNoteTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("diet01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(1000);
		
	}
	
	@Test(dataProvider="getData")
	public void OPEMR(String MRNO) throws InterruptedException, IOException {
		EMRDietNoteYasasiiWeb OP = new EMRDietNoteYasasiiWeb(driver) ;
		OP.Diet(MRNO);
	}
		
	
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}

@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("dietnote");
		return data;
	}
}

