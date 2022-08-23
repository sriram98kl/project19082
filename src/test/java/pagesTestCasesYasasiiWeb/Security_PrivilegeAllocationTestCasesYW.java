package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Security_PrivilegeAllocationYasasiiWeb;
import pagesOfYasasiiWeb.Security_UserCreationYasasiiWeb;

public class Security_PrivilegeAllocationTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void ERBirth(String name) throws InterruptedException, IOException {
		Thread.sleep(2000);
		
		Security_PrivilegeAllocationYasasiiWeb Schedule2 = new Security_PrivilegeAllocationYasasiiWeb(driver);
		Schedule2.create(name);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("PriviledgeAllocation");
	return data;
}



}
