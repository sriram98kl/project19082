package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Masters_RoomStatusSetting_YasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public Masters_RoomStatusSetting_YasasiiWeb(WebDriver driver) {

		super(driver);

}
	

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")
	public WebElement Resource;
	
	@FindBy(xpath = "//a[@title='To change the status of the Room after ADT actions']//span[contains(text(),'Room Status Setting')]")
	public WebElement RoomStatusSetting;
	
	@FindBy(xpath = "//input[@id='statusName']")
	public WebElement entername;
	
	@FindBy(xpath = "//input[@id='statusType']")
	public WebElement type;
	
	@FindBy(xpath = "//button[@id='roomstatussave']")
	public WebElement save;
	
	@FindBy(xpath = "//input[@placeholder='Search Text']")
	public WebElement searchname;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-roomstatus-setting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonthename;
	
	@FindBy(xpath = "//span[@id='common_edit_icon_0']//i[@class='ki ki-pencil']")
	public WebElement editicon;
	
	@FindBy(xpath = "//input[@id='wbAction']")
	public WebElement wbnextaction;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement invalid;
	
	@FindBy(xpath = "//button[@id='roomstatusupdate']")
	public WebElement update;
	
	@FindBy(xpath = "//span[normalize-space()='Room Status Settings']")
	public WebElement roomstatussetting;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-roomstatus-setting[1]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement release;
	
	@FindBy(xpath = "//li[normalize-space()='Ready to Clean']")
	public WebElement status;
	@FindBy(xpath = "//li[normalize-space()='Release']")
	public WebElement selectreleasestatus;
	
	
	public void action(String name,String selecttype,String wnnextacn) throws InterruptedException
	{
 
		Menutoggle.click();
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//app-asideleftbar//li[1]//a[1]")).click();
		Thread.sleep(800);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Resource);
		Resource.click();
		Thread.sleep(800);
//////////Create a room status
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", RoomStatusSetting);
		
		RoomStatusSetting.click();
		Thread.sleep(1000);
		entername.sendKeys(name);
		Thread.sleep(500);
		type.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + selecttype + "')]")).click();
		Thread.sleep(500);
		save.click();
		Thread.sleep(1500);
/////////////Edit the room status and change to invalid
		searchname.sendKeys(name);
		Thread.sleep(800);
		searchicon.click();
		Thread.sleep(800);
		clickonthename.click();
		Thread.sleep(800);
		editicon.click();
		Thread.sleep(1000);
		wbnextaction.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + wnnextacn + "')]")).click();
		Thread.sleep(800);
		invalid.click();
		update.click();
		Thread.sleep(1000);
/////////delete the created one
		clickonthename.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();		
		Thread.sleep(1000);
/////////// room status setting
		roomstatussetting.click();
		Thread.sleep(800);
		release.click();
		Thread.sleep(800);
		status.click();
		Thread.sleep(800);
		release.click();
		Thread.sleep(800);
		selectreleasestatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='roomsettingsave']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
