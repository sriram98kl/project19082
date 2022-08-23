package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_VitalSignCategoryYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;


public class EMR_VitalSignCategoryTestCaseYW extends TestBaseYasasiiWeb  {
	
	public static LoginPageYasasiiWeb login;
    public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData")
public void emrvitals(String Test) throws InterruptedException {
		Thread.sleep(2000);
		
		EMR_VitalSignCategoryYasasiiWeb step = new EMR_VitalSignCategoryYasasiiWeb(driver);
		step.action(Test);
		}




@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("vitalTest");
	return data;	
}


}
