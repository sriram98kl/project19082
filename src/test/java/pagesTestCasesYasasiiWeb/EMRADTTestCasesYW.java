package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRADTTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("DOCAS", "Kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData")
public void EMRADT(String firstname,String gender,String age,String encounter,String MRNo , String docnomb) throws InterruptedException {
		Thread.sleep(2000);
		
		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
		Schedule.AdtSelectionn(firstname,gender,age,encounter,MRNo);
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("ERPatientFlow");
	return data;
}




}
