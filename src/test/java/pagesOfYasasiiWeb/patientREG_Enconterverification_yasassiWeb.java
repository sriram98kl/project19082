package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class patientREG_Enconterverification_yasassiWeb extends  PageFactoryInitYasasiiWeb {
	public  patientREG_Enconterverification_yasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='card-body']//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
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

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement ProviderNmae;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//label[contains(text(),'Allow Visitor')]")
	public WebElement ElementAllowVisitor;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement RoomCategory;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNumber;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement ADVpayYes;

	@FindBy(xpath = "//div[@class='panel-body card-block card-body']")
	public WebElement Category;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement serviceName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement AddAmount;

	@FindBy(xpath = "//label[@class='pay-style']")
	public WebElement ElementTotalAmount;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement SaveBILLING;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement TransactionOK;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")//input[@id='EncBillingproviders']
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//div[@class='card scroll']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//i[1]")
	public WebElement deleteconfee;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yesDelete;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement saveBill;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess1;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamberger;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMRIcon;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomeScreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement registration;

	@FindBy(xpath = "//span[@class='user-name']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement  logout;


	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement searchField;


	public void patientREG1(String NAME1 ,String AGE, String MBLNO,String ORGANISATION , String ADDRESS ,String  AADHAAR1 ,String PROVIDER1 ) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		registration.click();
		Thread.sleep(2000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME1);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		Thread.sleep(1000);
		aadharNo.sendKeys(Keys.HOME + AADHAAR1);
		Thread.sleep(1000);
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
		Thread.sleep(1000);

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

		File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(54);	
		int i=FOFullRegTest.getLastRowNum();


		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(18).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout); 

		SaveSuccess.click();



		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		ENCprvdrName.click();
		ENCprvdrName.sendKeys(PROVIDER1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER1+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		saveBill.click();
		Thread.sleep(1000);
		SaveSuccess1.click();


		
	}

	public void patientREG2(String NAME2 ,String AGE, String MBLNO,String ORGANISATION , String ADDRESS ,String  AADHAAR2 ,String PROVIDER1 ) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		registration.click();
		
		
		Thread.sleep(2000);
		List<WebElement> Element=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(Element.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		Thread.sleep(800); 
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME2);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		Thread.sleep(1000);
		aadharNo.sendKeys(Keys.HOME + AADHAAR2);
		Thread.sleep(1000);
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

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(1000);

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

		File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(54);	
		int i=FOFullRegTest.getLastRowNum();


		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(19).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout); 

		SaveSuccess.click();



		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		ENCprvdrName.click();
		ENCprvdrName.sendKeys(PROVIDER1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER1+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		saveBill.click();
		Thread.sleep(1000);
		SaveSuccess1.click();


	
	}

	public void patientREG3(String NAME3 ,String AGE, String MBLNO,String ORGANISATION , String ADDRESS ,String  AADHAAR3 ,String PROVIDER2 ) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		registration.click();
		Thread.sleep(2000);
		List<WebElement> Element =driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(Element.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		Thread.sleep(800); 
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME3);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		Thread.sleep(1000);
		aadharNo.sendKeys(Keys.HOME + AADHAAR3);
		Thread.sleep(1000);
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

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(1000);

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

		File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(54);	
		int i=FOFullRegTest.getLastRowNum();


		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(20).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout); 

		SaveSuccess.click();



		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		ENCprvdrName.click();
		ENCprvdrName.sendKeys(PROVIDER2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER2+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		saveBill.click();
		Thread.sleep(1000);
		SaveSuccess1.click();


		
	}

	public void patientREG4(String NAME4 ,String AGE, String MBLNO,String ORGANISATION , String ADDRESS ,String  AADHAAR4 ,String PROVIDER2 ) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		registration.click();
		Thread.sleep(2000);
		List<WebElement> Element=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(Element.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		Thread.sleep(800); 
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME4);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		Thread.sleep(1000);
		aadharNo.sendKeys(Keys.HOME + AADHAAR4);
		Thread.sleep(1000);
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

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(1000);

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

		File src=new File("D:\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(54);	
		int i=FOFullRegTest.getLastRowNum();


		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(21).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout); 

		SaveSuccess.click();



		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		ENCprvdrName.click();
		ENCprvdrName.sendKeys(PROVIDER2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER2+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		saveBill.click();
		Thread.sleep(1000);
		SaveSuccess1.click();


		
	}

	//===========================================================================================================================
	public void DoctorListVerify1(String USER1 , String PASSWORD1,String MRNO1 ,String MRNO2, String NAME1 ,String  NAME2) throws InterruptedException {


		/////MRNO1 verification
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get("http://192.168.0.240:75/login");
		Thread.sleep(5000);


		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(USER1);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(PASSWORD1);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



		hamberger.click();
		Thread.sleep(1000);
		EMRIcon.click();
		Thread.sleep(1000);
		EMRhomeScreen.click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.sendKeys(MRNO1);
		Thread.sleep(1000);
		boolean PATientMRNO1	= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO1+"')])[1]")).isDisplayed();

		System.out.println(NAME1);
		Thread.sleep(1000);
		if (PATientMRNO1==true)
		{
			System.out.println(MRNO1 +" exist in the OPlist");
		}

		else {
			System.out.println(MRNO1 +"not exist in the OPlist");
		}

		Thread.sleep(2000);
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My OP and IP']")).click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.clear();
		searchField.sendKeys(MRNO1);
		Thread.sleep(1000);
		boolean pATientMRNO1= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO1+"')])[1]")).isDisplayed();

		//System.out.println(pATientMRNO1);
		Thread.sleep(1000);
		if (pATientMRNO1==true)
		{
			System.out.println(MRNO1 +" exist in the MY OP and IP list");
		}

		else {
			System.out.println(MRNO1 +" not exist in the MY OP and IP list");
		}


		////MRNO2 verification



		hamberger.click();
		Thread.sleep(1000);
		//EMRIcon.click();
		Thread.sleep(1000);
		EMRhomeScreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.clear();
		searchField.sendKeys(MRNO2);
		Thread.sleep(1000);
		boolean PATientMRNO2	= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO2+"')])[1]")).isDisplayed();

		System.out.println(NAME2);
		Thread.sleep(1000);
		if (PATientMRNO2==true)
		{
			System.out.println(MRNO2 +" exist in the OPlist");
		}

		else {
			System.out.println(MRNO2 +"not exist in the OPlist");
		}

		Thread.sleep(2000);
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My OP and IP']")).click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.clear();
		searchField.sendKeys(MRNO2);
		Thread.sleep(1000);
		boolean pATientMRNO2= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO2+"')])[1]")).isDisplayed();

		//System.out.println(pATientMRNO2);
		Thread.sleep(1000);
		if (pATientMRNO2==true)
		{
			System.out.println(MRNO2 +" exist in the MY OP and IP list");
		}

		else {
			System.out.println(MRNO2 +" not exist in the MY OP and IP list");
		}
	}

	/////doctorVerify2
	public void DoctorListVerify2(String USER2, String PASSWORD2,String MRNO3 ,String MRNO4 , String NAME3,String NAME4) throws InterruptedException {


		/////MRNO1 verification
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(2));
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(5000);
		driver.get("http://192.168.0.240:75/login");
		Thread.sleep(5000);


		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(USER2);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(PASSWORD2);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



		hamberger.click();
		Thread.sleep(1000);
		EMRIcon.click();
		Thread.sleep(1000);
		EMRhomeScreen.click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.sendKeys(MRNO3);
		Thread.sleep(1000);
		boolean PATientMRNO1	= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO3+"')])[1]")).isDisplayed();

		System.out.println(NAME3);
		Thread.sleep(1000);
		if (PATientMRNO1==true)
		{
			System.out.println(MRNO3 +" exist in the OPlist");
		}

		else {
			System.out.println(MRNO3 +"not exist in the OPlist");
		}

		Thread.sleep(2000);
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My OP and IP']")).click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.clear();
		searchField.sendKeys(MRNO3);
		Thread.sleep(1000);
		boolean pATientMRNO3= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO3+"')])[1]")).isDisplayed();

		//System.out.println(NAME3);
		Thread.sleep(1000);
		if (pATientMRNO3==true)
		{
			System.out.println(MRNO3 +" exist in the MY OP and IP list");
		}

		else {
			System.out.println(MRNO3 +" not exist in the MY OP and IP list");
		}


		////MRNO2 verification



		hamberger.click();
		Thread.sleep(1000);
		//EMRIcon.click();
		Thread.sleep(1000);
		EMRhomeScreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.clear();
		Thread.sleep(1000);
		searchField.sendKeys(MRNO4);
		Thread.sleep(1000);
		boolean PATientMRNO4	= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO4+"')])[1]")).isDisplayed();

		System.out.println(NAME4);
		Thread.sleep(1000);
		if (PATientMRNO4==true)
		{
			System.out.println(MRNO4 +" exist in the OPlist");
		}

		else {
			System.out.println(MRNO4 +"not exist in the OPlist");
		}

		Thread.sleep(2000);
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My OP and IP']")).click();
		Thread.sleep(1000);
		searchField.click();
		Thread.sleep(1000);
		searchField.clear();
		searchField.sendKeys(MRNO4);
		Thread.sleep(1000);
		boolean pATientMRNO4= driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO4+"')])[1]")).isDisplayed();

		//System.out.println(pATientMRNO4);
		Thread.sleep(1000);
		if (pATientMRNO4==true)
		{
			System.out.println(MRNO4 +" exist in the MY OP and IP list");
		}

		else {
			System.out.println(MRNO4 +" not exist in the MY OP and IP list");
		}
	}






}



















