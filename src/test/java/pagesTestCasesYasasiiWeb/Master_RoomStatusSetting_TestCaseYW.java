package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersResourceCategoryYasassiiWeb;
import pagesOfYasasiiWeb.Masters_RoomStatusSetting_YasasiiWeb;

public class Master_RoomStatusSetting_TestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(2000);
	
}

@Test(dataProvider="getData")
public void Schedulesettings(String name,String selecttype,String wnnextacn) throws InterruptedException {
		Thread.sleep(2000);
		
		Masters_RoomStatusSetting_YasasiiWeb roomstatus = new Masters_RoomStatusSetting_YasasiiWeb(driver);
		roomstatus.action( name, selecttype, wnnextacn);
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("roomstatus");
	return data;

}
}
