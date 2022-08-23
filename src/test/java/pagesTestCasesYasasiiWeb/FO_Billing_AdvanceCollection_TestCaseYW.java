package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_Billing_AdvanceCollection_YasasiiWeb;
import pagesOfYasasiiWeb.FO_SelectPatientAndCheckin_YasasiiWeb;
import pagesOfYasasiiWeb.FO_ServiceBillingYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class FO_Billing_AdvanceCollection_TestCaseYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateERPage() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(4000);
		
		
	}
//	@Test(dataProvider="getData")
	public void outsideregistration(String Providername, String service,String selectcategory,String Amount,String SErvice,String MRNo,String authorisername,String remarks,String id, String password,String Site) throws InterruptedException, IOException {
		
		
		
		FO_SelectPatientAndCheckin_YasasiiWeb patient = new FO_SelectPatientAndCheckin_YasasiiWeb(driver);
		patient.selectPatient(MRNo);
		
		FO_Billing_AdvanceCollection_YasasiiWeb OSReg = new FO_Billing_AdvanceCollection_YasasiiWeb(driver) ;
		OSReg.billing( Providername,  service, selectcategory, Amount);
		OSReg.save();
		OSReg.advanceview();
		OSReg.advanceutilizing( Providername, SErvice);
		OSReg.wallet();
		}
///////////Advance refunding	
	
	@Test(dataProvider="getData")
	public void advancerefund(String Providername, String service,String selectcategory,String Amount,String SErvice,String MRNo,String authorisername,String remarks,String id, String password,String Site) throws InterruptedException, IOException {
		
		
		
		FO_SelectPatientAndCheckin_YasasiiWeb patient = new FO_SelectPatientAndCheckin_YasasiiWeb(driver);
		patient.selectPatient(MRNo);
		
		FO_Billing_AdvanceCollection_YasasiiWeb OSReg = new FO_Billing_AdvanceCollection_YasasiiWeb(driver) ;
		OSReg.billing( Providername,  service, selectcategory, Amount);
		OSReg.save();
		OSReg.advanceview();
///////request for refund
	    OSReg.refund(authorisername, remarks);
	
/////logout from admin and log in as doctor to accept the refund request	    
	    
	    LogingOutAndLogingIn_YasasiiWeb loginout=new LogingOutAndLogingIn_YasasiiWeb(driver);
		loginout.action( id,  password, Site);
		
///////request accept		
		OSReg.requestaccept();
	
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("Advance");
		return data;
	}

	
	
	
	
}
