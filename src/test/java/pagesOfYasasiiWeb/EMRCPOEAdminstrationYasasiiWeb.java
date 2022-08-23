package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMRCPOEAdminstrationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRCPOEAdminstrationYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//i[contains(@class,'dashboard-lock-arrow ki ki-chevron-up')]")
	public WebElement patienthomepagelock1;
	@FindBy(xpath="//label[@class='icon cpoeadmin']")
	public WebElement adminstration;
	@FindBy(xpath="//i[@title='Encounter']")
	public WebElement filter;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/span[2]/img[1]")
	public WebElement man;
	@FindBy(xpath="//i[@title='Add']")
	public WebElement plus1;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes4;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement savemed;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[2]/i[1]")
	public WebElement filter2;
//calpol
		@FindBy(xpath="//img[@title='Quick Admin']")//img[@title='Quick Admin']
	    public WebElement Quickadmin;
//Diabeta
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[4]/div[3]/div[1]/span[2]/img[1]")
	public WebElement tabman;
	@FindBy(xpath="//input[@id='rejectquantity']")
	public WebElement quantity;
	@FindBy(xpath="//input[@id='rejectquantityunitid']")
	public WebElement quantityid;
	@FindBy(xpath="/html[1]/body[1]/modal-container[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement verifyid;
	@FindBy(xpath="//input[@id='verifiedpassword']")
	public WebElement password;
	@FindBy(xpath="//i[@title='Verify']")
	public WebElement verify;
	@FindBy(xpath="//i[@title='Add']")
	public WebElement plussign;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes1;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement save;
	//Amoxicillin
	@FindBy(xpath="(//img[@title='Admin'])[2]")
	public WebElement tabman1;
	@FindBy(xpath="//input[@id='statusid']")
	public WebElement statusid;
	@FindBy(xpath="//input[@id='brand']")
	public WebElement brand;
	@FindBy(xpath="//i[@title='Add']")
	public WebElement plussign1;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes3;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement save1;
	//ServiceAdminstration
	@FindBy(xpath="//label[normalize-space()='Service Administration']")
	public WebElement serviceadmin;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/i[1]")
	public WebElement filterservice;
	@FindBy(xpath="//i[@title='Click To Administration']")
	public WebElement exeicon;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement savebutton1;
	@FindBy(xpath="//i[contains(@title,'Click To Administration')]")
	public WebElement exeicon1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement savebutton;
 //Instruction order
	@FindBy(xpath="//label[contains(text(),'Instruction Order')]")
	public WebElement instructionorder;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-instructionorder[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/i[1]")
	public WebElement filterservice1;
	@FindBy(xpath="//button[contains(text(),'Today')]")
	public WebElement Today;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement savebutton2;
	
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement mainCat;
	
	@FindBy(xpath="//li[normalize-space()='Search']")
	public WebElement search;
	
	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement SearchText;
	
	public void EMRCPOE(String MRNo) throws InterruptedException {
//		Thread.sleep(1000);
//		mainCat.click();
//		Thread.sleep(1000);
//		search.click();
//		Thread.sleep(1000);
//		SearchText.click();
//		Thread.sleep(1000);
//		SearchText.sendKeys(MRNo);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		  
		//patienthomepagelock1.click();
		Thread.sleep(500);
		adminstration.click();
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
	    Thread.sleep(1000);
	 	filter.click();
		Thread.sleep(1000);
       driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
        Thread.sleep(500);
//medicine
    // man.click();
     Thread.sleep(500);
  //  plus1.click();
  //  Thread.sleep(1000);
    //yes4.click();
   // Thread.sleep(1000);
  //  savemed.click();
    Thread.sleep(1000);
   // filter2.click();
     Thread.sleep(1000);
  // driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/ki-checkbox-control[1]/label[1]/label[1]")).click();	
    Thread.sleep(1000);
// 	
//		//calpol
		Quickadmin.click();
		Thread.sleep(1000);
		
////////diabeta	
		Thread.sleep(1000);
		tabman.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",quantity);
		 quantity.click();//input[@id='rejectquantity']
	    Thread.sleep(1000);
	    quantity.sendKeys("0");
		quantity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//quantityid.click();
		
	   // driver.findElement(By.xpath("//li[normalize-space()='Bottle']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		 Thread.sleep(1000);
		 
		 List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Ok')][normalize-space()='Yes']"));
			
			if(dynamicElement.size() !=0)
			{
				driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
			}
			  Thread.sleep(800); 

		 
		 Thread.sleep(1000);
        verifyid.click();
        Thread.sleep(500);
        verifyid.sendKeys("nur01");
        Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[normalize-space()='Miss Rani(Nur01)']")).click();
	    Thread.sleep(1000);
	    password.click();
	    Thread.sleep(1000);
	    password.clear();
	    Thread.sleep(1000);
	    password.sendKeys("KAmeda123$");
	    Thread.sleep(500);
       // verify.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")).click();
        Thread.sleep(2000);
      
//	    plussign.click();
//	    Thread.sleep(1000);
//  	 	JavascriptExecutor js3 = (JavascriptExecutor) driver;
//     	js3.executeScript("arguments[0].scrollIntoView();",save);
//     	 yes1.click();
//	    save.click();
//	    Thread.sleep(5000);
//	    
//////////Amoxalin
//	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		 js2.executeScript("arguments[0].scrollIntoView();", tabman1);
		   Thread.sleep(2000);
		 tabman1.click();
       Thread.sleep(1000);
	   // statusid.click();
	    Thread.sleep(1000);
        //driver.findElement(By.xpath("//li[normalize-space()='Self Administered']")).click();
	  //  Thread.sleep(500);
	    brand.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[normalize-space()='Mox 500Mg Cap']")).click();
	   //	JavascriptExecutor js4 = (JavascriptExecutor) driver;
		//js4.executeScript("arguments[0].scrollIntoView();", plussign1);
	   // plussign1.click();
	    Thread.sleep(1000);
	    //yes3.click();
	    save1.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	    Thread.sleep(1000);
////////Service
	    serviceadmin.click();
	    Thread.sleep(1000);
	   // exeicon.click();
	    Thread.sleep(1000);
	   // savebutton1.click();
       Thread.sleep(2000);
	    filterservice.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[normalize-space()='ER']//span[@class='checkmark']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[normalize-space()='IP']//span[contains(@class,'checkmark')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[normalize-space()='All']//span[contains(@class,'checkmark')]")).click();
	    Thread.sleep(2000);
	    exeicon1.click();
	    Thread.sleep(2000);
        savebutton.click();
	    Thread.sleep(2000);
//	    
//Instructionorder
	   /* Thread.sleep(1000);
	    instructionorder.click();
	    Thread.sleep(1000);
	    filterservice1.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[normalize-space()='OP']//span[@class='checkmark']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[1]/div[2]/app-instructionorder[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-service-detail-modal[1]/div[3]/div[1]/form[1]/div[1]/div[2]/ki-calender-time-military[1]/div[1]/input[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@class='owl-dt-control-content owl-dt-control-button-content'][normalize-space()='Today']")).click();
	    Thread.sleep(1000);
	    savebutton2.click();
	    Thread.sleep(1000);
	    */
	    
	    
}
}
