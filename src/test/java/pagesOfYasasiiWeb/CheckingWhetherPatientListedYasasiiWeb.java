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

public class CheckingWhetherPatientListedYasasiiWeb extends PageFactoryInitYasasiiWeb {
	protected static String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\excelYasasiiWeb\\TestDataYasasiiWeb.xls";

	public CheckingWhetherPatientListedYasasiiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[3]//ki-select-control[1]//div[1]//input[1]")
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

	
	
	public void EnterPatientDetails(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn) throws InterruptedException, IOException
	{
		//////////////Register a patient with mandatory field entering
		

	
		
		Thread.sleep(2000);
		firstname.sendKeys(Firstname);
		Thread.sleep(500);
		gender.click();	
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + Gender + "')]")).click();
	//	gender.sendKeys(Gender);
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
		organisation.sendKeys(Organisatn);
		Thread.sleep(900);
     	SelectOrganisation.click();
		age.sendKeys(Age);
		phoneno.sendKeys(Phoneno);				
		contInformation.click();
		Thread.sleep(800);
		homeadd1.sendKeys(HAddress);
		Thread.sleep(800);
		docIdentification.click();
		Thread.sleep(1500);
		num.sendKeys(Keys.HOME +Documentno);
	//	docnumber.sendKeys(Documentno);
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
		
		File src=new File("C:\\Users\\haritha\\eclipse-workspace\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\TestDataYasasiiWeb.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet Checking=wb.getSheetAt(52);	
	//	int j=1;
	//	int j=Checking.getLastRowNum();
		int j=Checking.getPhysicalNumberOfRows();
      

		System.out.println("Number of rows: " + j);		
		
		
		Checking.getRow(j).createCell(8).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		

		Thread.sleep(1000);
		successok.click();
		Thread.sleep(2000);
	
		
		
		
	}
	
	
	
	
	
	
	public void returning() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")).click();
	    Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='Registration']")).click();
		Thread.sleep(1000);
	
		
		
		
List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		if(dynamicElement1.size() !=0)
		{
			
		}

		
		else
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		}
		
		Thread.sleep(1000);
	
	
	}	
	

}

