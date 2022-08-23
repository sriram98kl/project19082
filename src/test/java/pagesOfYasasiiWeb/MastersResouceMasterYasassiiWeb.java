package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;


public class MastersResouceMasterYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersResouceMasterYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement Resource;
	
	@FindBy(xpath = "//span[normalize-space()='Resource Master']")
	public WebElement ResourceMaster;
	
	@FindBy(xpath = "//input[@id='resourcecategoryid']")
	public WebElement Category;
	
	@FindBy(xpath = "//li[contains(text(),'Category A')]")
	public WebElement SelectCategory;
	
	@FindBy(xpath = "//input[@id='name1']")
	public WebElement EnterName;
	
	@FindBy(xpath = "//button[@id='resourcemastersave']")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@id='resourcecategory']")
	public WebElement Search;
	
	@FindBy(xpath = "//li[contains(text(),'Category A')]")
	public WebElement SelectCategoryForSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonName;
	
	@FindBy(xpath = "//div[@class='search-results ng-star-inserted']//div[1]//div[1]//div[1]//div[1]//div[2]//label[1]//i[1]")
	public WebElement Edit;
	
	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement EnterDescription;
	
	@FindBy(xpath = "//button[@id='resourcemasterupdate']")
	public WebElement clickonUpdate;
	
	@FindBy(xpath = "//input[@id='blockid']")
	public WebElement floorblock;
	
	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement descrip; 
	
	@FindBy(xpath = "//input[@id='roomtypeid']")
	public WebElement roomtype;
	
	@FindBy(xpath = "//input[@id='name1']")
	public WebElement roomname;
	
	@FindBy(xpath = "//input[@id='bedname']")
	public WebElement bedname;
	
	@FindBy(xpath = "//main[contains(@class,'page-body')]//li[1]//a[1]")
	public WebElement general;
	
	@FindBy(xpath = "//input[@id='roomtypeid']")
	public WebElement RoomType;
	
	@FindBy(xpath = "//div[contains(@class,'col-md-4')]//input[@id='blockid']")
	public WebElement block;
	
	
	@FindBy(xpath = "//input[@id='name1']")
	public WebElement Roomname;
	
	
	
	//main[contains(@class,'page-body')]//li[1]//a[1]
	
	public void ResourceMasterSelect() throws InterruptedException{
//////////////Click on resource master screen		
	Thread.sleep(1000);
	Menutoggle.click();
	Thread.sleep(2000);
	mastericon.click();
	Thread.sleep(2000);
	general.click();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", Resource);
	Resource.click();
	Thread.sleep(2000);
	ResourceMaster.click();
	
//	Category.sendKeys("Category B");
//	SelectCategory.click();
//	EnterName.sendKeys("Test ABC");
//	Save.click();
//	Thread.sleep(5000);
//	Search.sendKeys("Category B");
//	SelectCategoryForSearch.click();
//	Thread.sleep(500);
//	clickonName.click();
//	clickonName.click();
//	Thread.sleep(500);
//	Edit.click();
//	EnterDescription.sendKeys("Alphabets");
//	Thread.sleep(500);
//	clickonUpdate.click();
	
}
	
	public void ResourceMasterBed(String BlockName,String FloorName,String RoomName,String BedName) throws InterruptedException{
		
		Thread.sleep(500);
////////////////create the block		
		Category.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'Block')]")).click();
		Thread.sleep(500);
		EnterName.sendKeys(BlockName);
		Thread.sleep(500);
		Save.click();
		Thread.sleep(5000);
		
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='OK']"));
//		
//		System.out.println(dynamicElement.size());
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//
//		}


		
		
//////////////////create the floor
		Category.click();
		Thread.sleep(500);
		Category.sendKeys("F");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Floor')]")).click();
		Thread.sleep(500);
	
		floorblock.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BlockName+"']")).click();
		
		Thread.sleep(1500);
		EnterName.sendKeys(FloorName);
		Thread.sleep(1000);
		//floorblock.sendKeys("A");
		Thread.sleep(500);
		descrip.sendKeys("test floor");
		Thread.sleep(1000);
		Save.click();
		
//List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='OK']"));
//		
//		System.out.println(dynamicElement1.size());
//		if(dynamicElement1.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//
//		}
/////////////////////create room
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(500);
		Category.sendKeys("room");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
		Thread.sleep(500);
		roomname.sendKeys("A1");
		//roomtype.click();
		Thread.sleep(500);
	//	driver.findElement(By.xpath("//li[contains(text(),'Normal Room')]")).click();
//		Thread.sleep(500);
//		floorblock.click();
//		Thread.sleep(500);
//		floorblock.click();
		Save.click();
//List<WebElement> dynamicElement2=driver.findElements(By.xpath("//button[normalize-space()='OK']"));
//		
//		System.out.println(dynamicElement2.size());
//		if(dynamicElement2.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//
//		}
		Thread.sleep(3000);
		Category.click();
		Thread.sleep(500);
		//Category.sendKeys("room");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Room/Ward']")).click();
		Thread.sleep(500);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Deluxe']")).click();
		Thread.sleep(1000);
        block.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[normalize-space()='"+BlockName+"']")).click();
        Thread.sleep(1000);
        Roomname.click();
        Thread.sleep(1000);
        Roomname.sendKeys("Test");
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //button[@id='resourcemastersave']")).click();
		
		
		
		
		
		
		
		
//////////////create bed
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(500); 
		Category.sendKeys("bed");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[normalize-space()='Bed']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='blockid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BlockName+"']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='floorid']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='"+FloorName+"']")).click();
		// driver.findElement(By.xpath("//li[normalize-space()='ABC Floor']")).click();
		
		driver.findElement(By.xpath("//input[@id='roomid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		bedname.sendKeys(BedName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='bedtype']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nursingstation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emrgency NS']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(@class,'ki ki-plus')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='resourcemastersave']")).click();		
	}
		


}
