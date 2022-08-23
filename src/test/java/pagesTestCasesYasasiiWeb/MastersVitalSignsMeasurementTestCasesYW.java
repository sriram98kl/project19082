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
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Masters_VitalMeasurementandSign;

public class MastersVitalSignsMeasurementTestCasesYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(4000);
	
}
@Test(dataProvider="getData")
public void Vital(String ServiceName,String Data1,String Value1,String Score1,String Data2,String Value2,String Score2,String ScoreName1,String From1,String To1,String ScoreName2,String From2,String To2) throws InterruptedException, IOException, AWTException
{
	Thread.sleep(5000);
	
	Masters_VitalMeasurementandSign vtls = new Masters_VitalMeasurementandSign(driver);
	vtls.VitalAction(ServiceName,Data1,Value1,Score1,Data2,Value2,Score2,ScoreName1,From1,To1,ScoreName2,From2,To2);
	}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("VtalSignsAndMeasurement");
	return data;	
}
}
