package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_SmartNoteYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersScheduleSettingsYasassiiWeb;

public class EMR_SmartNoteTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateMaster() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCJP", "Kameda123$", "KIMSHEALTH TVM");
	Thread.sleep(2000); 
	
}


@Test
   public void Schedulesettings() throws InterruptedException, IOException {
		Thread.sleep(1000);
		
		EMR_SmartNoteYasasiiWeb Schedule = new EMR_SmartNoteYasasiiWeb(driver);
		Schedule.smartnoteaction();
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


}
