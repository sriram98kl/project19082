package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Security_UserCreationYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public Security_UserCreationYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-user-privilege-fill']")
	public WebElement Security;
	
	@FindBy(xpath = "//span[normalize-space()='User Creation']")
	public WebElement userCreation;
	
	@FindBy(xpath = "//input[@id='title']")
	public WebElement Title;
	
	@FindBy(xpath = "//li[normalize-space()='Dr']")
	public WebElement SelectTitle;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//input[@id='gender']")
	public WebElement gender;
	
	@FindBy(xpath = "//li[normalize-space()='Female']")
	public WebElement SelectGender;
	
	@FindBy(xpath = "//input[@id='phoneno']")
	public WebElement EnterPhoneno;
	
	@FindBy(xpath = "//input[@id='empid']")
	public WebElement UserId;
	
	@FindBy(xpath = "//ki-calendar[@id='doj']//input[@type='text']")
	public WebElement DOJ;
	
	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")
	public WebElement selectDOJ;
	
	@FindBy(xpath = "//input[@id='usertypeid']")
	public WebElement UserType;
	
	@FindBy(xpath = "//li[normalize-space()='Doctor']")
	public WebElement SelectUserType;
	
	@FindBy(xpath = "//input[@id='deptname']")
	public WebElement Department;
	
	@FindBy(xpath = "//li[normalize-space()='Cardiology']")
	public WebElement SelectDept;
	
	@FindBy(xpath = "//input[@id='designation']")
	public WebElement Designation;
	
	@FindBy(xpath = "//li[normalize-space()='Visiting Doctor']")
	public WebElement SelectDesignation;
	
	@FindBy(xpath = "//input[@id='site']")
	public WebElement AllowedSite;
	
	@FindBy(xpath = "//li[normalize-space()='KIMSHEALTH TVM']")
	public WebElement SelectSite;
		
	
	@FindBy(xpath = "//button[@id='multiselect_user_speciality']")
	public WebElement Speciality;
	
	@FindBy(xpath = "//i[@class='fa fa-square-o ng-star-inserted']")
	public WebElement SelectSpeciality;
	
	@FindBy(xpath = "//input[@id='defaultspeciality']")
	public WebElement Default;
	
	@FindBy(xpath = "//li[normalize-space()='Cardiology.']")
	public WebElement SelectDefault;
	
	@FindBy(xpath = "//input[@id='userprofileid']")
	public WebElement UserProfile;
	
	@FindBy(xpath = "//li[normalize-space()='Admin Doctor']")
	public WebElement SelectUserProfile;
	
	@FindBy(xpath = "//label[normalize-space()='Encounter Creation Allowed']//span[contains(@class,'checkmark')]")
	public WebElement EncounterCreationAllowed;
	
	@FindBy(xpath = "//button[@title='Add to grid']//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath = "//*[@class='dropdown-toggle form-control multiselect-list' and @xpath='1']")
	public WebElement ModuleName;
	
	@FindBy(xpath = "//i[@class='fa fa-square-o ng-star-inserted']")
	public WebElement SelectModule;
	
	@FindBy(xpath = "//input[@id='defaultmodule']")
	public WebElement DefaultModule;
	
	@FindBy(xpath = "//input[@id='defaultmodule']")
	public WebElement SelectDefaultModule;
	
	
	@FindBy(xpath = "//button[normalize-space()='Login Restriction']")
	public WebElement LoginRestriction;
	
	@FindBy(xpath = "//div[contains(@class,'card-body form-inputs-header')]//input[@id='site']")
	public WebElement site;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-login-restriction[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement FromDate;
	
	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-today']")
	public WebElement selectfromdate;
	
	@FindBy(xpath = "//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement ToDate;
	
	@FindBy(xpath = "//span[normalize-space()='30']")
	public WebElement selecttodate;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-login-restriction[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/button[1]/i[1]")
	public WebElement addbutton;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")
	public WebElement ok;
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//span[normalize-space()='User Credentials']")
	public WebElement UserCredential;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@id='cpassword']")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath = "//button[@id='save']")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement search;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement clickonname;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]/label[1]/i[1]")
	public WebElement editbutton;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement enteremail;
	
	
	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;
	
	
	
	@FindBy(xpath = "//button[@id='update']")
	public WebElement update;
	
	@FindBy(xpath = "//label[@title='Create Designation']//i[@class='ki ki-plus']")
	public WebElement Plusicon;
	
	@FindBy(xpath = "//input[@id='lookupvalue']")
	public WebElement enterdesignation;
	
	@FindBy(xpath = "//button[@id='desigsave']")
	public WebElement Savedesignation;
	
	@FindBy(xpath = "//input[@class='form-control']")
	public WebElement searchDesignation;
	
	@FindBy(xpath = "//div[@class='searchbar-criteria one-level']//i[@class='ki ki-search']")
	public WebElement searchIcon;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement clickonName;
	
	@FindBy(xpath = "//span[@id='common_edit_icon_0']//i[contains(@class,'ki ki-pencil')]")
	public WebElement edit;
	
	@FindBy(xpath = "//ki-checkbox[contains(@controlname,'isvalid')]//span[contains(@class,'checkmark')]")
	public WebElement invalid;
	
	@FindBy(xpath = "//button[@id='desigsave']")
	public WebElement updateit;
	
	
public void create(String  firstname, String userid, String passwrd,String Phone,String Dept,String desig,String email,String Site) throws InterruptedException, AWTException{
///////////Create a user	
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(1000);
		Security.click();
		Thread.sleep(1000);
		userCreation.click();
		Thread.sleep(1000);
		Title.click();
		Thread.sleep(500);
		SelectTitle.click();
		firstName.sendKeys(firstname);
		LastName.sendKeys("murugan");
		gender.click();
		Thread.sleep(500);
		SelectGender.click();
		EnterPhoneno.sendKeys(Phone);
		UserId.sendKeys(userid);
		DOJ.click();
		Thread.sleep(1200);
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1200);	
		
		//selectDOJ.click();
		UserType.click();
		Thread.sleep(500);
		SelectUserType.click();
		Department.sendKeys(Dept);
		Thread.sleep(500);
		SelectDept.click();
		Designation.sendKeys(desig);
		Thread.sleep(500);
		SelectDesignation.click();
		AllowedSite.click();
		Thread.sleep(500);
		SelectSite.click();
		Speciality.click();
		Thread.sleep(500);
		SelectSpeciality.click();
		Default.click();
		Thread.sleep(500);
		SelectDefault.click();
		UserProfile.click();
		Thread.sleep(500);
		SelectUserProfile.click();
		EncounterCreationAllowed.click();
		Add.click();
//		Thread.sleep(800);
//		ModuleName.click();
//		Thread.sleep(500);
//		SelectModule.click();
//		DefaultModule.click();
//		Thread.sleep(500);
//		SelectDefaultModule.click();
		Thread.sleep(1000);
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//span[normalize-space()='User Credentials']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		
////////////Login Restriction
		LoginRestriction.click();
		Thread.sleep(800);
		site.click();
		Thread.sleep(900);
	    driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
	    Thread.sleep(800);
		FromDate.click();
		Thread.sleep(800);
		 selectfromdate.click();
		 Thread.sleep(800);
		 ToDate.click();
		 Thread.sleep(800);
		 //Robot r=new Robot(); 
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(800);	
			
		// selecttodate.click();
		 Thread.sleep(800);
		 addbutton.click();
		 Thread.sleep(800);
		 ok.click();
		 Thread.sleep(800);
//////Deleting the added restriction
		 LoginRestriction.click();
		 Thread.sleep(800);
		 driver.findElement(By.xpath("//tbody/tr[1]/td[7]/label[2]/i[1]")).click();
		 Thread.sleep(800);
		 driver.findElement(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		 Thread.sleep(800);
		 driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")).click();
		 Thread.sleep(1000);
		
/////////Add user credentials		
		UserCredential.click();
		Thread.sleep(900);
	    driver.findElement(By.xpath("//label[contains(text(),'User Must Change Password At Next Login')]")).click();
		 Thread.sleep(500);
		Password.sendKeys(passwrd);
		Thread.sleep(500);
		ConfirmPassword.sendKeys(passwrd);
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);
		
}
		public void designationcreation(String firstname , String email , String designation) throws InterruptedException
		{
			
			
			search.sendKeys(firstname);
			Thread.sleep(800);
			searchbutton.click();
			Thread.sleep(1000);
			clickonname.click();
			Thread.sleep(800);
			editbutton.click();
			Thread.sleep(800);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",ContactInformation);
			Thread.sleep(900);
			ContactInformation.click();
		    Thread.sleep(1500);
			enteremail.clear();
			Thread.sleep(900);
			enteremail.sendKeys(email);
			Thread.sleep(900);
			driver.findElement(By.xpath("//label[contains(text(),'Valid')]")).click();
			Thread.sleep(900);
			update.click();
			Thread.sleep(2000);
			
			//////////////Designation Creation
			driver.findElement(By.xpath("//span[contains(text(),'User Information')]")).click();
			Thread.sleep(1000);
			Plusicon.click();
			Thread.sleep(800);
			enterdesignation.sendKeys(designation);
			Thread.sleep(800);
			Savedesignation.click();
			Thread.sleep(800);
///////////////Designation edit
			Plusicon.click();
			Thread.sleep(800);
			searchDesignation.sendKeys(designation);
			Thread.sleep(800);
			searchIcon.click();
			Thread.sleep(800);
			 driver.findElement(By.xpath("//*[contains(text(),'" + designation + "')]")).click();
			 Thread.sleep(800);
			 edit.click();
			 Thread.sleep(800);
			 invalid.click();
			 Thread.sleep(800);
			 updateit.click();
///////////////////Designation delete
			 Thread.sleep(800);
			 Plusicon.click();
				Thread.sleep(800);
				searchDesignation.sendKeys(designation);
				Thread.sleep(800);
				searchIcon.click();
				Thread.sleep(800);
				 driver.findElement(By.xpath("//*[contains(text(),'" + designation + "')]")).click();
				 Thread.sleep(800);
				 driver.findElement(By.xpath("//span[@id='common_trash_icon_0']//i[contains(@class,'ki ki-trash')]")).click();
				 Thread.sleep(800);
				 driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
				 Thread.sleep(800);
			}
		
		

}
