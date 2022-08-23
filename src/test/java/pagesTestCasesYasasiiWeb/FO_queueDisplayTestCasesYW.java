package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.FO_queueDisplayYasassiweb;

public class FO_queueDisplayTestCasesYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(2000);
		
	}
	
	@Test(dataProvider="getData")
	public void  queuemaster (String MRNo,String URL)throws InterruptedException, IOException, AWTException {
			Thread.sleep(2000);
			
			FO_queueDisplayYasassiweb  token = new FO_queueDisplayYasassiweb(driver);
			token.tokenview(MRNo,URL);
			}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("juniorseniorVerify");
		return data;
		}

}