package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class bedCreation extends PageFactoryInitYasasiiWeb{

	public bedCreation(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon; 
	
	
	@FindBy(xpath = "//li[6]//a[1]//i[1]")
	public WebElement resource; 
	
	@FindBy(xpath = "//span[normalize-space()='Resource Master']")
	public WebElement resourceMaster; 
	
	@FindBy(xpath = "//input[@id='resourcecategory']")
	public WebElement category; 
	
	@FindBy(xpath = "//input[@id='roomid']")
	public WebElement ROOMcategory;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement  deluxRoom;
	
	@FindBy(xpath = "//span[@id='common_edit_icon_0']//i[@class='ki ki-pencil']")
	public WebElement Edit;
	
	@FindBy(xpath = "//input[@id='bedtype']")
	public WebElement BedType;
	
	@FindBy(xpath = "//input[@id='nursingstation']")
	public WebElement nurestation;
	
	@FindBy(xpath = "//input[@id='bedname']")
	public WebElement bedname;
	
	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement bedAdd;
	
	
	@FindBy(xpath = "//button[@id='resourcemasterupdate']")
	public WebElement update;
	
	
	
	
	
	
	public void bed() throws InterruptedException {
		Thread.sleep(2000);
		Menutoggle.click();
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", resource );
		Thread.sleep(1000);
		resource.click();
		Thread.sleep(1000);
		resourceMaster.click();
		Thread.sleep(2000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Bed']")).click();
		Thread.sleep(1000);
		ROOMcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Deluxe Room']")).click();
		Thread.sleep(1000);
		deluxRoom.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		BedType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(1000);
		nurestation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emrgency NS']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-291");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-292");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-293");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-294");
		Thread.sleep(1000);
		bedAdd.click();
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-295");
		Thread.sleep(1000);
		bedAdd.click();
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-296");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		//nurestation.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Ward Nure_Nursing station']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-297");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-298");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-299");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-300");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		nurestation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='NICCU']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("NICCU-121");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("NICCU-122");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("NICCU-123");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("NICCU-124");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(2000);
		
		
	////////////////////Emergency beds
		
		ROOMcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='erroom']")).click();
		Thread.sleep(1000);
		deluxRoom.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		BedType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(1000);
		nurestation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emrgency NS']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-121");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-122");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-123");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-124");
		Thread.sleep(1000);
		bedAdd.click();
		//input[@id='bedname']
		Thread.sleep(1000);	
		update.click();
		Thread.sleep(2000);
		
		
		
		
		
}
	

}
