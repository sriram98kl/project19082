package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;


public class FORegTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	
	}
	@Test(dataProvider="getData")
	public void addFOReg(String firstname,String lastname ,String gender,String age,String phoneno,String homeadd1,String homeadd2,String docnumber,String provencounter,String altphoneno,String expcondition,String testtype) throws InterruptedException, IOException {
		FORegistrationYasasiiWeb foReg = new FORegistrationYasasiiWeb(driver) ;
		FOEncounterYasasiiWeb foenc = foReg.enterFORegDetails(firstname,lastname, gender, age,phoneno,homeadd1,homeadd2,docnumber);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		FORegEditYasasiiWeb foedit =foenc.Foencounter(provencounter);
		foedit.FOEditYasasiiWeb(altphoneno);
		
		  String actcondition = driver.getCurrentUrl(); 
		
		  switch(testtype) { 
		  
		  case "positive": {
			  
			  Assert.assertTrue(actcondition.contains(expcondition));
		      break;
		  		  
		  }
		  
		  case "negative":
			  
				/*
				 * if (expcondition.equalsIgnoreCase("Only 9 numbers allowed")) {
				 * 
				 * 
				 * } else if (expcondition.equalsIgnoreCase("Block")) {
				 * 
				 * 
				 * }
				 * 
				 * else
				 * if(expcondition.equalsIgnoreCase("This document is already exist for ")){
				 * 
				 * Action
				 * 
				 * } else {
				 * 
				 * }
				 */
		  
		  //Assert.assertTrue(foReg.isFOwarningPresent1()); 
		  break;
		  
          case "Block": 
          {
			  
        	  Assert.assertTrue(actcondition.contains(expcondition));
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

		Object[][] data =readExcel("FORegTestCasesYW");
		return data;	
	}


}
