package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_MrNoCheckingWithDifferentSitesYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public FO_MrNoCheckingWithDifferentSitesYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")    
	public WebElement firstname;
	

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement phonecode;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement phoneno;
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;
	
	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;
	

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement docIdentification;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;
	
	@FindBy(xpath = "//label[@class='ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement Iddocadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[2]/button[1]")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[1]/div[1]/label[1]/span[1]")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement save;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement saveOK;
	
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


public void enterFOFullRegDetails(String name,String myage, String phone, String docno,String MRNo1) throws InterruptedException, IOException {
/////////Log in as admin and register one patient
	title.click();
	driver.findElement(By.xpath("//li[contains(text(),'Mrs')]")).click();
	Thread.sleep(600);
	firstname.sendKeys(name);
//	gender.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//li[normalize-space()='Male']"));
	Thread.sleep(500);
	age.sendKeys(myage);
	age.sendKeys(Keys.ENTER);
	phoneno.sendKeys(phone);
	Thread.sleep(1000);
	organisation.sendKeys("Ki");
	driver.findElement(By.xpath("//li[contains(text(),'KIMS')]")).click();
	contInformation.click();
	Thread.sleep(1000);
	homeadd1.sendKeys("Kollam");
	docIdentification.click();
	docnumber.sendKeys( Keys.HOME+ docno);
	Iddocadd.click();
	Thread.sleep(5000);
	howdiduknow.click();
	checknewspaper.click();
	Thread.sleep(1000);
	howdiduknowOk.click();
	Thread.sleep(5000);
	save.click();
	Thread.sleep(800);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
	
	if(dynamicElement.size() !=0)
	{
		
	}

	
	else
	{
		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
	}
	
	
	
/////////////Write MRNo to excel sheet
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
	HSSFSheet FOFullRegTest=wb.getSheetAt(18);	
	int i=FOFullRegTest.getLastRowNum();
	System.out.println("Number of rows: " + i);		
	FOFullRegTest.getRow(i).createCell(8).setCellValue(word[1]);	
	FileOutputStream fout=new FileOutputStream(src);	
	wb.write(fout);
	
	
	
	Thread.sleep(1000);
	saveOK.click();
	downarrow.click();
	logout.click();
	Thread.sleep(3000);
	logoutok.click();
	Thread.sleep(1000);
}


public void NextSite(String myname,String myagea, String myphone, String mydocno,String MRNo2) throws InterruptedException, IOException {

	///////////Log in another site and register a patient 
	
	
	usernameenter.sendKeys("admin");
	Passwordenter.sendKeys("kameda321");
	siteclick.click();
	Thread.sleep(900);
	siteselect.click();
	Login.click();
	Thread.sleep(1000);
	title.click();
	driver.findElement(By.xpath("//li[contains(text(),'Mrs')]")).click();
	Thread.sleep(600);
	firstname.sendKeys(myname);
//	gender.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//li[normalize-space()='Male']"));
	Thread.sleep(500);
	age.sendKeys(myagea);
	age.sendKeys(Keys.ENTER);
	phoneno.sendKeys(myphone);
	Thread.sleep(1000);
	organisation.sendKeys("Ki");
	driver.findElement(By.xpath("//li[contains(text(),'KIMS')]")).click();
	contInformation.click();
	Thread.sleep(1000);
	homeadd1.sendKeys("Thiruvananthapuram");
	docIdentification.click();
	docnumber.sendKeys(Keys.HOME + mydocno);
	Iddocadd.click();
	Thread.sleep(5000);
	howdiduknow.click();
	checknewspaper.click();
	Thread.sleep(1000);
	howdiduknowOk.click();
	Thread.sleep(5000);
	save.click();
	Thread.sleep(800);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
	
	if(dynamicElement.size() !=0)
	{
		
	}

	
	else
	{
		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
	}
/////////////Write MRNo to excel sheet
	
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
	HSSFSheet FOFullRegTest=wb.getSheetAt(18);	
	int i=FOFullRegTest.getLastRowNum();
	System.out.println("Number of rows: " + i);		
	FOFullRegTest.getRow(i).createCell(9).setCellValue(word[1]);	
	FileOutputStream fout=new FileOutputStream(src);	
	wb.write(fout);
	
	Thread.sleep(1000);
	saveOK.click();
//	downarrow.click();
//	logout.click();
//	Thread.sleep(2000);
//	logoutok.click();
}
}
