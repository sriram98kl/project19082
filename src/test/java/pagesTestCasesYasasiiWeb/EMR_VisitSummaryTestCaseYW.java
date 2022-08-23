package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_VisitSummaryYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.FO_MandatoryFieldValidationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVImmunologyYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class EMR_VisitSummaryTestCaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(3000);
		
	
	}

	@Test (dataProvider="getData" , priority=0)
	public void patREg(String ChiefComp,String template,String service,String code,String name,String Name,String headname,String opinion,String doctor,String chartname,String serviceame , String MRNo,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String id, String password,String Site) throws InterruptedException, IOException 
	{
		  Thread.sleep(2000);
		  EMR_VisitSummaryYasasiiWeb Emrvisit = new EMR_VisitSummaryYasasiiWeb(driver) ;
		  Emrvisit.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
	}
	
	
	
	@Test(dataProvider="getData" , priority=1)
	public void foReg(String ChiefComp,String template,String service,String code,String name,String Name,String headname,String opinion,String doctor,String chartname,String serviceame , String MRNo,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String id, String password,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
	
		  FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		 	enc.takingEncounter(MRNo, doctor);
		
		 	LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		    log.action( id,  password, Site);
		
		
		EMR_VisitSummaryYasasiiWeb emrvisit = new EMR_VisitSummaryYasasiiWeb(driver) ;
	    emrvisit.Createdoctornote(ChiefComp,template,MRNo);
		emrvisit.diagnosisandplan();
		emrvisit.CPOEservice();
		emrvisit.CPOEpharmacy(service,opinion,doctor);
		emrvisit.configurableEMR();
		emrvisit.cpoadmintration();
		emrvisit.hidenoteANDIcdupdationtool(MRNo);
	}
		
		@Test(dataProvider="getData", priority=2)
		public void visitsmary(String ChiefComp,String template,String service,String code,String name,String Name,String headname,String opinion,String doctor,String chartname,String serviceame , String MRNo,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR , String id, String password,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);
			
		EMR_VisitSummaryYasasiiWeb Emrvisit = new EMR_VisitSummaryYasasiiWeb(driver) ;
		Emrvisit.visitsummary(MRNo);
		Emrvisit.Diagnosismaster(code,name);
		Emrvisit.Templatemaster(Name,headname);
		Emrvisit.doctorschart(chartname,serviceame);
	}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("VisitSummary");
		return data;	
	}

}


