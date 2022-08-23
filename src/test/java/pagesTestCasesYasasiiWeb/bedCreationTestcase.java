package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersServiceYasasiiWeb;
import pagesOfYasasiiWeb.bedCreation;

public class bedCreationTestcase extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateMasterServicePage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	
	}
	@Test//(dataProvider="getData")
	public void addservice()throws InterruptedException, IOException {
		
		
		 bedCreation BC =new  bedCreation(driver);
		 BC.bed();
		
		}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


//	@DataProvider
//	public Object[][] getData() throws Exception{
//
//		Object[][] data =readExcel("ServiceMaster");
//		return data;	
//	}
	
	

}
