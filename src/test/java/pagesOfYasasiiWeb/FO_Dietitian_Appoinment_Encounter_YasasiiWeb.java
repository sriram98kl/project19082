package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_Dietitian_Appoinment_Encounter_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_Dietitian_Appoinment_Encounter_YasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//div[@class='card-body']//div[2]//div[3]//ki-select-control[1]//div[1]//input[1]")
	public WebElement gender;
	

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement phoneno;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement organisation;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement SelectOrganisation;
	
	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@name='name_homeaddress1']")
	public WebElement homeadd1;
	
	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement docIdentification;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement num;
	
	@FindBy(xpath = "//label[contains(@class,'ng-star-inserted')]//i[contains(@class,'ki ki-plus')]")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[normalize-space()='How did you know about the hospital?']")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//label[normalize-space()='Newspaper']")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement successok;
	
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Module;
	
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement FO;
	
	
	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registatn;
	
	
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement searchpatient;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement searchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement selectpatient;
	
	@FindBy(xpath = "//i[@class='ki ki-calendar']")
	public WebElement Appoinment;
	
	@FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]")
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
	
	
	@FindBy(xpath = "//div[@title='Cancel Appointment']//i[@class='ki ki-close']")
	public WebElement DeleteAppoinment;
	
	@FindBy(xpath = "//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
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
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectthePatient;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement clickEdit;
	
	@FindBy(xpath = "//label[normalize-space()='Tele Consultation']//span[@class='checkmark']")
	public WebElement Teleconsultation;
	
	@FindBy(xpath = "//button[@id='appointmentupdateid']")
	public WebElement update;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[2]/div[1]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement DateRange;
	
	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-today']")
	public WebElement SelectDate;
	
	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;
	
	@FindBy(xpath = "//div[contains(text(),'Billing')]")
	public WebElement billing;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement enterprovider;
	
	@FindBy(xpath = "//label[@title='Add']")
	public WebElement plus;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement save;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement ok;


	public void EnterPatientDetails(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn) throws InterruptedException, IOException
	{
		//////////////Register a patient with mandatory field entering
		
		Thread.sleep(500);
		firstname.sendKeys(Firstname);
		Thread.sleep(500);
		gender.click();	
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + Gender + "')]")).click();	
		//gender.sendKeys(Gender);
		
		
		Thread.sleep(800);
List<WebElement> dynamicElement=driver.findElements(By.xpath("//label[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			
		}

		
		else
		{
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		}
		
		Thread.sleep(1000);
		organisation.sendKeys(Organisatn);
		Thread.sleep(900);
     	SelectOrganisation.click();
    	Thread.sleep(900);
		age.sendKeys(Age);
		Thread.sleep(900);
		phoneno.sendKeys(Phoneno);		
		Thread.sleep(900);
		contInformation.click();
		Thread.sleep(900);
		homeadd1.sendKeys(HAddress);
		Thread.sleep(900);
		docIdentification.click();
		Thread.sleep(900);
		
		num.sendKeys(Keys.HOME + Documentno);
		//docnumber.sendKeys(Documentno);
		Thread.sleep(900);
		docadd.click();
		Thread.sleep(800);
		howdiduknow.click();
		Thread.sleep(500);
		checknewspaper.click();
		Thread.sleep(700);
		howdiduknowOk.click();
		Thread.sleep(800);
		fosave.click();
		
//////////////Write MRNo to excel sheet
		
		Thread.sleep(3000);
        String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
    	System.out.println(mrno);
		
    	String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);
		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb82190\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData82.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet RegistrationFirstNmae=wb.getSheetAt(34);	
		int i=RegistrationFirstNmae.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		RegistrationFirstNmae.getRow(i).createCell(0).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		
	
		Thread.sleep(1000);
		successok.click();
		Thread.sleep(2000);
//		Module.click();
//		//Thread.sleep(500);
//		//FO.click();
//		Thread.sleep(600);
//		Registatn.click();
//		Thread.sleep(1000);
	}
	
	
	public void dietitian(String MRNo) throws InterruptedException, AWTException
	{
		
//		searchpatient.click();
//		Thread.sleep(800);
//		searchpatient.sendKeys(MRNo);
//		Thread.sleep(800);
//		searchicon.click();
//		Thread.sleep(800);
//		
//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
//		//selectpatient.click();
		
		Thread.sleep(800);
		Appoinment.click();
		
		Thread.sleep(3000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//tbody/tr[2]/td[4]/div[1]"));
		
		
		//td[@class='slot-list ng-star-inserted']/div/span[1]

		for(WebElement element:li){
		if(Integer.parseInt(element.getText())>0){
			element.click();
			break;
		
		}
		
    }
		
		Thread.sleep(3000);
		
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
    	
    	Thread.sleep(500);
//////////////Edit the appoinment
	Search.click();
	Thread.sleep(500);
	Appoinmt.click();
	Thread.sleep(1000);
	DateRange.click();
	Thread.sleep(800);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyRelease(KeyEvent.VK_RIGHT);
	Thread.sleep(800);
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyRelease(KeyEvent.VK_RIGHT);
	Thread.sleep(800);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
  
	Thread.sleep(800);
	Set.click();
	Thread.sleep(800);
	entermrno.clear();
	Thread.sleep(800);
	entermrno.sendKeys(MRNo);
	Thread.sleep(1000);
	SelectthePatient.click();
	Thread.sleep(1000);
	clickEdit.click();
	Thread.sleep(800);
	
	Teleconsultation.click();
	update.click();
}

public void encounterCheckIn() throws InterruptedException, IOException {
//////////////Delete the apppoinment    	
	Thread.sleep(5000);
	SelectthePatient.click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[text()[contains(.,'Token Details')]]")).click();
	Thread.sleep(2000);
	DeleteAppoinment.click();
	Thread.sleep(500);
	Reason.click();
	Thread.sleep(500);
  SelectReason.click();
  CancelAppoinment.click();
  OK.click();

		
	}

public void encounter(String providername) throws InterruptedException
{
	billing.click();
	Thread.sleep(1000);
	clear.click();
	enterprovider.sendKeys(providername);
	Thread.sleep(800);
	driver.findElement(By.xpath("//*[contains(text(),'" + providername + "')]")).click();
	Thread.sleep(500);
	plus.click();
	Thread.sleep(800);
	save.click();
	Thread.sleep(800);
	ok.click();
}

}
