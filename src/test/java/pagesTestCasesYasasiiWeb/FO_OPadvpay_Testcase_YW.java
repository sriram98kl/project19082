package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_MouseHoveringonOP_yasassiWeb;
import pagesOfYasasiiWeb.FO_OPadvpay_yasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_OPadvpay_Testcase_YW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000); 
	}


	@Test (dataProvider = "getData", priority=0)
	public void patreg(String MRNO , String PROVIDER ,String SERVICE1, String AMOUNT ,String SERVICE2,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR) throws InterruptedException, IOException {
		FO_OPadvpay_yasassiWeb opadv=new  FO_OPadvpay_yasassiWeb(driver);
		 
		
		opadv.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		
		//opadv.opAdvpay(MRNO, PROVIDER, SERVICE1, AMOUNT, SERVICE2);
		
		
	
	}
	
	
	

	@Test (dataProvider = "getData",priority=1)
	public void OPAdvancewallet(String MRNO , String PROVIDER ,String SERVICE1, String AMOUNT ,String SERVICE2,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR) throws InterruptedException, IOException {
		
		
		FO_OPadvpay_yasassiWeb opadv=new  FO_OPadvpay_yasassiWeb(driver);
		 
		
	//	opadv.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		
		opadv.opAdvpay(MRNO, PROVIDER, SERVICE1, AMOUNT, SERVICE2);
		
		
	
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

		Object[][] data =readExcel("opAdvWallet");
		return data;
		}
	}