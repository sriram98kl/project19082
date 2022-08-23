package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRJuniourSeniourDoctorVerificationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMRJuniourSeniourDoctorVerificationYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRNurseNoteYasasiiWeb;


public class EMRJuniorSeniorDoctorVerificationTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("jur01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(3000);
	
}
@Test(dataProvider="getData")
public void NurseNote(String MRNo, String DOCid, String Password,String URL) throws InterruptedException, IOException, AWTException
{
	Thread.sleep(2000);
	
	EMRJuniourSeniourDoctorVerificationYasasiiWeb junoiur = new EMRJuniourSeniourDoctorVerificationYasasiiWeb(driver);
	junoiur.JuniourSeniorDoctorAction(MRNo);
	junoiur.DoctorVerify(MRNo,DOCid,  Password, URL);
	
	}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("jun-sen-doc");
	return data;	
}


}
