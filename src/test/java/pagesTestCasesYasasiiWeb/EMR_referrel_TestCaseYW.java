package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_queueDisplayYasassiweb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_referrel_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(4000);
		
	}
	
	@Test(dataProvider="getData")
	public void  referral (String MRNo)throws InterruptedException, IOException, AWTException {
			Thread.sleep(2000);
			
			
			}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Referral");
		return data;
		}

}
