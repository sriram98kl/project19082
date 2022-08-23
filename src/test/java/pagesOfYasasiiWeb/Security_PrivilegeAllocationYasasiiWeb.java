package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Security_PrivilegeAllocationYasasiiWeb  extends PageFactoryInitYasasiiWeb {
	
	public Security_PrivilegeAllocationYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//a[contains(@class,'nav-link navbar-brand menu')]//label[contains(@class,'wrap-menu-toggle')]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-user-privilege-fill')]")
	public WebElement Security;
	
	@FindBy(xpath = "//span[normalize-space()='Privilege Allocation']")
	public WebElement PrivilegeAllocation;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'searchtext')]")
	public WebElement EnterName;
	
	@FindBy(xpath = "//span[@id='searchprivilege']//i[contains(@class,'ki ki-search')]")
	public WebElement SearchButton;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-privillageallocation[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement ClickOnName;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;
	
	@FindBy(xpath = "//ki-checkbox-control[@formcontrolname='selectAllModules']//span[@class='checkmark']")
	public WebElement AllowedModule;
	
	@FindBy(xpath = "//accordion-group[@class='panel panel-open']//div[@class='panel-body card-block card-body']//div[1]//div[1]//div[1]//div[1]//div[1]")
	public WebElement Default;
	
	@FindBy(xpath = "//span[normalize-space()='General Privileges']")
	public WebElement GeneralPrivilege;
	
	@FindBy(xpath = "//ki-checkbox-control[@formcontrolname='selectAllMasterPriv']//span[@class='checkmark']")
	public WebElement SelectPrivilege;
	
	@FindBy(xpath = "//button[@id='save']")
	public WebElement save;
	
public void create(String name) throws InterruptedException{
///////////Allocate the Privilege to the user		
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(1000);
		Security.click();
		Thread.sleep(1000);
		PrivilegeAllocation.click();
		Thread.sleep(1000);
		EnterName.sendKeys(name);
		SearchButton.click();
		Thread.sleep(800);
		ClickOnName.click();
		Thread.sleep(800);
		Edit.click();
		Thread.sleep(800);
		AllowedModule.click();
		Default.click();
		Thread.sleep(800);
		GeneralPrivilege.click();
		SelectPrivilege.click();
		//save.click();
		

}
}
