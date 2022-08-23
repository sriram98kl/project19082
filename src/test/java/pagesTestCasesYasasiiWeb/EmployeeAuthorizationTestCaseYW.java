package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRMedicationYasasiiWeb;
import pagesOfYasasiiWeb.EmployeeAuthorizationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;



public class EmployeeAuthorizationTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCJP", "Kameda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	@Test(dataProvider="getData")
	public void OPEMR(String search1,String dep) throws InterruptedException, IOException {
		EmployeeAuthorizationYasasiiWeb OP = new EmployeeAuthorizationYasasiiWeb(driver) ;
		OP.authorize(search1,dep);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}


@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("EmployeeAuthorization");
		return data;

}
}