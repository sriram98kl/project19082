package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersRecommendDoseYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersRecommendDoseYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[1]")
	public WebElement Pharmacy;
	
	@FindBy(xpath = "//span[contains(text(),'Recommend Dose')]")
	public WebElement RecommendDose;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/input[1]")
	public WebElement Search;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/span[1]/i[1]")
	public WebElement Searchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement BrandSelect;
	
	@FindBy(xpath = "//label[@title='Edit']")
	public WebElement EditIcon;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;
	
	@FindBy(xpath = "//li[contains(text(),'Days')]")
	public WebElement FrequencySelect;
	
	@FindBy(xpath = "//input[@id='duration']")
	public WebElement EnterDuration;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;
	
	@FindBy(xpath = "//li[contains(text(),'Day(s)')]")
	public WebElement SelectDurationUnit;
	
	@FindBy(xpath = "//input[@name='remarks']")
	public WebElement EnterRemarks;
	
	@FindBy(xpath = "//input[@id='calculationdose']")
	public WebElement RequiredDose;
	
	@FindBy(xpath = "//input[@id='calculationunitid']")
	public WebElement RequiredDoseUnit;
	
	@FindBy(xpath = "//li[contains(text(),'BSA')]")
	public WebElement RequiredDoseUnitSelect;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@id='sortby']")
	public WebElement Searchgeneric;
	
	@FindBy(xpath = "//li[contains(text(),'Generic')]")
	public WebElement Genericselect;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")
	public WebElement Genericname;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/span[1]/i[1]")
	public WebElement Searchicn;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement SelectGeneric;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement editicn;
	
	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement EnterDose;
	
	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement DoseUnit;
	
	@FindBy(xpath = "//li[contains(text(),'Mg')]")
	public WebElement SelectDoseUnit;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement freq;
	
	@FindBy(xpath = "//li[normalize-space()='TID']")
	public WebElement FreqSelect;
	
	@FindBy(xpath = "//input[@id='duration']")
	public WebElement Enterduration;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement duratunit;
	
	@FindBy(xpath = "//li[contains(text(),'Day(s)')]")
	public WebElement duratnunitselect;
	
	@FindBy(xpath = "//input[@name='remarks']")
	public WebElement EnterRema;
	
	@FindBy(xpath = "//input[@id='routeid']")
	public WebElement route;
	
	@FindBy(xpath = "//li[contains(text(),'Intra-articular')]")
	public WebElement routeselect;
	
	@FindBy(xpath = "//input[@id='formid']")
	public WebElement form;
	
	@FindBy(xpath = "//li[contains(text(),'Injection')]")
	public WebElement formselect;
	
	@FindBy(xpath = "//input[@id='calculationdose']")
	public WebElement EnterReqdose;
	
	@FindBy(xpath = "//input[@id='calculationunitid']")
	public WebElement dosunit;
	
	@FindBy(xpath = "//li[contains(text(),'BSA')]")
	public WebElement dosunitselect;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;
	

public void RecommSelect() throws InterruptedException{
/////////////////Select recommend dose screen	and create recommend dose for brand medicine	
		Thread.sleep(2000);
		Menutoggle.click();
		Thread.sleep(2000);
		mastericon.click();
		Thread.sleep(2000);
		Pharmacy.click();
		Thread.sleep(800);
		RecommendDose.click();
		Thread.sleep(500);
		Search.sendKeys("ultrazac");
		Thread.sleep(800);
	    Searchicon.click();	
	    Thread.sleep(500);
	    BrandSelect.click();
	    Thread.sleep(800);
	    EditIcon.click();
	    Thread.sleep(800);
	    Frequency.click();//input[@id='frequencyid']
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
	    Thread.sleep(500);
	    EnterDuration.click();
	    Thread.sleep(1000);
	    EnterDuration.sendKeys("4");
        DurationUnit.click();
        SelectDurationUnit.click();
        Thread.sleep(500);
	    EnterRemarks.click();
	    Thread.sleep(800);
	    EnterRemarks.sendKeys("ok");
	    Thread.sleep(800);
//	    Thread.sleep(1000);
//		{
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			WebElement element = driver.findElement(By.xpath("//input[@id='calculationunitid"));
//			js.executeScript("arguments[0].scrollIntoView(true);", element);
//			}
//	    RequiredDose.sendKeys("250");
//    	RequiredDoseUnit.click();
//    	RequiredDoseUnitSelect.click();
	    Add.click();
	    Thread.sleep(800);
	    Save.click();
	Thread.sleep(2000);
	
	
	    BrandSelect.click();
	    Thread.sleep(800);
	    EditIcon.click();
	    Thread.sleep(800);
	    driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
	    Thread.sleep(800);
	    driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
	    Thread.sleep(800);
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	    Thread.sleep(800);
	    
	Searchgeneric.click();
	Thread.sleep(800);
	Genericselect.click();
	Thread.sleep(800);
	WebElement l=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
	l.clear();
	Thread.sleep(500);
/////////////////Create recommend dose for generic master
	Genericname.sendKeys("paracet");
	Thread.sleep(800);
	Searchicn.click();
//	SelectGeneric.click();
	WebElement GenSelect = driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-recommend-dose-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	act.moveToElement(GenSelect).click().build().perform();
	Thread.sleep(800);
	editicn.click();
	Thread.sleep(800);
	EnterDose.sendKeys("500");
	Thread.sleep(800);
	DoseUnit.click();
	Thread.sleep(800);
	SelectDoseUnit.click();
	Thread.sleep(500);
	route.click();
	Thread.sleep(800);
	routeselect.click();
	Thread.sleep(800);
	form.click();
	Thread.sleep(800);
	formselect.click();
	Thread.sleep(800);
	freq.click();
	Thread.sleep(800);
	FreqSelect.click();
	Thread.sleep(800);
	Enterduration.sendKeys("7");
	Thread.sleep(800);
	duratunit.click();
	Thread.sleep(800);
	duratnunitselect.click();
	Thread.sleep(800);
	EnterRema.sendKeys("test remarks");
	Thread.sleep(800);
//	Thread.sleep(1000);
//	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement element = driver.findElement(By.xpath("//input[@id='calculationdose']"));
//
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		}
//	EnterReqdose.sendKeys("250");
	driver.findElement(By.xpath("//input[@id='calculationdose']")).sendKeys("2");
	Thread.sleep(800);
	add.click();
	Thread.sleep(500);
	save.click();
	
	Thread.sleep(800);

	act.moveToElement(GenSelect).click().build().perform();
	Thread.sleep(800);
	editicn.click();
	
	 Thread.sleep(800);
	    driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
	    Thread.sleep(800);
	    driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
	    Thread.sleep(800);
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	    Thread.sleep(800);
	
	

}
}
