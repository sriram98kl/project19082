package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_ERBedAllocation;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersContainerYasassiiWeb;
import pagesOfYasasiiWeb.Masters_LocationMasterYasasiiWeb;

public class MastersLocationMasterTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void ERBirth(String countryname, String nationality, String countrycode, String phonecode, String phonedigit, String statename, String city) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		Masters_LocationMasterYasasiiWeb Schedule1 = new Masters_LocationMasterYasasiiWeb(driver);
		Schedule1.Location(countryname,nationality,countrycode,phonecode,phonedigit,statename,city);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("Locationmaster");
	return data;
}

}
