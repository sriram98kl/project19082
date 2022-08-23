package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_Checklist_YasasiiWeb;
import pagesOfYasasiiWeb.EMR_ERBedAllocation;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_ChecklistTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void ERBirth(String NAME,String Ques) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMR_Checklist_YasasiiWeb Schedule1 = new EMR_Checklist_YasasiiWeb(driver);
		Schedule1.checklist(NAME,Ques);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("Checklist");
	return data;
}

}
