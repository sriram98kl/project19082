package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Masters_CateoryMaster_YasasiiWeb;
import pagesOfYasasiiWeb.Masters_LocationMasterYasasiiWeb;

public class Masters_CategoryMaster_TestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void ERBirth(String name,String ERPCode,String parentcategory,String subcategory, String eRpcode) throws InterruptedException, IOException {
		Thread.sleep(2000);
		
		Masters_CateoryMaster_YasasiiWeb category = new Masters_CateoryMaster_YasasiiWeb(driver);
		category.categryrootmaster(name,ERPCode);
		category.creatingsubcategorymaster( parentcategory, subcategory,  eRpcode);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("categorymaster");
	return data;
}

}
