package pagesOfYasasiiWeb;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Security_LogViewYassasiiWeb  extends PageFactoryInitYasasiiWeb{
	
	public Security_LogViewYassasiiWeb(WebDriver driver) {

		super(driver);

}

		@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
		public WebElement Toggle;
		@FindBy(xpath="//i[@class='ki ki-user-privilege-fill']")
		public WebElement Security;
		@FindBy(xpath = "//span[normalize-space()='Log View']")
		public WebElement Logview;
		@FindBy(xpath = "//input[@placeholder='Search...']")
		public WebElement SearchText;
		@FindBy(xpath = "//i[@class='ki ki-search']")
		public WebElement SearchIcon;
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-login-logview-landing[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement ClickOnName;
		
		@FindBy(xpath = "//ki-select-control[@placeholder='Site']//input[@type='text']")
		public WebElement Site;
		@FindBy(xpath = "//li[normalize-space()='KIMSHEALTH TVM']")
		public WebElement Siteselect;
		@FindBy(xpath = "//button[normalize-space()='View']")
		public WebElement viewbutn;	
		
		
		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-login-logview-landing[1]/div[2]/app-logviewdetails[1]/form[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/label[1]/i[1]")
		public WebElement Eyebutn;	
		@FindBy(xpath = "//button[normalize-space()='Close']")
		public WebElement EyebtnClose;
		
		
		
		
		
		
		public void action()throws InterruptedException {

		//////View the log details of the user	
			Thread.sleep(1000);
			Toggle.click();
			Thread.sleep(1000);
			Security.click();
			Thread.sleep(1500);
			Logview.click();
			Thread.sleep(500);
			SearchText.click();
			SearchText.sendKeys("John Peter");
			Thread.sleep(500);
			SearchIcon.click();
			Thread.sleep(1000);
			ClickOnName.click();
			
			Thread.sleep(800);
			Site.click();
			Thread.sleep(500);
			Siteselect.click();
			Thread.sleep(2000);
			viewbutn.click();
			
			Thread.sleep(800);
			Eyebutn.click();
			Thread.sleep(900);
			EyebtnClose.click();
			Thread.sleep(1000);   
			
		}

		
	
}
