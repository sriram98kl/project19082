package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Security_ProfileCreationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public Security_ProfileCreationYasasiiWeb(WebDriver driver) {

		super(driver);

}

		@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
		public WebElement Toggle;
		@FindBy(xpath="//i[@class='ki ki-user-privilege-fill']")
		public WebElement SecurityMod;
		@FindBy(xpath = "//a[@title='To create user profile']//span[contains(text(),'Profile Creation')]")
		public WebElement Profilecreation;
		@FindBy(xpath = "//input[@id='usertypeid']")
		public WebElement UserType;
		@FindBy(xpath = "//li[normalize-space()='Staff']")
		public WebElement SelectUserType;
		@FindBy(xpath = "//input[@id='name']")
		public WebElement EnterName;
		@FindBy(xpath = "//label[normalize-space()='Non Provider']//span[@class='checkmark']")
		public WebElement SelecttheGroup;	
		@FindBy(xpath = "//button[@id='save']")
		public WebElement Save;	
		
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-user-profile[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")
		public WebElement EnterNameInSearch;
		@FindBy(xpath = "//span[@id='Profilesearch']//i[contains(@class,'ki ki-search')]")
		public WebElement SearchIcon;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-user-profile[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement ClickOnName;
		@FindBy(xpath = "//i[@class='ki ki-pencil']")
		public WebElement Edit;	
		@FindBy(xpath = "//label[normalize-space()='Valid']//span[@class='checkmark']")
		public WebElement Invalid;	
		@FindBy(xpath = "//button[@id='update']")
		public WebElement Update;
		@FindBy(xpath = "//i[@class='ki ki-trash']")
		public WebElement Delete;
		@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
		public WebElement yes;

public void action() throws InterruptedException
{
	///////////////Creata a profile
	Thread.sleep(1000);
	Toggle.click();
	Thread.sleep(500);
	SecurityMod.click();
	Thread.sleep(500);
	Profilecreation.click();
	Thread.sleep(500);
	UserType.click();
	Thread.sleep(1000);
	SelectUserType.click();
	Thread.sleep(1000);
	EnterName.sendKeys("Lab Technician");
	Thread.sleep(1000);
	SelecttheGroup.click();
	Thread.sleep(1000);
	Save.click();
///////////////Edit the created profile
	Thread.sleep(1000);
	EnterNameInSearch.click();
	Thread.sleep(1000);
	EnterNameInSearch.sendKeys("Lab Technician");
	Thread.sleep(800);
	SearchIcon.click();
	Thread.sleep(800);
	ClickOnName.click();
	Thread.sleep(500);
	Edit.click();
	Thread.sleep(500);
	Invalid.click();
	Thread.sleep(500);
	Update.click();
	Thread.sleep(1000);
///////////////////Delete the created profile
	EnterNameInSearch.clear();
	Thread.sleep(1000);
	EnterNameInSearch.sendKeys("Lab Technician");
	Thread.sleep(500);
	SearchIcon.click();
	Thread.sleep(500);
	ClickOnName.click();
	Thread.sleep(1000);
	Delete.click();
	Thread.sleep(1000);
	yes.click();
	
}
}
