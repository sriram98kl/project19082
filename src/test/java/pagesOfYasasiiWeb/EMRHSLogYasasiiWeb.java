package pagesOfYasasiiWeb;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

	public class EMRHSLogYasasiiWeb extends PageFactoryInitYasasiiWeb{
		
		public EMRHSLogYasasiiWeb(WebDriver driver) {

			super(driver);
		}
		
		@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
		public WebElement docemrnote;
		
		@FindBy(xpath = "//i[@title='More']")
		public WebElement selectnotearrow;
		
		
		@FindBy(xpath = "//div[contains(text(),'Log')]")
		public WebElement log;
		
		@FindBy(xpath = "//div[contains(text(),'Edit')]")
		public WebElement edit;
		
		
		
	public EMReditDoctorsNoteYasasiiWeb EMRHomeLogpage() throws InterruptedException {
		//docemrnote.click();
		
//////////////Edit the doctor note by clicking the arrow
		Thread.sleep(2000);
		
		selectnotearrow.click();
		Thread.sleep(1000);
		log.click();

		Thread.sleep(2000);
		selectnotearrow.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(1000);
		return new EMReditDoctorsNoteYasasiiWeb(driver);
	}
	}


