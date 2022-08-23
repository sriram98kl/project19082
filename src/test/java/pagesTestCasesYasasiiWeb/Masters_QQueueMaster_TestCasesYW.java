package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Masters_QueueMaster_YasasiiWeb;
import pagesOfYasasiiWeb.Masters_RoomStatusSetting_YasasiiWeb;

public class Masters_QQueueMaster_TestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData")
public void queue(String name, String rowcont,String providernam,String RoomNo,String nurseroom) throws InterruptedException {
		Thread.sleep(2000);
		
		Masters_QueueMaster_YasasiiWeb roomstatus = new Masters_QueueMaster_YasasiiWeb(driver);
		roomstatus.queue(  name,  rowcont, providernam, RoomNo, nurseroom);
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("quemaster");
	return data;

}
}


