package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_DietitianTemplateTestCaseYW extends PageFactoryInitYasasiiWeb{

	public EMR_DietitianTemplateTestCaseYW(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//i[@title='Click to change view as Card View']")
	public WebElement changeview;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement arrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement lock;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement doctornote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement enterchiefcomplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ok;

	@FindBy(xpath = "//div[contains(text(),'Visit Note')]")
	public WebElement visitnote;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF74']")
	public WebElement enternote;

	@FindBy(xpath = "//div[contains(text(),'History of Illness')]")
	public WebElement historyofillness;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF114']")
	public WebElement enterhistory;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Allergy']")
	public WebElement allergy;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-allergy[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement addnewllergy;

	@FindBy(xpath = "//input[@id='otherallergyname']")
	public WebElement enterallergy;

	@FindBy(xpath = "//button[@id='otherallergyaddbtn']")
	public WebElement add;

	@FindBy(xpath = "//div[contains(text(),'Vital Signs and Measurement')]")
	public WebElement vitalsignsandmeasurement;

	@FindBy(xpath = "//input[@id='vital000']")
	public WebElement height;

	@FindBy(xpath = "//input[@id='vital010']")
	public WebElement weight;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Nutritional Assessment']")
	public WebElement nutritionalassessment;

	@FindBy(xpath = "//div[3]//div[1]//div[4]//div[2]//div[1]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")
	public WebElement calories;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1000558']")
	public WebElement enternumber;

	@FindBy(xpath = "//div[contains(text(),'Nutrition Form')]")
	public WebElement nutritionform;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1000635']")
	public WebElement dietprescribed;

	@FindBy(xpath = "//li[normalize-space()='Diabetic Diet']")
	public WebElement selectdiet;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Diet']")
	public WebElement diet;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF1000604']")
	public WebElement enterdiagnosis;

	@FindBy(xpath = "//div[@id='HTF1000606']//label[1]//span[2]")
	public WebElement oral;

	@FindBy(xpath = "//div[@id='HTF1000608']//label[2]//span[2]")
	public WebElement good;

	@FindBy(xpath = "//label[@class='icon emrpreview']")
	public WebElement preview;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement save;

	@FindBy(xpath = "//i[@title='More']")
	public WebElement Arrow;

	@FindBy(xpath = "//div[normalize-space()='Hide Note']")
	public WebElement hidenote;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement hideyes;

	@FindBy(xpath = "")
	public WebElement searchicon;

	@FindBy(xpath = "//div[@class='listitem ng-star-inserted']")
	public WebElement unhide;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement unhideyes;

	@FindBy(xpath = "//div[normalize-space()='Confidential']")
	public WebElement confidentialnote;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement confiyes;

	@FindBy(xpath = "//div[normalize-space()='Non Confidential']")
	public WebElement nonconfidential;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement nonyes;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamburger;

	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement emrmenu;

	@FindBy(xpath = "//span[normalize-space()='Rule engine']")
	public WebElement ruleengine;

	@FindBy(xpath = "//input[@id='rule-name']")
	public WebElement enterrulename;

	@FindBy(xpath = "//input[@id='ruleType']")
	public WebElement ruletype;

	@FindBy(xpath = "//li[normalize-space()='Possible Diagnosis']")
	public WebElement possiblediagnosis;

	@FindBy(xpath = "//input[@id='operator0']")
	public WebElement operator;

	@FindBy(xpath = "//li[normalize-space()='In']")
	public WebElement in;

	@FindBy(xpath = "//button[@title='Add Rule']")
	public WebElement addrule;

	@FindBy(xpath = "//input[@id='operator1']")
	public WebElement Operator;

	@FindBy(xpath = "//li[normalize-space()='<']")
	public WebElement greater;

	@FindBy(xpath = "//input[@id='rule-value1']")
	public WebElement enterNumber;

	@FindBy(xpath = "//input[@id='valueunit1']")
	public WebElement unit;

	@FindBy(xpath = "//li[normalize-space()='Year(s)']")
	public WebElement year;

	@FindBy(xpath = "//div[@class='linkdes']")
	public WebElement addDiagnosis;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement enterICD;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selectICD;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement oK;

	@FindBy(xpath = "//label[contains(text(),'A78')]//span[@class='checkmark']")
	public WebElement secondICD;

	@FindBy(xpath = "//label[contains(text(),'A54.33')]//span[@class='checkmark']")
	public WebElement thirdicd;

	@FindBy(xpath = "//tbody/tr[3]/td[3]/i[1]")
	public WebElement deleteicd;

	@FindBy(xpath = "//button[@id='save']")
	public WebElement SAve;

	@FindBy(xpath = "//input[@id='ruleTypeSide']")
	public WebElement search;

	@FindBy(xpath = "(//i[@class='ki ki-pencil'])[2]")
	public WebElement edit;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-rules-setup[1]/div[2]/div[2]/div[4]/div[3]/table[1]/tbody[1]/tr[1]/td[3]/i[1]")
	public WebElement deleteIcd;

	@FindBy(xpath = "//button[@id='save']")
	public WebElement update;

	@FindBy(xpath = "//span[contains(@class,'action')]//i[contains(@title,'Delete')]")
	public WebElement delete;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-rules-setup[1]/div[1]/div[3]/div[2]/span[2]/label[2]/i[1]")
	public WebElement deleteyes;

	@FindBy(xpath = "//li[normalize-space()='Recommended Service']")
	public WebElement recommendservice;

	@FindBy(xpath = "//div[@class='linkdes']")
	public WebElement addservice;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement enterservice;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selectservice;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement okk;

	@FindBy(xpath = "//label[normalize-space()='128 Slice CT 3D Reconstruction']//span[@class='checkmark']")
	public WebElement secondndservice;

	@FindBy(xpath = "//label[normalize-space()='128 Slice CT Abdomen with Virtual Colonoscopy']//span[@class='checkmark']")
	public WebElement thirdservice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement searchdepartment;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selectcheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement searchtemplate;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selecttemplate;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement saVe;

	@FindBy(xpath = "//div[@class='panel-collapse collapse in show']//i[@class='ki ki-pencil']")
	public WebElement editpencil;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement provider;

	@FindBy(xpath = "//input[@id='inputcontrol_wnYK6ClGeZ0']")
	public WebElement searchprovder;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement selectprovider;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement selecttem;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selectitem;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchTEXt;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//input[@id='header']")
	public WebElement header;


	@FindBy(xpath = "//input[@id='name']")
	public WebElement EmployeeSearch;



	public void dietnote(String MRNo,String fever,String selecttemplate,String alergy,String Height,String Weight) throws InterruptedException
	{
		mainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		SearchTEXt.click();
		Thread.sleep(1000);
		SearchTEXt.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();

		///////////////create doctor note in Dietitian template KIMS template
		Thread.sleep(1000);
		//changeview.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
		Thread.sleep(1500);
		arrow.click();//i[@class='dashboard-lock-arrow ki ki-chevron-up']
		Thread.sleep(800);
		lock.click();
		doctornote.click();//label[@class='icon doctornote']
		Thread.sleep(1000);

//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}
//		Thread.sleep(800); 

//			List<WebElement> dynamicElement=driver.findElements(By.xpath("//span[@class='btn btn-dark-green active']"));
//		
//			
//			
//			if(dynamicElement.size() !=0)
//			{
//				
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//input[@id='inchargeproviderid']")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//span[@class='btn btn-dark-green active']")).click();
//			}
	Thread.sleep(1500); 
		enterchiefcomplaint.click();
		Thread.sleep(800);
		enterchiefcomplaint.clear();
		Thread.sleep(800); 
		enterchiefcomplaint.sendKeys(fever);
		Thread.sleep(800); 
		driver.findElement(By.xpath("//*[contains(text(),'" + fever + "')]")).click();
		Thread.sleep(800);
		template.click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//li[normalize-space()='Dietitian Template KIMS']")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'" +selecttemplate+ "')]")).click();
		Thread.sleep(800);
		ok.click();
		Thread.sleep(800);
		visitnote.click();
		enternote.sendKeys("Patient is having knee pain");
		Thread.sleep(800);
		historyofillness.click();
		Thread.sleep(800);
		enterhistory.sendKeys("Asthmatic for 2 years");
		//allergy.click();
		Thread.sleep(800);
		//addnewllergy.click();
		Thread.sleep(800);
		//enterallergy.sendKeys(alergy);
		Thread.sleep(800);
		//add.click();
		Thread.sleep(800);
		vitalsignsandmeasurement.click();
		Thread.sleep(800);
		height.clear();
		height.sendKeys(Height);
		Thread.sleep(800);
		weight.clear();
		weight.sendKeys(Weight);
		Thread.sleep(800);
		nutritionalassessment.click();
		Thread.sleep(800);
		calories.click();
		Thread.sleep(800);
		enternumber.sendKeys("10");
		Thread.sleep(800);
		nutritionform.click();
		Thread.sleep(800);
		dietprescribed.click();
		Thread.sleep(800);
		selectdiet.click();
		Thread.sleep(800);
		diet.click();
		Thread.sleep(800);
		enterdiagnosis.sendKeys("Weightgain issue due to excess use of medicine");
		Thread.sleep(800);
		oral.click();
		good.click();
		Thread.sleep(800);	
		preview.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1300);

	}

	public void editnote() throws InterruptedException
	{
		////////////Hide note

		//driver.findElement(By.xpath("//i[@class='fa fa-caret-right']")).click();
		
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='fa fa-caret-right']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			Thread.sleep(800);
//			driver.findElement(By.xpath("//i[@class='fa fa-caret-right']")).click();
//		}
//		
		Thread.sleep(800);
		Arrow.click();
		Thread.sleep(800);
		hidenote.click();
		Thread.sleep(800);
		hideyes.click();
		Thread.sleep(2000);
		///////////unhide note
		Arrow.click();
		Thread.sleep(1000);
		unhide.click();
		Thread.sleep(900);
		unhideyes.click();
		Thread.sleep(2000);
		//////////confidential note
		Arrow.click();
		Thread.sleep(1000);
		confidentialnote.click();
		Thread.sleep(800);
		confiyes.click();
		Thread.sleep(2000);
		///////////non confidential note
		Arrow.click();
		Thread.sleep(2000);
		nonconfidential.click();//div[normalize-space()='Non Confidential']
		Thread.sleep(1000);
		nonyes.click();
		Thread.sleep(900);
	}


	public void possibleicd(String rulename,String icd) throws InterruptedException, AWTException
	{
		Thread.sleep(1500);
		hamburger.click();
		Thread.sleep(800);
		emrmenu.click();
		Thread.sleep(800);
		ruleengine.click();
		Thread.sleep(800);
		enterrulename.sendKeys(rulename);
		ruletype.click();
		Thread.sleep(800);
		possiblediagnosis.click();
		Thread.sleep(800);
		operator.click();
		Thread.sleep(800);
		in.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//a[normalize-space()='Any']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(800);
		addrule.click();
		Thread.sleep(800);
		Operator.click();
		Thread.sleep(800);
		greater.click();
		Thread.sleep(800);
		enterNumber.sendKeys("10");
		unit.click();
		Thread.sleep(800);
		year.click();
		Thread.sleep(800);
		addDiagnosis.click();
		Thread.sleep(1000);
		enterICD.sendKeys(icd);
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(800);
		selectICD.click();
		Thread.sleep(800);
		oK.click();
		Thread.sleep(800);
		addDiagnosis.click();
		Thread.sleep(1000);
		secondICD.click();
		Thread.sleep(800);
		oK.click();
		Thread.sleep(800);
		addDiagnosis.click();
		Thread.sleep(1000);
		thirdicd.click();
		Thread.sleep(800);
		oK.click();
		Thread.sleep(800);
		//	deleteicd.click();
		SAve.click();
		Thread.sleep(2500);
		//////edit the created rule		
		search.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='Possible Diagnosis']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + rulename + "')]")).click();
		Thread.sleep(800);
		edit.click();   
		Thread.sleep(1000);
		deleteIcd.click();
		Thread.sleep(800);
		update.click();
		Thread.sleep(1200);
		///////delete created rule
		driver.findElement(By.xpath("//*[contains(text(),'" + rulename + "')]")).click();
		Thread.sleep(800);
		delete.click();
		Thread.sleep(800);
		deleteyes.click();
		Thread.sleep(1200);

	}

	public void possibleService(String ruleName,String servicename) throws InterruptedException, AWTException
	{



		hamburger.click();
		Thread.sleep(800);
		//		emrmenu.click();
		Thread.sleep(800);
		ruleengine.click();
		Thread.sleep(800);
        enterrulename.sendKeys(ruleName);
		ruletype.click();
		Thread.sleep(800);
		recommendservice.click();
		Thread.sleep(800);
		operator.click();
		Thread.sleep(800);
		in.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//a[normalize-space()='Any']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(800);
		addrule.click();
		Thread.sleep(800);
		Operator.click();
		Thread.sleep(800);
		greater.click();
		Thread.sleep(800);
		enterNumber.sendKeys("10");
		unit.click();
		Thread.sleep(800);
		year.click();
		Thread.sleep(800);
		addservice.click();
		Thread.sleep(800);
		enterservice.sendKeys(servicename);
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		selectservice.click();
		Thread.sleep(800);
		okk.click();
		Thread.sleep(800);
		addservice.click();
		Thread.sleep(800);
		secondndservice.click();
		Thread.sleep(800);
		okk.click();
		Thread.sleep(800);
		addservice.click();
		Thread.sleep(800);
		thirdservice.click();
		Thread.sleep(800);
		okk.click();
		Thread.sleep(800);		
		SAve.click();
		Thread.sleep(1500);
		//////edit the created rule		
		search.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Recommended Service']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + ruleName + "')]")).click();
		Thread.sleep(800);
		edit.click();
		//	driver.findElement(By.xpath("//div[4]//span[2]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//tbody/tr[3]/th[1]/i[1]")).click();
		Thread.sleep(800);
		update.click();
		Thread.sleep(1200);
		///////delete created rule
		driver.findElement(By.xpath("//*[contains(text(),'" + ruleName + "')]")).click();
		Thread.sleep(800);
		delete.click();
		//driver.findElement(By.xpath("//div[4]//span[2]//label[2]//i[1]")).click();
		Thread.sleep(800);
		deleteyes.click();
		Thread.sleep(800);

	}
	
	public void templatecreation(String dept,String templt,String templt1,String providerName, String templt3) throws InterruptedException
	{
		////////////creating department wise template mapping
		
		Thread.sleep(2000);

		//	hamburger.click();

		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")).click();


		//		Thread.sleep(800);
		//		emrmenu.click();
		//		Thread.sleep(800);
		//		Thread.sleep(800);



		driver.findElement(By.xpath("//span[normalize-space()='Doctor Template Mapping']")).click();
		Thread.sleep(800);
		searchdepartment.sendKeys(dept);
		Thread.sleep(800);
		selectcheckbox.click();
		Thread.sleep(800);
		searchtemplate.sendKeys(templt);
		Thread.sleep(800);
		selecttemplate.click();
		Thread.sleep(800);
		saVe.click();
		Thread.sleep(800);
		///////Editing created one
		searchdepartment.clear();
		Thread.sleep(800);
		searchdepartment.sendKeys(dept);
		Thread.sleep(800);
		editpencil.click();
		Thread.sleep(800);
		searchtemplate.sendKeys(templt);
		Thread.sleep(800);
		selecttemplate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(1000);

	}	
	public void providerMApping(String providerName , String templt3) throws InterruptedException {	

		//driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")).click();

		//driver.findElement(By.xpath("//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")).click();
//
		//driver.findElement(By.xpath("//span[normalize-space()='Doctor Template Mapping']")).click();

		////////////////Creating providerwise mapping		
		driver.findElement(By.xpath("//span[normalize-space()='Provider Wise Template Mapping']")).click();	
		Thread.sleep(1000);
		selectprovider.click();
		selectprovider.sendKeys(providerName);
		Thread.sleep(800);
	//	driver.findElement(By.xpath("//label[normalize-space()='Dr Rajesh Mukundan(doc01)']//span[@class='checkmark']")).click();	
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-template-mapping[1]/div[1]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		selecttem.sendKeys(templt3);
		Thread.sleep(800);
		selectitem.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='Employee Ranking']//i[@class='ki ki-pencil']")).click();
		Thread.sleep(800);

		header.click();
		Thread.sleep(800);
		header.sendKeys("home");
		Thread.sleep(800);
		EmployeeSearch.click();
		Thread.sleep(800);
		EmployeeSearch.sendKeys("01");
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Mr Rajesh(Med01)']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		//driver.findElement(By.xpath("//i[@class='ki ki-arrow-down']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='Provider List']//i[@class='ki ki-info-circle']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label[normalize-space()='Dr Rajesh Mukundan(doc01)']//span[@class='checkmark']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(1500);
		////////////////Editing the provider wise template mapping
		driver.findElement(By.xpath("//span[normalize-space()='Provider Wise Template Mapping']")).click();	
		Thread.sleep(1500);
		//	System.out.println("haiiiiiiiiiiiiiiiiiii");
		selectprovider.click();
		Thread.sleep(800);
		selectprovider.sendKeys(providerName);
		Thread.sleep(800);
		//	selectitem.click();
		driver.findElement(By.xpath("//accordion-group[@class='panel panel-open']//button[1]//i[1]")).click();
		Thread.sleep(800);
		selecttem.sendKeys(templt3);
		Thread.sleep(800);
		selectitem.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(1000);
	}

}
