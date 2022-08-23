package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_AdvanceSearchYasasiiWeb;
import pagesOfYasasiiWeb.FO_MandatoryFieldValidationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_AdvanceSearchTestCaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	
	}
	@Test(dataProvider="getData")
	public void foReg(String Criteria,String data,String criteria1,String daata2,String criteria3) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		FO_AdvanceSearchYasasiiWeb foReb = new FO_AdvanceSearchYasasiiWeb(driver) ;
		foReb.Advancesearch(Criteria,data,criteria1,daata2,criteria3);
		
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Advancesearch");
		return data;	
	}

}
