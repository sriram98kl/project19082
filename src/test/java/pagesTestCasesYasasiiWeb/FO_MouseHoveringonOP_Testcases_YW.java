package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_MouseHoveringonOP_yasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;


public class FO_MouseHoveringonOP_Testcases_YW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000); 
	}

	

	@Test (dataProvider = "getData")
	public void mouseOver(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String PROVIDER,String SERVICE) throws InterruptedException, IOException {
		 FO_MouseHoveringonOP_yasassiWeb MV =new  FO_MouseHoveringonOP_yasassiWeb(driver);
		 
		 MV.PatientReg( NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
			MV.Encounter(PROVIDER);
			MV.admit(PROVIDER , SERVICE);
		Thread.sleep(4000); 
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

		Object[][] data =readExcel("mousehover");
		return data;	
	}
	
}
