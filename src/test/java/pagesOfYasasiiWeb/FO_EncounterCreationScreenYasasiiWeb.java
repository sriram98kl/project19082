package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_EncounterCreationScreenYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_EncounterCreationScreenYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement PatientSelect;
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement Selectprovider;
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Plus;
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement SAve;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement Okey;
	
	
	public void takingEncounter(String MRNo,String doctor) throws InterruptedException {
///////////////Create encounter for the patient
	   Thread.sleep(2000);
//	   EnterMRNo.clear();
//	   Thread.sleep(800);
//	    EnterMRNo.click();
//	    Thread.sleep(800);
//	    EnterMRNo.sendKeys(MRNo);
//        Thread.sleep(2000);
//	    SearchButton.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
//		//PatientSelect.click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
		Thread.sleep(1000);
		EnterProviderName.sendKeys(doctor);
		Thread.sleep(1300);
		driver.findElement(By.xpath("//*[contains(text(),'" + doctor + "')]")).click();
		Thread.sleep(1300);
	//	Selectprovider.click();
		Thread.sleep(1000);
		Plus.click();
		Thread.sleep(800);
		SAve.click();
		Thread.sleep(1000);
		Okey.click();
		Thread.sleep(2000);
		EnterMRNo.clear();
		Thread.sleep(1000);
	}
}
