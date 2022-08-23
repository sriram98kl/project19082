package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_queueDisplayYasassiweb extends PageFactoryInitYasasiiWeb {
	
	public FO_queueDisplayYasassiweb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//span[normalize-space()='Queue Display']")
	public WebElement QueueMaster;
	
	@FindBy(xpath = "//input[@id='queuetypeid']")
	public WebElement QueueType;
	
	@FindBy(xpath = "//input[@id='queueid']")
	public WebElement QueueName;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement ok;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]")
	public WebElement patientSelect;
	
	@FindBy(xpath = "//i[@class='ki ki-token-call']")
	public WebElement callcurrentToken;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncounterSaveOK;
	
	
	@FindBy(xpath = "//span[contains(@class,'search-icon')]//i[contains(@class,'ki ki-search')]")
	public WebElement searchIcon;
	
	@FindBy(xpath = "//label[@title='Clear']//i[@class='ki ki-close']")
	public WebElement Clear;
	
	
	
	
	
	public void tokenview(String MRNo,String URL) throws AWTException, InterruptedException {
	
		
		
		Searchfield.sendKeys(MRNo);
		Thread.sleep(1000);
		searchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
		Thread.sleep(1000);
		//patientSelect.click();
		Clear.click();
		Thread.sleep(2000);
		ENCprvdrName.click();
		Thread.sleep(1000);
		ENCprvdrName.sendKeys("Lekshmi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Lekshmi']")).click();
		
		//driver.findElement(By.xpath("//li[normalize-space()='"+ PROVIDER +"']")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		EncounterSaveOK.click();
		Thread.sleep(2000);
		
	
		///QueueMaster setup
		
		Menutoggle.click();
		QueueMaster.click();
		QueueType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Encounter Queue']")).click();
		QueueName.click();
		driver.findElement(By.xpath("//li[normalize-space()='1st level queue']")).click();
		ok.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(5000);
		 
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("DOCAS");
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys("Kameda321");
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		login.click();
		Thread.sleep(3000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
	//	patientSelect.click();
		Thread.sleep(3000);
		callcurrentToken.click();
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(8000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
	}

}