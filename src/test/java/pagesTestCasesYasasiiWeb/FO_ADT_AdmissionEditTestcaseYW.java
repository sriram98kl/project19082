package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_ADT_AdmissionEditingYasasiiWeb;
import pagesOfYasasiiWeb.FO_MandatoryFieldValidationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_ADT_AdmissionEditTestcaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(2000);
		
	
	}
	@Test(dataProvider="getData")
	public void foReg(String MRNo,String AdmissionType,String doctor,String Prio,String remarks, String id, String password, String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		FO_ADT_AdmissionEditingYasasiiWeb foReb = new FO_ADT_AdmissionEditingYasasiiWeb(driver);
		foReb.admit(MRNo,AdmissionType,doctor,Prio);
		foReb.edit(remarks,MRNo);
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("FOAdmission");
		return data;	
	}


}
