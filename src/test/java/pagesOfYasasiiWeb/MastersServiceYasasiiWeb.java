package pagesOfYasasiiWeb;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersServiceYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersServiceYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon; 
	
	@FindBy(xpath = "//span[text()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(text(),'Service Master')]")
	public WebElement servicemaster;
	
	@FindBy(xpath = "//input[@id='rootinvcatgeoryser']")
	public WebElement Basecategory;
	
	@FindBy(xpath = "//li[contains(text(),'Laboratory')]")
	public WebElement selectbasecategory;
	
	@FindBy(xpath = "//input[@id='servicecategoryser']")
	public WebElement subcategory;
	
	@FindBy(xpath = "//li[contains(text(),'Biochemistry')]")
	public WebElement selectsubcategory;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement ServiceName;
	
	@FindBy(xpath = "//input[@id='codetype']")
	public WebElement Codetype;
	
	@FindBy(xpath = "//li[contains(text(),'DSL Code')]")
	public WebElement Selectcodetype;
	
	@FindBy(xpath = "//input[@id='tempcode']")
	public WebElement Entercode;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Addcode;
	
	@FindBy(xpath = "//input[@id='education']")
	public WebElement EnterEducationResourceLink;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/app-educationlink[1]/form[1]/div[1]/div[2]/button[1]/i[1]")
	public WebElement AddLink;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/ki-checkbox-control[2]/label[1]/label[1]/span[1]")
	public WebElement PacsEnable;
	
	@FindBy(xpath = "//input[@id='modalityid']")
	public WebElement Moality;
	
	@FindBy(xpath = "//li[contains(text(),'EEG')]")
	public WebElement Selectmodality;
	
	@FindBy(xpath = " //textarea[@id='description']")
	public WebElement EnterDescription;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Sitemapping;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement AllowedSites;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[5]/span[1]/span[1]/span[1]/i[1]")
	public WebElement Selectsite;
	
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement closesitelist;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Selectservice;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]/i[1]")
	public WebElement movetoLeft;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/label[1]/label[1]/a[1]/i[1]")
	public WebElement Editlabdetails;
	
	@FindBy(xpath = "//input[@id='internallabid']")
	public WebElement internallab;
	
	@FindBy(xpath = "//li[contains(text(),'Biochemistry')]")
	public WebElement Biochemistry;
	
	@FindBy(xpath = "//input[@id='executioncategoryid']")
	public WebElement ExecutionCategory;
	
	@FindBy(xpath = "//li[contains(text(),'Lab Service')]")
	public WebElement labservice;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")
	public WebElement Ok;
	
	@FindBy(xpath = "//input[@id='specimenidser']")
	public WebElement specimen;
	
	@FindBy(xpath = "//li[normalize-space()='Blood']")
	public WebElement Selectspecimen;
	
	@FindBy(xpath = "//input[@id='containeridser']")
	public WebElement container;
	
	@FindBy(xpath = "//li[contains(text(),'Blood Bags')]")
	public WebElement Selectcontainer;
	
	@FindBy(xpath = "//input[@id='specimenexp']")
	public WebElement expiry;
	
	@FindBy(xpath = "//form[@class='ng-untouched ng-dirty ng-valid']//i[@class='ki ki-plus']")
	public WebElement addSpecimen;
	
	@FindBy(xpath = "//input[@id='resulttypeid']")
	public WebElement ResultType;
	
	@FindBy(xpath = "//li[contains(text(),'String')]")
	public WebElement selectResultType;
	
	@FindBy(xpath = "//label[normalize-space()='Display in Portal']//span[@class='checkmark']")
	public WebElement Displayinportal;
	
	@FindBy(xpath = "//input[@id='displayinportalupto']")
	public WebElement EnterDays;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/div[1]/div[4]/app-result[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selectPossibleresultString;
	
	@FindBy(xpath = "//input[@id='stringvalue']")
	public WebElement EnterString;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/div[1]/div[4]/app-result[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement clickAdd;
	
	@FindBy(xpath = "//input[@id='Id']")
	public WebElement TestMethod;
	
	@FindBy(xpath = "//li[contains(text(),'Enzymatic')]")
	public WebElement selectTestMetod;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/div[1]/div[6]/app-testmapping[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Default;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/div[1]/div[6]/app-testmapping[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/button[1]/i[1]")
	public WebElement addtestmethod;
	
	@FindBy(xpath = "//input[@id='rangemode']")
	public WebElement Type;
	
	@FindBy(xpath = "//li[contains(text(),'Normal Range')]")
	public WebElement SelectType;
	
	@FindBy(xpath = "//input[@id='patientconditionid']")
	public WebElement PatientCondition;
	
	@FindBy(xpath = "//li[contains(text(),'Pregnant')]")
	public WebElement SelectPatientType;
	
	@FindBy(xpath = "//input[@id='raceid']")
	public WebElement Ethnicgroup;
	
	@FindBy(xpath = "//li[contains(text(),'Asian')]")
	public WebElement SelectEthnicGroup;
	
	@FindBy(xpath = "//input[@id='testmethodid']")
	public WebElement TM;
	
	@FindBy(xpath = "//li[contains(text(),'Enzymatic')]")
	public WebElement SelectTm;
	
	@FindBy(xpath = "//input[@id='comparisonoperatorid']")
	public WebElement Comparison;
	
	@FindBy(xpath = "//li[contains(text(),'=')]")
	public WebElement SelectComparison;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement Value;
	
	@FindBy(xpath = "//li[contains(text(),'lkjm')]")
	public WebElement Selectvalue;
	
	@FindBy(xpath = "//textarea[@id='descriptionrange']")
	public WebElement Descri;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[4]/div[1]/div[2]/div[1]/div[1]/app-normalcritical[1]/div[1]/form[1]/div[6]/div[5]/button[1]")
	public WebElement addresultin;
	
	
	@FindBy(xpath = "//input[@id='deltaperiod']")
	public WebElement Delta;
	
	@FindBy(xpath = "//input[@id='deltaperiodunitid']")
	public WebElement Deltaunit;
	
	@FindBy(xpath = "//li[contains(text(),'Months')]")
	public WebElement Selectdeltaunit;
	
	@FindBy(xpath = "//input[@id='deltapercentagevalue']")
	public WebElement Variance;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[2]/button[1]")
	public WebElement adddelta;
	
	@FindBy(xpath = "//span[contains(text(),'Authorization Rule')]")
	public WebElement AuthorizationRule;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Resultreview;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Autoauthorization;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Accredited;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Resultediting;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement SMSnotification;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ReviewRequest;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Read;
	@FindBy(xpath = "//textarea[@id='reportfooter']")
	public WebElement ReportFooter;
	
	@FindBy(xpath = "//span[contains(text(),'Rules')]")
	public WebElement Rules;
	
	@FindBy(xpath = "//input[@id='rangemoderule']")
	public WebElement RuleType;
	
	@FindBy(xpath = "//li[contains(text(),'Related Service')]")
	public WebElement SelectRuleType;
	
	@FindBy(xpath = "//input[@id='patientconditionidrule']")
	public WebElement PatntCondn;
	
	@FindBy(xpath = "//li[contains(text(),'Pregnant')]")
	public WebElement selectPatntCondn;
	
	@FindBy(xpath = "//input[@id='clinicalwarningidrule']")
	public WebElement ClWarning;
	
	@FindBy(xpath = "//li[contains(text(),'Previous surgeries/interventional procedures')]")
	public WebElement SelectClWarning;
	
	@FindBy(xpath = "//input[@id='additionaltestrule']")
	public WebElement Sername;
	
	@FindBy(xpath = "//li[contains(text(),'-Absolute reticulocyte count')]")
	public WebElement Selectsername;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[6]/div[1]/div[2]/div[1]/app-rule[1]/div[1]/form[1]/div[5]/div[1]/button[1]/i[1]")
	public WebElement Addrule;
	
	@FindBy(xpath = "//span[contains(text(),'Template Mapping')]")
	public WebElement TemplateMapping;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ClinicalIndication;
	
	@FindBy(xpath = "//input[@id='templatetype']")
	public WebElement Templatetype;
	
	@FindBy(xpath = "//li[contains(text(),'Result')]")
	public WebElement TemplatetypeSelect;
	
	@FindBy(xpath = "//input[@id='templateid']")
	public WebElement TemplateName;
	
	@FindBy(xpath = "//li[contains(text(),'Test2')]")
	public WebElement TemplateNameSelect;
		
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[7]/div[1]/div[2]/div[1]/app-templatemapping[1]/div[1]/form[1]/div[1]/div[3]/button[1]/i[1]")
	public WebElement TemplateNameAdd;
	
	@FindBy(xpath = "//span[contains(text(),'Others')]")
	public WebElement Others;
	
	@FindBy(xpath = "//input[@id='resourcecategoryid']")
	public WebElement Resourcecat;
	
	@FindBy(xpath = "//li[contains(text(),'Block')]")
	public WebElement Resourcecatselect;
	
	@FindBy(xpath = "//input[@id='noofslots']")
	public WebElement Slot;
	
	@FindBy(xpath = "//button[@id='servicemastersave']")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[4]/div[1]/span[1]/i[1]")
	public WebElement Searchbutton;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement serv;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-pencil')]")
	public WebElement edit;
	
	@FindBy(xpath = "//label[normalize-space()='Online Pay']//span[@class='checkmark']")
	public WebElement onlinepay;
	
	@FindBy(xpath = "//button[@id='servicemasterupdate']")
	public WebElement update;
	
	public void ServiceMasterSelect(String servicename) throws InterruptedException{
////////////////////	Click on service master screen and select  the laboratory as base category	
		Thread.sleep(1000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Service.click();
		Thread.sleep(500);
		servicemaster.click();
		Thread.sleep(500);
		Basecategory.sendKeys("lab");
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'Laboratory')]")).click();
		Thread.sleep(500);
		subcategory.sendKeys("bio");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Bio-Chemistry')]")).click();
		Thread.sleep(500);
		ServiceName.sendKeys(servicename);
		Thread.sleep(1000);
		Codetype.click();
		Thread.sleep(1000);
		Selectcodetype.click();
		Thread.sleep(1000);
		Entercode.sendKeys("H19X2456");
		Thread.sleep(1000);
		Addcode.click();
		Thread.sleep(1000);
		EnterEducationResourceLink.sendKeys("www.google.com");
		Thread.sleep(1000);
		AddLink.click();
		Thread.sleep(1000);
		PacsEnable.click();
		Thread.sleep(1000);
		Moality.click();
		Thread.sleep(1000);
		Selectmodality.click();
		Thread.sleep(1000);
		EnterDescription.sendKeys("alphabets");
		Thread.sleep(1000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(1000);
/////////////////Enter details in site mapping section
		Sitemapping.click();
		Thread.sleep(1000);
		
		AllowedSites.click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[1]/span[1]/i[1]	")).click();
		closesitelist.click();
		Thread.sleep(1000);
		Selectservice.click();
		Thread.sleep(1000);
		movetoLeft.click();
		Thread.sleep(1000);
		Editlabdetails.click();
		Thread.sleep(1000);
		internallab.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Biochemistry']")).click();
		Thread.sleep(500);
		ExecutionCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Lab Service')]")).click();
		Ok.click();
		Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='specimenidser']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
/////////////Enter specimen details
		Thread.sleep(1000);
		specimen.sendKeys("bloo");
		Thread.sleep(800);
		Selectspecimen.click();
		container.sendKeys("bloo");
		Thread.sleep(800);
		Selectcontainer.click();
		Thread.sleep(1000);
		expiry.sendKeys("4");
		addSpecimen.click();
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='resulttypeid']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
/////////////////Enter result
		Thread.sleep(1000);
		ResultType.click();
		Thread.sleep(1000);
		selectResultType.click();
		Thread.sleep(1000);
		Displayinportal.click();
		Thread.sleep(1000);
		EnterDays.sendKeys("3");
		Thread.sleep(1000);
		selectPossibleresultString.click();
		Thread.sleep(1000);
		EnterString.sendKeys("lkjm");
		Thread.sleep(1000);
		clickAdd.click();
		Thread.sleep(1000);
		TestMethod.click();
		Thread.sleep(1000);
		selectTestMetod.click();
		Thread.sleep(1000);
		Default.click();
		Thread.sleep(1000);
		addtestmethod.click();
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='rangemode']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(1000);
////////////////Enter result interpretation	
		Type.click();
		Thread.sleep(1000);
		SelectType.click();
		Thread.sleep(1000);
		PatientCondition.click();
		Thread.sleep(1000);
		SelectPatientType.click();
		Thread.sleep(1000);
		Ethnicgroup.click();
		Thread.sleep(1000);
		SelectEthnicGroup.click();
		Thread.sleep(1000);
		TM.click();
		Thread.sleep(1000);
		SelectTm.click();
		Thread.sleep(1000);
		Comparison.click();
		Thread.sleep(1000);
		SelectComparison.click();
		Thread.sleep(1000);
		Value.click();
		Thread.sleep(1000);
		Selectvalue.click();
		Thread.sleep(1000);
		Descri.click();
		Thread.sleep(1000);
		addresultin.click();
//		Delta.sendKeys("3");
//		Deltaunit.click();
//		Selectdeltaunit.click();
//		Variance.sendKeys("4");
//		adddelta.click();
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Authorization Rule')]"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		
///////////////Enter authorization rule	
		
		AuthorizationRule.click();
		Thread.sleep(1000);
		Resultreview.click();
		Thread.sleep(1000);
		Autoauthorization.click();
		Thread.sleep(1000);
		Accredited.click();
		Thread.sleep(1000);
		Resultediting.click();
		Thread.sleep(1000);
		SMSnotification.click();
		Thread.sleep(1000);
		ReviewRequest.click();
		Thread.sleep(1000);
		Read.click();
		Thread.sleep(1000);
		ReportFooter.sendKeys("report footer");
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Rules')]"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(1000);
///////////Enter Rules
		Rules.click();
		Thread.sleep(1000);
		RuleType.click();
		Thread.sleep(1000);
		SelectRuleType.click();	
		Thread.sleep(1000);
		PatntCondn.click();
		Thread.sleep(1000);
		selectPatntCondn.click();
		Thread.sleep(1000);
		ClWarning.click();
		Thread.sleep(1000);
		SelectClWarning.click();
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='additionaltestrule']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(1000);
		Sername.sendKeys("%");
		Thread.sleep(1000);
		Selectsername.click();
		Thread.sleep(1000);
		Addrule.click();
//Thread.sleep(1000);
//		
//		
//		{
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Template Mapping')]"));
//
//			js.executeScript("arguments[0].scrollIntoView(true);", element);
//			}
//		TemplateMapping.click();
//		ClinicalIndication.click();
//		Templatetype.click();
//		TemplatetypeSelect.click();
//		TemplateName.click();
//		TemplateNameSelect.click();
//		TemplateNameAdd.click();
Thread.sleep(1000);
		
/////////////Enter others		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Others')]"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		
		Thread.sleep(1000);
		
		
		Others.click();
Thread.sleep(600);
////////Enter resource		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='resourcecategoryid']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		Thread.sleep(1000);
		Resourcecat.click();
		Thread.sleep(1000);
		Resourcecatselect.click();
		Thread.sleep(1000);
		Slot.sendKeys("5");
		Thread.sleep(2000);
		Save.click();
		
		Thread.sleep(3000);
		Search.sendKeys(servicename);
		Thread.sleep(1000);
		Searchbutton.click();
		Thread.sleep(1000);
		serv.click();
////////////////Edit the created service ans save
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		onlinepay.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(1000);
	}			
}