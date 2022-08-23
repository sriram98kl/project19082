package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Security_GroupCreationYasasiiWeb;
import pagesOfYasasiiWeb.Security_ProfileCreationYasasiiWeb;

public class Security_ProfileCreationTestCasesYW extends TestBaseYasasiiWeb  {
	
	public static LoginPageYasasiiWeb login;
    public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000);
	
}

@Test
public void security() throws InterruptedException {
		Thread.sleep(2000);
		
		Security_ProfileCreationYasasiiWeb step = new Security_ProfileCreationYasasiiWeb(driver);
		step.action();
		}




@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


}
