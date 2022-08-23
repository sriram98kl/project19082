package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Security_PrivilegeViewYasasiiWeb  extends PageFactoryInitYasasiiWeb {
	
	public Security_PrivilegeViewYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-user-privilege-fill']")
	public WebElement Security;
	
	@FindBy(xpath = "//span[contains(text(),'Privilege View')]")
	public WebElement PrivilegeView;
	
	@FindBy(xpath = "//input[@id='viewtype']")
	public WebElement SelectType;
	
	@FindBy(xpath = "//li[normalize-space()='User']")
	public WebElement SelectUser;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement EnterName;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-privilegeview[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement ClickOnName;
	

	
public void create() throws InterruptedException{
	////////////View the privilege of the user	
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(1000);
		Security.click();
		Thread.sleep(1000);
		PrivilegeView.click();
		SelectType.click();
		SelectUser.click();
		EnterName.sendKeys("john peter");
		Thread.sleep(600);
		SearchIcon.click();
		Thread.sleep(900);
		ClickOnName.click();
//////////////View the privilege of the group		
		Thread.sleep(3000);
		SelectType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Group']")).click();
		EnterName.clear();
		Thread.sleep(600);
		EnterName.sendKeys("Doctors");
		Thread.sleep(600);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Doctors']")).click();
//////////////View the privilege of the module	
		Thread.sleep(3000);
		SelectType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Module']")).click();
		EnterName.clear();
		Thread.sleep(600);
		EnterName.sendKeys("Masters");
		Thread.sleep(600);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Masters']")).click();
		
		Thread.sleep(3000);
		SelectType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Privilege']")).click();
		EnterName.clear();
		Thread.sleep(600);
		EnterName.sendKeys("Bank Master");
		Thread.sleep(600);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Bank Master']")).click();
//////////////View the privilege of the profile	
		Thread.sleep(3000);
		SelectType.click();
		driver.findElement(By.xpath("//li[normalize-space()='User Profile']")).click();
		EnterName.clear();
		Thread.sleep(600);
		EnterName.sendKeys("Nurse");
		Thread.sleep(600);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Nurse']")).click();
		
		
		

}
}
