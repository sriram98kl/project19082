package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.ER2OPRegistration;
import pagesOfYasasiiWeb.ERPatientYasasiiWeb;
import pagesOfYasasiiWeb.FOERPatientEncounterYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
import pagesOfYasasiiWeb.Outsiderappointment;

public class OutsiderPatientRegTestCases extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateERPage() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(4000);
		
		
	}
	@Test(dataProvider="getData",priority=0)
	public void outsideregistration(String firstnme,String secondname,String Age,String phone,String Homeaddress,String documnumber,String doctor,String MRNo,String provider,String Servicename,String cardname) throws InterruptedException, IOException {
		OutsiderPatientYasasiiWeb OSReg = new OutsiderPatientYasasiiWeb(driver) ;
		OSReg.Outsiderentry(firstnme,secondname,Age,phone);
		Outsiderappointment OSApp = new Outsiderappointment(driver);
		OSApp.Outsiderappointment(doctor);
		OSApp.encounterappCheckIn();
		OSReg.OutsiderRegistration(Homeaddress,documnumber,MRNo);
			}
	
	@Test(dataProvider="getData",priority=1)
	public void outsiderbilling(String firstnme,String secondname,String Age,String phone,String Homeaddress,String documnumber,String doctor,String MRNo,String provider,String Servicename,String cardname) throws InterruptedException, IOException {
		Outsiderappointment OSSReg = new Outsiderappointment(driver) ;
		OSSReg.outsiderpatientselection(secondname,MRNo);
	 //OSSReg.outsiderbilling(provider, Servicename);
	// OSSReg.card(cardname);
	 //OSSReg.savebill();
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("OutsiderPatientRegistration");
		return data;
	}


}
