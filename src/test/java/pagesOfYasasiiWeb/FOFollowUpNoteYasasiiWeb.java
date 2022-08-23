package pagesOfYasasiiWeb;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class FOFollowUpNoteYasasiiWeb extends PageFactoryInitYasasiiWeb {
	public FOFollowUpNoteYasasiiWeb(WebDriver driver) {
		super(driver);

}


@FindBy(xpath="//li/a/label/div/div")
public WebElement EMRmenu;
@FindBy(xpath="//label/i[@class='ki ki-reception-fill']")
public WebElement FO;
@FindBy(xpath="//input[@id='searchtext']")
public WebElement search;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
public WebElement patientselect;
@FindBy(xpath="//div[@class='col-md-8 pl-0']//input[1]")
public WebElement service;
@FindBy(xpath="//i[@class='ki ki-plus']")
public WebElement add;
@FindBy(xpath="//button[@id='billingsave']")
public WebElement save;
@FindBy(xpath="//button[contains(text(),'OK')]")
public WebElement OK;
//logout	
@FindBy(xpath="//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
public WebElement logdown;
@FindBy(xpath="//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
public WebElement logout;
@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
public WebElement yes;
//login doctor
@FindBy(xpath="//input[@id='loginemail']")
public WebElement userid;
@FindBy(xpath="//input[@id='loginpassword']")
public WebElement password;
@FindBy(xpath="//input[@id='loginsite']")
public WebElement site;
@FindBy(xpath="//button[normalize-space()='Login']")
public WebElement login;










public Object FOfollowup(String MRNo) throws InterruptedException, IOException {

///////////////From Fo,select a patient 
	Thread.sleep(1000);
	EMRmenu.click();
	Thread.sleep(1000);
	FO.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'Registration')]")).click();
	Thread.sleep(2000);
	search.click();
	Thread.sleep(1000);
	search.sendKeys(MRNo);
	search.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	patientselect.click();
//////////////Take follow up consultation
	Thread.sleep(1000);
	service.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Follow-up Consultation']")).click();
	Thread.sleep(1000);
	add.click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(8000);
	OK.click();
	Thread.sleep(1000);
	logdown.click();
	Thread.sleep(1000);
	logout.click();
	Thread.sleep(1000);
	yes.click();
/////////////Login as doctor
	Thread.sleep(3000);
	userid.click();
	userid.sendKeys("DOCAS");
	userid.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	password.click();
	Thread.sleep(1000);
	password.sendKeys("Kameda321");
	password.sendKeys(Keys.ENTER);
	
	Thread.sleep(1000);
	site.click();
	driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
	Thread.sleep(1000);
	login.click();
	Thread.sleep(1000);
	
	return EMRFollowupNoteYasasiiWeb(driver);
	
	
	
}

	private Object EMRFollowupNoteYasasiiWeb(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}
