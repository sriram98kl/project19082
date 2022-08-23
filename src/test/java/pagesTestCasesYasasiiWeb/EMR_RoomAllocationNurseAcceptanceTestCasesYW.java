package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_RoomAllocationNurseAcceptanceYasasiiWeb;
import pagesOfYasasiiWeb.FO_ADT_AdmissionEditingYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class EMR_RoomAllocationNurseAcceptanceTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(2000);
		
	
	}
	
	@Test(dataProvider="getData")
	public void foReg(String MRNo,String AdmissionType,String doctor,String Prio,String remarks,String id, String password,String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		Thread.sleep(2000);
		
		EMR_RoomAllocationNurseAcceptanceYasasiiWeb trans = new EMR_RoomAllocationNurseAcceptanceYasasiiWeb(driver);
		trans.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
	
		
	}
	
	@Test(dataProvider="getData")
	public void tranfer(String MRNo,String AdmissionType,String doctor,String Prio,String remarks,String id, String password,String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		Thread.sleep(2000);
		
	  FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		 	enc.takingEncounter(MRNo, doctor);
		
		FO_ADT_AdmissionEditingYasasiiWeb foReb = new FO_ADT_AdmissionEditingYasasiiWeb(driver);
		foReb.admit(MRNo,AdmissionType,doctor,Prio);
		
//////////newtranfer
		EMR_RoomAllocationNurseAcceptanceYasasiiWeb trans = new EMR_RoomAllocationNurseAcceptanceYasasiiWeb(driver);
		trans.transfer();
	
	/////////logout and login as nurse	

		LogingOutAndLogingIn_YasasiiWeb logout=new LogingOutAndLogingIn_YasasiiWeb(driver);
		logout.action(id, password, Site);
		
////////////Accept the transfer		
		
		trans.nurseloginandAccept(MRNo);
		
		
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("roomTransfer");
		return data;	
	}


}
