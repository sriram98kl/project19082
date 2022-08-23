package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.IPAdvancePayBilling_yasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class IPAdvancepayBilling_TestCase_YW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(4000);
		
	}
	
	
	
	@Test (dataProvider = "getData") 
	
	public void AdvancePay(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String PROVIDER ,String SERVICE) throws InterruptedException, AWTException {
		
		IPAdvancePayBilling_yasassiWeb AP = new IPAdvancePayBilling_yasassiWeb (driver);
		
		AP.PatientReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		AP.Encounter(PROVIDER);
		AP.admit(PROVIDER);
	}
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		//driver.quit();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("advancePay");
		return data;	
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
