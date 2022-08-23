package pagesOfYasasiiWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersResourceCategoryYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersResourceCategoryYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement Resource;
	
	@FindBy(xpath = "//span[normalize-space()='Resource Category']")
	public WebElement ResourceCategory;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterCategory;
	
	@FindBy(xpath = "//input[@id='field6']")
	public WebElement ResourceType;
	
	@FindBy(xpath = "//li[contains(text(),'All')]")
	public WebElement ResourceTypeSelect;
	
	@FindBy(xpath = "//label[normalize-space()='Appointment']//span[@class='checkmark']")
	public WebElement CheckAppoinment;
	
	@FindBy(xpath = "//label[normalize-space()='Site']//span[@class='checkmark']")
	public WebElement Site;
	
	@FindBy(xpath = "//button[@id='categorysaveid']")
	public WebElement Save;
	
	@FindBy(xpath = "//lib-searchbar-head/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Search;
	
	@FindBy(xpath = "//lib-searchbar-head/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement clickonName;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-categorycreation[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterComments;
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	public WebElement clickonUpdate;
	
	
public void ResourceMasterSelect() throws InterruptedException{
////////////////Click on resource category screen 		
		Thread.sleep(1000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Resource.click();
		Thread.sleep(1000);
		ResourceCategory.click();
		Thread.sleep(1000);
		EnterCategory.sendKeys("XRay Machine3");
		Thread.sleep(1000);
		ResourceType.click();
		Thread.sleep(1000);
		ResourceTypeSelect.click();
		Thread.sleep(1000);
		CheckAppoinment.click();
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(5000);
////////Edit created category
		Search.sendKeys("XRay Machine3");
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(500);
		clickonName.click();
		Thread.sleep(500);
		Edit.click();
		EnterComments.sendKeys("Alphabets");
		Thread.sleep(500);
		clickonUpdate.click();
		
}
}

