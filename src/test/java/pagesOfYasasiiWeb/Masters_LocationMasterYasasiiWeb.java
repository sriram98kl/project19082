package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Masters_LocationMasterYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public Masters_LocationMasterYasasiiWeb(WebDriver driver) {

		super(driver);

}
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;
	@FindBy(xpath = "//span[normalize-space()='Location Master']")
	public WebElement LocationMaster;
	@FindBy(xpath = "//input[@id='country']")
	public WebElement CountryName;
	@FindBy(xpath = "//input[@id='nationality']")
	public WebElement Nationality;
	@FindBy(xpath = "//input[@id='code']")
	public WebElement CountryCode;
	@FindBy(xpath = "//input[@id='phncode']")
	public WebElement PhoneCode;
	@FindBy(xpath = "//input[@id='phndigit']")
	public WebElement PhoneNoDigits;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save;
	@FindBy(xpath = "//span[normalize-space()='State']")
	public WebElement ClickOnState;
	@FindBy(xpath = "//input[@id='field1']")
	public WebElement EnterCOuntryName;
	@FindBy(xpath = "//li[normalize-space()='Angola']")
	public WebElement SelectCOuntryAngola;
	@FindBy(xpath = "//input[@id='state']")
	public WebElement EnterState;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;
	@FindBy(xpath = "//span[normalize-space()='City']")
	public WebElement ClickOnCCity;
	@FindBy(xpath = "//input[@id='cityfield1']")
	public WebElement country;
	@FindBy(xpath = "//li[normalize-space()='Angola']")
	public WebElement selectangola;
	@FindBy(xpath = "//input[@id='citystate']")
	public WebElement state;
	@FindBy(xpath = "//input[@id='city1']")
	public WebElement CityName;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement SAve;
	
	public void Location(String countryname, String nationality, String countrycode, String phonecode, String phonedigit, String statename, String city) throws InterruptedException, IOException {
		
	    Thread.sleep(1000);
		Hamburger.click();	
		Thread.sleep(800);
		Masters.click();
		Thread.sleep(500);
////////////Create country name
		LocationMaster.click();
		Thread.sleep(800);
		CountryName.sendKeys(countryname);
		Nationality.sendKeys(nationality);
		CountryCode.sendKeys(countrycode);
		PhoneCode.sendKeys(phonecode);
		PhoneNoDigits.sendKeys(phonedigit);
		Save.click();
		Thread.sleep(800);
////////////Create state name
		ClickOnState.click();
		Thread.sleep(800);
		EnterCOuntryName.click();
		Thread.sleep(500);
		SelectCOuntryAngola.click();
		EnterState.sendKeys(statename);
		save.click();
		Thread.sleep(1200);
////////////Create city name
		ClickOnCCity.click();
		Thread.sleep(800);
		country.click();
		Thread.sleep(800);
		selectangola.click();
		Thread.sleep(500);
		state.sendKeys(statename);
		Thread.sleep(800);
		CityName.sendKeys(city);
		SAve.click();
		Thread.sleep(500);
		

}
}