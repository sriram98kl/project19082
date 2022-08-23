package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Masters_CateoryMaster_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public Masters_CateoryMaster_YasasiiWeb(WebDriver driver) {

		super(driver);

}
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;
	@FindBy(xpath = "//span[normalize-space()='Category Master']")
	public WebElement categorymaster;
	@FindBy(xpath = "//label[normalize-space()='Root Category']//span[@class='checkmark']")
	public WebElement clickonrootcategory;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement enterRootName;
	@FindBy(xpath = "//input[@id='erpcode1']")
	public WebElement erpcode;
	@FindBy(xpath = "//label[normalize-space()='Display In EMR']//span[@class='checkmark']")
	public WebElement displayinEMR;
	@FindBy(xpath = "//button[@id='categorymastersave']")
	public WebElement savecetegorymaster;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement enternameinsearcharea;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchicon;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-categorymaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonname;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement edit;
	@FindBy(xpath = "//label[normalize-space()='Valid']//span[@class='checkmark']")
	public WebElement invalid;
	@FindBy(xpath = "//button[@id='categorymasterupdate']")
	public WebElement update;
	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement deleteyes;
	@FindBy(xpath = "//input[@id='parentinvcategoryid']")
	public WebElement patentcategory;
	@FindBy(xpath = "")
	public WebElement state;
	@FindBy(xpath = "")
	public WebElement CityName;
	@FindBy(xpath = "")
	public WebElement SAve;
	
	
	
	public void categryrootmaster(String name,String ERPCode) throws InterruptedException
	{
	
	    Thread.sleep(1000);
		Hamburger.click();	
		Thread.sleep(800);
		Masters.click();
		Thread.sleep(500);
		
/////////////////Create a root category
		
		categorymaster.click();
		Thread.sleep(800);
		clickonrootcategory.click();
		enterRootName.sendKeys(name);
		Thread.sleep(800);
		erpcode.sendKeys(ERPCode);
		Thread.sleep(800);
		displayinEMR.click();
		savecetegorymaster.click();
		Thread.sleep(1500);
//////////////Edit created root category
		enternameinsearcharea.click();
		enternameinsearcharea.sendKeys(name);
		Thread.sleep(800);
		searchicon.click();
		Thread.sleep(800);
		clickonname.click();
		Thread.sleep(800);
		edit.click();
		Thread.sleep(1000);
		invalid.click();
		update.click();
		Thread.sleep(1000);
////////////////delete created root category
		clickonname.click();
		Thread.sleep(800);
		delete.click();
		Thread.sleep(800);
		deleteyes.click();
		Thread.sleep(800);	
	}
	
	public void creatingsubcategorymaster(String parentcategory,String subcategory, String eRpcode) throws InterruptedException
	{
		
		Thread.sleep(2500);
		patentcategory.click();
		 driver.findElement(By.xpath("//*[contains(text(),'" + parentcategory + "')]")).click();
		 enterRootName.sendKeys(subcategory);
			Thread.sleep(800);
			erpcode.sendKeys(eRpcode);
			Thread.sleep(800); 
			savecetegorymaster.click();
			Thread.sleep(1500);
//////////////editing
			enternameinsearcharea.clear();
			Thread.sleep(1000);
			enternameinsearcharea.sendKeys(subcategory);
			Thread.sleep(800);
			searchicon.click();
			Thread.sleep(800);
			clickonname.click();
			Thread.sleep(1200);
			edit.click();
			Thread.sleep(1000);
			invalid.click();
			update.click();
			Thread.sleep(1000);
	////////////////delete created root category
			clickonname.click();
			Thread.sleep(800);
			delete.click();
			Thread.sleep(800);
			deleteyes.click();
			Thread.sleep(800);	
	}
	
	
}




