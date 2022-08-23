package pagesOfYasasiiWeb;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;


public class MastersResourceMappingYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersResourceMappingYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement Resource;
	
	@FindBy(xpath = "//span[normalize-space()='Resource Mapping']")
	public WebElement ResourceMapping;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement MainCategory;
	
	@FindBy(xpath = "//li[normalize-space()='Doctor']")
	public WebElement SelectMainCategory;
	
	@FindBy(xpath = "//input[@id='resourcemasterlist']")
	public WebElement EnterName;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement SelectName;
	
	@FindBy(xpath = "//div[@class='col-md-7']//input[1]")
	public WebElement SubCategory;
	
	@FindBy(xpath = "//li[normalize-space()='Nurse']")
	public WebElement SelectSubCategory;
	
	@FindBy(xpath = "//label[normalize-space()='Sheethal(nur001)']//span[@class='checkmark']")
	public WebElement clickonName;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[2]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement ToDate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[5]/td[7]/span[1]")              //tbody/tr[4]/td[4]/span[1]
	public WebElement SelectToDate;
	
	
	@FindBy(xpath = "//input[@id='fromtime']")              
	public WebElement fromTime;
	
	//input[@id='fromtime']
	
	@FindBy(xpath = "//input[@id='totime']")
	public WebElement ToTime;
	
	@FindBy(xpath = "//button[@aria-label='Add a minute']//span[@class='owl-dt-control-button-content']//*[name()='svg']//*[name()='path' and contains(@d,'M248.292,1')]")
	public WebElement UpArrow;
	
	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;
	
	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;

	
	@FindBy(xpath = "//button[@id='dutyrostsaveid']")
	public WebElement Save;
	
	
	public void ResourceMasterSelect() throws InterruptedException, AWTException{
	///////////////select resource mapping screen	
		Thread.sleep(800);
		Menutoggle.click();
		Thread.sleep(2000);
		mastericon.click();
		Thread.sleep(2000);
		Resource.click();
		ResourceMapping.click();
		Thread.sleep(1000);
		MainCategory.click();
		Thread.sleep(800);
		SelectMainCategory.click();
		EnterName.sendKeys("John");
		Thread.sleep(800);
		SelectName.click();
		Thread.sleep(800);
		SubCategory.click();
		Thread.sleep(800);
		SelectSubCategory.click();
		Thread.sleep(500);
		clickonName.click();
		ToDate.click();
		Thread.sleep(1000);
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		//SelectToDate.click();
		Thread.sleep(800);
		fromTime.click();
		fromTime.sendKeys( Keys.HOME +"18 00");
		ToTime.click();
		Thread.sleep(800);
		ToTime.sendKeys( Keys.HOME +"23 00");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);
		Save.click();
		
	}
		
		
}
