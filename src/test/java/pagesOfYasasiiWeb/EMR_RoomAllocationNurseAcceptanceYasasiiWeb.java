package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_RoomAllocationNurseAcceptanceYasasiiWeb  extends PageFactoryInitYasasiiWeb{
	
	public EMR_RoomAllocationNurseAcceptanceYasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement threedots;
	
	@FindBy(xpath = "//div[contains(text(),'New Transfer')]")
	public WebElement newtransfer;
		
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement roomcategory;
	
	@FindBy(xpath = "//li[normalize-space()='ROOM']")
	public WebElement selectRoom;	
		
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement roomtype;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[3]/li[1]")
	public WebElement selectroomtype;
		
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement bedno;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/form[1]/div[1]/div[2]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectbed;		
		
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement sendrequest;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mylocation;
		
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement selectIP;
	
	@FindBy(xpath = "//i[@title='Click to change view as Card View']")
	public WebElement changetogridview;	
		
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement uparrow;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement lock;
		
	@FindBy(xpath = "//label[@class='icon adtview']")
	public WebElement adt;
	
	@FindBy(xpath = "//button[@id='acceptpatadtbutton']")
	public WebElement accept;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement search;
	
	
	
	
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;	
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//	
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;	
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
//		
//	@FindBy(xpath = "")
//	public WebElement enterMRNo;
//	
//	@FindBy(xpath = "")
//	public WebElement ClickOnSearch;
	
	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//label[@class='ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;
	
	
	
	
public void patientreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Organisation.sendKeys(ORGANISATION);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		docAdd.click();
		Thread.sleep(1000);
		//	Insurance.click();
		///Thread.sleep(1000);
		//	Inscorp.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Company[Corp]']")).click();
		//	PlanName.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Scheme']")).click();
		//Thread.sleep(1000);
		//	insAdd.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{
System.out.println("sri");
		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		
		Thread.sleep(3000);
        String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
    	System.out.println(mrno);
		
    	String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);
		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb82190\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData82.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(58);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(0).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		SaveSuccess.click();

	}
		
public void transfer() throws InterruptedException
{
	
	threedots.click();
	Thread.sleep(800);
	newtransfer.click();
	Thread.sleep(800);
	roomcategory.click();
	Thread.sleep(1500);
	selectRoom.click();
	Thread.sleep(1200);
	roomtype.click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/form[1]/div[1]/div[2]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
	//selectroomtype.click();
	Thread.sleep(5000);
	bedno.click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//*[contains(text(),'Emrgency NS')])[1]")).click();
	
	//selectbed.click();
	Thread.sleep(2000);
	sendrequest.click();
	Thread.sleep(3000);
}
public void nurseloginandAccept(String MRNo) throws InterruptedException
{
//////////////Nurse Duty Roster / Plan. This nurse can only see the IP patients(In my location) in their nursing location
	Thread.sleep(3000);	
	//mylocation.click();
	//Thread.sleep(800);
	//selectIP.click();
	//Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//div[@class='count ng-star-inserted']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/div[1]/div[1]/lib-task-manager[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]")).click();
	Thread.sleep(1000);
      search.click();
  	Thread.sleep(1000);
	search.sendKeys(MRNo);
			
	//changetogridview.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(1500);
   uparrow.click();//i[@class='dashboard-lock-arrow ki ki-chevron-up']
	Thread.sleep(800);
	//lock.click();
	Thread.sleep(2000);
	adt.click();//label[@class='icon adtview']
	Thread.sleep(1500);
	driver.findElement(By.xpath("//i[@class='ki ki-screen-expand']")).click();
    Thread.sleep(1500);
  accept.click();
	Thread.sleep(1500);	

		
	}
	
	
	
	


}
