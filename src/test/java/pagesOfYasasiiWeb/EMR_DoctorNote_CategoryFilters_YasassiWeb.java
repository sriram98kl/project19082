package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_DoctorNote_CategoryFilters_YasassiWeb  extends PageFactoryInitYasasiiWeb {
	





	public EMR_DoctorNote_CategoryFilters_YasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='ER']")
	public WebElement ER;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")  //input[@id='chiefcomplainttext']
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;
	
	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch1;

	
	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement cpoeServiceSearch;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;

	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSearch;


	@FindBy(xpath = "//body//app-root//app-cpoe-pharmacy-list//img[1]")
	public WebElement uncheckStar;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement medicineSelect;

	@FindBy(xpath = "//app-cpoe-pharmacy-prescription//ki-select-control[@id='routeid']//input[1]")
	public WebElement Route;

	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;

	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement DoseLevel;

	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement Doseunit;

	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement reason;


	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//label[normalize-space()='Consumable']//span[@class='checkmark']")
	public WebElement consumables;

	@FindBy(xpath = "//label[normalize-space()='Brand']//span[@class='checkmark']")
	public WebElement brand;

	@FindBy(xpath = "//label[normalize-space()='Generic']//span[@class='checkmark']")
	public WebElement generic;

	@FindBy(xpath = "//span[contains(@title,'Drug Class')]//i[contains(@class,'ki ki-drug')]")
	public WebElement DrugClass;

	@FindBy(xpath = "//span[normalize-space()='Probiotics']")
	public WebElement probiotics;
	
	@FindBy(xpath = "//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'mbl-pl5 col-md-5')]/div/app-cpoe-order-view/div[contains(@class,'card card-right order-card-container')]/div[contains(@class,'card-body')]/div[contains(@class,'order-container-wrap')]/div[contains(@class,'all-orders ng-star-inserted')]/div[contains(@class,'order-list')]/div[contains(@class,'row ng-star-inserted')]/div[1]/div[1]/div[2]/div[1]/i[1]")
	public WebElement Threedot1;
	
	@FindBy(xpath = "//div[text()=' Edit']")
	public WebElement edit;
	
	@FindBy(xpath = "//input[contains(@name,'remarks')]")
	public WebElement Remarks;
	
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement update;
	
	@FindBy(xpath = "//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen[contains(@class,'ng-star-inserted')]/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'mbl-pl5 col-md-5')]/div/app-cpoe-order-view/div[contains(@class,'card card-right order-card-container')]/div[contains(@class,'card-body')]/div[contains(@class,'order-container-wrap')]/div[contains(@class,'all-orders ng-star-inserted')]/div[contains(@class,'order-list')]/div[contains(@class,'row ng-star-inserted')]/div[2]/div[1]/div[2]/div[1]/i[1]")
	public WebElement Threedot2;
	
	@FindBy(xpath = "//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen[contains(@class,'ng-star-inserted')]/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'mbl-pl5 col-md-5')]/div/app-cpoe-order-view/div[contains(@class,'card card-right order-card-container')]/div[contains(@class,'card-body')]/div[contains(@class,'order-container-wrap')]/div[contains(@class,'all-orders ng-star-inserted')]/div[contains(@class,'order-list')]/div[contains(@class,'row ng-star-inserted')]/div[3]/div[1]/div[2]/div[1]/i[1]")
	public WebElement Threedot3;
	
	
	@FindBy(xpath = "//span[contains(@title,'Medicine Type')]//i[contains(@class,'ki ki-generic')]")
	public WebElement medicineType;
	
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;
	
	@FindBy(xpath = "//span[contains(@title,'Base Category')]//i[contains(@class,'ki ki-generic')]")
	public WebElement maincategory;
	
	@FindBy(xpath = "//span[contains(@title,'Sub Category')]//i[contains(@class,'ki ki-formulary')]")
	public WebElement subCategory;
	
	@FindBy(xpath = "//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'mbl-pl5 col-md-5')]/div/app-cpoe-order-view/div[contains(@class,'card card-right order-card-container')]/div[contains(@class,'card-body')]/div[contains(@class,'order-container-wrap')]/div[contains(@class,'all-orders ng-star-inserted')]/div[contains(@class,'order-list')]/div[contains(@class,'row ng-star-inserted')]/div[1]/div[1]/div[2]/div[1]")
	public WebElement serv1;
	
	@FindBy(xpath = "//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'mbl-pl5 col-md-5')]/div/app-cpoe-order-view/div[contains(@class,'card card-right order-card-container')]/div[contains(@class,'card-body')]/div[contains(@class,'order-container-wrap')]/div[contains(@class,'all-orders ng-star-inserted')]/div[contains(@class,'order-list')]/div[contains(@class,'row ng-star-inserted')]/div[2]/div[1]/div[2]/div[1]")
	public WebElement serv2;
	
	@FindBy(xpath = "//div[contains(@class,'mbl-pl5 col-md-5')]//div[contains(@class,'card-body')]//div[3]//div[1]//div[2]//div[1]//i[1]")
	public WebElement serv3;
	

	@FindBy(xpath = "//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen/div[contains(@class,'page-container')]/div[contains(@class,'note-layout ng-star-inserted layout-2')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'mbl-pl5 col-md-5')]/div/app-cpoe-order-view/div[contains(@class,'card card-right order-card-container')]/div[contains(@class,'card-body')]/div[contains(@class,'order-container-wrap')]/div[contains(@class,'all-orders ng-star-inserted')]/div[contains(@class,'order-list')]/div[contains(@class,'row ng-star-inserted')]/div[4]/div[1]/div[2]/div[1]")
	public WebElement serv4;
	
	@FindBy(xpath = "//div[contains(@class,'form-group ng-star-inserted')]//textarea[@id='remarks']")
	public WebElement servRemarks1;
	
	@FindBy(xpath = "//*[contains(text(),'Update')]")
	public WebElement servUpdate;
	
	@FindBy(xpath = "//div[contains(@class,'btn-pharmacy-group cust-grp')]//i[contains(@class,'ki ki-reset')]")
	public WebElement pharFilterReset;
	
	
	@FindBy(xpath = "//div[contains(@class,'btn-service-group')]//i[contains(@class,'ki ki-reset')]")
	public WebElement servFilterReset;
	
	
	
	
	
	public void doctorNote(String MRNo  ) throws InterruptedException {

		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(4000);
		//UParrow.click();
		//Thread.sleep(4000);
		//Lock.click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1200);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
 
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(1500); 
		cheifComplaint.click();
		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);

	}
		
		public void Cpoephar(String MED1,String MED2, String MED3 ,String REMARKS) throws InterruptedException {
			Thread.sleep(2000);
		cpoePharmacy.click();
		Thread.sleep(1000);
		uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
		Thread.sleep(1000);
		
		
		medicineType.click();
		Thread.sleep(1000);
		consumables.click();
		Thread.sleep(1000);
		brand.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys(MED1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Aciclovir']")).click();
		DoseLevel.click();
		Thread.sleep(1000);
		DoseLevel.sendKeys("2");
		Thread.sleep(1000);
		Doseunit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey6']//li")).click();
		Thread.sleep(1000);
		Route.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Oral']")).click();
		Form.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Capsule']")).click();
		Frequency.click();
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("(//ul[@id='check']//li)[1]")).click();
		DurationUnit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@id='check']//li)[1]")).click();
		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(3000);

		brand.click();
		Thread.sleep(1000);
		generic.click();
		Thread.sleep(1000);
		medicineSearch.clear();
		Thread.sleep(1000);
		medicineSearch.sendKeys(MED2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Abzorb Dusting Powder 100Gm, 100 Gm  by Dermal']")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(3000);
		generic.click();
		Thread.sleep(1000);
		consumables.click();
		Thread.sleep(1000);
		DrugClass.click();
		Thread.sleep(2000);
		probiotics.click();
		Thread.sleep(1000);
		medicineSearch.clear();
		Thread.sleep(1000);
		medicineSearch.sendKeys(MED3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Darolac Cap, 1 Cap(s)  by Oral']")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@id='check']//li)[1]")).click();
		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(3000);
		pharFilterReset.click();
		
		
		Threedot1.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(REMARKS);
		Thread.sleep(1000);
		update.click();
		Thread.sleep(3000);
		
		Threedot2.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.clear();
		Remarks.sendKeys(REMARKS);
		Thread.sleep(1000);
		update.click();
		
		Thread.sleep(3000);
		Threedot3.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(REMARKS);
		Thread.sleep(1000);
		update.click();
		
		
		
	}
	
	
 public void CpoeServ(String SERV1 ,String SERV2 ,String SERV3 , String SERV4 , String REMARKS) throws InterruptedException {
	 
	 Thread.sleep(3000);
	 cpoeService.click();
	 Thread.sleep(1000);
	 maincategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@title=' Diet']")).click();
	 Thread.sleep(1000);
	 subCategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//div[@class='custom-list ng-star-inserted']/div)[2]")).click();
	 Thread.sleep(1000);
	 cpoeServiceSearch1.click();
	 Thread.sleep(1000);
	 cpoeServiceSearch1.sendKeys(SERV1);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
	 Thread.sleep(2000);
	 maincategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@title=' Laboratory']")).click();
	 Thread.sleep(1000);
	 subCategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@title=' Bio-Chemistry']")).click();
	 Thread.sleep(1000);
	 cpoeServiceSearch.clear();
	 Thread.sleep(1000);
	 cpoeServiceSearch.click();
	 Thread.sleep(1000);
	 cpoeServiceSearch.sendKeys(SERV2);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
	 Thread.sleep(1000);
	 
	 maincategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@title=' Radiology']")).click();
	 Thread.sleep(1000);
	 subCategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@title=' Test MR scan']")).click();
	 Thread.sleep(1000);
	 cpoeServiceSearch.clear();
	 Thread.sleep(1000);
	 cpoeServiceSearch.click();
	 Thread.sleep(1000);
	 cpoeServiceSearch.sendKeys(SERV3);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//label[normalize-space()='MR Scan1']")).click();
	 
	 
	 
	 Thread.sleep(1000);
	 maincategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@title=' Procedure']")).click();
	 Thread.sleep(1000);
	 subCategory.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[contains(text(),'Anaesthesiology')]")).click();
	 Thread.sleep(1000);
	 cpoeServiceSearch.clear();
	 Thread.sleep(1000);
	 cpoeServiceSearch.click();
	 Thread.sleep(1000);
	 cpoeServiceSearch.sendKeys(SERV4);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[contains(text(),'CAUDAL ANAESTHESIA')]")).click();
	 servFilterReset.click();
	 
	 
	 
	 
	 Thread.sleep(1000);
	 serv1.click();
	 Thread.sleep(1000);
	 edit.click();
	 Thread.sleep(1000);
	 servRemarks1.click();
	 Thread.sleep(1000);
	 servRemarks1.sendKeys(REMARKS);
	 Thread.sleep(1000);
	 servUpdate.click();
	 
	 Thread.sleep(1000);
	 serv2.click();
	 Thread.sleep(1000);
	 edit.click();
	 Thread.sleep(1000);
	 servRemarks1.click();
	 Thread.sleep(1000);
	 servRemarks1.sendKeys(REMARKS);
	 Thread.sleep(1000);
	 servUpdate.click();
	 
	 
	 Thread.sleep(1000);
	 serv3.click();
	 Thread.sleep(1000);
	 edit.click();
	 Thread.sleep(1000);
	 servRemarks1.click();
	 Thread.sleep(1000);
	 servRemarks1.sendKeys(REMARKS);
	 Thread.sleep(1000);
	 servUpdate.click();
	 
	 
	 Thread.sleep(1000);
	 serv4.click();
	 Thread.sleep(1000);
	 edit.click();
	 Thread.sleep(1000);
	 servRemarks1.click();
	 Thread.sleep(1000);
	 servRemarks1.sendKeys(REMARKS);
	 Thread.sleep(1000);
	 servUpdate.click();
	 
	 
 }

}
