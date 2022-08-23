package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_ERBedAllocation;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Security_UserCreationYasasiiWeb;

public class Security_UserCreationTestcaseYW extends TestBaseYasasiiWeb  {
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
public void ERBirth(String firstname,String userid, String passwrd,String Phone,String Dept,String desig,String email,String designation,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Security_UserCreationYasasiiWeb Schedule2 = new Security_UserCreationYasasiiWeb(driver);
		Schedule2.create( firstname,userid,passwrd,Phone,Dept,desig,email,Site);
		Schedule2.designationcreation(firstname,email,designation);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("UserCreation");
	return data;
}


}
