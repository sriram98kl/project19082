package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FOAppointment;
import pagesOfYasasiiWeb.FOAppointmentCheckIn;
import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FOFullPatientRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FOFullRegTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	//Register patient, Make appoinment and then check in
	@Test(dataProvider="getData")
	public void addFOFullReg(String firstname,String middlename,String lastname ,String age,String phoneno,String altphoneno,String homeadd1,String homeadd2,String docnumber,String expcondition,String testtype,String MRNo,String familyName,String Organisatin,String mail,String relatedMR ) throws InterruptedException, IOException, AWTException {
		
		
		
		FOFullPatientRegistrationYasasiiWeb foRegfull = new FOFullPatientRegistrationYasasiiWeb (driver) ;
		//foRegfull.enterFOFullRegDetails(firstname,middlename,lastname,age,phoneno,altphoneno,homeadd1,homeadd2,docnumber);
		foRegfull.enterFOFullRegDetails(firstname,middlename,lastname,age,phoneno,altphoneno);
		foRegfull.enterFOpatientInfDetails(familyName,Organisatin);
		foRegfull.enterFOcontactInfDetails(homeadd1,homeadd2,mail);
		foRegfull.enterFOdocumentInfDetails(Keys.HOME + docnumber);
		foRegfull.enterFORelatedMrnoDetails(relatedMR);
		foRegfull.enterFOdocumentDetails();
		foRegfull.enterFOremarksDetails();
		FOAppointment FOapp = new FOAppointment(driver);
		FOapp.Outsiderappointment();
		FOapp.encounterCheckIn();
		//FOAppointmentCheckIn FOcheckin = new FOAppointmentCheckIn(driver);
		//FOcheckin.encounterappCheckIn();
		
		  String actcondition = driver.getCurrentUrl(); 
		
		  switch(testtype) { 
		  
		  case "positive": {
			  
			  Assert.assertTrue(actcondition.contains(expcondition));
		      break;
		  		  
		  }
		  
		  case "negative":
		  {
				
		  break;
		 
		  }
		  default: System.out.println("Condition not implemented");
		  
		  }
		 
		
		}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("FOFullRegTest");
		return data;	
	}


}
