package pagesOfYasasiiWeb;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRAppointmentPageYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRAppointmentPageYasasiiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[1]/img[1]")
	public WebElement appicon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement appdropdown;
	
	@FindBy(xpath = "//div[contains(text(),'HHC Visit Team')]")
	public WebElement hhcvisitteam;

	@FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]")
	public WebElement apphhcslot;
	
	
	@FindBy(xpath = "///td[contains(text(),'20:00')]")
	public WebElement appscroll;
	
	@FindBy(xpath = "//tbody/tr[4]/td[2]/div[2]/label[1]/i[1]")
	public WebElement appaddicon;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement appsave;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement appok;
	
	

	public EMRDoctorsNote EMRHHCApp() throws InterruptedException {
		
		
		
//////////Taking an appoinment for the patient
				
		appicon.click();
		Thread.sleep(10000);
		/*
		 * appdropdown.click(); Thread.sleep(1000); hhcvisitteam.click();
		 * Thread.sleep(10000);
		 */
		
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//td[@class='slot-list ng-star-inserted']/div/span[1]"));

		for(WebElement element:li){
		if(Integer.parseInt(element.getText())>0){
			element.click();
			break;
		
		}
		
    }
		
		//apphhcslot.click();
		Thread.sleep(5000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("arguments[0].scrollIntoView();", appscroll);
		//js.executeScript("window.scrollBy(1574,698)");
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		js.executeScript("document.querySelector('.table appointment-table ng-star-inserted').scrollDown=5000");
//		Thread.sleep(1000);
//		Actions action =new  Actions(driver);
//		action.moveToElement(appaddicon,1565,339);
//		appaddicon.click();
//		appsave.click();
//		Thread.sleep(3000);
//		appok.click();
//		
		
		List<WebElement> li2=new ArrayList<WebElement>();
		//li2=driver.findElements(By.xpath("//div[@class='btn-book-app ng-star-inserted']"));
	//	li2=driver.findElements(By.xpath("//i[@class='ki ki-plus']"));
		//System.out.println(li2);
		WebElement plusDiv=driver.findElement(By.xpath("//tr[@class=\"row-0-0 ng-star-inserted\"]/td[2]/div[2]"));
		WebElement appointmentPlus=driver.findElement(By.xpath("//tr[@class=\"row-0-0 ng-star-inserted\"]/td[2]/div[2]/label/i"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(5000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(8000);
		/*
		 * WebElement applus=driver.findElement(By.
		 * xpath("//tr[@class=\"row-0-0 ng-star-inserted\"]/td[2]/div[2]/label/i"));
		 * applus.click();
		 */
		//WebElement l3=driver.findElement(By.xpath(""));
		Thread.sleep(8000);
		appsave.click();
    	Thread.sleep(3000);
    	appok.click();
		return new EMRDoctorsNote(driver);
		
    	
		
		
		
		
	}
}
