package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.FOEMR_BirthRegTwoChildYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_BirthRegTwoChildTestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

@BeforeClass
public void foadt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("Admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(8000);
}



@Test(priority=1,dataProvider="getData")
public void addFOPatReg(String FirstName,String AadharNumber,String MRNo) throws InterruptedException, IOException {
	FOEMR_BirthRegTwoChildYasasiiWeb fopatReg = new FOEMR_BirthRegTwoChildYasasiiWeb(driver) ;
     fopatReg.Action1(FirstName,AadharNumber,MRNo);
     fopatReg.Secondbabyadd(FirstName,AadharNumber);
     fopatReg.Save();
	}
	
@Test(priority=2,dataProvider="getData")
	public void Two(String FirstName,String AadharNumber,String MRNo) throws InterruptedException, IOException {
		Thread.sleep(5000);
		FOEMR_BirthRegTwoChildYasasiiWeb Step1 = new FOEMR_BirthRegTwoChildYasasiiWeb(driver);
		Step1.Action2(FirstName,AadharNumber);
		Step1.Secondbabyadt(FirstName,AadharNumber);
		Step1.Babyadtlogoutin();
		Step1.Firstbabychart(FirstName,AadharNumber);
		Step1.secondbabychart(FirstName,AadharNumber);
		Step1.EMR_LogOut();
		
	}
	
@Test(priority=3,dataProvider="getData")
	public void Three(String FirstName,String AadharNumber,String MRNo) throws InterruptedException, IOException {
		Thread.sleep(5000);
		FOEMR_BirthRegTwoChildYasasiiWeb Step2 = new FOEMR_BirthRegTwoChildYasasiiWeb(driver);
		Step2.Action3(FirstName,AadharNumber);
	
		
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}


@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("BirthRegSenarios");
	return data;	
}



}
