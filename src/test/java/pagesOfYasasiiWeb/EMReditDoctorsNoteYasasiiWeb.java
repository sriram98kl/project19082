package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMReditDoctorsNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMReditDoctorsNoteYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosisplan;
	
	@FindBy(xpath = "//span[normalize-space()='IP Recommendation']")
	public WebElement iprecommendation;
	
	
	@FindBy(xpath = "//span[@class='checkmark active-label']")
	public WebElement patientforadmissioncheckbox;
	
	@FindBy(xpath = "//input[@id='categoryid']")
	public WebElement priority;
	
	@FindBy(xpath = "//input[@id='admntypeid']")
	public WebElement admtype;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/div[7]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "//label[@class='icon emrpreview']")
	public WebElement emreditpreview;
	
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement emrsave;
	
	@FindBy(xpath = "//input[@id='bedid']")
	public WebElement emrroomtype;
	
	@FindBy(xpath = "//li[contains(text(),'ICU')]")
	public WebElement emrroomtypeselect;
	
	
	
	
public void EMReditIPRecommendation() throws InterruptedException {
//////////Edit the doctor note and add IP recommendation and save it
	//docemrnote.click();
	Thread.sleep(3000);
	diagnosisplan.click();//div[contains(text(),'Diagnosis and Plan')]
	Thread.sleep(1000);
	iprecommendation.click();
	Thread.sleep(3000);
	patientforadmissioncheckbox.click();
	priority.click();
	driver.findElement(By.xpath("//li[contains(text(),'Elective')]")).click();
	Thread.sleep(1000);
	admtype.click();
	driver.findElement(By.xpath("//li[contains(text(),'Day Case Admission')]")).click();
	Thread.sleep(500);
	emrroomtype.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[normalize-space()='Deluxe']")).click();
	Thread.sleep(500);
	remarks.sendKeys("admit the patient");
	Thread.sleep(1000);
	emreditpreview.click();
	Thread.sleep(1000);
	emrsave.click();
	Thread.sleep(3000);
	
}
}
