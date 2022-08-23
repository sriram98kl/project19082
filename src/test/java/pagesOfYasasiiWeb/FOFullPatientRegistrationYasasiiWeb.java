package pagesOfYasasiiWeb;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOFullPatientRegistrationYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public FOFullPatientRegistrationYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[2]/i[1]")
	public WebElement camera;

	@FindBy(xpath = "//button[contains(text(),'Take A Snapshot')]")
	public WebElement takeasnap;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")    
	public WebElement firstname;

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middlename;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement phonecode;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement phoneno;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement altphonecode;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement altphoneno;

	@FindBy(xpath = "//input[@id='familyname']")
	public WebElement familyname;

	@FindBy(xpath = "//input[@id='mothermaidenname']")
	public WebElement mothermaidenname;

	@FindBy(xpath = "//input[@id='bloodgroup']")
	public WebElement bloodgroup;

	@FindBy(xpath = "//input[@id='nationality']")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='preferedlanguageid']")
	public WebElement preferedlanguageid;
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement vip;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[2]/ki-checkbox[1]/label[1]/label[1]/span[1]")
	public WebElement physicallychallenge;

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='personalemail']")
	public WebElement personalemail;

	@FindBy(xpath = "//input[@id='preferedcommunicationid']")
	public WebElement preferedcommunicationid;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//input[@id='homeaddress2']")
	public WebElement homeadd2;

	@FindBy(xpath = "//input[@id='homeCountry']")
	public WebElement homeCountry;

	@FindBy(xpath = "//input[@id='homeState']")
	public WebElement homeState;

	@FindBy(xpath = "//input[@id='homeCity']")
	public WebElement homeCity;

	@FindBy(xpath = "//input[@id='homezip']")
	public WebElement homezip;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement docIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;

	@FindBy(xpath = "//input[@id='issuedPlace']")
	public WebElement issuedPlace;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement IssuedDate;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validfrom;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validto;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/label[1]/label[1]/i[1]")
	public WebElement attachment;

	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/ki-documentscan[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")
	public WebElement docattachment;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement docattclose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/button[1]/label[1]")
	public WebElement Iddocadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement foRelatedMrnotab;

	@FindBy(xpath = "//input[@id='relatedmrno']")
	public WebElement relatedmrno;

	@FindBy(xpath = "//input[@id='relation']")
	public WebElement relation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[1]/div[3]/div[2]/button[1]/label[1]")
	public WebElement add;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/i[1]")
	public WebElement emcontact;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/ki-dialog-confirm[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement emcontactConfirmation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[6]/div[1]/div[1]/div[1]/div[1]")
	public WebElement emergencycontact;

	@FindBy(xpath = "//span[contains(text(),'Add')]")
	public WebElement docadd;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[8]/div[1]/div[1]/div[1]/div[1]")
	public WebElement remarks;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement remarksarea;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[7]/div[1]/div[1]/div[1]/div[1]")
	public WebElement documentstab;
		
	 @FindBy(xpath="//input[@id='filecategoryid']")
	 public WebElement filecategory;
	 
	@FindBy(xpath="//input[@id='filesubcategoryid']")
	public WebElement subcategory;

	@FindBy(xpath = "//button[contains(text(),'Attach')]")
	public WebElement docatt;

	@FindBy(xpath = "//button[contains(text(),'Capture')]")
	public WebElement doccap;
	
	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement checkbox;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-camera-component[1]/div[3]/div[1]/input[1]")
	public WebElement doccapname;

	@FindBy(xpath = "//button[contains(text(),'Take A Snapshot')]")
	public WebElement doccapsnapshot;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[2]/button[1]")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[1]/div[1]/label[1]/span[1]")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement saveok;


	public void enterFOFullRegDetails(String myfirstname, String mymiddlename, String mylastname, String myage,
			String myphoneno, String myaltphoneno) throws InterruptedException, IOException {

		Thread.sleep(500);
		
		/*
		 * WebElement camera=driver.findElement(By.xpath(
		 * "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[2]/i[1]"
		 * )); WebElement camerasel=driver.findElement(By.xpath(
		 * "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[2]/i[1]"
		 * )); act.moveToElement(camera).build().perform(); Thread.sleep(1000);
		 * act.moveToElement(camerasel).click().build().perform(); Thread.sleep(5000);
		 * takeasnap.click();
		 */
////////////////Register a patient
		
		title.click();
		driver.findElement(By.xpath("//li[contains(text(),'Mrs')]")).click();
		Thread.sleep(600);
		firstname.sendKeys(myfirstname);
		middlename.sendKeys(mymiddlename);
		lastname.sendKeys(mylastname);
		Thread.sleep(500);

		age.sendKeys(myage);
		age.sendKeys(Keys.ENTER);
		phoneno.sendKeys(myphoneno);
		altphoneno.sendKeys(myaltphoneno);
		
		
		
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			
		}

		
		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		//checkbox.click();

	}

	public void enterFOpatientInfDetails(String familyName,String Organisatin) throws InterruptedException, IOException {

		//////////////Enter Patient information
		
		
		familyname.sendKeys(familyName);
		mothermaidenname.sendKeys("Kipa Fernadas");
		Thread.sleep(500);
		bloodgroup.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'B+')]")).click();
		nationality.click();
		driver.findElement(By.xpath("//li[contains(text(),'Indian')]")).click();
		preferedlanguageid.click();
		driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();
		organisation.sendKeys(Organisatin);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		//vip.click();
		physicallychallenge.click();
	}

	public void enterFOcontactInfDetails(String myhomeadd1, String myhomeadd2,String mail)
			throws InterruptedException, IOException {

		//////////////Enter contact information
		
		
		contInformation.click();
		Thread.sleep(1000);
		personalemail.sendKeys(mail);
		preferedcommunicationid.click();
		driver.findElement(By.xpath("//li[contains(text(),'Phone')]")).click();
		homeadd1.sendKeys(myhomeadd1);
		homeadd2.sendKeys(myhomeadd2);
	}

	public void enterFOdocumentInfDetails(String mydocnumber) throws InterruptedException, IOException {


		//////////////Enter Document information
		
		docIdentification.click();
		docnumber.sendKeys(mydocnumber);
		issuedPlace.sendKeys("Chennai");
		IssuedDate.sendKeys("21/07/2010");
		validfrom.sendKeys("23/07/2010");
		Thread.sleep(500);
		validto.sendKeys("23/07/2022"); 
		Thread.sleep(5000);
//		attachment.click();
//		Thread.sleep(5000);
//		docattachment.click();
//		Thread.sleep(10000);
//		Runtime.getRuntime().exec("C:\\Users\\Mathews\\Documents\\upload.exe");
//		Thread.sleep(5000);
//		docattclose.click();
		Iddocadd.click();
		Thread.sleep(1000);
	}

	public void enterFORelatedMrnoDetails(String relatedMR) throws InterruptedException, IOException {

		

		//////////////Enter related MRNo details
		
		
		foRelatedMrnotab.click();
		relatedmrno.sendKeys(relatedMR);
		relatedmrno.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click();
		add.click();
		Thread.sleep(1000);
		emcontact.click();
		Thread.sleep(1000);
		emcontactConfirmation.click();
		Thread.sleep(2000);
		emergencycontact.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", documentstab);
		Thread.sleep(5000);
	}

	public void enterFOdocumentDetails() throws InterruptedException, IOException {


		//////////////Enter Document
		
		
		documentstab.click();
		Thread.sleep(2000);
		filecategory.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'FO')]")).click();
		Thread.sleep(1000);
		subcategory.click();
		driver.findElement(By.xpath("//li[contains(text(),'Identifying Document')]")).click();
		doccap.click();
		Thread.sleep(1000);
		doccapname.sendKeys("FO");
		doccapsnapshot.click();
		Thread.sleep(2000);
		System.out.println("first");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", remarks);
		Thread.sleep(5000);
		System.out.println("second");
	}

	public FOAppointment enterFOremarksDetails() throws InterruptedException, IOException {
		

		//////////////Enter remarks
		
		
	//	System.out.println("third");

		remarks.click();
		remarksarea.sendKeys("Patient is suffering from high fever");
		Thread.sleep(5000);
		howdiduknow.click();
		checknewspaper.click();
		Thread.sleep(1000);
		howdiduknowOk.click();
		Thread.sleep(5000);
		fosave.click();
		Thread.sleep(3000);
		
		
		
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(1);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(11).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		
		
		saveok.click();
		Thread.sleep(3000);
		return new FOAppointment(driver);
	}
}
