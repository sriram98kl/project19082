package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRBirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRNurseNoteYasasiiWeb;

public class EMRNurseNotTestCasesYasasiiWeb extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("nur01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData")
public void NurseNote(String MRNo,String URL) throws InterruptedException, IOException
{
	Thread.sleep(3000);
	
	EMRNurseNoteYasasiiWeb nurse = new EMRNurseNoteYasasiiWeb(driver);
	nurse.NurseNoteAction(MRNo);
	}

@AfterClass public void logout() throws Exception { 
	
	Thread.sleep(3000);
	  this.hm.clickLogout(); 
	  
}
	  
		
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("nurse");
	return data;
}

}
