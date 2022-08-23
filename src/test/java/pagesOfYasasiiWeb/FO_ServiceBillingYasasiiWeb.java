package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_ServiceBillingYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_ServiceBillingYasasiiWeb(WebDriver driver) {

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

	
	
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providername;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement addneworder;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement plus;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement save;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-card[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/i[1]")
	public WebElement threedot;
	
	@FindBy(xpath = "//label[@class='remark']")
	public WebElement remarks;
	
	@FindBy(xpath = "//ki-textarea-control[@placeholder='Remarks']//textarea[@id='undefined']")
	public WebElement TextArea;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement sEARCHfield;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement sEARCHicon;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-card[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement Service1;
	
	@FindBy(xpath = "//label[@title='Clear']//i[@class='ki ki-close']")
	public WebElement Clear;
	
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement BillRemarks;
	
	
	
	
	

//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
//
//	@FindBy(xpath = "")
//	public WebElement searchname;
	
	
	
	
	
	
	public void EnterPatientDetails( String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn) throws InterruptedException, IOException
	{
		//////////////Register a patient with mandatory field entering
		
		Thread.sleep(500);
		firstname.sendKeys(Firstname);
		Thread.sleep(500);
		gender.click();	
		Thread.sleep(500);
	//	gender.sendKeys(Gender);
		driver.findElement(By.xpath("//*[contains(text(),'" + Gender + "')]")).click();
		Thread.sleep(1000);
		
List<WebElement> dynamicElement=driver.findElements(By.xpath("//label[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			System.out.println("sri");
		}

		
		else
		{
			driver.findElement(By.xpath("//label[@class='required ng-star-inserted']")).click();
		}
		
		Thread.sleep(1000);
		organisation.sendKeys(Organisatn);
		Thread.sleep(900);
     	SelectOrganisation.click();
     	Thread.sleep(900);
		age.sendKeys(Age);
		phoneno.sendKeys(Phoneno);
		Thread.sleep(900);
		contInformation.click();
		Thread.sleep(900);
		homeadd1.sendKeys(HAddress);
		Thread.sleep(900);
		docIdentification.click();
		Thread.sleep(1500);
		num.sendKeys(Keys.HOME + Documentno);
	//	docnumber.sendKeys(Documentno);
		Thread.sleep(900);
		docadd.click();
		Thread.sleep(800);
		howdiduknow.click();
		Thread.sleep(500);
		checknewspaper.click();
		Thread.sleep(900);
		howdiduknowOk.click();
		Thread.sleep(800);
		fosave.click();
		
//////////////Write MRNo to excel sheet
//		
//		Thread.sleep(3000);
//        String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
//    	System.out.println(mrno);
//		
//    	String word[]=mrno.split("[ :] ");
//		System.out.println("number of words: "+word.length);
//		for(int i=0;i<word.length;i++)
//		{
//			System.out.println("word["+i+"]="+word[i]);
//		}
//		System.out.println(word[1]);
//		
//		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb82190\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData82.xls");
//		FileInputStream fis=new FileInputStream(src);
//		HSSFWorkbook wb=new HSSFWorkbook(fis);
//		HSSFSheet RegistrationFirstNmae=wb.getSheetAt(36);	
//		int i=RegistrationFirstNmae.getLastRowNum();
//		System.out.println("Number of rows: " + i);		
//		RegistrationFirstNmae.getRow(i).createCell(10).setCellValue(word[1]);	
//    	FileOutputStream fout=new FileOutputStream(src);	
//		wb.write(fout);
		
	
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
	
	
	
	
	
///////////Doing combination billing. That is did registration and service billing in same billing
	
public void billing(String MRNo ,String Providername, String service) throws InterruptedException
{
	
	Thread.sleep(2000);
	sEARCHfield.click();
	Thread.sleep(1000);
	sEARCHfield.sendKeys(MRNo);
	Thread.sleep(1000);
	sEARCHicon.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Clear.click();
	Thread.sleep(2000);
	
	
	Service.click();
	Thread.sleep(800);
	//providername.sendKeys(Providername);
	Thread.sleep(800);
	//driver.findElement(By.xpath("//*[contains(text(),'" + Providername + "')]")).click();
	Thread.sleep(800);
	addneworder.click();
	Thread.sleep(800);
	servicename.sendKeys(service);
	Thread.sleep(800);
	driver.findElement(By.xpath("//*[contains(text(),'" + service + "')]")).click();
	Thread.sleep(800);
	plus.click();
	Thread.sleep(800);
	

JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", Service1);
//js.executeScript("window.scrollBy(0,1500)");
Thread.sleep(1200);
act.moveToElement(threedot).click().build().perform();
	//threedot.click();
	Thread.sleep(2000);
	remarks.click();
	Thread.sleep(1000);
	TextArea.click();
	Thread.sleep(800);
	TextArea.sendKeys("test Bill");
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[@class='btn btn-dark-green active sm mr0 mt0 mb0']")).click();
	Thread.sleep(800);
	
	
	}


public void save() throws InterruptedException
{
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", BillRemarks);
	Thread.sleep(1000);
	BillRemarks.click();
	Thread.sleep(1000);
	BillRemarks.sendKeys("bill completed");
	Thread.sleep(1000);
	save.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
	Thread.sleep(800);
}
}
