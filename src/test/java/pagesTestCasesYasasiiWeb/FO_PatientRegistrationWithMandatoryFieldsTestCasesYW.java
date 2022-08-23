package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.FO_PatientRegistrationWithMandatoryFields;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_PatientRegistrationWithMandatoryFieldsTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	
	}
	@Test(dataProvider="getData")
	public void foReg(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String MRNo,String HAddress,String Organisatn) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		FO_PatientRegistrationWithMandatoryFields foReb = new FO_PatientRegistrationWithMandatoryFields(driver) ;
		foReb.EnterPatientDetails(Firstname,Lastname, Gender,Phoneno,Age,Documentno,HAddress,Organisatn);
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("RegistrationFirstNmae");
		return data;	
	}	
	
}
