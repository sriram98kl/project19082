package pagesOfYasasiiWeb;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class IVSampleProcessingAfterDespatch extends PageFactoryInitYasasiiWeb {
	public IVSampleProcessingAfterDespatch(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menutoggle;
	
	
	@FindBy(xpath = "//span[contains(text(),'Sample Processing')]")
	public WebElement Sampleprocessing;
	
	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement search;
	
	
	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement searChField;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[1]/lib-searchlab[1]/form[1]/div[3]/div[2]/div[1]/span[1]/i[1]")
	public WebElement searChbutton;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement patientselect;

	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CHECKBOX;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[2]/form[1]/div[2]/div[1]/label[1]/i[1]")
	public WebElement Receive;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[2]/form[1]/div[2]/div[1]/label[3]/i[1]")
	public WebElement Accept;
	
	
	@FindBy(xpath = "//input[@placeholder='Result']")
	public WebElement EnterResult;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[6]/span[1]/i[1]")
	public WebElement IVattachment; 
	
	@FindBy(xpath = "//button[contains(text(),'Attach')]")
	public WebElement attach;
	
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement close;
	
	@FindBy(xpath = "//input[@id='srchauthorisation1']")
	public WebElement Authorisation;
	
	
	@FindBy(xpath = "//li[contains(text(),'Second Level Authorized')]")
	public WebElement Authorisation2ndLevel;
	
	@FindBy(xpath = "//*[@id=\"onSaveid\"]")
	public WebElement save;
	
	
	
	public void enterIVSampleprocessingDeTails() throws InterruptedException, IOException{
		menutoggle.click();
		Thread.sleep(2000);
		Sampleprocessing.click();
		Thread.sleep(3000);
		search.click();
		Thread.sleep(3000);
		searChField.sendKeys("%%%");
		searChbutton.click();
		Thread.sleep(5000);
		patientselect.click();
		Thread.sleep(1000);
		CHECKBOX.click();
		Receive.click();
		Thread.sleep(3000);
		Accept.click();
		Thread.sleep(5000);
		EnterResult.sendKeys("137");
		Thread.sleep(1000);
		IVattachment.click();
		Thread.sleep(10000);
		attach.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Mathews\\Documents\\upload.exe");
		Thread.sleep(10000);
		close.click();
		Thread.sleep(5000);
		Authorisation.click();
		Thread.sleep(3000);
		Authorisation2ndLevel.click();
		Thread.sleep(3000);
		save.click();
	}
	

}