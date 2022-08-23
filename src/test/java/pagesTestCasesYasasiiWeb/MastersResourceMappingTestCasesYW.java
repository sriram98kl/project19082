package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersResouceMasterYasassiiWeb;
import pagesOfYasasiiWeb.MastersResourceMappingYasassiiWeb;

public class MastersResourceMappingTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateresoursemap() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(2000);
	
}

@Test
public void ResourseMap() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		
		MastersResourceMappingYasassiiWeb ResMap = new MastersResourceMappingYasassiiWeb(driver);
		ResMap.ResourceMasterSelect();
		}


@AfterClass
public void logout() throws Exception
{
	Thread.sleep(3000);
	this.hm.clickLogout();
}



}