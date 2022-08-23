package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRHomePageYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRHomePageYasasiiWeb(WebDriver driver) {
		super(driver);
	}
//	@FindBy(xpath="//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
//	public WebElement toggle;
//	
//	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
//	public WebElement emr;
//	
//	@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
//	public WebElement EMRhomescreen;
//	
//	@FindBy(xpath="//input[@id='maincategory']")
//	public WebElement Menudropdown;
//	
//	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
//	public WebElement selectop;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectPatient;

	@FindBy(xpath = "//i[contains(@class,'dashboard-lock-arrow ki ki-chevron-up')]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement patienthomepagelock;
	
	
	public EMRDoctorsNote enterEMRHomePage(String firstname, String gender,String age,String encounter,String MRNo) throws InterruptedException, IOException {
///////////Select the pateint in EMR and lock the dash bar
		 Thread.sleep(1000);
		// System.out.println("hai111111111");
		 EnterPatientName.sendKeys(MRNo);
		// System.out.println("hai22222222222");
		 Thread.sleep(800);
		 
		 
		 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		// SelectPatient.click();
		// System.out.println("hai3333333333");
		  Thread.sleep(1000);
		 // patienthomepageicon.click();
		  Thread.sleep(1000);
		 // patienthomepagelock.click();
		  Thread.sleep(5000);
		  return new EMRDoctorsNote(driver);

		
	}

}
