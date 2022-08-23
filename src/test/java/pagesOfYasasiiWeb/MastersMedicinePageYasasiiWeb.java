package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersMedicinePageYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersMedicinePageYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menutogglemaster;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastersicon; 
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[1]")
	public WebElement Pharmacy;
	
	@FindBy(xpath = "//span[normalize-space()='Medicine Master']")
	public WebElement MedicineMaster;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement subcategory;
	
	@FindBy(xpath = "//li[contains(text(),'Capsule/Tablets')]")
	public WebElement subcategoryselect;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement EnterItemName;
	
	@FindBy(xpath = "//input[@id='materialtypeid']")
	public WebElement itemType;
	
	@FindBy(xpath = "//li[contains(text(),'Medicine')]")
	public WebElement itemTypeSelect;
	
	@FindBy(xpath = "//input[@id='genericname']")
	public WebElement EnterGenericName;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/i[1]")
	public WebElement SearchGenericName;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
	public WebElement SelectGenericName;
	
	
	@FindBy(xpath = "//input[@id='quantity']")
	public WebElement EnterTotalQuantity;
	
	@FindBy(xpath = "//input[@id='perdosequantity']")
	public WebElement EnterPerDose;
	
	@FindBy(xpath = "//input[@id='quantityunitid']")
	public WebElement Unit;
	
	@FindBy(xpath = "//li[contains(text(),'Cap(s)')]")
	public WebElement UnitSelect;
	
	@FindBy(xpath = "//input[@id='buomid']")
	public WebElement BUOM;
	
	@FindBy(xpath = "//li[contains(text(),'Cap(s)')]")
	public WebElement BUOMSelect;
	
	@FindBy(xpath = "//input[@id='codetype']")
	public WebElement codetype;
	
	@FindBy(xpath = "//li[contains(text(),'DD Code')]")
	public WebElement codetypeselect;
	
	@FindBy(xpath = "//input[@id='tempcode']")
	public WebElement Entercode;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/i[1]")
	public WebElement addCode;
	
	@FindBy(xpath = "//input[@id='edulink']")
	public WebElement EnterEducationResourcelink;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement addresourcelink;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Admintask;
	
	@FindBy(xpath = "//input[@id='taskname']")
	public WebElement entertaskname;
	
	@FindBy(xpath = "//input[@id='taskdueat']")
	public WebElement entertaskdue;
	
	@FindBy(xpath = "//input[@id='vitals']")
	public WebElement Entertask;
	
	@FindBy(xpath = "//li[contains(text(),'Falls Risk')]")
	public WebElement selecttask;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[2]/button[1]/i[1]")
	public WebElement addtask;
	
	@FindBy(xpath = "//input[@id='buomtovalue1']")
	public WebElement enterconversion;
	
	@FindBy(xpath = "//input[@id='buomtounit1id']")
	public WebElement conversionunit;
	
	@FindBy(xpath = "//li[contains(text(),'Box')]")
	public WebElement selectconversionunit;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[4]/button[1]/i[1]")
	public WebElement addconversion;
	
	@FindBy(xpath = "//input[@id='opbuomid']")
	public WebElement Opdispensingunit;
	
	@FindBy(xpath = "//li[contains(text(),'Cap(S)')]")
	public WebElement selectopdispensingunit;
	
	@FindBy(xpath = "//input[@id='ipbuomid']")
	public WebElement Ipdispencing;
	
	@FindBy(xpath = "//li[contains(text(),'Box')]")
	public WebElement selectipdespencingunit;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement recommendDose;
	
	@FindBy(xpath = "//input[@id='dose']")
	public WebElement dose;
	
	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement doseunits;
	
	@FindBy(xpath = "//li[contains(text(),'Gm')]")
	public WebElement doseunitsselect;
	
	@FindBy(xpath = "//input[@id='routeaddid']")
	public WebElement route;
	
	@FindBy(xpath = "//li[contains(text(),'Oral')]")
	public WebElement routeselect;
	
	@FindBy(xpath = "//input[@id='formaddid']")
	public WebElement form;
	
	@FindBy(xpath = "//li[contains(text(),'Capsule')]")
	public WebElement formselect;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-recommend-dose[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]/i[1]")
	public WebElement addformselect;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	public WebElement defaultformselect;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement frequency;
	
	@FindBy(xpath = "//li[contains(text(),'OD')]")
	public WebElement selectFrequency;
	
	@FindBy(xpath = "//input[@id='duration']")
	public WebElement Enterduration;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement clickdurationunit;
	
	@FindBy(xpath = "//li[contains(text(),'Day(s)')]")
	public WebElement selectdurationunit;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-recommend-dose[1]/form[1]/div[1]/div[1]/div[2]/div[5]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement displayInadditive;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-recommend-dose[1]/form[1]/div[1]/div[1]/div[2]/div[5]/div[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Remarksmandatory;
	
	@FindBy(xpath = "//button[@id='updateMedMaster']")
	public WebElement save;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/input[1]")
	public WebElement search;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/span[1]/i[1]")
	public WebElement searchicon;
	
	@FindBy(xpath = "//div[contains(text(),'Aceclofenac')]")
	public WebElement selectthedata;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/label[1]/i[1]")
	public WebElement editicon;
	
	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement description;
	
	@FindBy(xpath = "//button[@id='updateMedMaster']")
	public WebElement update;
	
	@FindBy(xpath = "//label[@title='Delete']//i[@class='ki ki-trash']")
	public WebElement delete;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement deleteYes;
	
	
	
	
	public void createmedicine (String Itemname)  throws InterruptedException{
	///////////////Click on medicine master screen and enter all other required information	
		    Thread.sleep(3000);
		    menutogglemaster.click();
		    Thread.sleep(3000);
		    mastersicon.click();
		    Thread.sleep(3000);

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",  Pharmacy);
		    Pharmacy.click();
		    Thread.sleep(1000); 
			MedicineMaster.click();
			Thread.sleep(1000);
			subcategory.click();
			Thread.sleep(1000);
			subcategoryselect.click();
			EnterItemName.sendKeys(Itemname);		
			itemType.click();
			Thread.sleep(1000);
			itemTypeSelect.click();
			Thread.sleep(1000);
			EnterGenericName.sendKeys("Aceclofenac");
			Thread.sleep(1000);
			SearchGenericName.click();
			Thread.sleep(1000);
			SelectGenericName.click();
			Thread.sleep(1000);
			EnterTotalQuantity.sendKeys("100");
			EnterPerDose.sendKeys("1");
			Thread.sleep(1000);
			Unit.click();
			
			UnitSelect.click();
			Thread.sleep(1000);
			BUOM.click();
			Thread.sleep(1000);
			BUOMSelect.click();		
		/*	Admintask.click();
			entertaskname.sendKeys("check pulse");
			entertaskdue.sendKeys("2");
			Entertask.sendKeys("%");
			Thread.sleep(500);
			selecttask.click();
			addtask.click();*/
			codetype.click();
			Thread.sleep(1000);
			codetypeselect.click();
			Thread.sleep(1000);
			Entercode.sendKeys("JMZ1212");
			Thread.sleep(1000);
			addCode.click();
			Thread.sleep(1000);
			EnterEducationResourcelink.sendKeys("www.google.com");
			Thread.sleep(1000);
			addresourcelink.click();
			Thread.sleep(1000);
			enterconversion.sendKeys("10");
			Thread.sleep(1000);
			conversionunit.click();
			Thread.sleep(1000);
			selectconversionunit.click();
			//addconversion.click();
			Thread.sleep(500);
			Opdispensingunit.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//app-list-item[@id='droplistkey0']")).click();
			Thread.sleep(500);
			Ipdispencing.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//app-list-item[@id='droplistkey1']")).click();
			
			
			
			
			Thread.sleep(1000);
			{
				
				WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));

				js.executeScript("arguments[0].scrollIntoView(true);", element);
				}
			Thread.sleep(1000);
		//	recommendDose.click();
			{
				
				WebElement element1 = driver.findElement(By.xpath("//input[@id='dose']"));

				js.executeScript("arguments[0].scrollIntoView(true);", element1);
				}
			dose.sendKeys("100"); 
			Thread.sleep(1000);
			doseunits.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//li[contains(text(),'Gm')]")).click();
		//	doseunitsselect.click();
			route.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//li[contains(text(),'Oral')]")).click();
			
			form.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//li[contains(text(),'Capsule')]")).click();
			
			addformselect.click();
			Thread.sleep(1000);
			defaultformselect.click();
			Thread.sleep(1000);
			frequency.click();
			Thread.sleep(1000);
			selectFrequency.click();
			Thread.sleep(1000);
			Enterduration.sendKeys("4");
			Thread.sleep(1000);
			clickdurationunit.click();
			Thread.sleep(1000);
			selectdurationunit.click();
			Thread.sleep(1000);
			displayInadditive.click();
			Thread.sleep(1000);
			Remarksmandatory.click();
			Thread.sleep(1000);
			save.click();
///////////////Edit the created medicine
			Thread.sleep(1000);
			search.sendKeys(Itemname);
			Thread.sleep(1000);
			searchicon.click();
			Thread.sleep(1000);
			selectthedata.click();
			Thread.sleep(1000);
			editicon.click();
			Thread.sleep(1000);
			description.sendKeys("pqrst albhabets");
			Thread.sleep(1000);
			Thread.sleep(500);
			update.click();
			Thread.sleep(1000);
			
			selectthedata.click();
			Thread.sleep(1000);
			delete.click();
			Thread.sleep(1000);
			deleteYes.click();
			Thread.sleep(1000);
}
}