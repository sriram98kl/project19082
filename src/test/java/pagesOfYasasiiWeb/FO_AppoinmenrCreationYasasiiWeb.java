package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_AppoinmenrCreationYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public FO_AppoinmenrCreationYasasiiWeb(WebDriver driver) {

		super(driver);

	}
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement PatientSelect;

	@FindBy(xpath= "//div[contains(text(),'Appointment')]")
	WebElement patientappointment;

	@FindBy(xpath= "//input[@placeholder='Search Resource..']")
	WebElement docsearch;

	@FindBy(xpath = "//tbody[1]/tr[2]/td[4]/div[1]")
	public WebElement appselection;


	@FindBy(xpath = "///td[contains(text(),'20:00')]")
	public WebElement appscroll;

	@FindBy(xpath = "//tbody/tr[4]/td[2]/div[2]/label[1]/i[1]")
	public WebElement appaddicon;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement appsave;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement appok;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/i[1]")
	public WebElement encountericon; 


	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/i[1]")
	public WebElement DeleteAppoinment;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Reason;

	@FindBy(xpath = "//li[normalize-space()='Patient Request']")
	public WebElement SelectReason;

	@FindBy(xpath = "//button[normalize-space()='Cancel Appointment']")
	public WebElement CancelAppoinment;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement Search;

	@FindBy(xpath = "//li[normalize-space()='Appointment']")
	public WebElement Appoinmt;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement entermrno;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectthePatient;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/i[1]")
	public WebElement clickEdit;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement Teleconsultation;

	@FindBy(xpath = "//button[@id='appointmentupdateid']")
	public WebElement update;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[2]/div[1]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement DateRange;

	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-today']")
	public WebElement SelectDate;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	public void Appoinment(String MRNo,String Name,String doctor) throws InterruptedException, IOException, Exception {
		//////////////Create an appoinment from FO screen	
		Thread.sleep(2000);
		EnterMRNo.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		// PatientSelect.click();
		Thread.sleep(1000);
		patientappointment.click();
		Thread.sleep(1000);
		docsearch.sendKeys(doctor);
		Thread.sleep(2500);
		appselection.click();
		Thread.sleep(5000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//tbody[1]/tr[2]/td[4]/div[1]"));


		//td[@class='slot-list ng-star-inserted']/div/span[1]

		for(WebElement element:li){
			if(Integer.parseInt(element.getText())>0){
				element.click();
				break;

			}

		}

		Thread.sleep(5000);

		List<WebElement> li2=new ArrayList<WebElement>(); 

		WebElement plusDiv=driver.findElement(By.xpath("//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[2]/lib-schedule-view[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]"));
		WebElement appointmentPlus=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/label[1]/i[1]"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(5000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(8000);
		appsave.click();
		Thread.sleep(3000);
		appok.click();
		Thread.sleep(500);
		//////////////Edit the appoinment
		Search.click();
		Thread.sleep(500);
		Appoinmt.click();
		Thread.sleep(1000);
		DateRange.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		//    	WebElement textbox=driver.findElement(By.xpath("//tbody/tr[3]/td[3]/span[1]"));
		//    	Thread.sleep(800);
		//    	textbox.click();
		//    	Thread.sleep(800);
		//    	textbox.sendKeys(Keys.ARROW_RIGHT,Keys.ENTER);
		//    	Thread.sleep(800);

		Set.click();
		Thread.sleep(800);
		entermrno.clear();
		Thread.sleep(800);
		entermrno.sendKeys(MRNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//SelectthePatient.click();
		Thread.sleep(1000);
		clickEdit.click();
		Thread.sleep(1000);
		Teleconsultation.click();
		update.click();
	}

	public void encounterCheckIn(String MRNo) throws InterruptedException, IOException {
		//////////////Delete the apppoinment    	
		Thread.sleep(3000);
		EnterMRNo.clear();
		Thread.sleep(1000);
		EnterMRNo.sendKeys(MRNo);
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectthePatient.click();
		//		Thread.sleep(5000);
		//		driver.findElement(By.xpath("//*[text()[contains(.,'Token Details')]]")).click();
		Thread.sleep(2000);
		DeleteAppoinment.click();
		Thread.sleep(500);
		Reason.click();
		Thread.sleep(500);
		SelectReason.click();
		CancelAppoinment.click();
		OK.click();
	}
	//////////////////Select another site and do booking    
	public void othersite(String sitename,String doctor1) throws InterruptedException
	{
		driver.findElement(By.xpath("//i[@class='ki ki-calendar']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-map-pin-fill']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//*[contains(text(),'" + sitename + "')]")).click();
		Thread.sleep(1000);
		docsearch.sendKeys(doctor1);
		Thread.sleep(600);
		appselection.click();
		Thread.sleep(5000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//tbody/tr[2]/td[3]/div[1]"));


		//td[@class='slot-list ng-star-inserted']/div/span[1]

		for(WebElement element:li){
			if(Integer.parseInt(element.getText())>0){
				element.click();
				break;

			}

		}

		Thread.sleep(5000);

		List<WebElement> li2=new ArrayList<WebElement>(); 

		WebElement plusDiv=driver.findElement(By.xpath("//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[2]/lib-schedule-view[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]"));
		WebElement appointmentPlus=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/label[1]/i[1]"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(5000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(8000);
		appsave.click();
		Thread.sleep(3000);
		appok.click();
		Thread.sleep(500);

	}


}

