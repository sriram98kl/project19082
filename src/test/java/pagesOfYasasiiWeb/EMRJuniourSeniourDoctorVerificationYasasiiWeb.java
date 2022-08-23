package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRJuniourSeniourDoctorVerificationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRJuniourSeniourDoctorVerificationYasasiiWeb(WebDriver driver) {

		super(driver);

}
	
	

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement IP;
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement MyDepartment;
	@FindBy(xpath = "//li[contains(text(),'All IP')]")
	public WebElement AllIp;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement Arrow;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement LockArrow;
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	@FindBy(xpath = "//button[normalize-space()='Create New Note']")
	public WebElement CreateNewNte;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[6]/li[1]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement OK;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement DiagnosisAndPlan;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectICD;
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CPOEService;
	@FindBy(xpath = "//label[contains(text(),'Glucose 2 HR')]")
	public WebElement SelectService;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement PatientNotInterviewed;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement aDd;
	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmissionReconsile;
	@FindBy(xpath = "//i[@class='ki ki-continue']")
	public WebElement Tick;
	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement yeS;
	@FindBy(xpath = "//input[@id='reason0']")
	public WebElement overridereason;
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement YYes;
	
	
	
	@FindBy(xpath = "//*[contains(text(),'Ziagen')]")
	public WebElement SelectMedicine;	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement FrequencyDetails;
	@FindBy(xpath = "//div[@class='row mt-4 ng-star-inserted']//div[2]//div[1]//div[1]//div[2]//ki-input-control[1]//div[1]//input[1]")
	public WebElement EnterQuantity;		
	@FindBy(xpath = "//span[normalize-space()='Schedule']")
	public WebElement Schedule;
	@FindBy(xpath = "//input[@id='weeklyValue']")
	public WebElement EnterRecover;
	@FindBy(xpath = "//label[normalize-space()='Tuesday']")
	public WebElement Tuesday;
	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='OK']")
	public WebElement ok;
	@FindBy(xpath = "//input[@id='orderreadback']")
	public WebElement OrderRead;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;
	@FindBy(xpath = "//img[@title='Print']")
	public WebElement Print;
	@FindBy(xpath = "//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]")
	public WebElement CancelPrint;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement Save;

	//logout and then login as senior doctor
	
	
	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement DownArrow;
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement LogOut;
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Yes;
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement EnterUserId;
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement EnterPassword;
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement Site;
	@FindBy(xpath = "//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement SelectSite;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	public WebElement login;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[3]/span[1]/div[1]")
	public WebElement Task;
	@FindBy(xpath = "//span[normalize-space()='Jr doctor sr doctor verification']")
	public WebElement JrToSrDrVerification;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Entername;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	public WebElement SelectName;
	@FindBy(xpath = "//i[@class='fa fa-caret-right']")
	public WebElement SideArrow;
	
	
	@FindBy(xpath = "//*[@class='ki ki-check-circle-fill' and @title='Counter Sign Pending']")
	public WebElement CounterSignPending;
	@FindBy(xpath = "//textarea[@id='countersignremarkstxt']")
	public WebElement EnterCounterSignRemarks;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement SaveCounterSign;
	
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement serviceSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement medicineSearch;
	
	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[contains(@class,'checkmark')]")
	public WebElement nomedication;
	
	@FindBy(xpath = "	//div[contains(@class,'mb10 btn-type-add ta-r')]//button[contains(@type,'button')][normalize-space()='Add']")
	public WebElement nomedicationAdd;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-discharge-reconciliation')]")
	public WebElement DichargeReconcilation;
	
	
	@FindBy(xpath = "//input[@id='fav']")
	public WebElement diagnosisSearch;
	
	
public void JuniourSeniorDoctorAction(String MRNo) throws InterruptedException, IOException, AWTException {
/////////////////Select an IP patient		
	    Thread.sleep(2000);
	    IP.click();
	    Thread.sleep(1000);
	    SelectIP.click();
	    Thread.sleep(1000);
	    MyDepartment.click();
	    Thread.sleep(1000);
	
	    AllIp.click();
		Thread.sleep(1000);
		EnterName.sendKeys(MRNo);
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		
		//SelectPatient.click();
		Thread.sleep(800);
		Arrow.click();
		Thread.sleep(800);
		LockArrow.click();
/////////////Create the doctor note
		
	DoctorNote.click();
		Thread.sleep(1000);
//	List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//		
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}
//		  Thread.sleep(800); 

	//	CreateNewNte.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chiefcomplainttext']")).clear();
		Thread.sleep(1000);
		EnterChiefComplaint.sendKeys("Infection");
		Thread.sleep(600);
		EnterTemplate.click();
		//EnterTemplate.sendKeys("fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(600);
		OK.click();
		Thread.sleep(800);
		DiagnosisAndPlan.click();
		Thread.sleep(800);
		diagnosisSearch.clear();
		Thread.sleep(800);
		//diagnosisSearch.sendKeys("normal pressure hydrocephalus");
		Thread.sleep(2000);
	

		//SelectICD.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		
		
//		List<WebElement> ok=driver.findElements(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']"));
//		
//		System.out.println(ok.size());
//		if(ok.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']")).click();
//
//		}
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[contains(@class,'card card-sm ng-star-inserted')]//i[contains(@class,'fa fa-ellipsis-v')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='Yes']")).click();
		
		Thread.sleep(2000);
	    CPOEService.click();
		serviceSearch.clear();
		Thread.sleep(600);
		serviceSearch.click();
		serviceSearch.sendKeys("STAT Sodium");
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		
		//SelectService.click();
		CPOEPharmacy.click();
		Thread.sleep(600);
		//PatientNotInterviewed.click();
		//aDd.click();
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//label[normalize-space()='No Current Medication']//span[@class='checkmark']"));
		
//		System.out.println(dynamicElement1.size());
//		if(dynamicElement1.size() !=0)
//		{
//			nomedication.click();
//			Thread.sleep(1000);
//			nomedicationAdd.click();
//			Thread.sleep(1000);
//			DichargeReconcilation.click();
//			Thread.sleep(600);
//			//AdmissionReconsile.click();//i[@class='ki ki-admission-reconciliation']
//			Tick.click();
//			Reconsile.click();
//			Thread.sleep(600);
//			yeS.click();//button[@class='btn btn-dark-green active'][normalize-space()='Yes']
//			Thread.sleep(1200);
//
//		}	

		
		
		medicineSearch.click();
		Thread.sleep(800);
		medicineSearch.sendKeys("calpol");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[contains(text(),'Calpol 120Mg Suspension 60Ml, 60 Ml  by Oral')]")).click();
		Thread.sleep(800);
		
		FrequencyDetails.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(600);
	//	EnterQuantity.sendKeys("2");
	//	Schedule.click();
	//	EnterRecover.sendKeys("1");
	//	Tuesday.click();
	//	ok.click();
		
	
		//OrderRead.sendKeys("yes");
		Thread.sleep(500);
		AddMedicine.click();
		Thread.sleep(1500);
		Print.click();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
		
//		Robot robot = new Robot();
//		robot.mouseMove(1000, 1);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\\\"sidebar\\\"]//print-preview-button-strip//div/cr-button[2]")).click();
		//CancelPrint.click();
		Save.click();
		
	
		Thread.sleep(1000);
		


}

public void DoctorVerify(String MRNo, String DOCid, String Password,String URL) throws InterruptedException {
	
	
	
	((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(2000);


		EnterUserId.sendKeys(DOCid);
		EnterPassword.sendKeys(Password);
		Site.click();
		SelectSite.click();
		login.click();
		Thread.sleep(1000);
/////////Click on task and selct junior Senior doctor verification and select the patient
		Task.click();//div[@class='count ng-star-inserted']
		Thread.sleep(2000);
		JrToSrDrVerification.click();
		Thread.sleep(2000);
		Entername.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//SelectName.click();
		Thread.sleep(2000);
		
//		try
//		{
//			SideArrow.click();
//		}
//		catch (Exception e)
//		{
//			
//		}
		
//////////Click on red counter sign and enter the details and save it
		
		SideArrow.click();//i[@class='fa fa-caret-right']
		Thread.sleep(800);
		CounterSignPending.click();
		Thread.sleep(600);
		EnterCounterSignRemarks.sendKeys("Senior Doctor Verified");
		Thread.sleep(600);
		SaveCounterSign.click();
		Thread.sleep(600);

}
}