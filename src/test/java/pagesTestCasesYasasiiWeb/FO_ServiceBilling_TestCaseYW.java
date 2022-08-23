package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_ServiceBilling_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_ServiceBilling_TestCaseYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000); 
	}
	
	@Test (dataProvider = "getData")
	public void billing(String MRNO, String CHEIFCOMPLAINT , String SERVICE,  String CARDNO , String APPROVENO,String URL) throws InterruptedException, IOException {
		Thread.sleep(2000); 
		
		FO_ServiceBilling_YasassiWeb bill = new FO_ServiceBilling_YasassiWeb(driver);
		bill.cpoeService(MRNO, CHEIFCOMPLAINT, SERVICE);
		bill.serviceBilling(MRNO, CARDNO, APPROVENO,URL);
		

	}
	
	@AfterClass
	public void logout() throws Exception
	{
		Thread.sleep(2000);
		this.hm.clickLogout();
		//this.hm.clickLogout();
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("serviceBilling");
		return data;	
	}
	

	
}