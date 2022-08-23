package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_combinationalPAY_DiscRaise_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_combinationalPAY_Discprice_TestcaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000); 
	}
	
	@Test (dataProvider = "getData")
	public void combinePay(String MRNO , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		
		FO_combinationalPAY_DiscRaise_YasassiWeb  com = new FO_combinationalPAY_DiscRaise_YasassiWeb (driver);
		com.combpay(MRNO, PROVIDER, ADJAMOUNT, CARDAMOUNT, CARDNO, APPROVENO, AUTHPERSON, REMARK1, REMARK2,URL);
		
		
	
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

		Object[][] data =readExcel("combinational pay");
		return data;	
	}
	
	
	
	
	
	

}
