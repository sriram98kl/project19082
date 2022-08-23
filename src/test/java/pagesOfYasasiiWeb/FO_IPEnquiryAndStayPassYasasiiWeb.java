package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_IPEnquiryAndStayPassYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public FO_IPEnquiryAndStayPassYasasiiWeb(WebDriver driver) {

		super(driver);

}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//li[8]//a[1]//span[1]")
	public WebElement adtcategory;
	
	@FindBy(xpath = "//span[normalize-space()='IP Enquiry']")
	public WebElement IPEnqury;
	
	@FindBy(xpath = "//i[@title='Large View']")
	public WebElement clickon1;
	
	@FindBy(xpath = "//i[@title='Color indication']")
	public WebElement clickon2;
	
	@FindBy(xpath = "//span[normalize-space()='Stay Pass']")
	public WebElement staypass;
	
	@FindBy(xpath = "//label[@class='adv-search-mrn0']//i[@title='Advanced Search']")
	public WebElement advancesearch;
	
	@FindBy(xpath = "//div[@class='col-md-4 col-4 plt-prt-5 col-md-6']//input[@id='maincategory']")
	public WebElement search;
	
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement ip;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[2]/div[1]/div[1]/div[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement selectpatient;
	
	@FindBy(xpath = "//button[@id='staypassprint']")
	public WebElement print;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement cclose;
	
	@FindBy(xpath = "//span[normalize-space()='Room/Bed Status']")
	public WebElement roomOrBedStatus;
	
	@FindBy(xpath = "//span[normalize-space()='Bed Status']")
	public WebElement bedstatus;

	@FindBy(xpath = "//tr[@class='active ng-star-inserted']//i")
	public WebElement viewstatus;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-roombed-status[1]/div[2]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/i[1]")
	public WebElement next;
	
//	@FindBy(xpath = "")
//	public WebElement bedstatus;
//	
//	@FindBy(xpath = "")
//	public WebElement bedstatus;
//	
//	@FindBy(xpath = "")
//	public WebElement bedstatus;
//	
//	@FindBy(xpath = "")
//	public WebElement bedstatus;
//	
//	@FindBy(xpath = "")
//	public WebElement bedstatus;
//	
//	@FindBy(xpath = "")
//	public WebElement bedstatus;
	
	
////////////IP Enquiry
	public void action() throws InterruptedException, AWTException
	{
		Menutoggle.click();
		Thread.sleep(800);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		adtcategory.click();
		Thread.sleep(800);
		IPEnqury.click();
		Thread.sleep(1000);
		clickon1.click();
		Thread.sleep(1000);
		clickon2.click();
		Thread.sleep(800);
		clickon2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
	}
/////////////stay pass
	
	public void action2() throws InterruptedException, AWTException
	{
		Thread.sleep(800);
		Menutoggle.click();
		Thread.sleep(800);
		staypass.click();
		Thread.sleep(800);
		advancesearch.click();
		Thread.sleep(800);
		search.click();
		Thread.sleep(800);
		ip.click();
		Thread.sleep(800);
		selectpatient.click();
		Thread.sleep(800);
		print.click();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		cclose.click();
		
		
		
	}
///////////Bedstatus
	public void action3() throws InterruptedException, AWTException
	{
		Thread.sleep(800);
		Menutoggle.click();
		Thread.sleep(800);
		roomOrBedStatus.click();
		Thread.sleep(800);
		bedstatus.click();
		Thread.sleep(800);
		viewstatus.click();
		Thread.sleep(1000);
		next.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active mr10']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		
		
	}
	
	
}


