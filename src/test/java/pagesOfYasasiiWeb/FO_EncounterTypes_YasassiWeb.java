package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_EncounterTypes_YasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public FO_EncounterTypes_YasassiWeb(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement regSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncounterSaveOK;

	@FindBy(xpath = "//i[@class='ki ki-info-square']")
	public WebElement EpisodeIcon;
	
	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;
	
	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'encountersubmode')]//input[@id='undefined']")
	public WebElement SubMode;
	
	
	@FindBy(xpath = "//span[normalize-space()='Episode']")
	public WebElement episode;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-encounter-episode-view[1]/div[2]/form[1]/tabset[1]/div[1]/tab[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/label[1]/i[1]")
	public WebElement encCancel;
	
	@FindBy(xpath = "//label[@title='Close Episode']//i[@class='ki ki-close']")
	public WebElement epiCancel;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade blockoutside in show']")
	public WebElement header;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement closedEpi;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement closedEnc;
	
	
	
	
	
	
	
	public void  ERpatientReg(String TITLE ,String NAME , String AGE , String MBLNO) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+TITLE+"']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement.size());
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}
		regSave.click();


		Thread.sleep(3000);
	
		SaveOK.click();  
		Thread.sleep(2000);
	}

	public void  ERencounter(String PROVIDER) throws InterruptedException {
		Thread.sleep(3000);
		ENCprvdrName.click();
		Thread.sleep(1000);
		ENCprvdrName.sendKeys(PROVIDER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+PROVIDER+"')])")).click();
		
		//driver.findElement(By.xpath("//li[normalize-space()='"+ PROVIDER +"']")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		EncounterSaveOK.click();
		Thread.sleep(2000);
		EpisodeIcon.click();
		Thread.sleep(5000);
		Encounter.click();
		Thread.sleep(5000);
		Close.click();
	
		
		
		
	}

	
	public void  opencounter() throws InterruptedException {
		
		SubMode.click();
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(2000);
		EncounterSaveOK.click();
		Thread.sleep(2000);
		EpisodeIcon.click();
		Thread.sleep(1000);
		episode.click();
		Thread.sleep(1000);
		epiCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		header.click();
		Thread.sleep(1000);
		Encounter.click();
		Thread.sleep(3000);
		encCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		
		encCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		
		episode.click();
		Thread.sleep(1000);
		epiCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		closedEpi.click();
		Thread.sleep(2000);
		Encounter.click();
		Thread.sleep(1000);
		closedEnc.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(1000);
		
		
		
	}

	
}
