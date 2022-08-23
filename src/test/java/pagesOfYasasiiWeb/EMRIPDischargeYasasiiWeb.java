package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRIPDischargeYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public EMRIPDischargeYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement IP;
	
	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement MyDepartment;
	
	@FindBy(xpath = "//li[contains(text(),'All IP')]")
	public WebElement AllIP;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatient;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement SelectPatient;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UParrow;
	
	@FindBy(xpath = "//span[@class='icon doctornote']")
	public WebElement DoctorNote;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement CreateNewNote;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement ChiefComplt;
	
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	
	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SOAP;
	
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement OK;
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement DiagnosisAndPlan;
	
	@FindBy(xpath = "//span[contains(text(),'Discharge Recommendation')]")
	public WebElement DischargeRecommendation;
	
	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']")
	public WebElement PatientForDischarge;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService;
	
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement EnterServiceName;
	
	@FindBy(xpath = "//div[@id='cpoeservicelist_0']//div[contains(@class,'item-list-row')]")
	public WebElement SelectService;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement EnterMedicine;
	
	@FindBy(xpath = "//*[contains(text(),'Ultracet Tab')]")
	public WebElement SelectMedicine;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADD;
	
	@FindBy(xpath = "//span[@class='icon emrsave']")
	public WebElement Save;
	
	@FindBy(xpath = "//span[@class='icon adtview']")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement DischargeStatus;
	
	@FindBy(xpath = "//li[contains(text(),'Cured')]")
	public WebElement SelectStatus;
	
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;

	@FindBy(xpath = "//li[contains(text(),'Discharged Home')]")
	public WebElement SelectDisposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement save;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelock;
	

	
	
public void DischargeSelectionn(String firstname ,String gender,String age,String encounter,String MRNo) throws InterruptedException{
/////////Select the patient		
		Thread.sleep(1000);
		OP.click();
		Thread.sleep(500);
		IP.click();
		Thread.sleep(500);
		MyDepartment.click();
		Thread.sleep(500);
		AllIP.click();
		Thread.sleep(500);
		EnterPatient.sendKeys(MRNo);
		Thread.sleep(2000);
		SelectPatient.click();
		 Thread.sleep(5000);
		  patienthomepageicon.click();
		  patienthomepagelock.click();
		  Thread.sleep(5000);
/////////////////////////////Create the doctor note
		DoctorNote.click();
		 Thread.sleep(600);
		//CreateNewNote.click();
		ChiefComplt.clear();
		Thread.sleep(900);
		ChiefComplt.sendKeys("Severe Fever");
		Template.click();
		SOAP.click();
		OK.click();
		DiagnosisAndPlan.click();
		Thread.sleep(500);
		DischargeRecommendation.click();
		Thread.sleep(1000);
		PatientForDischarge.click();	
		CPOEService.click();
		
		EnterServiceName.sendKeys("Copper");
		SelectService.click();
		CPOEPharmacy.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(text(),'In-Active')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'order-details')]//i[contains(@class,'fa fa-ellipsis-v')]")).click();
		//div[@class='card card-sm left-border ng-star-inserted']//div[@class='multi-action']
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[normalize-space()='Add']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//label[contains(text(),'Current Note')]")).click();
    	Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='order-head']/div/div[@class='ng-star-inserted']/label[contains(text(),'Active')][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Current Note')]")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[@class='order-head']/div/div[@class='ng-star-inserted']/label[contains(text(),'Active')][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Add as New')]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='CPOE Pharmacy']")).click();
		Thread.sleep(800);		
//		driver.findElement(By.xpath("//i[@class='ki ki-admission-reconciliation']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//i[@class='ki ki-continue']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//i[@class='ki ki-reconciliation']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//label[normalize-space()='Active']")).click();
//		
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//div[normalize-space()='Add as New']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		
		
		
		//driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		EnterMedicine.sendKeys("ultracet");
		Thread.sleep(1000);
		SelectMedicine.click();
		Thread.sleep(500);
		ADD.click();
		Thread.sleep(1000);
		//UParrow.click();
		Save.click();
		Thread.sleep(5000);
////////////////Discharge the patient		
		ADT.click();
		Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='dischargestatus']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(600);	
		DischargeStatus.click();
		Thread.sleep(600);
		SelectStatus.click();
		Thread.sleep(500);
		Disposition.click();
		Thread.sleep(800);
		SelectDisposition.click();
		Thread.sleep(1000);
		save.click();
		
}
	
	
	

}
