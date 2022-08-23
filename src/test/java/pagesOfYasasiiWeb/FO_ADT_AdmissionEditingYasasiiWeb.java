package pagesOfYasasiiWeb;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_ADT_AdmissionEditingYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_ADT_AdmissionEditingYasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement enterMRNo;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement ClickOnSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement SelectPatient;

	@FindBy(xpath = "//div[contains(text(),'ADT')]")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement admissionType;
	
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement Providernamefield;
	
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement RoomCategory;
	
	@FindBy(xpath = "//li[normalize-space()='ROOM']")
	public WebElement SelectRoom;
	
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoonType;
	
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNo;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBedNo;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement save;
	
	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement threedots;
	
	@FindBy(xpath = "//div[contains(text(),'Admission Edit')]")
	public WebElement admissedit;
	
	@FindBy(xpath = "//div[@class='card-body form-inputs']//div[@class='row']//textarea[@id='remarks']")
	public WebElement enterRemaarks;
	
	@FindBy(xpath = "//button[@id='updatepatadtbutton']")
	public WebElement updateclick;
	
	@FindBy(xpath = "//div[contains(text(),'New Transfer')]")
	public WebElement newTranfer;
	
	@FindBy(xpath = "//div[contains(text(),'Transfer Request Edit')]")//div[contains(text(),'Transfer Request Edit')]
	public WebElement TransferRequestERdit;
	
	@FindBy(xpath = "//input[@id='remarks']")
	public WebElement rremarks;
	
	@FindBy(xpath = "//div[contains(text(),'Transfer Request Cancel')]")//div[contains(text(),'Transfer Request Cancel')]
	public WebElement tranfercancel;
	
	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement reason;
	
	@FindBy(xpath = "//div[contains(text(),'New Hold')]")
	public WebElement Hold;
	
	@FindBy(xpath = "//*[@class='ki ki-bed-fill' and @style='color: orange']")
	public WebElement holdTranfer;
	
	@FindBy(xpath = "//div[contains(text(),'New Reservation')]")
	public WebElement newReservation;
	
	@FindBy(xpath = "//div[contains(text(),'Reservation Edit/View')]")
	public WebElement reservationdedit;
	
	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement reservationdelete;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement reservationdeleteyes;
	
	@FindBy(xpath = "//div[contains(text(),'Bed History')]")
	public WebElement BedHistory;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement close;
	
	@FindBy(xpath = "//div[contains(text(),'Admission Cancel')]")
	public WebElement admissioncancel;
	
	
	
	
	
	
	
	public void admit(String MRNo,String AdmissionType,String doctor,String Prio) throws InterruptedException
	{
		
		Thread.sleep(3000);
		enterMRNo.clear();
		Thread.sleep(800);
		enterMRNo.click();
		Thread.sleep(500);
		enterMRNo.sendKeys(MRNo);
		Thread.sleep(800);
		ClickOnSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(800);
		ADT.click();
		Thread.sleep(800);
		Thread.sleep(800);
    	driver.findElement(By.xpath("//input[@id='admittype']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey3']//li[contains(text(),'IP')]")).click();
		Thread.sleep(800);
		
		
//	WebElement element1=driver.findElement(By.xpath("//input[@id='admittype']"));	
//		String text=element1.getText();
//		Thread.sleep(800);
//		if(text.contains("ER"))
//		{
//			Thread.sleep(800);
//			driver.findElement(By.xpath("//input[@id='admittype']")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//app-list-item[@id='droplistkey3']//li[contains(text(),'IP')]")).click();
//			Thread.sleep(800);
//		}
//		else
//		{
//			
//		}
		
		
		
//		
//		List<WebElement> l=driver.findElements(By.xpath("//*[contains(text(),'IP')]"));
//		Thread.sleep(800);
//		
//		if (l.size()>0) 
//		{
//			
//		}
//		else
//		{
//			driver.findElement(By.xpath("//input[@id='admittype']")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//app-list-item[@id='droplistkey3']//li[contains(text(),'IP')]")).click();
//			Thread.sleep(800);
//		}
//		admissionType.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//*[contains(text(),'" + AdmissionType + "')]")).click();
//		Thread.sleep(1000);
		Thread.sleep(800);
	    Providernamefield.sendKeys(doctor);
		Thread.sleep(800);
		 driver.findElement(By.xpath("//*[contains(text(),'" + doctor + "')]")).click();
		Thread.sleep(800);
		Priority.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + Prio + "')]")).click();
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		RoomCategory.click();
		SelectRoom.click();
		Thread.sleep(800);
		RoomType.click();
		driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(800);
		BedNo.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'NICCU')])[1]")).click();
		//SelectBedNo.click();
		Thread.sleep(800);
		save.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1500); 
	}
	
	public void edit(String remarks, String MRNo) throws InterruptedException, AWTException
	{
		
		enterMRNo.click();
		Thread.sleep(500);
		enterMRNo.sendKeys(MRNo);
		Thread.sleep(800);
		ClickOnSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(800);
		ADT.click();
		Thread.sleep(3000);
		
		
		
/////////Editing the admit details
		threedots.click();
		admissedit.click();
		Thread.sleep(600);
		enterRemaarks.sendKeys(remarks);
		updateclick.click();
		Thread.sleep(2500);
/////////////////////New Tranfer
		threedots.click();//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']
		Thread.sleep(1000);
		newTranfer.click();
		Thread.sleep(500);
		RoomCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/form[1]/div[1]/div[2]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		BedNo.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='savepatadtbutton']")).click();
/////////////////Tranfer request
		Thread.sleep(3000);
		threedots.click();
		Thread.sleep(500);
		TransferRequestERdit.click();
		rremarks.clear();
		Thread.sleep(500);
		rremarks.sendKeys("Request Sended");
		Thread.sleep(500);
		updateclick.click();
		Thread.sleep(2500);
///////////////Tranfer request cancel
		threedots.click();
		tranfercancel.click();
		Thread.sleep(500);
		reason.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Advance Order Cancelled']")).click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
///////////////Hold		
		Thread.sleep(3000);
		threedots.click();
	    Hold.click();//div[contains(text(),'New Hold')]
	    Thread.sleep(500);
	    RoomCategory.click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
		RoomType.click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/div[1]/div[2]/form[1]/div[1]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		BedNo.click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/div[1]/div[2]/form[1]/div[1]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='savepatadtbutton']")).click();
		
//////////////Hold Tranfer	
		Thread.sleep(3000);
		threedots.click();
		Thread.sleep(1000);
		holdTranfer.click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='ng-star-inserted']//i[@class='ki ki-ellipsis-v']")).click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Patient Hold Transfer')]")).click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
/////////////Tranfer cancel
		Thread.sleep(3000);
		threedots.click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Transfer Cancel')]")).click();//div[contains(text(),'Transfer Cancel')]
		 Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='cancelreason']")).click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='As per Patient request']")).click();
		 Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
/////////////////////New reservation
		Thread.sleep(3000);
		threedots.click();
		newReservation.click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//ki-select-control[contains(@formcontrolname,'roomtypeid')]//input[@id='undefined']")).click();
		 Thread.sleep(500);	
		 driver.findElement(By.xpath("//li[normalize-space()='Deluxe']")).click();
			 driver.findElement(By.xpath("//ki-select-control[contains(@formcontrolname,'reservationtypeid')]//input[@id='undefined']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//ki-calendar[@id='reservationdate']//input[contains(@type,'text')]")).click();
			 Thread.sleep(500);
			 Robot r=new Robot();
			 Thread.sleep(500);
				r.keyPress(KeyEvent.VK_RIGHT);
				r.keyRelease(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(800);	
			// driver.findElement(By.xpath("//span[normalize-space()='28']")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[@id='savepatadtbutton']")).click();
			
		
////////////Reservation Edit or view
			Thread.sleep(3000);
			threedots.click();
			reservationdedit.click();
			 Thread.sleep(1300);
			reservationdelete.click();
			 Thread.sleep(500);
			reservationdeleteyes.click();
/////////////////Bed History
			
			Thread.sleep(3000);
			threedots.click();
			BedHistory.click();
			Thread.sleep(3000);
			close.click();
			
/////////////Admission cancel	
			Thread.sleep(3000);
			threedots.click();
			admissioncancel.click();
			 Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='cancelreason']")).click();
			 Thread.sleep(500);
			driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
			 Thread.sleep(500);
			driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")).click();
			
			
			
	}
	
//////////////Click adt after selecting the patient	
	
	public void ADT(String MRNo,String AdmissionType,String doctor,String Prio) throws InterruptedException
	{
		
		Thread.sleep(800);
		ADT.click();
		Thread.sleep(800);
//		admissionType.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//*[contains(text(),'" + AdmissionType + "')]")).click();
//		Thread.sleep(1000);
	    Providernamefield.sendKeys(doctor);
		Thread.sleep(800);
		 driver.findElement(By.xpath("//*[contains(text(),'" + doctor + "')]")).click();
		Thread.sleep(800);
		Priority.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'" + Prio + "')]")).click();
        Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		RoomCategory.click();
		SelectRoom.click();
		Thread.sleep(800);
		RoomType.click();
		SelectRoonType.click();
		Thread.sleep(800);
		BedNo.click();
		Thread.sleep(800);
		SelectBedNo.click();
		Thread.sleep(800);
		save.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1500);
	}
}
