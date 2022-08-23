package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOAppointmentCheckIn extends PageFactoryInitYasasiiWeb {

	public FOAppointmentCheckIn(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//div[contains(text(),'Encounter')]")
	public WebElement encountericon;

	
	public void encounterappCheckIn() throws InterruptedException, IOException {
	//////////Appoinment checkin
		
		Thread.sleep(1000);
		encountericon.click();
		
	}
	
}
