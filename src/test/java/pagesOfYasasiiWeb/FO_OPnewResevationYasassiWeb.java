package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_OPnewResevationYasassiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_OPnewResevationYasassiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement enterMRNo;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement ClickOnSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement SelectPatient;

	@FindBy(xpath = "//div[contains(text(),'ADT')]")
	public WebElement ADT;
	
	@FindBy(xpath = "//label[@class='check-container zero-right']//span[@class='checkmark']")
	public WebElement ADMISSION;
	
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement Providernamefield;
	
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	
	@FindBy(xpath = "//input[@id='roomtypeid']")
	public WebElement RoomType;
	
	@FindBy(xpath = "//input[@id='reservationtypeid']")
	public WebElement ReservationType;
	
	
	@FindBy(xpath = "//label[@class='ng-star-inserted']")
	public WebElement Counselling;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[1]/div[1]/label[1]/span[1]")
	public WebElement CheckBox;
	
	@FindBy(xpath = "//i[contains(@title,'Capture')]")
	public WebElement Capture;
	
	@FindBy(xpath = "//span[@id='signature_padcontainer']")
	public WebElement signSave;
	
	@FindBy(xpath = "//button[@class='btn btn-primary sm active pull-right']")
	public WebElement CounsOK;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement reserveSave;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement reserveEdit;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement EditOK;
	
	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement ReservationRemarks;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green pull-right active']")
	public WebElement Counselled;
	
	@FindBy(xpath = "//textarea[@id='counsellingremarks']")
	public WebElement CounsellingRemarks;
	
	@FindBy(xpath = "//button[@id='updatepatadtbutton']")
	public WebElement reservationUpdate;
	
	@FindBy(xpath = "//i[@class='ki ki-list']")
	public WebElement reservationLog;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement MainCategory;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")
	public WebElement header;
	
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNo;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement Save;
	
	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement threedots;
	
	@FindBy(xpath = "//div[contains(text(),'Admission Cancel')]")
	public WebElement admissioncancel;
	
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-trash')]")
	public WebElement Delete;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void Reservation(String MRNo,String doctor , String Prio ) throws InterruptedException {
	
	
	Thread.sleep(1000);
	enterMRNo.clear();
	Thread.sleep(800);
	enterMRNo.click();
	Thread.sleep(500);
	enterMRNo.sendKeys(MRNo);
	Thread.sleep(800);
	ClickOnSearch.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

	//SelectPatient.click();
	Thread.sleep(800);
	ADT.click();
	Thread.sleep(800);
	ADMISSION.click();
	Thread.sleep(800);
    Providernamefield.sendKeys(doctor);
	Thread.sleep(800);
	 driver.findElement(By.xpath("//*[contains(text(),'" + doctor + "')]")).click();
	Thread.sleep(800);
	Priority.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//*[contains(text(),'" + Prio + "')]")).click();
    Thread.sleep(1000);
    RoomType.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//li[normalize-space()='Deluxe']")).click();
    Thread.sleep(1000);
    ReservationType.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(" //li[normalize-space()='Current IP']")).click();
    Thread.sleep(1000);
///////Counseling 	
    
    Counselling.click();
    Thread.sleep(1000);
    CheckBox.click();
    Thread.sleep(1000);
    Capture.click();
    Thread.sleep(1000);
    signSave.click();
    Thread.sleep(1000);
    CounsOK.click();
    Thread.sleep(1000);
    reserveSave.click();
    Thread.sleep(1000);
    reserveEdit.click();
    Thread.sleep(1000);
    EditOK.click();
    Thread.sleep(1000);
    ReservationRemarks.click();
    Thread.sleep(1000);
    ReservationRemarks.sendKeys("ok");
    Thread.sleep(1000);
    Counselled.click();
    Thread.sleep(1000);
    CounsellingRemarks.click();
    Thread.sleep(1000);
    CounsOK.click();
    Thread.sleep(1000);
    reservationUpdate.click();
    Thread.sleep(1000);
    reservationLog.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
    Thread.sleep(1000);
    MainCategory.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//li[normalize-space()='Room Reservation']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
    Thread.sleep(1000);
    header.click();
    Thread.sleep(1000);
    BedNo.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[1]")).click();
    Thread.sleep(1000);
    Save.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
    Thread.sleep(1000);
/////////////Admission cancel	
	Thread.sleep(3000);
	threedots.click();
	Thread.sleep(1000);
	admissioncancel.click();
	 Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='cancelreason']")).click();
	 Thread.sleep(500);
	driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
	 Thread.sleep(500);
	driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")).click();
    
	Thread.sleep(2000);
	Delete.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(1000);
    
    
    
	
}}
