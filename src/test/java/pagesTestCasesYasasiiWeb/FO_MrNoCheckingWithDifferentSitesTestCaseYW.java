package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_ERBedAllocation;
import pagesOfYasasiiWeb.FO_MrNoCheckingWithDifferentSitesYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_MrNoCheckingWithDifferentSitesTestCaseYW extends TestBaseYasasiiWeb  {
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
public void ERBirth(String name,String myage, String phone, String docno,String myname,String myagea, String myphone, String mydocno,String MRNo1,String MRNo2) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		FO_MrNoCheckingWithDifferentSitesYasasiiWeb Schedule1 = new FO_MrNoCheckingWithDifferentSitesYasasiiWeb(driver);
		Schedule1.enterFOFullRegDetails(name, myage, phone, docno,MRNo1);
		Schedule1.NextSite(myname, myagea, myphone, mydocno,MRNo2);		
}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("MrNoChecking");
	return data;
}

}
