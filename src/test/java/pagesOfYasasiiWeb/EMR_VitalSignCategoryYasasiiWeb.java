package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_VitalSignCategoryYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMR_VitalSignCategoryYasasiiWeb(WebDriver driver) {

		super(driver);

}

		@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
		public WebElement Toggle;
		@FindBy(xpath="//span[normalize-space()='Vital Signs Category']")
		public WebElement Category;
		@FindBy(xpath = "//ki-input-control[@placeholder='Name']//input[@type='text']")
		public WebElement Name;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-vitalcategory[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
		public WebElement Site;
		@FindBy(xpath = "//span[@title='KIMSHEALTH TVM']")
		public WebElement Siteselect;
		@FindBy(xpath = "//label[normalize-space()='APGAR Score']//span[@class='checkmark']")
		public WebElement SelectAPGAR;
		@FindBy(xpath = "//label[normalize-space()='BP Diastolic']//span[@class='checkmark']")
		public WebElement BpDia;	
		@FindBy(xpath = "//label[normalize-space()='BP Systolic']//span[@class='checkmark']")
		public WebElement BpSys;	
		@FindBy(xpath = "//i[@class='ki ki-chevron-right']")
		public WebElement RightArw;	
		@FindBy(xpath = "//button[@id='vitalsavid']")
		public WebElement Save;	
		
		
		@FindBy(xpath = "//input[@placeholder='Search...']")
		public WebElement SearchTextbox;	
		@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
		public WebElement Search;	
		
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-vitalcategory[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement Select;
		@FindBy(xpath = "//i[@class='ki ki-pencil']")
		public WebElement Edit;
		@FindBy(xpath = "//label[normalize-space()='Valid']//span[@class='checkmark']")
		public WebElement Validchkbox;
		@FindBy(xpath = "//button[@id='vitalsavid']")
		public WebElement Update;
		@FindBy(xpath = "//span[normalize-space()='Master']")
		public WebElement Master;
		
		
			
		
		public void action(String Test)throws InterruptedException {

////////////	Create a vital signs category		
			Thread.sleep(1000);
			Toggle.click();
			Thread.sleep(1000);
			Master.click();
			Thread.sleep(1000);
			Category.click();
			Thread.sleep(1500);
			Name.click();
			Thread.sleep(500);
			Name.sendKeys(Test);
			Thread.sleep(500);
			Site.click();
			Thread.sleep(500);
			Siteselect.click();
			SelectAPGAR.click();
			Thread.sleep(2000);
			BpDia.click();
			BpSys.click();
			Thread.sleep(500);
			RightArw.click();
			Thread.sleep(1500);   
			Save.click();
			Thread.sleep(1000);
//////////Edit the created one and make it as invalid			
			SearchTextbox.click();
			Thread.sleep(500);
			SearchTextbox.sendKeys(Test);
			Thread.sleep(1000);
			Search.click();
			
			Select.click();
			Edit.click();
			Thread.sleep(1000);
			Validchkbox.click();
			Thread.sleep(500);
			Update.click();
			Thread.sleep(2000);
			Select.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(500);
			
			
		}



}