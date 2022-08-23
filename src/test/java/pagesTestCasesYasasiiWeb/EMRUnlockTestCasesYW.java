package pagesTestCasesYasasiiWeb;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRDietNoteYasasiiWeb;
import pagesOfYasasiiWeb.EMRUnlockPageYasasiiWeb;





public class EMRUnlockTestCasesYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
	Thread.sleep(1000);
		
	}
	
	@Test
	public void OPEMR() throws InterruptedException, IOException {
		EMRUnlockPageYasasiiWeb OP = new EMRUnlockPageYasasiiWeb(driver) ;
		OP.unlock();
	}
		
	
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}
}
