package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class PatientDischarge_YasassiWeb  extends PageFactoryInitYasasiiWeb{

	
	public PatientDischarge_YasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EmrSave;

	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;

	@FindBy(xpath = "//span[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;
	
	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;
	
	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;
	
	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EmrIcon;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']")//button[normalize-space()='Department Clearance']
	public WebElement Depclearance;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement laboratoryCheckbox;
	
	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement radiologyCheckbox;
	
	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;
	
	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;
	
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;
	
	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement FinancialClearance;
	
	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement pysicalDischarge;
	
	@FindBy(xpath = "//i[@class='ki ki-redo']")
	public WebElement RollBack;
	
	
	
public void dischargeRecommendation(String MRNO , String nurseUser , String  Password,String URL) throws InterruptedException {
		Hamberger.click();	
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		Thread.sleep(1000);
		IP.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='All IP']")).click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		//UParrow.click();
     	//Lock.click();
		Thread.sleep(1000);	
		DoctorNote.click();
		Thread.sleep(1000);	
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

	if(dynamicElement.size() !=0)
	{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
	Thread.sleep(800); 
		cheifComplaint.clear();
		Thread.sleep(1000);
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		diagnosis.click();
		Thread.sleep(1000);
		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000); 
		
		//openNewTab

				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
				driver.switchTo().window(tabs.get(1));
				Thread.sleep(5000);
				driver.get(URL);
				Thread.sleep(3000);

				//login
				userid.click();
				userid.sendKeys(nurseUser);
				password.click();
				password.sendKeys(Password); 
				Thread.sleep(1000);
				site.click();
				driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				Thread.sleep(5000);

		
	}

	public void dischargeApproval(String MRNO , String nurseUser , String  Password , String depUser ,String URL ) throws InterruptedException, AWTException {
		
	///	driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(5000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(3000);
		//act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//element.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(2000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		
	////////ROLLBACK	
		
	    js.executeScript("arguments[0].scrollIntoView();", RollBack);
		Thread.sleep(3000);
		act.moveToElement(RollBack).click().build().perform();
		Thread.sleep(2000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		
		 js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(3000);
		//act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//element.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(2000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		
		
		
		
		
		
		
		
		
		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		driver.switchTo().window(tabs1.get(2));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(depUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

}

public void laboratoryClearance(String MRNO , String  Password , String depUser , String RADuser ,String URL) throws InterruptedException {
	
	Hamberger.click();
	Thread.sleep(1000);
	EmrIcon.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2000);
	WhiteBoard.click();
	Thread.sleep(1000);
	NameSearch.click();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNO);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Depclearance);
	Thread.sleep(3000);
	act.moveToElement(Depclearance).click().build().perform();
	//Depclearance.click();
	Thread.sleep(1000);
	laboratoryCheckbox.click();
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(depUser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+depUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	
	//openNewTab

	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(3));
	driver.switchTo().window(tabs.get(3));
	Thread.sleep(5000);
	driver.get(URL);
	Thread.sleep(3000);

	//login
	userid.click();
	userid.sendKeys(RADuser);
	password.click();
	password.sendKeys(Password);
	Thread.sleep(1000);
	site.click();
	driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(5000);
	
}
	
public void radiologyClearance(String MRNO ,  String RADuser , String  Password , String meduser,String URL ) throws InterruptedException {
	
	Hamberger.click();
	Thread.sleep(1000);
	EmrIcon.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(1000);
	WhiteBoard.click();
	Thread.sleep(1000);
	NameSearch.click();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNO);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Depclearance);
	Thread.sleep(3000);
	act.moveToElement(Depclearance).click().build().perform();
	//Depclearance.click();
	Thread.sleep(1000);
	radiologyCheckbox.click();
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(RADuser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+RADuser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	
	//openNewTab

	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(4));
	driver.switchTo().window(tabs.get(4));
	Thread.sleep(5000);
	driver.get(URL);
	Thread.sleep(3000);

	//login
	userid.click();
	userid.sendKeys(meduser);
	password.click();
	password.sendKeys(Password);
	Thread.sleep(1000);
	site.click();
	driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(5000);
	
	
}

public void medicalClearance(String MRNO  , String  Password , String meduser , String nurseUser,String URL ) throws InterruptedException {
	
	Hamberger.click();
	Thread.sleep(1000);
	EmrIcon.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2500);
	WhiteBoard.click();//span[normalize-space()='White Board']
	Thread.sleep(1000);
	NameSearch.click();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNO);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Depclearance);
	Thread.sleep(3000);
	act.moveToElement(Depclearance).click().build().perform();
	//Depclearance.click();
	Thread.sleep(1000);
	radiologyCheckbox.click();
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(meduser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+meduser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	
	//openNewTab

	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(5));
	driver.switchTo().window(tabs.get(5));
	Thread.sleep(5000);
	driver.get(URL);
	Thread.sleep(3000);

	//login
	userid.click();
	userid.sendKeys(nurseUser);
	password.click();
	password.sendKeys(Password);
	Thread.sleep(1000);
	site.click();
	driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(5000);
	
	}

public void PharmacyClearance(String MRNO, String nurseUser,String Password , String AdminUser , String AdminPassword,String URL) throws InterruptedException {
	
	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2000);
	WhiteBoard.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	NameSearch.click();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNO);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
	Thread.sleep(3000);
	act.moveToElement( pharmacyClearance).click().build().perform();

	Thread.sleep(1000);
	
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(6));
		driver.switchTo().window(tabs.get(6));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	
}

public void ADTAppoval(String MRNO , String nurseUser,String Password,String URL ) throws InterruptedException {
	Thread.sleep(3000);
	FOSearchField.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	FOSearchField.sendKeys(MRNO);
	Thread.sleep(1000);
	FOSearchField.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	Thread.sleep(1000);
	ADT.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);
	
	
	Thread.sleep(2000);
	dischargeStatus.click();//input[@id='dischargestatus']
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
	Thread.sleep(1000);
	disposition.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
	Thread.sleep(1000);
	 ADTSave.click();
	 Thread.sleep(1000);

	//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(7));
		driver.switchTo().window(tabs.get(7));//7
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
		
	
}

public void financialClearance(String MRNO , String nurseUser,String Password,String URL) throws InterruptedException {
	

	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2000);
	WhiteBoard.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	NameSearch.click();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNO);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
	Thread.sleep(3000);
	act.moveToElement( FinancialClearance).click().build().perform();

	Thread.sleep(1000);
	
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	//openNewTab

			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(8));
			driver.switchTo().window(tabs.get(8));
			Thread.sleep(5000);
			driver.get(URL);
			Thread.sleep(3000);

			//login
			userid.click();
			userid.sendKeys(nurseUser);
			password.click();
			password.sendKeys(Password);
			Thread.sleep(1000);
			site.click();
			driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
			Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	
}
public void physicalDischarge( String MRNO , String nurseUser,String Password) throws InterruptedException {
	
	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2000);
	WhiteBoard.click();
	Thread.sleep(1000);
	
	//driver.navigate().refresh();
	Thread.sleep(1000);
	NameSearch.click();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNO);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='Incharge Provider']")).click();
	
	//driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
	Thread.sleep(3000);
	act.moveToElement( pysicalDischarge).click().build().perform();

	Thread.sleep(1000);
	
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	
	
	
	
}
	
}








