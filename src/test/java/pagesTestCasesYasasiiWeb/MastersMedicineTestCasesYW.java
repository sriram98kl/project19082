package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersMedicinePageYasasiiWeb;


public class MastersMedicineTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
		
	@BeforeClass
	public void navigateMIPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	}
	
	@Test(dataProvider="getData")
	public void addmedicinecmaster(String Itemname,String expcondition,String testtype ) throws InterruptedException, IOException {
//		LoginPageYasasiiWeb addlogin=new LoginPageYasasiiWeb(driver);
//		HomePageYasasiiWeb home = addlogin.enterloginDetails(username, password, loginsite);
//		Thread.sleep(8000);
		MastersMedicinePageYasasiiWeb medmaster = new MastersMedicinePageYasasiiWeb(driver);
		medmaster.createmedicine(Itemname);
		
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

		Object[][] data =readExcel("MedicineMaster");
		return data;	
	}

}
