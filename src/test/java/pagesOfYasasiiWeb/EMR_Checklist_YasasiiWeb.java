package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_Checklist_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMR_Checklist_YasasiiWeb(WebDriver driver) {

		super(driver);

}
	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;
	
	@FindBy(xpath = "//span[normalize-space()='Master']")
	public WebElement master;
	
	
	@FindBy(xpath = "//a[@title='To define settings for checklist']//span[contains(text(),'Checklist Master')]")
	public WebElement SelectChecklist;
	
	@FindBy(xpath = "//div[@class='page-container']//ki-select-control[@id='checklisttype']//input[1]")
	public WebElement Checklisttype;
	@FindBy(xpath = "//li[normalize-space()='Handover']")
	public WebElement SelectType;
	@FindBy(xpath = "//input[@id='checklistname']")
	public WebElement EnterChecklistname;
	
	
	@FindBy(xpath = "//input[@id='question']")
	public WebElement EnterQuestion;
	@FindBy(xpath = "//input[@id='controltype']")
	public WebElement controlType;
	@FindBy(xpath = "//li[normalize-space()='Textbox']")
	public WebElement SelectControlType;
	@FindBy(xpath = "//label[normalize-space()='Remarks']//span[contains(@class,'checkmark')]")
	public WebElement remarks;
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;
	@FindBy(xpath = "//button[@id='save']")
	public WebElement Save;
	
	@FindBy(xpath = "//div[@class='form-group zero-bottom ki-dropdown']//input[@id='checklisttype']")
	public WebElement selecttype;
	@FindBy(xpath = "//li[normalize-space()='Handover']")
	public WebElement clickontype;
	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement enterinSearch;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement clickonSearch;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-checklist-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickOnName;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update;
	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yes;
	
	public void checklist(String NAME,String Ques) throws InterruptedException, IOException {
		
/////Creating the checklist
		
		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(1000);
		master.click();
		SelectChecklist.click();
		 Thread.sleep(800);
		Checklisttype.click();
		SelectType.click();
		 Thread.sleep(800);
		EnterChecklistname.sendKeys(NAME);
		EnterQuestion.sendKeys(Ques);
		 Thread.sleep(800);
		controlType.click();
		 Thread.sleep(800);
		SelectControlType.click();
		 Thread.sleep(800);
		remarks.click();
		 Thread.sleep(800);
		Add.click();
		Save.click();
		 Thread.sleep(2000);
		 
//////////Edit the created checklist
		 
		selecttype.click();
		 Thread.sleep(800);
		clickontype.click();
		 Thread.sleep(800);
		enterinSearch.sendKeys(NAME);
		 Thread.sleep(800);
		clickonSearch.click();
		 Thread.sleep(800);
		clickOnName.click();
		 Thread.sleep(800);
		Edit.click();
		 Thread.sleep(800);
		Update.click();
		 Thread.sleep(1000);

////////Delete the created checklist
		 
		clickOnName.click();
		 Thread.sleep(800);
		delete.click();
		 Thread.sleep(800);
		yes.click();
		
	}

}
