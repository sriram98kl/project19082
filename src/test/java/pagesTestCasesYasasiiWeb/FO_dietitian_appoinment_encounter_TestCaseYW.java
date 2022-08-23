package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_DietitianTemplateTestCaseYW;
import pagesOfYasasiiWeb.FO_ADT_AdmissionEditingYasasiiWeb;
import pagesOfYasasiiWeb.FO_Dietitian_Appoinment_Encounter_YasasiiWeb;
import pagesOfYasasiiWeb.FO_PatientRegistrationWithMandatoryFields;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class FO_dietitian_appoinment_encounter_TestCaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	
	}
	
	
	@Test(dataProvider="getData")
	public void foREg(String MRNo,String providername,String id, String password,String Site,String fever,String selecttemplate,String alergy,String Height,String Weight,String rulename,String icd,String ruleName,String servicename,String dept,String templt,String templt1,String providerName, String templt3,String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn) throws InterruptedException, IOException {
		Thread.sleep(2000);
		
		FO_Dietitian_Appoinment_Encounter_YasasiiWeb foReB = new FO_Dietitian_Appoinment_Encounter_YasasiiWeb(driver);
		foReB.EnterPatientDetails(Firstname,Lastname, Gender,Phoneno,Age,Documentno,HAddress,Organisatn);
	}
		
	
	
	
	
	@Test(dataProvider="getData")
	public void foReg(String MRNo,String providername,String id, String password,String Site,String fever,String selecttemplate,String alergy,String Height,String Weight,String rulename,String icd,String ruleName,String servicename,String dept,String templt,String templt1,String providerName, String templt3,String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		FO_Dietitian_Appoinment_Encounter_YasasiiWeb foReb = new FO_Dietitian_Appoinment_Encounter_YasasiiWeb(driver);
	foReb.dietitian(MRNo);
	foReb.encounterCheckIn();
	foReb.encounter(providername);
		
	LogingOutAndLogingIn_YasasiiWeb logout= new LogingOutAndLogingIn_YasasiiWeb(driver);
		logout.action( id,  password, Site);
		
		EMR_DietitianTemplateTestCaseYW emr = new EMR_DietitianTemplateTestCaseYW(driver);
		emr.dietnote( MRNo, fever, selecttemplate, alergy, Height, Weight);
		emr.editnote();
		emr.possibleicd( rulename, icd);
		emr.possibleService( ruleName, servicename);
		emr.templatecreation( dept, templt, templt1, providerName,  templt3);
		emr.providerMApping(providerName, templt3);
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("dietitian");
		return data;	
	}

}
