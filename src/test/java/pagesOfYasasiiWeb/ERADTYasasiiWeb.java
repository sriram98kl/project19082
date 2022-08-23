package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class ERADTYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public ERADTYasasiiWeb(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='inchargeproviderdisplayname']")
	public WebElement inchargeprovider;
	
	@FindBy(xpath = "//input[@id='erconsultid']")
	public WebElement erconsultant;
		
	@FindBy(xpath = "//input[@id='inchargenurseid']")
	public WebElement inchargenurse;
	
	@FindBy(xpath= "//input[@id='contactname']")
	WebElement contactname;
	
	@FindBy(xpath= "//input[@id='contactrelationid']")
	WebElement contactrelation;
	
	@FindBy(xpath= "//input[@id='contactno']")
	WebElement contactno;
	
	@FindBy(xpath= "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")
	WebElement remarks;
	
	@FindBy(xpath= "//input[@id='bedclass']")
	WebElement bedtype;
	
	@FindBy(xpath= "//input[@id='bednumber']")
	WebElement bednumber;
	
	@FindBy(xpath= "//button[@id='savepatadtbutton']")
	WebElement adtsave;
	
	
    public void eradtdetails() throws InterruptedException
	{
    	Thread.sleep(5000);
    	inchargeprovider.click();
    	Thread.sleep(2000);
    	inchargeprovider.sendKeys("Greg");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[@id='ngb-typeahead-1-0']")).click();
    	Thread.sleep(2000);
    	erconsultant.click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[contains(text(),'Epen Joseph George(1221)')]")).click();
    	Thread.sleep(2000);
    	inchargenurse.click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[contains(text(),'Ahamed(1214)')]")).click();
    	Thread.sleep(2000);
    	contactname.sendKeys("Rahual Sharma");
    	Thread.sleep(2000);
    	contactrelation.click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[contains(text(),'Brother')]")).click();
    	Thread.sleep(2000);
    	contactno.sendKeys("854768129");
    	Thread.sleep(2000);
    	remarks.sendKeys("ER Patent admited");
    	Thread.sleep(5000);
    	bedtype.click();
    	driver.findElement(By.xpath("//li[contains(text(),'ER(6)')]")).click();
    	Thread.sleep(2000);
    	bednumber.click();
    	driver.findElement(By.xpath("//li[contains(text(),'s5/NB -NS1/North Block-First Floor-ER section-Room')]")).click();
    	adtsave.click();
	}

}
