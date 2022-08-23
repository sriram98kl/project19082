package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_PharmacyBilling_YasassiWeb;
import pagesOfYasasiiWeb.FO_SingleBill_MultipleServices_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_SingleBill_MultipleServices_TestCases_YW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver);
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000); 
	}

	

	@Test (dataProvider = "getData")
	public void singleBill(String MRNO , String PROVIDER , String SERVICE1 ,String  SERVICE2) throws InterruptedException, IOException, AWTException {
		FO_SingleBill_MultipleServices_YasassiWeb  multiserv = new   FO_SingleBill_MultipleServices_YasassiWeb(driver);
		multiserv.SingleBillforMultipleServices(MRNO, PROVIDER, SERVICE1, SERVICE2);
		
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		//Thread.sleep(2000);
		//this.hm.clickLogout();
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("multiService");
		return data;
		}
	
	
	
	
	
	
	
	

}