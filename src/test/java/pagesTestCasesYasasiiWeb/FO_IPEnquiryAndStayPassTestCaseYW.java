package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_IPEnquiryAndStayPassYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersDisplayOrderYasassiWeb;

public class FO_IPEnquiryAndStayPassTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

@Test
public void displayorder() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		
		FO_IPEnquiryAndStayPassYasasiiWeb ip = new FO_IPEnquiryAndStayPassYasasiiWeb(driver);
		ip.action();
		ip.action2();
		ip.action3();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}



}
