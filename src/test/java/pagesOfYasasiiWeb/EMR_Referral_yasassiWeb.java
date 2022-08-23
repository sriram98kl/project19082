package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_Referral_yasassiWeb  extends PageFactoryInitYasasiiWeb {

	public EMR_Referral_yasassiWeb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;
	
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;
	
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;
	
	
	
	
	
	
	
	
	public void doctorNote(String MRNo , String SERVICE) throws InterruptedException {
		
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(3000);
		patientSelect.click();
		Thread.sleep(1000);
		//UParrow.click();
		//Lock.click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		  Thread.sleep(800); 
		 cheifComplaint.clear();
		cheifComplaint.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		cpoeService.click();
		Thread.sleep(1000);
		cpoeServiceSearch.click();
		Thread.sleep(1000);
		cpoeServiceSearch.sendKeys(SERVICE);
		Thread.sleep(1000);
				
				
	}
	

}
