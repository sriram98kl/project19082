package pagesOfYasasiiWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_WhiteBoard_Discharge_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMR_WhiteBoard_Discharge_YasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement searchname;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement selectpatient;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement arrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement arrowlock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement clickdoctornote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement chiefcompaint;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ok;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral/Handover/Handoff']")
	public WebElement referral;

	@FindBy(xpath = "//input[@id='rhtonamewithid']")
	public WebElement providername;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-referralhandover[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement selectdoctor;

	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeframe;

	@FindBy(xpath = "//li[normalize-space()='Within 1 Day']")
	public WebElement selecttimeframe;

	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement enterremarks;

	@FindBy(xpath = "//button[@class='btn btn-primary sm'][normalize-space()='Add']")
	public WebElement add;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoepharmacy;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement entermedicine;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement selectmedicine;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement frequency;

	@FindBy(xpath = "//li[normalize-space()='TID']")
	public WebElement tid;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineadd;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CPOEService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement enterservicename;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-cpoe-service-list[1]/div[1]/div[3]/div[1]/div[1]/label[2]")
	public WebElement selectservice;

	@FindBy(xpath = "//label[contains(@class,'icon emrpreview')]")
	public WebElement preview;
	
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement save;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosisAndPlan;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement recommendation;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[@class='checkmark']")
	public WebElement patientfordischargecheckbox;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement downarrow;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement logout;
		
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yes;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement enteruserid;	
		
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement enterpassword;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;
	
	
	
	
	
	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement hamburger;
	
	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;

	@FindBy(xpath = "//span[normalize-space()='White Board']")
	public WebElement Whiteboard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoEnter;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchclick;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement readyfordischarge;
	
	@FindBy(xpath = "//input[@id='enteredbynameview']")                  
	public WebElement EnteredBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Passsword;
	

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement SAVe;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']")
	public WebElement departmentClearence;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-whiteboard-authentication[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkboxdept;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-whiteboard-authentication[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkboxrad;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-whiteboard-authentication[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkboxmed;

	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement financialClearance;

	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement physicalDischarge;
	
	@FindBy(xpath = "//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[5]/a[1]")
	public WebElement ADT;

	@FindBy(xpath = "//span[normalize-space()='Physical Discharge Cancel']")
	public WebElement physicalDischargeCancel;

	@FindBy(xpath = "//input[@id='filtercriteria']")
	public WebElement entermrno;

	@FindBy(xpath = "//button[@id='physicalcancelsave']")
	public WebElement SaVe;

	
	
	
	
	
	
////////Select patient	
	public void selectpatient(String MRNo) throws InterruptedException
	{
		searchname.sendKeys(MRNo);
		Thread.sleep(1500);
		selectpatient.click();
		Thread.sleep(1500);
		arrow.click();
		Thread.sleep(800);
		arrowlock.click();
		Thread.sleep(800);
	}
	
	public void IPPatientList(String MRNo) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		searchname.sendKeys(MRNo);
		Thread.sleep(1500);
		selectpatient.click();
		Thread.sleep(1500);
		arrow.click();
		Thread.sleep(800);
		arrowlock.click();
		Thread.sleep(800);
	}
/////////////////////Enterchief complaint and select template
	public void doctornote(String chiefcomplaint,String Templt) throws InterruptedException
	{
		
		clickdoctornote.click();
		  Thread.sleep(1000);
		    
//			List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//			
//			if(dynamicElement.size() !=0)
//			{
//				driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//			}
			  Thread.sleep(800);
			  
			  chiefcompaint.sendKeys(chiefcomplaint);
			  Thread.sleep(1000);
			  Thread.sleep(1000);
			  template.click();
			  template.sendKeys(Templt);
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[contains(text(),'" + Templt + "')]")).click();
			  Thread.sleep(1000);
			  ok.click();
			  Thread.sleep(1000);
	}
	
	public void referral(String Provider,String remarks) throws InterruptedException
	{
		referral.click();
		Thread.sleep(800);
		providername.sendKeys(Provider);
		Thread.sleep(800);
		selectdoctor.click();
		Thread.sleep(800);
		timeframe.click();
		Thread.sleep(800);
		selecttimeframe.click();
		Thread.sleep(800);
		enterremarks.sendKeys(remarks);
		Thread.sleep(800);
		add.click();
	}
	
	public void CPOEPharmacy(String medicinename) throws InterruptedException
	{
		Thread.sleep(800);
		cpoepharmacy.click();
		Thread.sleep(800);
		entermedicine.sendKeys(medicinename);
		Thread.sleep(800);
		selectmedicine.click();
		Thread.sleep(800);
		frequency.click();
		Thread.sleep(800);
		tid.click();
		Thread.sleep(800);
		medicineadd.click();
		Thread.sleep(800);
	}
	
	public void CPOEservice(String servicename) throws InterruptedException
	{
		Thread.sleep(800);
		CPOEService.click();
		Thread.sleep(800);
		enterservicename.sendKeys(servicename);
		Thread.sleep(800);
		selectservice.click();
		Thread.sleep(800);
	}
	
	public void dischargerecommendation() throws InterruptedException
	{
		Thread.sleep(800);
		diagnosisAndPlan.click();	
		Thread.sleep(800);
		recommendation.click();
		Thread.sleep(800);
		patientfordischargecheckbox.click();
		Thread.sleep(800);
	}
	
	public void savedoctornote() throws InterruptedException
	{
		Thread.sleep(800);
		preview.click();
		Thread.sleep(800);
		save.click();
		Thread.sleep(800);
	}
	
	
	
	public void loggout() throws InterruptedException
	{
//////////loging out
		Thread.sleep(1000);
		downarrow.click();
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys("nur01");
		enterpassword.sendKeys("KAmeda123$");
		Thread.sleep(800);
		site.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}
	
	
	public void doingdischargeinwhiteboardSelectPatient(String MRNo) throws InterruptedException
	{
		hamburger.click();
		Thread.sleep(800);
		EMR.click();
		Thread.sleep(1000);
		Whiteboard.click();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNo);
		Thread.sleep(800);
		searchclick.click();
		Thread.sleep(1500);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
	}
	
	public void doingdischargeinwhiteboard(String nurseusername,String nursepassword) throws InterruptedException
	{
		Thread.sleep(1000);
		readyfordischarge.click();
		Thread.sleep(1000);
		EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Thread.sleep(800);
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();
		Thread.sleep(800);
	}
	
	public void login() throws InterruptedException
	{
//////////loging out
		Thread.sleep(1000);
		downarrow.click();
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys("dep01");
		enterpassword.sendKeys("KAmeda123$");
		Thread.sleep(800);
		site.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}
	
	
	
	public void deptclearance(String MRNo,String nurseusername,String nursepassword) throws InterruptedException
	{
		Thread.sleep(800);
		hamburger.click();
		Thread.sleep(800);
		EMR.click();
		Thread.sleep(800);
		Whiteboard.click();
		Thread.sleep(800);
		MRNoEnter.sendKeys(MRNo);
		Thread.sleep(800);
		searchclick.click();
		Thread.sleep(800);
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
		
		departmentClearence.click();
		Thread.sleep(800);
		checkboxdept.click();
		Thread.sleep(800);
		EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();
		Thread.sleep(800);
			
	}
	
	public void logintoraddept() throws InterruptedException
	{
//////////loging out
		Thread.sleep(1000);
		downarrow.click();
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys("rad01");
		enterpassword.sendKeys("KAmeda123$");
		Thread.sleep(800);
		site.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}
	
	public void rad(String MRNo,String nurseusername,String nursepassword) throws InterruptedException
	{
		Thread.sleep(800);
		hamburger.click();
		Thread.sleep(800);
		EMR.click();
		Thread.sleep(800);
		Whiteboard.click();
		Thread.sleep(800);
		MRNoEnter.sendKeys(MRNo);
		Thread.sleep(800);
		searchclick.click();
		Thread.sleep(800);
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
		departmentClearence.click();
		Thread.sleep(800);
		checkboxrad.click();
		Thread.sleep(800);
		EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Thread.sleep(800);
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();
		Thread.sleep(800);	
		
		
	}
	
	public void logintomeddept() throws InterruptedException
	{
//////////loging out
		Thread.sleep(1000);
		downarrow.click();
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys("med");
		enterpassword.sendKeys("KAmeda123$");
		Thread.sleep(800);
		site.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}
	
	public void med(String MRNo,String nurseusername,String nursepassword) throws InterruptedException
	{
		Thread.sleep(800);
		hamburger.click();
		Thread.sleep(800);
		EMR.click();
		Thread.sleep(800);
		Whiteboard.click();
		Thread.sleep(800);
		MRNoEnter.sendKeys(MRNo);
		Thread.sleep(800);
		searchclick.click();
		Thread.sleep(800);
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
		departmentClearence.click();
		Thread.sleep(800);
		checkboxmed.click();
		EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Thread.sleep(800);
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();	
		Thread.sleep(800);
	}
	
	
	public void pharmClearance(String nurseusername,String nursepassword) throws InterruptedException 
	{
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
		Thread.sleep(800);
		pharmacyClearance.click();
		Thread.sleep(800);
		EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Thread.sleep(800);
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();
	
	}
	
	public void adminlogin() throws InterruptedException
	{
//////////loging out
		Thread.sleep(1000);
		downarrow.click();
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys("admin");
		enterpassword.sendKeys("kameda321");
		Thread.sleep(800);
		site.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}
  public void financlearance(String nurseusername,String nursepassword) throws InterruptedException
{
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
		Thread.sleep(800);
	    financialClearance.click();
		Thread.sleep(800);
	    EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Thread.sleep(800);
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();
		Thread.sleep(800);
}
  public void physicaldischarge(String nurseusername,String nursepassword) throws InterruptedException
{
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//thead/tr[1]/th[23]/i[1]"));
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);		
		Thread.sleep(1500);
		
		Thread.sleep(800);
	  physicalDischarge.click();
		Thread.sleep(800);
	    EnteredBy.sendKeys(nurseusername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + nurseusername + "')]")).click();
		Thread.sleep(800);
		Passsword.sendKeys(nursepassword);
		Thread.sleep(800);
		SAVe.click();
		Thread.sleep(800);
}
  
  
  
  public void canceldischarge(String MRNo) throws InterruptedException
  {
		Thread.sleep(1000);
	  hamburger.click();
		Thread.sleep(800);
	  ADT.click();
		Thread.sleep(800);
	  physicalDischargeCancel.click();
		Thread.sleep(800);
	  entermrno.sendKeys("MRNo");
		Thread.sleep(1000);
	  SaVe.click();
		Thread.sleep(800);
  }

}
