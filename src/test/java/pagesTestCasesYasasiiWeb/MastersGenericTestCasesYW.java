package pagesTestCasesYasasiiWeb;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.ERADTYasasiiWeb;
import pagesOfYasasiiWeb.ERPatientYasasiiWeb;
import pagesOfYasasiiWeb.FOERPatientEncounterYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVSampleDespatch;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersGenericYasasiiWeb;

public class MastersGenericTestCasesYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateMSPage() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(2000);
		
	}
	
	@Test(dataProvider="getData")
	public void addgenericmaster(String genericname,String genericcode,String expcondition,String testtype ) throws InterruptedException, IOException {
			
			MastersGenericYasasiiWeb generic = new MastersGenericYasasiiWeb(driver);
	        generic.genericmedicinecreate(genericname,genericcode);
	       // generic.genericmedicinecreate2();
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

		Object[][] data =readExcel("GenericMaster");
		return data;	
	}

}


 
