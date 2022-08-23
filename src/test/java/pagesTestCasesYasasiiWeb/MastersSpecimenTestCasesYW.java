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
import pagesOfYasasiiWeb.MastersSpecimenYasassiWeb;

public class MastersSpecimenTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

	
	
	@BeforeClass
	public void navigateMasterSpecimenPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000);
		
	}
	
	
	@Test(dataProvider="getData")
	public void addspecimn(String specimenname)throws InterruptedException, IOException {
		MastersSpecimenYasassiWeb specimenName = new MastersSpecimenYasassiWeb(driver) ;
		specimenName.SpecimenMasterSelect(specimenname);
	}
		
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("SpecimenMaster");
		return data;	
	}
	
	
}