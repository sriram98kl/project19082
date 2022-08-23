package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class IVCPOEViewYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public IVCPOEViewYasasiiWeb(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	 
	}
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement menu;
	@FindBy(xpath="//i[@class='ki ki-beaker']")
	public WebElement IVmodule;
	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement exeloc;
	@FindBy(xpath="//button[@class='btn btn-dark-green active btn-sm m0']")
	public WebElement ok;
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menu1;
	@FindBy(xpath="//span[normalize-space()='CPOE View']")
	public WebElement cpoeview;
	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-cpoe-view-container[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement Selectpatient;
	@FindBy(xpath="//input[@id='providername']")
	public WebElement provider;
	
	public void  CPOE(String MRNO) throws InterruptedException, IOException {
	
////Investigation module	
		menu.click();
		Thread.sleep(2000);
		IVmodule.click();
		Thread.sleep(2000);
		exeloc.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='7th Level Execution']")).click();
		Thread.sleep(2000);
		ok.click();
		Thread.sleep(2000);
		menu1.click();
		Thread.sleep(2000);
		cpoeview.click();
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		search.sendKeys(MRNO);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Selectpatient.click();
		Thread.sleep(2000);
		provider.click();
		Thread.sleep(2000);
		provider.sendKeys("Albert Sam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Dr Albert Sam(DOCAS)']")).click();
		Thread.sleep(1000);
//view by op
		driver.findElement(By.xpath("//label[normalize-space()='IP']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='ER']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
//View by IP
		driver.findElement(By.xpath("//label[normalize-space()='IP']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='OP']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
///View by ER
		driver.findElement(By.xpath("//label[normalize-space()='ER']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='IP']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		
		
		
		
	}}

	