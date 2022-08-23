package pagesOfYasasiiWeb;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class BlockandFreezeYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public BlockandFreezeYasasiiWeb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menu;
	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement masters;
	@FindBy(xpath="//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[6]/a[1]/span[1]")
	public WebElement resource;
	@FindBy(xpath="//span[normalize-space()='Block/Freeze Schedule']")
	public WebElement blockandfreeze;
	@FindBy(xpath="//input[@id='resourcecategoryid']")
	public WebElement category;
	@FindBy(xpath="//input[@id='resourcemastername']")
	public WebElement name;
	@FindBy(xpath="//div[contains(@class,'col-md-4 ng-star-inserted')]//input[@id='siteid']")
	public WebElement site;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement Date;
	@FindBy(xpath="//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement todate;
	@FindBy(xpath="//input[@id='fromtime']")
	public WebElement fromtime;
	@FindBy(xpath="//body/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[1]/button[1]/span[1]/*[1]")
	public WebElement time;
	@FindBy(xpath="//input[@id='totime']")
	public WebElement totime;
	@FindBy(xpath="//input[@id='reasonid']")
	public WebElement reason;
	@FindBy(xpath="//input[@id='remarks']")
	public WebElement remarks;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement save;
	@FindBy(xpath="//span[normalize-space()='Set']")
	public WebElement set;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-radio-list[1]/label[2]/span[1]")
	public WebElement Freeze;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/ki-time-picker[1]/div[1]/input[1]")
	public WebElement time1;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes;
	@FindBy(xpath="//button[normalize-space()='Ok']")
	public WebElement ok;

	@FindBy(xpath="//label[normalize-space()='Freeze']//span[@class='checkmark']")
	public WebElement freeeze;

	@FindBy(xpath="//input[@id='holidaycategory']")
	public WebElement SelectCategory;

	@FindBy(xpath="//input[@id='blockorfreeze']")
	public WebElement blockORfreeze;

	@FindBy(xpath="//input[@id='holidayresource']")
	public WebElement SelectResource;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement element;


	@FindBy(xpath="//i[@class='ki ki-trash']")
	public WebElement delete;




	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;
	//	@FindBy(xpath="//input[@id='siteid']")
	//	public WebElement site;

	public void BlockandFreeze() throws InterruptedException, AWTException {




		//////////////////Blocking

		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", resource);
		Thread.sleep(1000);  
		resource.click();
		Thread.sleep(1000);
		blockandfreeze.click();
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		name.sendKeys("John Peter(docjp)");
		driver.findElement(By.xpath("//li[normalize-space()='John Peter(docjp)']")).click();
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		Date.click();
		Thread.sleep(1000);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		
		//driver.findElement(By.xpath("//span[contains(text(),'31')]")).click();
		Thread.sleep(1000);
		//todate.click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
		Thread.sleep(1000);
		fromtime.click();
		Thread.sleep(1000);
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "22 34");
		// set.click();
		Thread.sleep(1000);
		// time1.click();
		Thread.sleep(1000);
		totime.click();
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "23 34");
		reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Leave']")).click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("Absent");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000); 
		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[4]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		//////////////////Freezing


		//		// yes.click();
		//		Thread.sleep(1000);
		//		// ok.click();
		//		Thread.sleep(1000);
		//		menu.click();
		//		Thread.sleep(1000);
		//		masters.click();
		//		Thread.sleep(1000);
		//		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		//		js11.executeScript("arguments[0].scrollIntoView();", resource);
		//		Thread.sleep(1000);  
		//		resource.click();
		//		Thread.sleep(1000);
		//		blockandfreeze.click();
		//		Thread.sleep(1000);
		Thread.sleep(1000);
		freeeze.click();
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		name.sendKeys("John Peter(docjp)");
		driver.findElement(By.xpath("//li[normalize-space()='John Peter(docjp)']")).click();
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		Date.click();
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		
		//driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
		Thread.sleep(1000);
		//todate.click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
		Thread.sleep(1000);
		fromtime.click();
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "22 34");
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 time.click();
		//	 Thread.sleep(1000);
		//	 set.click();
		//	 Thread.sleep(1000);
		//	 time1.click();
		Thread.sleep(1000);
		totime.click();
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "23 34");
		Thread.sleep(1000);
		reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("In Major Surgery");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);

		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Freeze']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[4]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}
}