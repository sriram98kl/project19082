package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_SmartNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMR_SmartNoteYasasiiWeb(WebDriver driver) {

		super(driver);

}
	

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Hamburger;

	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;
	
	@FindBy(xpath = "//span[normalize-space()='Smart Note(EMR)']")
	public WebElement SelectSmartNote;
	@FindBy(xpath = "//input[@id='abbreviation']")
	public WebElement EntersmartnoteName;
	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement EnterRemarks;
	@FindBy(xpath = "//span[normalize-space()='Formatted Remarks']")
	public WebElement ClickFormattedRemarks;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M15.25,11.')]")
	public WebElement clickBold;
	@FindBy(xpath = "//button[@id='italic-1']//*[name()='svg']")
	public WebElement ClickItalics;
	@FindBy(xpath = "//div[@class='fr-element fr-view']//p")
	public WebElement EnterFormattedRemarks;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;
	@FindBy(xpath = "//input[@id='']")
	public WebElement EnternameinSearchArea;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement ClickOnSearch;
	@FindBy(xpath = "//*[@class='result-name']")
	public WebElement clickOnName;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update;

	
	public void smartnoteaction() throws InterruptedException, IOException {
/////////Create the smart note
		
	    Thread.sleep(1000);
		Hamburger.click();
		 Thread.sleep(1000);
		EMR.click();
		
		SelectSmartNote.click();
		EntersmartnoteName.sendKeys("Migraine");
		Thread.sleep(800);
		EnterRemarks.sendKeys("What triggers headaches and migraines?\r\n"
				+ "Alcohol use.\r\n"
				+ "Changes in eating or sleeping patterns.\r\n"
				+ "Depression.");
		Thread.sleep(800);
		ClickFormattedRemarks.click();
		Thread.sleep(800);
//		clickBold.click();
//		ClickItalics.click();
		EnterFormattedRemarks.sendKeys("Headaches can have causes that aren't due to underlying disease. Examples include lack of sleep, an incorrect eyeglass prescription, stress, loud noise exposure or tight head wear.");
		Thread.sleep(800);
		save.click();
		Thread.sleep(5000);
//		EnternameinSearchArea.sendKeys("Migraine");
//		Thread.sleep(800);
//		ClickOnSearch.click();
//		Thread.sleep(1500);
//////////Edit the created note
		clickOnName.click();
		Thread.sleep(800);
		Edit.click();
		Thread.sleep(800);
		Update.click();
		Thread.sleep(800);
//////////Delete the created note
		clickOnName.click();
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}
}
