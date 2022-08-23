package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class FO_MandatoryFieldValidationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_MandatoryFieldValidationYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement save;
	
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//div[contains(@class,'col-md-3 mbl-pr0')]//div[contains(@class,'card-body')]//div[2]//div[3]//ki-select-control[1]//div[1]//input[1]")
	public WebElement gender;
	

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[contains(@class,'form-group ng-star-inserted')]//input[@id='mobilephone']")
	public WebElement phoneno;
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement SelectOrganisation;
	
	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/lib-address[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement alternateaddress;
	
	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement docIdentification;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;
	
	@FindBy(xpath = "//label[contains(@class,'ng-star-inserted')]//i[contains(@class,'ki ki-plus')]")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[normalize-space()='How did you know about the hospital?']")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//label[normalize-space()='Newspaper']")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm sm active pull-right']")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement successok;
	
	 @FindBy(xpath="//i[@class='ki ki-user']")
	  public WebElement Patientedit;
	  
	  @FindBy(xpath="//i[@class='ki ki-pencil']") 
	  public WebElement editicon;
	  
	  @FindBy(xpath="//input[@id='patientstatusid']") 
	  public WebElement Status;
	  
	  @FindBy(xpath="//input[@id='searchtext']") 
	  public WebElement searchname;
	  
	  @FindBy(xpath="//i[@class='ki ki-search']") 
	  public WebElement searchbutton;
	  
	  @FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]") 
	  public WebElement clickonname;
	  
	  @FindBy(xpath="//i[@class='ki ki-calendar']") 
	  public WebElement appoinment;
	  
	  @FindBy(xpath="//i[@class='ki ki-filter-list']") 
	  public WebElement filter;
	  
	  @FindBy(xpath="//input[@id='providerSearchDb']") 
	  public WebElement searchdept;
	  
		@FindBy(xpath = "//button[contains(text(),'Save')]")
		public WebElement appsave;
		
		@FindBy(xpath = "//button[contains(text(),'OK')]")
		public WebElement appok;
	  
		@FindBy(xpath = "//input[@id='daycount']")
		public WebElement nodays;
		
		@FindBy(xpath = "//input[@id='repeatCount']")
		public WebElement endafter;
		
		@FindBy(xpath = "//button[@id='repaeatappointmentbuttonid']")
		public WebElement buttoncontinue;
		
		@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
		public WebElement resourcedetails;
		
		@FindBy(xpath = "//ki-select-control[@formcontrolname='prefcardordertyperefid']//input[@id='']")
		public WebElement resource;
		
		@FindBy(xpath = "//li[normalize-space()='Human Resource']")
		public WebElement selectresource;
		
		@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-dirty ng-invalid']//input[@id='']")
		public WebElement resourcetype;
		
		@FindBy(xpath = "//li[normalize-space()='Doctor']")
		public WebElement selectresourcetype;
		
		@FindBy(xpath = "//li[normalize-space()='Doctor']")
		public WebElement entername;
		
		@FindBy(xpath = "//li[normalize-space()='Aswathy(TVM00050)']")
		public WebElement selectname;
	  
	 
	




	  
	  
	  
	public void ERBedAllocation(String Firstname) throws InterruptedException
	{
/////////////////////Validating the mandatory field of FO
		save.click();
		Thread.sleep(5000);
/////////////////////////////////// Switching the language
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[2]/i[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[2]/i[1]")).click();
		
	}
	
	public void registeration(String Title,String Firstname,String Lastname ,String status,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn,String gend,String alteraddress,String MrNoAppoinmt,String filtr,String departname,String doctorname, String MRNo) throws InterruptedException, IOException
	{
		Thread.sleep(500);
	    driver.findElement(By.xpath("//div[@class='card-body']//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")).click();
	    Thread.sleep(900);
	    driver.findElement(By.xpath("//*[contains(text(),'" + Title + "')]")).click();
		firstname.sendKeys(Firstname);
		Thread.sleep(800);
		
		WebElement inputBox=driver.findElement(By.xpath("//div[@class='card-body']//div[2]//div[3]//ki-select-control[1]//div[1]//input[1]"));
		String textInsideInputBox=inputBox.getAttribute("value");
		if(textInsideInputBox.isEmpty())
		{
			gender.click();	
			Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[contains(text(),'" + gend + "')]")).click();
			//gender.sendKeys("Male");
		}
		
		Thread.sleep(1000);
		organisation.click();
		Thread.sleep(500);
		organisation.sendKeys("KIMS");
		Thread.sleep(900);
     	SelectOrganisation.click();
		age.sendKeys(Age);
		phoneno.sendKeys(Phoneno);
		//driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		//driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[2]/ki-checkbox[1]/label[1]/label[1]/span[1]")).click();
		//driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[3]/ki-checkbox[1]/label[1]/label[1]/span[1]")).click();
		//driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[4]/ki-checkbox[1]/label[1]/label[1]/span[1]")).click();
		contInformation.click();
		homeadd1.sendKeys(HAddress);
		driver.findElement(By.xpath("//span[contains(text(),'Alternative')]")).click();
		alternateaddress.sendKeys(alteraddress);
		docIdentification.click();
		docnumber.sendKeys(Keys.HOME +Documentno);
		docadd.click();
		Thread.sleep(800);
		howdiduknow.click();
		Thread.sleep(500);
		checknewspaper.click();
		Thread.sleep(700);
		howdiduknowOk.click();
		Thread.sleep(800);
		
		fosave.click();
		
		
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
		HSSFSheet FFieldValidation=wb.getSheetAt(24);	
		int i=FFieldValidation.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FFieldValidation.getRow(i).createCell(9).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		
	
		Thread.sleep(1000);
		successok.click();
		Thread.sleep(2000);
		
//////////////////////////////	register the patient and edit and change the status of the patient
		
		Patientedit.click();
		Thread.sleep(800);
		editicon.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + status + "')]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='updateregistrationbutton']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
		
		Thread.sleep(800);
		searchname.sendKeys(MRNo);
		searchbutton.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//clickonname.click();
		Thread.sleep(800);
		appoinment.click();
		Thread.sleep(800);
		filter.click();
//////////////////////////////making favourite and unfavourite and viewing the information
		
		searchdept.sendKeys(doctorname);
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@title='Search']")).click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//*[contains(text(),'" + doctorname + "')]")).click();
		appoinment.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='provider-name'][normalize-space()='John Peter(docjp)']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[2]/label[2]/i[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='provider-name'][normalize-space()='John Peter(docjp)']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[2]/label[1]/i[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='provider-name'][normalize-space()='John Peter(docjp)']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@title='Add to favorites list']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
/////////////////// Taking appoinment after filtering	
		
		filter.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='type']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + filtr + "')]")).click();
		Thread.sleep(800);
		searchdept.sendKeys(departname);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + departname + "')]")).click();
		Thread.sleep(800);
		appoinment.click();
		
		Thread.sleep(5000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/div[1]"));
		
		
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
//////////Booking repeat appoinment
		driver.findElement(By.xpath("//label[normalize-space()='Repeat']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		nodays.sendKeys("3");
		endafter.sendKeys("2");
		buttoncontinue.click();	
		Thread.sleep(500);
		resourcedetails.click();
		Thread.sleep(500);
///////////////////Resource Details
		resource.click();
		selectresource.click();
		Thread.sleep(500);
		resourcetype.click();
		selectresourcetype.click();
		entername.sendKeys("aswathy");
		Thread.sleep(900);
		selectname.click();
		Thread.sleep(500);
		appsave.click();
    	Thread.sleep(3000);
    	appok.click();
    	Thread.sleep(500);
		driver.findElement(By.xpath("//label[@class='check-container session-splitter']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Free Slots']//span[@class='checkmark']")).click();
		Thread.sleep(500);
	}
	
	

}
