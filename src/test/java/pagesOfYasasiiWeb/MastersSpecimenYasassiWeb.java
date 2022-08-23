package pagesOfYasasiiWeb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersSpecimenYasassiWeb extends PageFactoryInitYasasiiWeb {

	public MastersSpecimenYasassiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Menutoggle;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;

	@FindBy(xpath = "//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[7]/a[1]/span[1]")
	public WebElement Service;

	@FindBy(xpath = "//span[normalize-space()='Specimen Master']")
	public WebElement SpecimenMaster;	

	@FindBy(xpath = "//input[@id='lookupvalue']")
	public WebElement SpecimenName;	

	@FindBy(xpath = "//input[@id='field1']")
	public WebElement Code;	

	@FindBy(xpath = "//input[@id='field2']")
	public WebElement SpecimenCodeType;

	@FindBy(xpath = "//li[normalize-space()='P Code']")
	public WebElement SpecimenCodeTypeSelect;

	@FindBy(xpath = "//button[@id='specimenmastersave']")
	public WebElement Save;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-specimenmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectSpecimen;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//textarea[@id='comments']")
	public WebElement Description;

	@FindBy(xpath = "//button[@id='specimenmasterupdate']")
	public WebElement Update;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-specimenmaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[2]/span[1]/i[1]")
	public WebElement delete;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement DeleteYes;
	
	
	
	public void SpecimenMasterSelect(String  specimenname) throws InterruptedException{
		///////////Create the specimen master		
		Thread.sleep(1000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",	Service);
     	Service.click();
		Thread.sleep(500);
		SpecimenMaster.click();
		Thread.sleep(500);
		SpecimenName.sendKeys(specimenname);
		Code.sendKeys("CZ01146");
		SpecimenCodeType.click();
		SpecimenCodeTypeSelect.click();
		Save.click();
		Thread.sleep(1000);
		/////////////////Edit the create dspecimen master
		Search.sendKeys(specimenname);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		SelectSpecimen.click();
		Edit.click();
		Thread.sleep(500);
		Description.sendKeys("Specimen Master");
		Thread.sleep(500);
		Update.click();

//////////delete		
		
		SelectSpecimen.click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		DeleteYes.click();
		Thread.sleep(2000);

	}

}