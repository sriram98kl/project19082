package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;


import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Security_GroupCreationYasasiiWeb;

public class Security_GroupCreationTestCaseYW extends TestBaseYasasiiWeb  {
	
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
		Thread.sleep(3000);
		
		Security_GroupCreationYasasiiWeb step = new Security_GroupCreationYasasiiWeb(driver);
		step.action();
		}




@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}




}