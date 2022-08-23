package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRADTYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public EMRADTYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientNme;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectPatientNme;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;

	@FindBy(xpath = "//label[@class='icon adtview']")
	public WebElement ADT;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']")
	public WebElement JustClick;

	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement ER;

	@FindBy(xpath = "//li[normalize-space()='Day Case Admission']")
	public WebElement DayCaseAdmission;

	@FindBy(xpath = "//div[normalize-space()='Recommended Date']")
	public WebElement RecommendedDateClick;

	@FindBy(xpath = "//div[contains(@class,'card-body form-inputs')]//div[contains(@class,'row')]//textarea[@id='remarks']")
	public WebElement EnterRemarks;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement RoomCategory;

	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement RoomCategorySelection;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//li[normalize-space()='Delux(18)']")
	public WebElement SelectRoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement Save;


	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement Provider;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement ThreeDot;


	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement Reason;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement MainCategory;

	


	public void AdtSelectionn(String firstname,String gender,String age,String encounter,String MRNo) throws InterruptedException{
		//////////////////Admit the patient		
		Thread.sleep(2000);
		
		MainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		EnterPatientNme.sendKeys(MRNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		//SelectPatientNme.click();
		Thread.sleep(1000);
	   //  UpArrow.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//i[@class='dashboard-lock ki ki-lock-open']")).click();
		
		ADT.click();
		Thread.sleep(500);
		//JustClick.click();
		Thread.sleep(700);
		ER.click();
		Thread.sleep(1000);
		//		DayCaseAdmission.click();
		//		Thread.sleep(1000);
		//		
		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='OK']"));
		//		
		//		System.out.println(dynamicElement.size());
		//		if(dynamicElement.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		//
		//		}
		//     	//RecommendedDateClick.click();
		//		Thread.sleep(2000);
		//		Provider.click();
		//		Thread.sleep(1000);
		//		Provider.sendKeys("John Peter");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='John Peter(docjp)']")).click();
		//		Thread.sleep(1000);
		//		Priority.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		//		Thread.sleep(1000);
		//		EnterRemarks.sendKeys("Admitting the Patient");
		//		Thread.sleep(1000);
		//		RoomCategory.click();
		//		Thread.sleep(1000);
		//		RoomCategorySelection.click();
		//		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(2000);
	//	UpArrow.click();
		Thread.sleep(700);
		ADT.click();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Admission Cancel')]")).click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-adt-cancel[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='adtcancel']")).click();
		Thread.sleep(3000);





	}

}
