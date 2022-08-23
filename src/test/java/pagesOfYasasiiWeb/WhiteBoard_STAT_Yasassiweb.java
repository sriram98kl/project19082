package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class WhiteBoard_STAT_Yasassiweb extends PageFactoryInitYasasiiWeb{

	public WhiteBoard_STAT_Yasassiweb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement patienthomepagelock;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement docnote;

	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement createnote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement category;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;
	
	@FindBy(xpath = "//div[@id='cpoeservicelist_3']//label[contains(@class,'item-name')]")
	public WebElement service;
	
	@FindBy(xpath = "//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement ThreeDot;
	
	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement ServEdit;
	
	@FindBy(xpath = "//label[normalize-space()='STAT']")
	public WebElement Stat;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEphar;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;
	
	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement frequency;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;
	
	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;
	
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;
	
	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;

	@FindBy(xpath = "//span[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "//i[@class='ki ki-others-fill']")
	public WebElement OthersIcon;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[16]/label[1]")
	public WebElement ServiceBlink;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[20]/label[1]")
	public WebElement MedicineBlink;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement SelectPatient;
	
	
	@FindBy(xpath = "//input[@id='reason0']")
	public WebElement Reason;
	
	@FindBy(xpath = "//i[contains(@title,'Filter By Room Status')]")
	public WebElement filter;
	
	@FindBy(xpath = "//label[normalize-space()='Release']")
	public WebElement release;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[5]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement bedSearch;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement Search;
	
	@FindBy(xpath = "//button[normalize-space()='Release']")//button[normalize-space()='Hold']
	public WebElement ActionRelease;
	
	@FindBy(xpath = "//button[normalize-space()='Hold']")
	public WebElement ActionHold;
	
	
	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;
	
	
	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement PAssword;
	
	@FindBy(xpath = "//input[@id='roomstatusid']")
	public WebElement RoomStatus;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[2]/div[1]/ki-radio-list[1]/label[3]/input[1]")
	public WebElement others;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void  DoctorReferral(String MRNo) throws InterruptedException, IOException {
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		// SelectPatient.click();
		Thread.sleep(2000);
		//patienthomepageicon.click();
		Thread.sleep(1000);
		// patienthomepagelock.click();
		////////////DocNote 
		Thread.sleep(1000);
		docnote.click();
		Thread.sleep(3000);
		   createnote.click();
		Thread.sleep(1000);
		//////TemplateSelection
		encreate.clear();
		Thread.sleep(1000);
		encreate.click();
		Thread.sleep(1000);
		encreate.sendKeys("Fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
		Thread.sleep(2000);
		template.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
		Thread.sleep(1000);
		clickOK.click();
		Thread.sleep(1000);
		cpoeService.click();
		Thread.sleep(1000);
		service.click();
		Thread.sleep(2000);
		//act.moveToElement(ThreeDot).click().build().perform();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		ServEdit.click();
		Thread.sleep(1000);
		Stat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(1000);
		CPOEphar.click();
		Thread.sleep(1000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys("lipicard");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Lipicard 160Mg Tab, 1 Tab(s)  by Oral')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='reason0']")).click();
		Thread.sleep(1000);
		//Reason.click();
		//Reason.sendKeys("needed for patient");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
		frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();
		
	///////Medicine REconciliation
		/*Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='No Current Medication']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(@class,'ki ki-admission-reconciliation')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(@class,'ki ki-reconciliation')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
		Thread.sleep(1000); */
	//////////////////////
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		EMRsave.click();
		Thread.sleep(1000);
	}
	
	public void Whiteboard(String MRNo) throws InterruptedException {
		
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView();" , OthersIcon);
		Thread.sleep(3000);
	
		act.moveToElement(ServiceBlink).click().build().perform();
		//ServiceBlink.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);
		act.moveToElement(MedicineBlink).click().build().perform();
		//MedicineBlink.click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
	    Thread.sleep(3000);
	}	
	
	public void roomstatus() throws InterruptedException {
		
		 filter.click();
		 Thread.sleep(1000);
		 release.click();
		 Thread.sleep(1000);
		String bedName = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
		Thread.sleep(1000);
		System.out.println(bedName);
		bedSearch.click();
		 Thread.sleep(1000);
		bedSearch.sendKeys(bedName);
		 Thread.sleep(1000);
		Search.click();
		 Thread.sleep(1000);
		ActionRelease.click();
		 Thread.sleep(1000);
		RoomStatus.click();
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Hold']")).click();
	    Thread.sleep(1000);
		verifiedBy.click();
		 Thread.sleep(1000);
		verifiedBy.sendKeys("nur01");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Rani(Nur01)']")).click();
		 Thread.sleep(1000);
	    PAssword.click();
	    PAssword.sendKeys("KAmeda123$");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
	    Thread.sleep(1000);
	    filter.click();
	    Thread.sleep(1000);
	    others.click();
	    
	    Thread.sleep(1000);
	    bedSearch.clear();
		bedSearch.click();
		Thread.sleep(1000);
		bedSearch.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		ActionHold.click();
		Thread.sleep(1000);
		RoomStatus.click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[normalize-space()='Release']")).click();
	    Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys("nur01");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Rani(Nur01)']")).click();
		 Thread.sleep(1000);
	    PAssword.click();
	    Thread.sleep(1000);
	    PAssword.sendKeys("KAmeda123$");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
	    Thread.sleep(2000);
		
		
	    filter.click();
		 Thread.sleep(1000);
		 release.click();   
		 Thread.sleep(1000);
		System.out.println(bedName);
		bedSearch.clear();
		bedSearch.click();
		 Thread.sleep(1000);
		bedSearch.sendKeys(bedName);
		 Thread.sleep(1000);
		Search.click();
		 Thread.sleep(4000);
		
		
	}
	
	
	
	
	
	
	
	
}
