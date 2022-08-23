package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_DoctorNote_CategoryFilters_YasassiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.FO_combinationalPAY_DiscRaise_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class EMR_DoctorNote_CategoryFilters_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000); 
	}
	
	@Test (dataProvider = "getData")
	public void catFilter(String MRNo ,String MED1,String MED2, String MED3 ,String SERV1 ,String SERV2 ,String SERV3 , String SERV4 , String REMARKS,String doctor,String id, String password,String Site) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		
		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		enc.takingEncounter( MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb log= new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		Thread.sleep(2000); 
		EMR_DoctorNote_CategoryFilters_YasassiWeb  cat = new EMR_DoctorNote_CategoryFilters_YasassiWeb (driver);
		 
		cat.doctorNote(MRNo);
		cat.Cpoephar(MED1, MED2, MED3, REMARKS);
		cat.CpoeServ(SERV1, SERV2, SERV3, SERV4, REMARKS);     
		
	
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		//driver.quit();
		this.hm.clickLogout();
		//Thread.sleep(2000);
		//this.hm.clickLogout();
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("catFilter");
		return data;	
	}

}
