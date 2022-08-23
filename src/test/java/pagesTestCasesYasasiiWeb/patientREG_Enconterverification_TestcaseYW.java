package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.patientREG_Enconterverification_yasassiWeb;

public class patientREG_Enconterverification_TestcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","kameda321","KIMSHEALTH TVM");
	Thread.sleep(2000); 
	}

	@Test (dataProvider = "getData")
	public void patientREG(String NAME1,String AGE,String MBLNO,String ORGANISATION,String ADDRESS,String AADHAAR1,String PROVIDER1, String USER1 , String PASSWORD1 , String NAME2 , String AADHAAR2 , String NAME3 , String AADHAAR3 , String NAME4 , String AADHAAR4 , String USER2 , String PASSWORD2 ,String PROVIDER2,  String MRNO1 ,String MRNO2,String MRNO3,String MRNO4) throws InterruptedException, IOException {
		
		patientREG_Enconterverification_yasassiWeb PV = new patientREG_Enconterverification_yasassiWeb(driver);
		PV.patientREG1(NAME1, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR1, PROVIDER1);
		PV.patientREG2(NAME2, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR2, PROVIDER1);
		PV.patientREG3(NAME3, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR3, PROVIDER2);
		PV.patientREG4(NAME4, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR4, PROVIDER2);
		
		}
	
	
//	@Test (dataProvider = "getData")
//	public void patientVerify(String NAME1,String AGE,String MBLNO,String ORGANISATION,String ADDRESS,String AADHAAR1,String PROVIDER1, String USER1 , String PASSWORD1 , String NAME2 , String AADHAAR2 , String NAME3 , String AADHAAR3 , String NAME4 , String AADHAAR4 , String USER2 , String PASSWORD2 ,String PROVIDER2,  String MRNO1 ,String MRNO2,String MRNO3,String MRNO4) throws InterruptedException, IOException {
//		
//		patientREG_Enconterverification_yasassiWeb PV = new patientREG_Enconterverification_yasassiWeb(driver);
//		PV.DoctorListVerify1(USER1, PASSWORD1, MRNO1, MRNO2,NAME1,NAME2);
//		PV.DoctorListVerify2(USER2, PASSWORD2, MRNO3, MRNO4,NAME3,NAME4);
//		
//	}
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	
	}

	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("patientVerify");
		return data;
		}
	

	
	
	
	
	
	
	

}
