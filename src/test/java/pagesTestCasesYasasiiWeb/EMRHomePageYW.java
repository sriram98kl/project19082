package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.EMRAppointmentPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRDoctorsNote;
import pagesOfYasasiiWeb.EMRDoctorsNoteSOAPYasasiiWeb;
import pagesOfYasasiiWeb.EMRHSLogYasasiiWeb;
import pagesOfYasasiiWeb.EMRHomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMReditDoctorsNoteYasasiiWeb;
import pagesOfYasasiiWeb.FOFullPatientRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVImmunologyYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class EMRHomePageYW extends TestBaseYasasiiWeb {

	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

	@BeforeClass
	public void navigateEMRPage() throws InterruptedException {

		this.login = new LoginPageYasasiiWeb(driver);
		this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
		Thread.sleep(3000);

	}
	
	
	@Test(dataProvider="getData" , priority=0)
	public void immunology(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String doctor,String id , String password , String Site ,  String MRNo,String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn,String addnd,String des,String oa,String cdes,String dig,String ref,String reremarks,String search,String phsearch,String ht,String wt,String temp,String docnomb) throws InterruptedException, IOException 
	{
		  Thread.sleep(2000);
		  EMRDoctorsNoteSOAPYasasiiWeb docsoap = new EMRDoctorsNoteSOAPYasasiiWeb(driver);
		  docsoap.patientreg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
	}
	
	
	

	@Test(dataProvider="getData" , priority=1)
	public void EMRscreen(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String doctor,String id , String password , String Site ,  String MRNo,String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn,String addnd,String des,String oa,String cdes,String dig,String ref,String reremarks,String search,String phsearch,String ht,String wt,String temp,String docnomb) throws InterruptedException, IOException {
		
		
		 Thread.sleep(3000);
		  FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
		 	enc.takingEncounter(MRNo, doctor);
		
		 	LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		    log.action( id,  password, Site);
		
		
		
		EMRHomePageYasasiiWeb emrpatientscreen = new EMRHomePageYasasiiWeb(driver);
		
		//EMRDoctorsNote emrdoctorsnote = new EMRDoctorsNote(driver);
		//EMRDoctorsNote emrdoctorsnote =emrpatientscreen.enterEMRHomePage(MRNo);
		//emrdoctorsnote.EMRdocnoteReconcillation();
		//emrdoctorsnote.EMRdocnote(MRNo);
		EMRDoctorsNoteSOAPYasasiiWeb docsoap = new EMRDoctorsNoteSOAPYasasiiWeb(driver);
		docsoap.medicalhistory(MRNo,pasth,presenth, sh, fh, md, fhn,gen,fam,sn );
		docsoap.vitals(ht,wt,temp);
		docsoap.allergy(addnd,des,oa);
		docsoap.clinicalwarning(cdes);
		docsoap.diagnosisandplan(dig);
		docsoap.referral(ref,reremarks);
		docsoap.cpoeservice(search);
		docsoap.cpoepharmacy(phsearch);
		EMRHSLogYasasiiWeb emrhmlog = new EMRHSLogYasasiiWeb(driver);
	EMReditDoctorsNoteYasasiiWeb emredit = emrhmlog.EMRHomeLogpage();
		emredit.EMReditIPRecommendation();
		
		
		
		
//		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
//		Schedule.AdtSelectionn();
	}
	

	
	  @AfterClass public void logout() throws Exception 
	  { 
		  this.hm.clickLogout(); 
		  }
	  
	 

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("doctornote");
		return data;
	}

}
