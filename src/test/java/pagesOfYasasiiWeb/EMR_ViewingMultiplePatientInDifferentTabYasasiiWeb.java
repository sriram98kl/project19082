package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_ViewingMultiplePatientInDifferentTabYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public EMR_ViewingMultiplePatientInDifferentTabYasasiiWeb(WebDriver driver) {

		super(driver);

	}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMR;
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/div[1]/td[2]/div[1]/span[1]")
	public WebElement PatientSelection;



	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement myusername;
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement mypassword;
	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement myloginsite;
	@FindBy(xpath="//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement siteselect;
	@FindBy(xpath="//button[@class=\"btn btn-login\"]")
	public WebElement login;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;




	public void DifferentTab() throws InterruptedException, IOException {
		//////Login and select a patient and view the doctor note		
		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		search.sendKeys("G00000053322");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'G00000060322')])[1]")).click();
		PatientSelection.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")).click();
		Thread.sleep(3000);
		//////////////Login in another tab and view the patient's doctor note		
		((JavascriptExecutor)driver).executeScript("window.open()");
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		driver.get("http://uathis.kimshealth.org/login");
		Thread.sleep(1000);


		//	myusername.clear();
		myusername.sendKeys("DOCAS");
		//	mypassword.clear();
		mypassword.sendKeys("Kameda321");
		Thread.sleep(1000);
		myloginsite.click();
		Thread.sleep(1000);
		siteselect.click();
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		search.sendKeys("G00000053322");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'G00000060322')])[1]")).click();
		PatientSelection.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")).click();
		Thread.sleep(4000);		
		driver.switchTo().window(tabs.get(0));
			Thread.sleep(3000);	
		


	}
}
