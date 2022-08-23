package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_Copay_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_Copay_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(4000);
		
	}
	
	
	@Test(dataProvider = "getData") 
	public void copay(String NAME, String AGE, String MBLNO , String ORGANISATION , String ADDRESS  ,String AADHAAR ,String PROVIDER , String REFNO) throws AWTException, InterruptedException {
		FO_Copay_YasassiWeb ins =new FO_Copay_YasassiWeb(driver);
		ins.insuranceCopay(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, PROVIDER, REFNO);
		
		
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		//driver.quit();
	}
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("coPay");
		return data;	
	}

}
