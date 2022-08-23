package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOAppointment extends PageFactoryInitYasasiiWeb{

	public FOAppointment(WebDriver driver) {
			super(driver);
	}
	
	@FindBy(xpath= "//div[contains(text(),'Appointment')]")
	WebElement patientappointment;
	
	@FindBy(xpath= "//input[@placeholder='Search Resource..']")
	WebElement docsearch;
	
	@FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/span[1]")
	public WebElement appselection;
	
	
	@FindBy(xpath = "///td[contains(text(),'20:00')]")
	public WebElement appscroll;
	
	@FindBy(xpath = "//tbody/tr[4]/td[2]/div[2]/label[1]/i[1]")
	public WebElement appaddicon;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement appsave;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement appok;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/i[1]")
	public WebElement encountericon; 
	
	@FindBy(xpath = "//button[contains(text(),'Check-In')]")
	public WebElement checkin;
	
	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement encountersave; 
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement encountersaveok; 
	
  
    public void Outsiderappointment() throws InterruptedException
	{
    	
    	
   ////////////////Click appoinment screen and take an appoinment
    	
    	Thread.sleep(5000);
    	patientappointment.click();
    	docsearch.sendKeys("John Peter");
    	Thread.sleep(600);
    	appselection.click();
		Thread.sleep(5000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//td[@class='slot-list ng-star-inserted']/div/span[1]"));

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
		appsave.click();
    	Thread.sleep(3000);
    	appok.click();
		
	}
    
    public void encounterCheckIn() throws InterruptedException, IOException, AWTException {
    //////////Enter into encounter creation screen and do checkin
    	
		Thread.sleep(5000);
		encountericon.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='ki ki-print']")).click();
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);
		checkin.click();
		Thread.sleep(1000);
		docadd.click();
		Thread.sleep(500);
		encountersave.click();
		Thread.sleep(1000);
		encountersaveok.click();
	}
    
	}


