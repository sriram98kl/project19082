package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_PatientRegistrationWithMandatoryFields extends PageFactoryInitYasasiiWeb {
	protected static String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\excelYasasiiWeb\\TestDataYasasiiWeb.xls";

	public FO_PatientRegistrationWithMandatoryFields(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
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
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm sm active pull-right']")
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
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;

	
	
	public void EnterPatientDetails(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn) throws InterruptedException, IOException
	{
		//////////////Register a patient with mandatory field entering
		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(500);
		firstname.sendKeys(Firstname);
		Thread.sleep(500);
		//gender.click();	
		Thread.sleep(500);
		//gender.sendKeys(Gender);
		
List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			
		}

		
		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		
		Thread.sleep(1000);
		organisation.sendKeys(Organisatn);
		Thread.sleep(900);
     	SelectOrganisation.click();
		age.sendKeys(Age);
		phoneno.sendKeys(Phoneno);				
		contInformation.click();
		homeadd1.sendKeys(HAddress);
		docIdentification.click();
		Thread.sleep(1500);
		//num.sendKeys(Keys.HOME + "2545214578596584");
		docnumber.sendKeys(Keys.HOME +Documentno);
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
		
		File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet RegistrationFirstNmae=wb.getSheetAt(19);	
		int i=RegistrationFirstNmae.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		RegistrationFirstNmae.getRow(i).createCell(6).setCellValue(word[1]);	
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
	
	
	
	
	
	
	
	
	
	
	
	

}
