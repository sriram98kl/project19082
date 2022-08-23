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

public class MastersScheduleSettingsYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersScheduleSettingsYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement Resource;
	
	@FindBy(xpath = "//span[normalize-space()='Schedule Setting']")
	public WebElement ScheduleSettings;
	
	@FindBy(xpath = "//input[@id='categoryListId']")
	public WebElement Category;
	
	@FindBy(xpath = "//li[contains(text(),'Doctor')]")
	public WebElement clickCategory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Name;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement SelectName;
	
	
	@FindBy(xpath = "//div[@class='page-container']//ki-select-control[@id='siteid']//input[1]")
	public WebElement site;
	
	@FindBy(xpath = "//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement SelectSiite;
	
	@FindBy(xpath = "//input[@id='session']")
	public WebElement Session;
	
	@FindBy(xpath = "//li[contains(text(),'Morning Session')]")
	public WebElement MorningSession;
	
	@FindBy(xpath = "//input[@id='fromtime']")
	public WebElement FromTime;
	
	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/owl-date-time-container[1]/div[2]/div[1]/button[2]/span[1]")
	public WebElement Set;
	
	@FindBy(xpath = "//input[@id='totime']")
	public WebElement ToTime;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[1]/label[1]/input[1]")
	public WebElement SetToTime;
	
	@FindBy(xpath = "//body/div[3]/div[2]/div[1]/owl-date-time-container[1]/div[2]/div[1]/button[2]")
	public WebElement Set1;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;
	@FindBy(xpath = "//button[@id='schedulesettingsave']")
	public WebElement Save;
	
	@FindBy(xpath = " //body/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/ki-dialog-confirm[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement confirmationmessage;
	
	@FindBy(xpath = "//input[@id='schedulecategory']")
	public WebElement SelectCategory;
	
	@FindBy(xpath = "//li[contains(text(),'Doctor')]")
	public WebElement CategorySelect;
	
	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//input[@id='siteid']")
	public WebElement Site;
	
	@FindBy(xpath = "//li[normalize-space()='KIMSHEALTH TVM']")
	public WebElement SelectSite;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement SelectResource;
	
	@FindBy(xpath = "//li[contains(text(),'Jose Thomas(doc01)')]")
	public WebElement SelectUser;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement Edit;
	
	@FindBy(xpath = "//button[@id='schedulesettingupdate']")
	public WebElement update; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement todate;
	
	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content'][normalize-space()='30']")
	public WebElement todateselect; 

	
public void ScheduleSelect() throws InterruptedException, AWTException{
/////////Click on schedule setting screen and set the schedule		
	Thread.sleep(1000);
	Menutoggle.click();
	Thread.sleep(2000);
	mastericon.click();
	Thread.sleep(2000);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", Resource);
	Resource.click();
	Thread.sleep(2000);
		ScheduleSettings.click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(500);
		clickCategory.click();
		Thread.sleep(500);
		Name.sendKeys("john");
		Thread.sleep(1000);
		SelectName.click();
		Thread.sleep(500);
		todate.click();
		Thread.sleep(500);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		//todateselect.click();
		Thread.sleep(500);
		site.click();
		SelectSiite.click();
		Thread.sleep(500);
		Session.click();
		Thread.sleep(500);
		MorningSession.click();
		FromTime.click();
		Thread.sleep(1000);
		 FromTime.sendKeys(Keys.HOME  +   "07 00");
			Thread.sleep(1000);
			ToTime.click();
			Thread.sleep(1000);
			ToTime.sendKeys(Keys.HOME  +   "12 00");
			Thread.sleep(1000);
		
		int i=1;
//		while(i<=8)
//		{
//			WebElement fromtimearrow = driver.findElement(By.cssSelector("owl-date-time-timer-box:nth-child(1) > button:nth-child(1)"));
//			act.moveToElement(fromtimearrow).click().build().perform();
//			i++;
//		}
////		Up.click();
//		Thread.sleep(1000);
//		//Set.click();
//		//WebElement set = driver.findElement(By.cssSelector("#owl-dt-picker-2 > div.owl-dt-container-inner.ng-trigger.ng-trigger-fadeInPicker > div > button:nth-child(2)"));
//		WebElement set = driver.findElement(By.xpath("//div/button[@class='owl-dt-control owl-dt-control-button owl-dt-container-control-button'][2]"));
//		
//		act.moveToElement(set).click().build().perform();
//		Thread.sleep(1000);
//		ToTime.click();
//		Thread.sleep(500);
//		int j=1;
//		while(j<23)
//		{
//			WebElement fromtimearrow2 = driver.findElement(By.cssSelector("owl-date-time-timer-box:nth-child(1) > button:nth-child(1)"));
//			act.moveToElement(fromtimearrow2).click().build().perform();
//			j++;
//		}
////		WebElement set1 = driver.findElement(By.cssSelector("div[class='owl-dt-container-buttons owl-dt-container-row ng-tns-c21-3 ng-star-inserted'] button:nth-child(1) span:nth-child(1)"));
////		act.moveToElement(set1).click().build().perform();
		//driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(800);
//		confirmationmessage.click();
//		Thread.sleep(1000);

		

}
}