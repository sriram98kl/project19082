package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersRecommendDoseYasasiiWeb;
import pagesOfYasasiiWeb.MastersScheduleSettingsYasassiiWeb;

public class MastersScheduleSettingsTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateMaster() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000); 
	
}


@Test
   public void Schedulesettings() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		
		MastersScheduleSettingsYasassiiWeb Schedule = new MastersScheduleSettingsYasassiiWeb(driver);
		Schedule.ScheduleSelect();
		}


@AfterClass
public void logout() throws Exception
{
	Thread.sleep(1000);
	this.hm.clickLogout();
}


}
