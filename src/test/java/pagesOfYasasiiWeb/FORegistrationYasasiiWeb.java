package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FORegistrationYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public FORegistrationYasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//input[@id='homeaddress2']")
	public WebElement homeadd2;

	@FindBy(xpath = "//span[contains(text(),' Document Identification ')]")
	public WebElement docIdentification;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/button[1]/label[1]/i[1]")
	public WebElement docadd;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[2]/button[1]")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[1]/div[1]/label[1]/span[1]")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement successok;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[8]/div[1]/div[1]")
	public WebElement remarks;
	
	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement remarksarea;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[7]/div[1]/div[1]/div[1]/div[1]")
	public WebElement documentstab;
	
	 @FindBy(xpath="//input[@id='filecategoryid']")
	 public WebElement filecategory;
	 
	
	@FindBy(xpath="//input[@id='filesubcategoryid']")
	public WebElement subcategory;
	
	@FindBy(xpath="//button[contains(text(),'Attach')]")
	public WebElement docattachment;
	
	
	/*
	 * public boolean isFOwarningPresent1() { if(FOwarningMessage.isDisplayed())
	 * return true ; else return false; }
	 */
	
	public FOEncounterYasasiiWeb enterFORegDetails(String myfirstname, String mylastname ,String mygender, String myage, String myphoneno,
			String myhomeadd1, String myhomeadd2,String mydocnumber) throws InterruptedException, IOException {
////////////////////////Register a patient	
		Thread.sleep(1000);
		firstname.sendKeys(myfirstname);
		lastname.sendKeys(mylastname);
		gender.click();
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\"" + mygender + "\")]")).click();
		age.sendKeys(myage);
		age.sendKeys(Keys.ENTER);
		phoneno.sendKeys(myphoneno);
		organisation.sendKeys("Ki");
		driver.findElement(By.xpath("//li[contains(text(),'KIMS')]")).click();
		contInformation.click();
		Thread.sleep(1000);
		homeadd1.sendKeys(myhomeadd1);
		homeadd2.sendKeys(myhomeadd2);
		docIdentification.click();
		docnumber.sendKeys(Keys.HOME + mydocnumber);
		docadd.click();
		Thread.sleep(1000);
//		documentstab.click();
//		Thread.sleep(2000);
//		filecategory.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[contains(text(),'FO')]")).click();
//		Thread.sleep(1000);
//		subcategory.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[contains(text(),'Identifying Document')]")).click();
//		docattachment.click();
//		Thread.sleep(10000);
//		Runtime.getRuntime().exec("C:\\Users\\Mathews\\Documents\\upload.exe");
//		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", remarks);
		Thread.sleep(5000);
		remarks.click();
		remarksarea.sendKeys("patient suffering from high fever");
		Thread.sleep(5000);
		howdiduknow.click();
		checknewspaper.click();
		Thread.sleep(1000);
		howdiduknowOk.click();
		Thread.sleep(5000);
		fosave.click();
		Thread.sleep(2000);
		successok.click();
		
		return new FOEncounterYasasiiWeb(driver);
		
		
		
	}
	
	
	
}
