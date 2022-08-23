package pagesOfYasasiiWeb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Security_GroupCreationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public Security_GroupCreationYasasiiWeb(WebDriver driver) {

		super(driver);

}

		@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
		public WebElement Toggle;
		@FindBy(xpath="//i[@class='ki ki-user-privilege-fill']")
		public WebElement SecurityMod;
		@FindBy(xpath = "//span[normalize-space()='Group Creation']")
		public WebElement Grpcreation;
		@FindBy(xpath = "//input[@id='groupname']")
		public WebElement Name;
		@FindBy(xpath = "//input[@id='selectedmodule']")
		public WebElement Module;
		@FindBy(xpath = "//li[normalize-space()='Investigation']")
		public WebElement Investigation;
		@FindBy(xpath = "//div[@class='col-md-3 pr-0 mt-2 pr-0']//span[@class='checkmark']")
		public WebElement Selectall;	
		@FindBy(xpath = "//i[@class='ki ki-chevron-double-right']")
		public WebElement Rightarw;	
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-group-creation[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[30]/div[1]/div[1]/label[1]/i[1]")
		public WebElement Auth1;	
		@FindBy(xpath = "//label[normalize-space()='Generic']//span[@class='checkmark']")
		public WebElement Genchk;
		@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
		public WebElement Ok;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-group-creation[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[53]/div[1]/div[1]/label[1]/i[1]")
		public WebElement Auth2;	
		@FindBy(xpath = "//label[normalize-space()='Pharmacy']//span[@class='checkmark']")
		public WebElement Phar;
		@FindBy(xpath = "//button[@id='save']")
		public WebElement Save;	
	
		
		@FindBy(xpath = "//input[@placeholder='Search...']")
		public WebElement SearchText;	
		@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
		public WebElement Search;		
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-group-creation[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement ClickOnName;
		@FindBy(xpath = "//i[@class='ki ki-pencil']")
		public WebElement Edit;
		@FindBy(xpath = "//label[normalize-space()='Valid']//span[@class='checkmark']")
		public WebElement Invalid;
		@FindBy(xpath = "//button[@id='update']")
		public WebElement Update;
		@FindBy(xpath = "//i[@class='ki ki-trash']")
		public WebElement delete;
		@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
		public WebElement yes;
		
		public void action()throws InterruptedException {
////////Create a group
			
			Thread.sleep(1000);
			Toggle.click();
			Thread.sleep(500);
			SecurityMod.click();
			Thread.sleep(500);
			Grpcreation.click();
			Thread.sleep(500);
			Name.click();
			Name.sendKeys("Lab Assistant1");
			Thread.sleep(500);
			Module.click();
			Thread.sleep(500);
			Investigation.click();
			Selectall.click();
			Rightarw.click();
			Thread.sleep(500);
			
			JavascriptExecutor js= (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", Auth1);
//			
//			Auth1.click();
//			Thread.sleep(500);
//			Genchk.click();
//			Thread.sleep(500);
//			Ok.click();
//			
//			
//			js.executeScript("arguments[0].scrollIntoView();", 	Auth2);
//			
//			
//			Auth2.click();
//			Thread.sleep(500);
//			Phar.click();
//			Thread.sleep(1500);
//			Ok.click();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(3500);
	//////////Edit created group and make it as invalid		
			SearchText.click();//input[@placeholder='Search...']
			Thread.sleep(1000);
			SearchText.sendKeys("Lab Assistant1");
			Thread.sleep(1000);
			Search.click();
			Thread.sleep(900);
			ClickOnName.click();
			Thread.sleep(500);
			Edit.click();
			Thread.sleep(500);
			Invalid.click();
			Thread.sleep(500);
			Update.click();
			Thread.sleep(2000);
			ClickOnName.click();
			Thread.sleep(500);
			delete.click();
			Thread.sleep(500);
			yes.click();
			
			
			
		}


}