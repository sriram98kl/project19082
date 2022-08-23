package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_SelectPatientAndCheckin_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_SelectPatientAndCheckin_YasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement PatientSelect;
	
	@FindBy(xpath = "//button[normalize-space()='Check-In']")
	public WebElement clickcheckin;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement checkinadd;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement savereferral;
	
	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement adt;
	
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargestatus;
	
	@FindBy(xpath = "//li[normalize-space()='Cured']")
	public WebElement selectcured;
	
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;
	
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement selectdisposition;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement save;
	
	
	public void selectPatient(String MRNo) throws InterruptedException
	{
		
		Thread.sleep(2000);
		EnterMRNo.sendKeys(MRNo);
		Thread.sleep(800);
		SearchButton.click();
		Thread.sleep(800);
		PatientSelect.click();
		Thread.sleep(800);
	}
	
	public void checkin() throws InterruptedException
	{
		clickcheckin.click();
		Thread.sleep(800);
		checkinadd.click();
		Thread.sleep(800);
		savereferral.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']"));
		Thread.sleep(800);
	}
	
	public void discharge() throws InterruptedException
	{
		adt.click();
		Thread.sleep(1000);
		dischargestatus.click();
		Thread.sleep(800);
		selectcured.click();
		Thread.sleep(500);
		disposition.click();
		Thread.sleep(800);
		selectdisposition.click();
		Thread.sleep(800);
		save.click();
		Thread.sleep(1000);
	}

}
