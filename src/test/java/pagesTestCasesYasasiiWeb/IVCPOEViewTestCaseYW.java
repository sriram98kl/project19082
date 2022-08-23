package pagesTestCasesYasasiiWeb;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVCPOEViewYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class IVCPOEViewTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
		IVCPOEViewTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
		IVCPOEViewTestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	@Test (dataProvider="getData")
	public void IVCPOE(String MRNo) throws InterruptedException, IOException {
		IVCPOEViewYasasiiWeb OP = new IVCPOEViewYasasiiWeb(driver) ;
		OP.CPOE(MRNo);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  IVCPOEViewTestCaseYW.hm.clickLogout(); 
		  
	}
	 
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("CPOE");
				return data;
		  
	}
}