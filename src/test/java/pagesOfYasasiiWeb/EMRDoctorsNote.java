package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRDoctorsNote extends PageFactoryInitYasasiiWeb{
	
	public EMRDoctorsNote(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnote;
	
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement createnote;
	
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement enccreate;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement AddNoCurrentMedication;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement AddReconcillation;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[5]/label[1]/span[1]/i[1]")
	public WebElement Recon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[1]/div[2]/label[3]/label[2]/span[1]/i[1]")
	public WebElement Reconcilationicon;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement ReconcilationConfirmation;
	
	@FindBy(xpath = "//div[@id='emrdashboard_preview']")
	public WebElement emrpreview;
	
	@FindBy(xpath = "//div[@id='emrdashboard_save']")
	public WebElement emrsave;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	

	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement patienthomepageicon;
	
	
	
//	public void EMRdocnoteReconcillation() throws InterruptedException {
//		
//		docnote.click();
//		Thread.sleep(3000);
//		enccreate.click();
//		enccreate.sendKeys("fever");
//		driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
//		Thread.sleep(2000);
//		template.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
//		clickOK.click();
//			CPOEPharmacy.click();
//			AddNoCurrentMedication.click();
//			Thread.sleep(2000);
//			AddReconcillation.click();
//	       	Thread.sleep(2000);
//	    	Recon.click();
//	    	Thread.sleep(3000);
//    		Reconcilationicon.click();
//        	Thread.sleep(2000);
//    		ReconcilationConfirmation.click();
//		    emrpreview.click();
//		    emrsave.click();
//	}
//	
public EMRDoctorsNoteSOAPYasasiiWeb EMRdocnote(String MRNo) throws InterruptedException {
////////////Click on doctor note and select the template
//	Thread.sleep(5000);
//	docnote.click();
//	Thread.sleep(3000);
//	createnote.click();
	

	
	
	Thread.sleep(5000);
	docnote.click();
	Thread.sleep(1000);
	
	
List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
	
	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
	}
	  Thread.sleep(800); 

	
	
	
//	
//	enccreate.click();
//	Thread.sleep(3000);
	  Thread.sleep(1000);
	  enccreate.clear();
	enccreate.sendKeys("fever");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
	Thread.sleep(1000);
	template.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
	Thread.sleep(1000);
	clickOK.click();
//	else
//	{
//		WebElement set1 = driver.findElement(By.xpath("//button[contains(text(),'Create New Note')]"));
//		act.moveToElement(set1).click().build().perform();
//		Thread.sleep(1000);
//		
//		template.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
//	}
	return new EMRDoctorsNoteSOAPYasasiiWeb(driver);
	
}
}
