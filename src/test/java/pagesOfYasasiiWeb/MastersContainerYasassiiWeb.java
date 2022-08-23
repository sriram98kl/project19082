package pagesOfYasasiiWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersContainerYasassiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersContainerYasassiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-cog')]")
	public WebElement mastericon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]")
	public WebElement Service;
	
	@FindBy(xpath = "//span[normalize-space()='Container Master']")
	public WebElement ContainerMaster;	

	@FindBy(xpath = "//input[@id='container']")
	public WebElement ContainerName;
	
	@FindBy(xpath = "//input[@id='colorpicker']")
	public WebElement Colour;	
	
//	@FindBy(xpath = "//span[contains(text(),'Container Master')]")
//	public WebElement colourSelect;	
	
	@FindBy(xpath = "//button[@id='containermastersave']")
	public WebElement Save;	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Search;	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchicon;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement selectContainer;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement edit;
	@FindBy(xpath = "//button[@id='containermasterupdate']")
	public WebElement update;
	
	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement deleteYes;
	
	
	
public void SpecimenContainerSelect(String  containername) throws InterruptedException{
//////////Create a container	
		Thread.sleep(2000);
		Menutoggle.click();
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service);
		Thread.sleep(1000);
		Thread.sleep(500);
		Service.click();
		Thread.sleep(500);
		ContainerMaster.click();
		Thread.sleep(500);
		ContainerName.sendKeys(containername);
		Colour.click();
		Thread.sleep(1000);
		//colourSelect.click();
		Save.click();
//////////Edit the created container
		Thread.sleep(1000);
		Search.sendKeys(containername);
		Thread.sleep(1000);
		searchicon.click();
		Thread.sleep(1000);
		selectContainer.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(1000);
		//////delete
		Search.clear();
		Search.sendKeys(containername);
		Thread.sleep(1000);
		searchicon.click();
		Thread.sleep(1000);
		selectContainer.click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		deleteYes.click();
		
		
}
}
