package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRIPNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRIPNoteYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement maincategory;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement ipselection;
	
	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement subcategory;
	
	@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;
	
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Menudropdown;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectop;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]/i[1]")
	public WebElement patientselect;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelock;
	
	
	public EMRDoctorsNote enterEMRHomePage() throws InterruptedException, IOException {
////////////Select an IP patient
		Thread.sleep(1000);
		maincategory.click(); 
		Thread.sleep(500); 
		ipselection.click();
//		  Thread.sleep(3000); 
//		  EMRhomescreen.click();
//		  Thread.sleep(3000);
//		  Menudropdown.click();
//		  selectop.click();
//		  Thread.sleep(5000);
		  patientselect.click();
		  Thread.sleep(5000);
		  patienthomepageicon.click();
		  patienthomepagelock.click();
		  Thread.sleep(5000);
		  return new EMRDoctorsNote(driver);

		
	}

}
