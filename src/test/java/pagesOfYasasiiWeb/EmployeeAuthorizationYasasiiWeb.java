package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EmployeeAuthorizationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EmployeeAuthorizationYasasiiWeb(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	
//Login 	
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement toggle;
	
//Arrow
	@FindBy(xpath="//i[@class='ki ki-chevron-right']")
	public WebElement arrow;
	@FindBy(xpath="//button[@id='empauthsave']")
	public WebElement save;
//SearchUsers
	@FindBy(xpath="//input[@id='searchUsers']")
	public WebElement search;
	
@FindBy(xpath="//input[@id='deptname']")
public WebElement department;
@FindBy(xpath="(//i[@class='ki ki-trash'])[1]")
public WebElement delete;
@FindBy(xpath="//span[@class='user-name']")
public WebElement userlog;
@FindBy(xpath="//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
public WebElement logout;
@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
public WebElement yes;
@FindBy(xpath="//input[@id='loginemail']")
public WebElement login;
@FindBy(xpath="//input[@id='loginpassword']")
public WebElement password;
@FindBy(xpath="//input[@id='loginsite']")
public WebElement site;
@FindBy(xpath="//button[normalize-space()='Login']")
public WebElement login1;
//SelectingthePatient
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]")
public WebElement patientselect;
//
@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
public WebElement patienthomepageicon;

@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
public WebElement patienthomepagelock;

@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
public WebElement docnote;

@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
 public WebElement createnote;
	
@FindBy(xpath = "//input[@id='chiefcomplainttext']")
public WebElement encreate;

@FindBy(xpath = "//input[@id='emrtemplateid']")
public WebElement template;
@FindBy(xpath = "(//li)[23]")
public WebElement SOAP;
@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
public WebElement clickOK ;
@FindBy(xpath="//div[contains(text(),'Diagnosis and Plan')]")
public WebElement diagnosis;
@FindBy(xpath="//input[@id='db']")
public WebElement searchdignosis;
//savenote
@FindBy(xpath="//span[@class='icon emrsave']")
public WebElement savenote;	
	
@FindBy(xpath="//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
public WebElement EMR;	
	






	public void  authorize(String search1,String dep) throws InterruptedException {
		toggle.click();
		Thread.sleep(1000);
		EMR.click();
		driver.findElement(By.xpath("//span[normalize-space()='Employee Authorization']")).click();
		Thread.sleep(1000);//a[@title='To authorize employees']
//Selecting Authorize doctor
		driver.findElement(By.xpath("//label[normalize-space()='Amritha (amr1234)']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		arrow.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
//Search Users
		search.click();
		Thread.sleep(1000);
		search.sendKeys(search1);
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(1000);
//Searching by department
		department.click();
		Thread.sleep(1000);
		department.sendKeys(dep);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cardiology']")).click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-close']")).click();
		Thread.sleep(1000);
		
//Delete
		delete.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);

	}
	
}
