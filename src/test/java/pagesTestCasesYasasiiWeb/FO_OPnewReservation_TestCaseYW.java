package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_OPnewResevationYasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_OPnewReservation_TestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(2000);
		
	
	}
	@Test(dataProvider="getData")
	public void reservation(String MRNo,String doctor , String Prio ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		FO_OPnewResevationYasassiWeb res = new FO_OPnewResevationYasassiWeb(driver);
		
		res.Reservation(MRNo,doctor,Prio);
		
		
		
		
	
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("reservation");
		return data;	
	}
}
