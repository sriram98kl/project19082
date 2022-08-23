package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Masters_QueueMaster_YasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public Masters_QueueMaster_YasasiiWeb(WebDriver driver) {

		super(driver);

}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	public WebElement collapsegeneral;

	@FindBy(xpath = "//*[contains(text(),'FO')]")
	public WebElement FO;


	@FindBy(xpath = "//span[normalize-space()='Queue Master']")
	public WebElement QueueMaster;


	@FindBy(xpath = "//input[@id='queuename']")
	public WebElement enterQueuename;

	@FindBy(xpath = "//input[@id='siteid']")
	public WebElement site;


	@FindBy(xpath = "//li[normalize-space()='KIMSHEALTH TVM']")
	public WebElement selectSite;


	@FindBy(xpath = "//input[@id='maxrowid']")
	public WebElement rowcount;

	@FindBy(xpath = "//li[normalize-space()='12']")
	public WebElement selectcount;


	@FindBy(xpath = "//input[@id='providername']")
	public WebElement providername;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-queue-master[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement selectprovider;

	@FindBy(xpath = "//input[@id='roomno']")
	public WebElement enterroomno;


	@FindBy(xpath = "//input[@id='nurseroomno']")
	public WebElement enternurseroomnumber;


	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement clickadd;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;
	
///////////     editing the created queueMaster

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement enterinsearch;


	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-queue-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonname;


	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement editicon;


	@FindBy(xpath = "//label[normalize-space()='Valid']//span[@class='checkmark']")
	public WebElement invalid;
	
	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement update;
	
///////////     delete the created queueMaster

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;


	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement deleteyes;
	
	@FindBy(xpath = "//button[normalize-space()='Schedule']")
	public WebElement Schedule;
	
	@FindBy(xpath = "//button[normalize-space()='Map All']")
	public WebElement Map;
	
	
	//button[normalize-space()='Schedule']
	
	
	public void queue(String name, String rowcont,String providernam,String RoomNo,String nurseroom) throws InterruptedException
	{
		Thread.sleep(500);
		Menutoggle.click();	
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(1000);
		collapsegeneral.click();
		Thread.sleep(500);
		FO.click();
		QueueMaster.click();
		Thread.sleep(1000);
		enterQueuename.sendKeys(name);
		site.click();
		Thread.sleep(500);
		selectSite.click();
		rowcount.click();
		Thread.sleep(500);
		selectcount.click();
		//driver.findElement(By.xpath("//*[contains(text(),'" + rowcont + "')]")).click();
		Thread.sleep(500);
		providername.sendKeys(providernam);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + providernam + "')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Schedule']//span[contains(@class,'checkmark')]")).click();
		Thread.sleep(500);
		Schedule.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Map);
		enterroomno.sendKeys(RoomNo);
		Thread.sleep(500);
		enternurseroomnumber.sendKeys(nurseroom);
		Thread.sleep(500);
		Map.click();
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")).click();
		
		
		clickadd.click();
		Thread.sleep(500);
		save.click();
		Thread.sleep(1500);
		enterinsearch.sendKeys(name);
		Thread.sleep(500);
		searchicon.click();
		Thread.sleep(500);
///////////     editing the created queueMaster
		clickonname.click();
		Thread.sleep(500);
		editicon.click();
		Thread.sleep(500);
		invalid.click();
		Thread.sleep(500);
		update.click();
		Thread.sleep(1000);
///////////     delete the created queueMaster
		clickonname.click();
		Thread.sleep(500);
		delete.click();
		Thread.sleep(500);
		deleteyes.click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
