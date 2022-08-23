package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_ERPatient_AdmitAsIP_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public FO_ERPatient_AdmitAsIP_YasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement regSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncounterSaveOK;


	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//i[@class='ki ki-user']")
	public WebElement patientInfo;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement EditInfo;

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement uncheckER;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

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

	@FindBy(xpath = "//button[@id='updateregistrationbutton']")
	public WebElement RegUpdate;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement roomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement bedno;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTsave;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement options;

	@FindBy(xpath = "//div[contains(text(),'Transfer to IP')]")
	public WebElement T2IP;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirm;


	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement ProviderNmae;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//label[contains(text(),'Allow Visitor')]")
	public WebElement ElementAllowVisitor;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement RoomCategory;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNumber;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
	public WebElement Billing;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	
	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Category;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName;
	
	@FindBy(xpath = "//label[contains(@class,'icon-btn btn-dark-green inline')]")
	public WebElement serviceAdd ;
	
	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement savebill ;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement transcDone;
	
	@FindBy(xpath = "//p[@class='mb-0 ng-star-inserted']")
	public WebElement Expand;
	
	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement ADDnew;
	
	
public void  ERpatientAdmit(String TITLE ,String NAME , String AGE , String MBLNO) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+TITLE+"']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement.size());
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}
		regSave.click();


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

		File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(48);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(4).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		SaveOK.click();  
		Thread.sleep(2000);
	}

	public void  encounter(String PROVIDER) throws InterruptedException {
		Thread.sleep(3000);
		ENCprvdrName.click();
		Thread.sleep(2000);
		ENCprvdrName.sendKeys(PROVIDER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(2000);
		EncounterSaveOK.click();



	}

	public void AdmitAsER() throws InterruptedException {
		Thread.sleep(2000);
		ADT.click();
		Thread.sleep(1000);
		roomType.click();
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		bedno.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		ADTsave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();



	}

	public void patientInfo(String MRNO, String ADDRESS ,String AADHAAR) throws InterruptedException {


		Thread.sleep(3000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		SearchIcon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		patientInfo.click();
		Thread.sleep(1000);
		EditInfo.click(); 

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		//uncheckER.click();
		organisation.click();
		organisation.sendKeys("kims");
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
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegUpdate.click();
		Thread.sleep(3000);
		SaveSuccess.click();
	}

	public void  transferToIP(String MRNO , String PROVIDER) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		ADT.click();
		Thread.sleep(1000);
		options.click(); 
		Thread.sleep(1000);
		T2IP.click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(2000);
		ProviderNmae.click();
		ProviderNmae.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"(docjp)']")).click();
		//li[normalize-space()='John Peter(docjp)']
		Priority.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ElementAllowVisitor);
		Thread.sleep(2000);
		RoomCategory.click();
		driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")).click();
		BedNumber.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		ADTSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		
}

public void ServiceAdd(String SERVICE) throws AWTException, InterruptedException {
	
	Billing.click();
	Thread.sleep(1000);
	Service.click();
	Thread.sleep(1000);
	ADDnew.click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
	ServiceName.click();
	Thread.sleep(1000);
	ServiceName.sendKeys(SERVICE);
	driver.findElement(By.xpath("//*[contains(text(),'" +SERVICE+ "')]")).click();
	Thread.sleep(2000);
	serviceAdd.click();
	Thread.sleep(2000);
	
	WebElement element = driver.findElement(By.xpath("//span[@class='pay-style']"));
	Thread.sleep(1000);
	
	
	
	Thread.sleep(2000);
	Robot r=new Robot(); 
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(800);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(800);
	
	Thread.sleep(2000);
	Expand.click();
	
	Thread.sleep(1500);
	//r.keyPress(KeyEvent.VK_DOWN);
	//Thread.sleep(1000);
	//r.keyRelease(KeyEvent.VK_DOWN);
	//Robot r=new Robot(); 
	//r.keyPress(KeyEvent.VK_CONTROL);
	//r.keyPress(KeyEvent.VK_END);
	//r.keyRelease(KeyEvent.VK_END);
	//r.keyRelease(KeyEvent.VK_CONTROL);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", element);

	Thread.sleep(5000);
	Thread.sleep(5000);
	Thread.sleep(1000);
	savebill.click();
	Thread.sleep(2000);
	transcDone.click();
	Thread.sleep(2000);
	
}









}







