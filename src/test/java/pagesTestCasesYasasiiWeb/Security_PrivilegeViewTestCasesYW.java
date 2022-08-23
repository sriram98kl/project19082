package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.BlockandFreezeYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Security_PrivilegeViewYasasiiWeb;

public class Security_PrivilegeViewTestCasesYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	}
//	
	@Test
	public void OPEMR() throws InterruptedException, IOException {
		Security_PrivilegeViewYasasiiWeb OP = new Security_PrivilegeViewYasasiiWeb(driver) ;
		OP.create();
	}
		
	
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}

}
