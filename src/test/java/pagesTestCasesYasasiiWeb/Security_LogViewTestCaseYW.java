package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_notesAuthorizationOfSeniorByJrDrYW;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersDisplayOrderYasassiWeb;
import pagesOfYasasiiWeb.Security_LogViewYassasiiWeb;

public class Security_LogViewTestCaseYW extends TestBaseYasasiiWeb  {
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
		
		Security_LogViewYassasiiWeb step= new Security_LogViewYassasiiWeb(driver);
		step.action();
		}




@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}



	
}