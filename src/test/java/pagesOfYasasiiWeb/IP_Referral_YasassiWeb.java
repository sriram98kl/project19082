package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class IP_Referral_YasassiWeb extends PageFactoryInitYasasiiWeb{

	public IP_Referral_YasassiWeb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//label[@class='ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement SaveSuccess;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement patienthomepagelock;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement docnote;

	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement createnote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral']")
	public WebElement Referral;

	@FindBy(xpath = "//input[@id='rhtodeptname']")
	public WebElement DepNmae;


	@FindBy(xpath = "//input[@id='rhtonamewithid']")
	public WebElement DepProvider;

	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement TimeFrame;

	@FindBy(xpath = "//button[@class='btn btn-primary sm'][normalize-space()='Add']")
	public WebElement  Referaladd;

	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement  Remarks;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;
	
	@FindBy(xpath = "//button[normalize-space()='Check-In']")
	public WebElement Checkin;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement CheckinAdd;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;
	
	@FindBy(xpath = "//label[@title='Book Referral Appointment']//i[@class='ki ki-calendar']")
	public WebElement bookApmnt;
	
	@FindBy(xpath = "//tbody/tr[@class='ng-star-inserted']/td[2]/div[1]")
	public WebElement entry;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[2]/lib-schedule-view[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")
	public WebElement slot;
	
	@FindBy(xpath = "//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement plus;
	
	
	@FindBy(xpath = "//ki-select-control[@placeholder='Reason/Reporting Status']//input[@id='undefined']")
	public WebElement Reason;
	
	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement AppointmentSave;
	
	
	
	
	
	
	
	
	
	
	
	public void patientreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Organisation.sendKeys(ORGANISATION);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		docAdd.click();
		Thread.sleep(1000);
		//	Insurance.click();
		///Thread.sleep(1000);
		//	Inscorp.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Company[Corp]']")).click();
		//	PlanName.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Scheme']")).click();
		//Thread.sleep(1000);
		//	insAdd.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();

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
		HSSFSheet FOFullRegTest=wb.getSheetAt(63);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		SaveSuccess.click();
		Thread.sleep(2000);

	}






	public void  DoctorReferral(String MRNo,String remarks) throws InterruptedException, IOException {
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1200);

		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		// SelectPatient.click();
		Thread.sleep(2000);
		//patienthomepageicon.click();
		Thread.sleep(2000);
		// patienthomepagelock.click();
		////////////DocNote 
		Thread.sleep(1000);
		docnote.click();
		Thread.sleep(3000);
		//   createnote.click();
		Thread.sleep(1000);
		//////TemplateSelection
		encreate.clear();
		encreate.click();
		Thread.sleep(1000);
		encreate.sendKeys("Fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
		Thread.sleep(2000);
		template.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
		clickOK.click();
		Thread.sleep(1000);
		Referral.click();
		Thread.sleep(1000);
		DepNmae.click();
		Thread.sleep(1000);
		DepNmae.sendKeys("diet");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Diet And Nutrition Clinic.']")).click();
		DepProvider.click();
		Thread.sleep(1000);
		DepProvider.sendKeys("deepa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Deepa Rani(diet001)']")).click();
		Thread.sleep(1000);
		TimeFrame.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Urgent']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(remarks);
		Thread.sleep(1000);
		Referaladd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='icon emrsave']")).click();
	    Thread.sleep(2000);
}
	
public void CheckIn(String MRNo) throws InterruptedException {
	
	Thread.sleep(2000);
    EnterMRNo.click();
	Thread.sleep(1500);
    EnterMRNo.sendKeys(MRNo);
    Thread.sleep(1000);
    SearchButton.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	//PatientSelect.click();
	Thread.sleep(2000);
	bookApmnt.click();
	Thread.sleep(1000);
	
	
	entry.click();
	Thread.sleep(5000);
	List<WebElement> li=new ArrayList<WebElement>();
	li=driver.findElements(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[2]/div[1]"));


	//td[@class='slot-list ng-star-inserted']/div/span[1]

	for(WebElement element:li){
		if(Integer.parseInt(element.getText())>0){
			element.click();
			break;

		}

	}
	
	
	
	
	
	//act.moveToElement(entry).click().build().perform();
	//entry.click();
	Thread.sleep(1000);
	slot.click();
	Thread.sleep(2000);
	act.moveToElement(plus).click().build().perform();
	Thread.sleep(2000);
	Reason.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Referral']")).click();
	Thread.sleep(1000);
	AppointmentSave.click();
	Thread.sleep(1000);
	Checkin.click();
	Thread.sleep(1000);
	CheckinAdd.click();
	Thread.sleep(1000);
	billSave.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
	
	Thread.sleep(2000);
	
	
	
	
	
}

}
