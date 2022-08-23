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
public class EMRDietNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	public EMRDietNoteYasasiiWeb(WebDriver driver) {
		super(driver);
}

	@FindBy(xpath="//div[@class='menu-toggle change']")
	public WebElement EMRmenu;	
	@FindBy(xpath="//i[@class='ki ki-sthethescope']")
	public WebElement scope;
	@FindBy(xpath="//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement homescreen;		
	
@FindBy(xpath="//input[@id='maincategory']")
public WebElement Selectip;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[2]/div[1]/div[1]/span[3]/i[1]")
public WebElement docselect;
@FindBy(xpath="//input[@id='authgenuserid']")
public WebElement useriddoc;
@FindBy(xpath="//input[@id='searchtext']")
public WebElement searchtext;
@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
public WebElement patientselect;	
@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
public WebElement upArrow;
@FindBy(xpath="//i[@class='dashboard-lock ki ki-lock-open']")	
public WebElement lock;	
@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
public WebElement docnote;	
@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
 public WebElement createnote;
@FindBy(xpath = "//input[@id='chiefcomplainttext']")
public WebElement encreate;
@FindBy(xpath = "//input[@id='emrtemplateid']")
public WebElement template;	
@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
public WebElement clickOK ;	
@FindBy(xpath="//div[@class='item-name'][normalize-space()='Nutritional Assessment']")
public WebElement nutritionnote;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement calories;
@FindBy(xpath="//input[@id='dynamic_textHTF1000558']")
public WebElement calper;
@FindBy(xpath="//div[@id='HTF1000560']//label[1]//span[1]")	
public WebElement optimal;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement vegetabletaken;
@FindBy(xpath="//div[@id='HTF1000568']//label[1]//span[1]")	
public WebElement adequate;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[4]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")	
public WebElement vitamins;
@FindBy(xpath="//input[@id='HTFV1000338']")
public WebElement vityes;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[5]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")	
public WebElement intake;
@FindBy(xpath="//input[@id='dynamic_textHTF1000574']")
public WebElement intakeel;
@FindBy(xpath="//input[@id='dynamic_textHTF1000577']")
public WebElement weight;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement presence;
@FindBy(xpath="//input[@id='HTFV1000340']")
public WebElement yes;
@FindBy(xpath="//input[@id='dynamic_textHTF1000582']")
public WebElement overweight;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement malnutrition;
@FindBy(xpath="//input[@id='HTFV1000343']")
public WebElement No;
@FindBy(xpath="//input[@id='dynamic_textHTF1000596']")
public WebElement heightper;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[8]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement vitamindef;
@FindBy(xpath="//input[@id='dynamic_textHTF1000599']")
public WebElement vit;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[9]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")
public WebElement irondef;

//Nutritionform
@FindBy(xpath="//div[contains(text(),'Nutrition Form')]")
public WebElement form;
@FindBy(xpath="//input[@id='dynamic_selectHTF1000635']")
public WebElement dietprescribe;
@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1000637']")
public WebElement restriction;
//Dignosis&plan
@FindBy(xpath="//div[@class='item-name'][normalize-space()='Diagnosis and Plan']")
public WebElement DiagnosisPlan ;
@FindBy(xpath="//input[@id='fav']")
public WebElement search ;
//Diet
@FindBy(xpath="//div[@class='item-name'][normalize-space()='Diet']")
public WebElement Diet;
@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1000604']")
public WebElement dignosis;
@FindBy(xpath="//input[@id='HTFV1000344']")
public WebElement feeding;
@FindBy(xpath="//span[normalize-space()='Good']")
public WebElement appetite;
@FindBy(xpath="//span[normalize-space()='Difficulty in chewing']")
public WebElement intakeproblem;

@FindBy(xpath="//div[@id='HTF1000617']//span[@class='editable'][normalize-space()='Moderate']")
public WebElement carbo;
@FindBy(xpath="//input[@id='HTFV1000365']")
public WebElement Protein;
@FindBy(xpath="//input[@id='HTFV1000368']")
public WebElement Fat;
@FindBy(xpath="//input[@id='HTFV1000371']")
public WebElement Fibre;
@FindBy(xpath="//textarea[@id='dynamic_textarea_HTF1000629']")
public WebElement Energy;
@FindBy(xpath="//label[@class='icon emrsave']")
public WebElement save;
//Edit note
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")
public WebElement docnote1;

@FindBy(xpath="//i[@title='More']")
public WebElement More;

@FindBy(xpath="//div[normalize-space()='Edit']")
public WebElement edit;
@FindBy(xpath="//label[@class='icon emrsave']")
public WebElement save1;


public void Diet(String MRNO) throws InterruptedException {
	Thread.sleep(1000);
	//EMRmenu.click();
	Thread.sleep(1000);
	//scope.click();
	Thread.sleep(1000);
	//homescreen.click();
	Thread.sleep(1000);
	Selectip.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
 	driver.findElement(By.xpath("//li[contains(text(),'IP')]")).click();
	Thread.sleep(1000);

	 searchtext.click();
	 searchtext.sendKeys(MRNO);
	 searchtext.sendKeys(Keys.ENTER);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	 
  //  patientselect.click();
	//Thread.sleep(1000);
	 upArrow.click();
	Thread.sleep(1000);
	lock.click();
	Thread.sleep(1000);
	docnote.click();
	Thread.sleep(1000);
	
List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
	
	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
	}
	  Thread.sleep(800); 

	Thread.sleep(1000);
	encreate.clear();
    encreate.click();
	Thread.sleep(1000);
	 encreate.sendKeys("Weight Loss");
	 driver.findElement(By.xpath("//strong[normalize-space()='Weight']")).click();
	 encreate.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
	template.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Dietitian Template KIMS']")).click();
	Thread.sleep(1000);
	clickOK.click();
	Thread.sleep(1000);
	
//Nutritionnote 
	nutritionnote.click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", calories);
	 Thread.sleep(1000);
	 calories.click();
	Thread.sleep(1000);
	calper.click();
	Thread.sleep(1000);
	calper.sendKeys("50%");
	optimal.click();
	Thread.sleep(1000);
	vegetabletaken.click();
	Thread.sleep(1000);
	adequate.click();
	Thread.sleep(1000);
	vitamins.click();
	Thread.sleep(1000);
	vityes.click();
	Thread.sleep(1000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 js1.executeScript("arguments[0].scrollIntoView();", intake);
	intake.click();
	Thread.sleep(1000);
	intakeel.click();
	intakeel.sendKeys("Nuts");
	Thread.sleep(1000);
	weight.click();
	weight.sendKeys("25");
	Thread.sleep(1000);
	presence.click();
	Thread.sleep(1000);
	yes.click();
	overweight.click();
	overweight.sendKeys("10%");
	Thread.sleep(1000);
	malnutrition.click();
	Thread.sleep(1000);
	No.click();
	 heightper.click();
	 heightper.sendKeys("60%");
     heightper.sendKeys(Keys.ENTER);
     vitamindef.click();
     Thread.sleep(1000);
     vit.click();
     vit.sendKeys("yes");
     Thread.sleep(1000);
     irondef.click();
     Thread.sleep(1000);
     
 //Nutritionform
     form.click();
     Thread.sleep(1000);
      dietprescribe.click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//li[normalize-space()='Diabetic Diet']")).click();
     Thread.sleep(1000);
     restriction.click();
     Thread.sleep(1000);
     restriction.sendKeys("Avoid junk foods\n take more proteins");
 
//Diet      
     Diet.click();
     Thread.sleep(1000);
     dignosis.click();
     dignosis.sendKeys("Liver Fatty");
     Thread.sleep(1000);
     feeding.click();
     Thread.sleep(1000);
     appetite.click();
     Thread.sleep(1000);
     intakeproblem.click();
     Thread.sleep(1000);
     carbo.click();
     Thread.sleep(1000);
     Protein.click();
     Thread.sleep(1000);
     Fat.click();
     Thread.sleep(1000);
     Fibre.click();
     Thread.sleep(1000);
     Energy.click();
     Thread.sleep(1000);
     Energy.sendKeys("High");
     Energy.sendKeys(Keys.ENTER);
      save.click();
     Thread.sleep(5000);
 //Editnote
     docnote1.click();
     Thread.sleep(1000);
     More.click();
     Thread.sleep(1000);
     edit.click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[@class='item-name'][normalize-space()='Nutritional Assessment']")).click();
     Thread.sleep(1000);              
     driver.findElement(By.xpath("//div[@id='HTF1000568']//label[1]//span[1]")).click();
     Thread.sleep(1000); 
     save1.click();
     Thread.sleep(10000);
}

}
