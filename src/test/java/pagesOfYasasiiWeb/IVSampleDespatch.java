package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class IVSampleDespatch extends PageFactoryInitYasasiiWeb {
	public IVSampleDespatch(WebDriver driver) throws InterruptedException {
		super(driver);
		Thread.sleep(5000);
	}
		@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menutoggle;
	
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement module;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
	public WebElement Investigation;
	
	@FindBy(xpath = "//input[@id='executionlocid']")
	public WebElement executionLocation;
	
	@FindBy(xpath = "//li[contains(text(),'7th Level Sample Collection Point')]")
	public WebElement Level7th;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[2]")
	public WebElement OKbutton;
	
	
		@FindBy(xpath = "//input[@id='status']")
		public WebElement Sampleselection;
	
		@FindBy(xpath = "//li[contains(text(),'Sample Collection-Despatch Pending')]")
		public WebElement SampleDespatchPending;
	
		@FindBy(xpath = "//input[@id='mrno']")
		public WebElement textfield;
	
		@FindBy(xpath = "/html/body/app-root/app-layout/main/inv-samplecollection/div[1]/lib-searchlab/form/div[3]/div[2]/div/span/i")
		public WebElement searchbutton;

		@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]")
		public WebElement patientselection;
	
		@FindBy(xpath = "//button[@id='ondespatchid']")
		public WebElement Despatch;

		@FindBy(xpath = "//button[contains(text(),'OK')]")
		public WebElement oK; 
		
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement threedot;
		
		public IVSampleProcessingAfterDespatch enterIVSampleCollectionDeTails() throws InterruptedException{
			
			
			Thread.sleep(5000);
			menutoggle.click();
			Thread.sleep(5000);
			module.click();
			Thread.sleep(1000);
			Investigation.click();
			Thread.sleep(3000);
			executionLocation.click();
			Thread.sleep(3000);
			Level7th.click();
			OKbutton.click();
			Thread.sleep(5000);
			//Thread.sleep(2000);
			Sampleselection.click();
			Thread.sleep(2000);
			SampleDespatchPending.click();
			textfield.sendKeys("%%%");
			searchbutton.click();
			patientselection.click();
			Thread.sleep(5000);
			Despatch.click();
			oK.click();
//			WebElement threedots=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[1]/div[1]/div[1]/label[1]"));
//	    	WebElement threedothselect=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[1]/div[1]/div[1]/label[1]/i[1]"));
//			act.moveToElement(threedots).build().perform();
//			Thread.sleep(10000);
//			act.moveToElement(threedothselect).click().build().perform();
//			Thread.sleep(15000);
			Thread.sleep(5000);
			return new IVSampleProcessingAfterDespatch(driver);
			
		}
		
}
