package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_ERBedAllocation  extends PageFactoryInitYasasiiWeb{

	public EMR_ERBedAllocation(WebDriver driver) {

		super(driver);

	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Hamburger;
	//	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	//	public WebElement modul;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement FOModule;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement Registration;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
	@FindBy(xpath = "//li[contains(text(),'Miss')]")
	public WebElement SelectMiss;
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")  
	public WebElement EnterFirstNME;
	@FindBy(xpath = "//input[@id='age']")
	public WebElement EnterAge;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement EmergencyCheckBox;
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK;
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement Selectprovider;
	@FindBy(xpath = "//label[@title='Add']")
	public WebElement Plus;
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement SAve;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement Okey;
	@FindBy(xpath = "//div[contains(text(),'ADT')]")
	public WebElement ADT;
	@FindBy(xpath = "//input[@id='admittedproviderdisplayname']")
	public WebElement EnterInchargeProvider;
	@FindBy(xpath = "//li[contains(text(),'Vincent')]")
	public WebElement SelectinchargeProvider;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNumber;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SaVe;


	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement downarrow;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement logout;

	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutok;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement usernameenter;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement Passwordenter;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement siteclick;

	@FindBy(xpath = "//li[normalize-space()='KIMSHEALTH TVM']")
	public WebElement siteselect;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	public WebElement Login;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Module;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement SelectModule;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement EMR;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement ERSelect;
	@FindBy(xpath = "//li[contains(text(),'ER')]")
	public WebElement SelectER;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
	public WebElement SelectPatient;
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement Arrow;
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement EnterMedicinename;
	@FindBy(xpath = "//*[contains(text(),'Ultracet Semi')]")
	public WebElement SelectMedicine;
	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement MedicineOrder;
	@FindBy(xpath = "//li[contains(text(),'Ongoing')]")
	public WebElement Ongoing;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement Type;
	@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
	public WebElement OwnMedication;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADD;
	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement ThreeDots;
	@FindBy(xpath = "//div[contains(text(),'Discontinue/Hold')]")
	public WebElement DiscontinueHold;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-discontinuehold[1]/form[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	public WebElement oK;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement SAVe;
	@FindBy(xpath = "//label[@class='icon adtview']")
	public WebElement adt;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Discharge;
	@FindBy(xpath = "//li[normalize-space()='Cured']")
	public WebElement Cured;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement Selectdispostn;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement sAve;



	public void ERBedAllocation(String Patientname,String MRNo,String age,String doctor) throws InterruptedException, IOException {

		Thread.sleep(1000);
		//	Hamburger.click();
		//	
		//	
		//	 
		//	Thread.sleep(800);
		//	FOModule.click();
		//	Thread.sleep(500);
		//	Registration.click();
		//	Thread.sleep(800);

		/////////////Create an ER patient


		Title.click();
		SelectMiss.click();
		Thread.sleep(900);
		EnterFirstNME.sendKeys(Patientname);
		EnterAge.sendKeys(age);
		Thread.sleep(2000);




		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}



		//	WebElement chedkox=driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']"));
		//		Thread.sleep(600);
		//		chedkox.click();
		Save.click();
		Thread.sleep(3000);

		///////////Write the MRno. to excel

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
		HSSFSheet ERBedAllocation=wb.getSheetAt(13);	
		int i=ERBedAllocation.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		ERBedAllocation.getRow(i).createCell(1).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		OK.click();
		Thread.sleep(3000);

		//////////////Taking the encounter

		EnterProviderName.sendKeys(doctor);
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+doctor+"')])[1]")).click();
		Thread.sleep(800);
		Plus.click();
		Thread.sleep(800);
		SAve.click();
		Thread.sleep(1000);
		Okey.click();
		Thread.sleep(600);


		////NEED TO UNCOMMENT AFTER DEMO FROM 246 TO 325



		////////////Admit the ER patient

		ADT.click();
		Thread.sleep(1000);
		//EnterInchargeProvider.sendKeys("Mohan");
		Thread.sleep(600);
		//SelectinchargeProvider.click();
		RoomType.click();
		Thread.sleep(600);
		SelectRoomType.click();
		Thread.sleep(600);
		BedNumber.click();
		Thread.sleep(600);
		SelectBed.click();
		//driver.findElement(By.xpath("//label[normalize-space()='Insured']//span[@class='checkmark']")).click();
		SaVe.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();

	
	}


	//	Module.click();
	//	Thread.sleep(800);
	//	SelectModule.click();
	//	Thread.sleep(1000);
	//	EMR.click();
	//	Thread.sleep(800);
	//	EMRHomeScreen.click();


	////////Create doctor note for the ER patient

	public void DoctorNote(String MRNo) throws InterruptedException {

		////////////Log out and log in as the doctor
		Thread.sleep(2000);
		downarrow.click();
		Thread.sleep(900);
		logout.click();
		Thread.sleep(3000);
		logoutok.click();
		Thread.sleep(1000);
		usernameenter.sendKeys("DOCAS");
		Passwordenter.sendKeys("Kameda321");
		siteclick.click();
		Thread.sleep(900);
		siteselect.click();	
		Login.click();
		Thread.sleep(3000);


		Thread.sleep(600);
		ERSelect.click();
		Thread.sleep(600);
		SelectER.click();
		EnterName.sendKeys(MRNo);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//SelectPatient.click();
		Thread.sleep(900);
		Arrow.click();
		Thread.sleep(900);
		Lock.click();
		Thread.sleep(900);
		DoctorNote.click();
		Thread.sleep(500);
		EnterChiefComplaint.sendKeys("hedache");
		Thread.sleep(900);
		template.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
		Ok.click();
		Thread.sleep(2000);
		CPOEPharmacy.click();
		Thread.sleep(1500);
		EnterMedicinename.sendKeys("Ultracet");
		Thread.sleep(900);
		SelectMedicine.click();
		Thread.sleep(1000);
		MedicineOrder.click();
		Thread.sleep(900);
		Ongoing.click();
		Type.click();
		Thread.sleep(900);
		OwnMedication.click();
		Thread.sleep(900);
		ADD.click();
		Thread.sleep(1000);
		ThreeDots.click();
		Thread.sleep(900);
		DiscontinueHold.click();
		Thread.sleep(900);
		oK.click();
		Thread.sleep(2000);
		SAVe.click();

		//////////Discharge the patient


	
	}

}



