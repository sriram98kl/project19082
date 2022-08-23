package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_PatientRegistrationWithMandatoryFields;
import pagesOfYasasiiWeb.FO_ServiceBillingYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
import pagesOfYasasiiWeb.Outsiderappointment;

public class FO_AllTypesBill_TestCaseYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateERPage() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(3000);
		
		
	}
	@Test(dataProvider="getData")
	public void outsideregistration(String Providername, String service,String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn,String MRNo) throws InterruptedException, IOException {
		
		
		FO_ServiceBillingYasasiiWeb OSReg = new FO_ServiceBillingYasasiiWeb(driver) ;
		//OSReg.EnterPatientDetails(Firstname, Lastname, Gender, Phoneno, Age, Documentno, HAddress, Organisatn);
		OSReg.billing(MRNo,  Providername,  service);
		OSReg.save();
		
		}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("AllTypeServiceBill");
		return data;
	}
}
