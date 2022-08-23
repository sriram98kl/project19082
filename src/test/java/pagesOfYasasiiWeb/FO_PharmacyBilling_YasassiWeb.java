package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_PharmacyBilling_YasassiWeb  extends PageFactoryInitYasasiiWeb{
	public FO_PharmacyBilling_YasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;
	
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;
	
	@FindBy(xpath = "//label[contains(@title,'Add')]//i[contains(@class,'ki ki-plus')]")
	public WebElement EncounterAdd;//label[contains(@class,'addition')]//i[contains(@class,'ki ki-plus')]
	
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;
	//button[@id='billingsave']
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;
	
	@FindBy(xpath = "//span[@class='user-name']")
	public WebElement username;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[@class='logout list-item ']")
	public WebElement logout1;
	
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/ki-dialog-common[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement logoutConfirm;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
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

//    /html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]
	
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;
	
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    //input[@id='chiefcomplainttext']
	public WebElement cheifComplaint;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
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
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement toggle;
	
	@FindBy(xpath = "//span[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;
	
	@FindBy(xpath = "//span[normalize-space()='OP Panel']")
	public WebElement opPanel;
	
	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharloc;
	
	@FindBy(xpath = "//input[@id='callerid']")
	public WebElement callerID;
	
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
	public WebElement pharlocOK;
	
	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;
	
	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
	public WebElement counterSearchicon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement patientSearch2;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[1]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicineCheck;
	
	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement medicineSaveconfirm;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement confirmOK;
	
	@FindBy(xpath = "//div[@class='form-group min-clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement status;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[1]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicineCheck1;
	
	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement holdbillSave;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement BILLsave;
	
	@FindBy(xpath = "//div[normalize-space()='Dispensing']")
	public WebElement dispensing;
	
	
	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement dispensed;
	
	@FindBy(xpath = "//label[@class='check-container ']//span[@class='checkmark']")
	public WebElement checkMedicine;
	
	@FindBy(xpath = "//div[@class='pat-name']")
	public WebElement PATientselect;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[2]/div[2]/div[1]/span[1]/i[1]")
	public WebElement counterIcon2;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;
	
	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement category;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;
	
	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;//label[@class='icon-btn btn-dark-green inline']
	
	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOk;
	
	
	@FindBy(xpath = "//div[contains(@class,'page-inner-btn-group')]//button[1]")
	public WebElement Save;
	
	@FindBy(xpath = "//i[@class='ki ki-wallet icon-btn-billing btn-dark-green inline']")
	public WebElement Wallet;
	
	@FindBy(xpath = "//tr[@class='ng-untouched ng-dirty ng-valid ng-star-inserted']//span[@class='checkmark']")
	public WebElement checkbox;
	
	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement Amount1;
	
	@FindBy(xpath = "//i[@class='ki ki-doctor-fill']")
	public WebElement referal;
	
	@FindBy(xpath = "//div[@class='col-md-5']//input[1]")
	public WebElement hos;
	
	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Referral Provider')]//input[@id='undefined']")
	public WebElement prov;
	
	@FindBy(xpath = "//input[@id='referralprovider']")
	public WebElement ProviderName;
	
	@FindBy(xpath = "//input[@id='referralhospital']")
	public WebElement refhos;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-doctor-fill')]")
	public WebElement outsiderref;
	
	
	
	
	
	public void pharmacybill(String MRNo , String PROVIDER , String CHEIFCOMPLAINT , String MEDICINE) throws InterruptedException {
		
		
//		//////Encounter
		    Thread.sleep(2000);
			SearchField.click();
			Thread.sleep(1000);
			SearchField.sendKeys(MRNo);
			Thread.sleep(2000);
			SearchIcon.click();
			Thread.sleep(2000);
			//patientSelect.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
			
			 Thread.sleep(2000);
			 Service.click();	
			 Thread.sleep(1000);
			 AddnewService.click();
			 Thread.sleep(1000);
			 category.click();
			 driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
			 servicename.click();
			 Thread.sleep(1000);
			 servicename.sendKeys("General Advance");
			 driver.findElement(By.xpath("//li[normalize-space()='General Advance']")).click();
			 Thread.sleep(1000);
			 Amount.clear();
			 Amount.sendKeys("5000");
			 Amount.sendKeys(Keys.ENTER);
			 Thread.sleep(1000);
			 Add.click();
//			 Thread.sleep(1000);
//			 JavascriptExecutor js= (JavascriptExecutor) driver;
//			 js.executeScript("arguments[0].scrollIntoView();",  totalpay);
//			 Thread.sleep(1000);
//			Save.click();
//			Thread.sleep(1000);
//			 SaveOk.click();
			 			
//			
//			
//			
//			
//			WebElement inputBox = driver.findElement(By.xpath("//input[@id='EncBillingproviders']"));
//			String textInsideInputBox = inputBox.getAttribute("value");
//
//			// Check whether input field is blank
//			if(textInsideInputBox.isEmpty())
//			{
//			   System.out.println("Input field is empty");
//			   providerName.click();
//				Thread.sleep(1000);
//				providerName.sendKeys(PROVIDER);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[contains(text(),'" + PROVIDER + "')]")).click();
//			}
//			else {
			// js.executeScript("arguments[0].scrollIntoView();",  Service);
			   Thread.sleep(2000);
			    driver.findElement(By.xpath("//span[normalize-space()='Encounter']")).click(); 
			    Thread.sleep(1000);
				clear.click();
				Thread.sleep(1000);
				providerName.click(); 
				Thread.sleep(1000);
				providerName.sendKeys(PROVIDER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
//				 Thread.sleep(1000);
//			}
//			/* providerName.clear();
//			 Thread.sleep(1000);
//			 providerName.sendKeys(PROVIDER);
//			 driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();*/
				 Thread.sleep(1000);
				referal.click();
				 Thread.sleep(1000);
		    hos.click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//li[normalize-space()='aster']")).click();
		    Thread.sleep(1000);
		    prov.click();
		    Thread.sleep(1000);
		  ///  outsiderref.click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//li[normalize-space()='dafc']")).click();
//				 driver.findElement(By.xpath("//label[@class='addition']//i[@class='ki ki-plus']")).click();
//
//				 Thread.sleep(1000);
//				 ProviderName.click();
//				 Thread.sleep(1000);
//				 ProviderName.sendKeys("Albert Sam12");
//				 Thread.sleep(1000);
//				 refhos.click();
//				 Thread.sleep(1000);
//				 refhos.sendKeys("jos");
//				 Thread.sleep(1000);
//				 driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='Save']")).click();
//				 Thread.sleep(1000);
		    
			 EncounterAdd.click();
			 Thread.sleep(1000);
			 EncounterSave.click();
			 Thread.sleep(2000);
			 SAvesuccess.click();
			 Thread.sleep(2000);
//		////////logout
				
				username.click();
				logout.click();
				Thread.sleep(2000);
				logoutConfirm.click();
			 
		////////login
				Thread.sleep(5000);
				userid.click();
				userid.sendKeys("DOCAS");
				Thread.sleep(1000);
				password.click();
				password.sendKeys("Kameda321");
				Thread.sleep(1000);
				site.click();
				driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				Thread.sleep(2000);
				
				/////doctornote
				Thread.sleep(1000);
				Hamberger.click();
				Thread.sleep(1000);
				EMRhomescreen.click();
				Thread.sleep(1000);
				Searchfield.click();
				Thread.sleep(1000);
				Searchfield.sendKeys(MRNo);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
				
				//patientSelect1.click();
				Thread.sleep(1000);
		//		UParrow.click();
		//		Lock.click();
				Thread.sleep(1000);
				DoctorNote.click();
				Thread.sleep(1000);
//				List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//				
//				if(dynamicElement.size() !=0)
//				{
//					driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//				}
//				  Thread.sleep(800); 
				 cheifComplaint.clear();
				cheifComplaint.sendKeys(CHEIFCOMPLAINT);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
				template.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
				tempOk.click();
				Thread.sleep(1000);
				
				cpoePharmacy.click();
				Thread.sleep(1000);
				uncheckStar.click();
				Thread.sleep(2000);
				medicineSearch.click();
				Thread.sleep(1000);
				medicineSearch.sendKeys(MEDICINE);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()=' Lipicard 200Mg Tab, 1 Tab(s)  by Oral ']")).click();
				//medicineSelect.click();
				Thread.sleep(1000);
			    Frequency.click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
			    AddMedicine.click();
			    Thread.sleep(1000);
			    EMRsave.click();
			 
		////////logout
				Thread.sleep(2000);
				username.click();
				 Thread.sleep(1000);
				 logout1.click();
				Thread.sleep(1000);
				logoutConfirm.click();
			    
			 ///login
				Thread.sleep(2000);
				userid.click();
				Thread.sleep(1000);
				userid.sendKeys("admin");
				Thread.sleep(1000);
				password.click();
				password.sendKeys("kameda321");
				site.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				Thread.sleep(3000);
			 
				toggle.click();
				 Thread.sleep(1000);
				Pharmacypanel.click();
				 Thread.sleep(1000);
				opPanel.click();
				 Thread.sleep(1000);
				pharloc.click();
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Main Pharmacy']")).click();
				 Thread.sleep(1000);
				callerID.click();
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Main Pharmacy-Caller 1']")).click();
				pharlocOK.click();
				 Thread.sleep(1000);
				counterSearch.click();
				 Thread.sleep(1000);
				counterSearch.sendKeys(MRNo);
				 Thread.sleep(1000);
				counterSearchicon.click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
				// patientSearch2.click();
				 Thread.sleep(1000);
				 medicineCheck.click();	
				 Thread.sleep(1000);
				 medicineSaveconfirm.click();
				 Thread.sleep(2000);
				 confirmOK.click(); 
				 Thread.sleep(2000);
				 status.click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//li[normalize-space()='Confirmed'] ")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
				// patientSearch2.click();
				 Thread.sleep(1000);
				 medicineCheck1.click();
				 Thread.sleep(1000);
				// stockREservation.click();
				holdbillSave.click();
				 Thread.sleep(2000);
				 confirmOK.click();
				 Thread.sleep(1000);
				 status.click();
				 Thread.sleep(1000);
				
				 driver.findElement(By.xpath("//li[normalize-space()='Stock Reservation']")).click();
				// driver.findElement(By.xpath("//li[normalize-space()='Bill Hold']")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
				// patientSearch2.click();
				 Thread.sleep(1000);
				 
				 
				 JavascriptExecutor js= (JavascriptExecutor) driver;
				 js.executeScript("arguments[0].scrollIntoView();", Wallet);
				 
				 String amnt =driver.findElement(By.xpath("//input[@id='cash']")).getText();
				 Thread.sleep(1000);
				 System.out.println(amnt);
				 Thread.sleep(1000);
				 Wallet.click();
				 Thread.sleep(1000);
				 checkbox.click();
				 Thread.sleep(1000);
				 Amount1.click();
				 Thread.sleep(1000);
				 Amount1.sendKeys(amnt);
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
				 Thread.sleep(1000);
				 
				 
				 BILLsave.click();
				 Thread.sleep(2000);
				 confirmOK.click();
				 Thread.sleep(1000);
				 dispensing.click();
				 Thread.sleep(1000);
				 counterSearch.click();
				 Thread.sleep(1000);
					counterSearch.sendKeys(MRNo);
					Thread.sleep(1000);
					counterIcon2.click();
					Thread.sleep(1000);
					PATientselect.click();
					Thread.sleep(1000);
					 checkMedicine.click();
					 Thread.sleep(1000);
					 dispensed.click();
					 Thread.sleep(1000);
					 confirmOK.click();
					 Thread.sleep(1000);
				 
				 
				 
				 
				 
				 
				 
				 
		
	}
	
	
	
	
	
	
	

}
