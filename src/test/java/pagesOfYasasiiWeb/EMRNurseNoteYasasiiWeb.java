package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRNurseNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRNurseNoteYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement MyLocation;
	@FindBy(xpath = "//li[contains(text(),'OP')]")
	public WebElement SelectOP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientname;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement selectPatient;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement Arrow;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement LockArrow;
	@FindBy(xpath = "//label[@class='icon nursenote']")
	public WebElement NurseNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[contains(text(),'Nurse Note')]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ki-editor[1]/div[1]/div[4]")
	public WebElement EnterNote;
	@FindBy(xpath = "//div[contains(text(),'Vital Signs')]")
	public WebElement SelectVital;
	@FindBy(xpath = "//input[@id='vital010']")
	public WebElement EnterHeight;
	@FindBy(xpath = "//input[@id='vital020']")
	public WebElement EnterWeight;
	
	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Insertion']")
	public WebElement SelectInsertion;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-insertion[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement InsertionImplant;
	@FindBy(xpath = "//li[contains(text(),'CVLLUMEN')]")
	public WebElement Cvllumen;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-insertion[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Entersite;
	@FindBy(xpath = "//li[contains(text(),'Femoral(L)')]")
	public WebElement Femoral;
	@FindBy(xpath = "//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement Add;	
	@FindBy(xpath = "//div[contains(text(),'Triage')]")
	public WebElement Triage;
	@FindBy(xpath = "//input[@id='HTFV55']")
	public WebElement Walkin;
	@FindBy(xpath = "//input[@id='dynamic_selectHTF163']")
	public WebElement AccompaniedBy;
	@FindBy(xpath = "//li[contains(text(),'Relative')]")
	public WebElement Relative;	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF194']")
	public WebElement TriagePriority;
	@FindBy(xpath = "//li[contains(text(),'Level 2')]")
	public WebElement Level2;
	@FindBy(xpath = "//div[contains(text(),'Nurse Care Plan')]")
	public WebElement NurseCarePlan;
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF3003']")
	public WebElement EnterAssessment;
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF3004']")
	public WebElement ProblemIdentified;
	@FindBy(xpath = "//div[@class='ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement add;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement Save;
	
	
	@FindBy(xpath = "//button[normalize-space()='Edit Existing Note']")
	public WebElement Edit;
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Triage']")
	public WebElement Triag;
	@FindBy(xpath = "//label[normalize-space()='Not Assessed']//span[@class='checkmark']")
	public WebElement NotAssessed;
	@FindBy(xpath = "//input[@id='HTFV66']")
	public WebElement SelectEmoji;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement SAVE;
	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Insertion']")
	public WebElement insertion;
	
	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement Threedot;
	
	@FindBy(xpath = "//div[normalize-space()='Delete']")
	public WebElement delete;
	
	@FindBy(xpath = "//textarea[@id='deletedreason']")
	public WebElement Reason;
			
	@FindBy(xpath = "//div[@class='modal-footer ng-star-inserted']//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ok;
					
			
			
			
			
			
			
			
			
	
	
	public void NurseNoteAction(String MRNo) throws InterruptedException, IOException {
		
	    Thread.sleep(1000);
		MyLocation.click();
		Thread.sleep(800);
		SelectOP.click();
		Thread.sleep(2000);
		EnterPatientname.sendKeys(MRNo);
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

	//	selectPatient.click();
		Thread.sleep(1000);
		Arrow.click();
		Thread.sleep(1000);
		LockArrow.click();
		Thread.sleep(1000);
		NurseNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		else {
			System.out.println("sri");
		}
		  Thread.sleep(800); 
//////////////////Create a nurse note 
		Thread.sleep(2000);
///List<WebElement> dynamicElement1=driver.findElements(By.xpath("//input[@id='chiefcomplainttext']"));
		
	///	if(dynamicElement1.size() !=0)
	//	{
	//		
			driver.findElement(By.xpath("//input[@id='chiefcomplainttext']")).clear();
			Thread.sleep(1000);
			EnterChiefComplaint.sendKeys("Throat Infection");
			Thread.sleep(1000);
		//}
		
		//else {
			System.out.println("sri");
		//}
		  Thread.sleep(800); 
		
		Template.click();
		Thread.sleep(1000);
		SelectTemplate.click();
		Thread.sleep(1000);
		Ok.click();//button[@aria-label='Ok'][normalize-space()='OK']
		Thread.sleep(600);
		//EnterNote.sendKeys("The patient is having severe throat infection");
		SelectVital.click();
		Thread.sleep(1000);
		EnterHeight.clear();
		EnterHeight.sendKeys("168");
		Thread.sleep(1000);
		EnterWeight.clear();
		EnterWeight.sendKeys("72");
		Thread.sleep(1000);
		SelectInsertion.click();
		  Thread.sleep(1000);
		  
		  
		 
		  
		  
		  
		  
		
		
//List<WebElement> plus=driver.findElements(By.xpath("//div[@class='card insertion-info']//i[@class='fa fa-plus']"));
//		
//		if(plus.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='card insertion-info']//i[@class='fa fa-plus']")).click();
//			Thread.sleep(1000);
//			
//		}
		  Thread.sleep(800); 
		  
		  InsertionImplant.click();
			Thread.sleep(600);
		
		Cvllumen.click();
		 Thread.sleep(800); 
		Entersite.click();
		Thread.sleep(600);
		Entersite.sendKeys("%");
		Thread.sleep(600);
		Femoral.click();
		Thread.sleep(600);
		Add.click();
		  Thread.sleep(500);
		Triage.click();
		Thread.sleep(500);
		Walkin.click();
		Thread.sleep(500);
		AccompaniedBy.click();
		Thread.sleep(500);
		Relative.click();
		Thread.sleep(500);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[11]/div[2]/div[3]/label[1]/span[1]"));

			js.executeScript("arguments[0].scrollIntoView(true);", TriagePriority);
			}

		TriagePriority.click();
		Thread.sleep(600);
		Level2.click();
		Thread.sleep(600);
		  Thread.sleep(1000);
		  
///////////////Nurse care plan
		  
		NurseCarePlan.click();
		  Thread.sleep(1000);
		  List<WebElement> plus1=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-nursecareplan[1]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]"));
			
			if(plus1.size() !=0)
			{
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-nursecareplan[1]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")).click();
				Thread.sleep(1000);
				
			}
			  Thread.sleep(800); 
			  	  
			  
			  List<WebElement> addnew=driver.findElements(By.xpath("//button[normalize-space()='Add New - Care Plan']"));
				
				if(addnew.size() !=0)
				{
					driver.findElement(By.xpath("//button[normalize-space()='Add New - Care Plan']")).click();
					Thread.sleep(1000);
					
				}
				  Thread.sleep(800); 
		  
		 // driver.findElement(By.xpath("//button[normalize-space()='Add New care plan']")).click();
		Thread.sleep(800);
		EnterAssessment.click();
		EnterAssessment.sendKeys("Patient eyes is slightly in red colour");
		Thread.sleep(600);
		ProblemIdentified.click();
		Thread.sleep(800);
		ProblemIdentified.sendKeys("Dehydration");
		Thread.sleep(600);
		add.click();
		Thread.sleep(600);
		Save.click();
////////////////////Edit the nurse note 
		Thread.sleep(10000);
		NurseNote.click();
		Thread.sleep(900);
		Edit.click();
		Thread.sleep(800);
		
//		insertion.click();
//		Thread.sleep(800);
//		Threedot.click();
//		Thread.sleep(800);
//		delete.click();
//		Thread.sleep(800);
		
		Thread.sleep(800);
//		Reason.click();
//		Thread.sleep(800);
//		Reason.sendKeys("no need");
//		Thread.sleep(800);
//		ok.click();
//		Thread.sleep(800);
		
		Triag.click();
		Thread.sleep(800);
		//NotAssessed.click();
		Thread.sleep(800);
		SelectEmoji.click();
		Thread.sleep(800);
		SAVE.click();
		Thread.sleep(2000);
}
}