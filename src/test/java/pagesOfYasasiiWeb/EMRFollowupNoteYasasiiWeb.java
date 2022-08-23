package pagesOfYasasiiWeb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRFollowupNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	public  EMRFollowupNoteYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement menu;
	@FindBy(xpath="//label[contains(text(),'Modules')]")
	public WebElement Modules;
	@FindBy(xpath="//i[@class='ki ki-sthethescope']")
	public WebElement EMR;

	@FindBy(xpath="//span[normalize-space()='EMR HomeScreen']")
	public WebElement EMRHOME;


	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement searchtext;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]")
	public WebElement patientselect;

	//	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]")
	//	public WebElement patientselect;
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement patienthomepageicon;
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement patienthomepagelock;
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement docnote;
	@FindBy(xpath="//button[contains(text(),'Create New Note')]")
	public WebElement createnote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	@FindBy(xpath="//div[contains(text(),'Follow up Note')]")
	public WebElement followup;
	@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1003176']")
	public WebElement textarea;
	@FindBy(xpath="//label[@class='icon emrsave']")
	public WebElement save;
	@FindBy(xpath="//i[@title='More']")
	public WebElement arrow;
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;
	
	
	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;
	
	
	
	public void EMRFollowup(String MRNo,String URL) throws InterruptedException, IOException {
		
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);
		
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("DOCAS");
		Thread.sleep(1000);
		 password.click();
		 Thread.sleep(1000);
		 password.sendKeys("Kameda321");
		 Thread.sleep(1000);
		 Site.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		
		 
		//Create follow up notes
		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
		//EMR.click();
		Thread.sleep(1000);
		EMRHOME.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		Thread.sleep(1000);
	     searchtext.click();
		Thread.sleep(1000);
		searchtext.sendKeys(MRNo);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//i[@class='ki ki-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//patientselect.click();
		Thread.sleep(1000);
		
		patienthomepageicon.click();
		Thread.sleep(1000);
		patienthomepagelock.click();
		Thread.sleep(1000);
		docnote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 



		//createnote.click();
		Thread.sleep(1000);
		encreate.clear();
		encreate.click();
		encreate.sendKeys("Fever");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
		Thread.sleep(3000);
		template.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
		clickOK.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		followup.click();//div[contains(text(),'Follow up Note')]
		Thread.sleep(1000);
		textarea.click();
		Thread.sleep(1000);
		textarea.sendKeys("Fever \r\n symptoms of dengue \r\n Mediation");
		textarea.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-caret-right')]")).click();
		arrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Log']")).click();
		Thread.sleep(7000);

	}
}
