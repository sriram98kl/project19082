package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Masters_VitalMeasurementandSign extends PageFactoryInitYasasiiWeb{
	
	public Masters_VitalMeasurementandSign(WebDriver driver) {

		super(driver);

}
	
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement MastersIcon;
	@FindBy(xpath = "//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[7]/a[1]/span[1]")
	public WebElement Service;
	@FindBy(xpath = "//a[@title='To create/edit service master']//span[contains(text(),'Service Master')]")
	public WebElement ServiceMaster;	
	@FindBy(xpath = "//input[@id='rootinvcatgeoryser']")
	public WebElement EnterBaseCategory;
	@FindBy(xpath = "//li[normalize-space()='Vital Signs and Measurements']")
	public WebElement SelectBaseCategory;
	@FindBy(xpath = "//input[@id='servicecategoryser']")
	public WebElement EnterPercentage;
	@FindBy(xpath = "//li[normalize-space()='Blood Gases']")
	public WebElement SelectSubCategory;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement EnterServiceName;
	@FindBy(xpath = "//input[@id='resulttypeid']")
	public WebElement ResultType;	
	@FindBy(xpath = "//li[normalize-space()='Integer']")
	public WebElement SelectResultType;
	@FindBy(xpath = "//input[@id='displayorder']")
	public WebElement EnterDisplayOrder;
	@FindBy(xpath = "//div[contains(@class,'col-md-4')]//input[@id='field3']")
	public WebElement TemplateType;
	@FindBy(xpath = "//li[normalize-space()='Data&Information']")
	public WebElement SelectTemplateType;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[9]/div[1]/div[2]/div[1]/app-score[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AssessEnterData;
	@FindBy(xpath = "//button[@id='addvalues']")
	public WebElement ClickValues;
	@FindBy(xpath = "//input[@id='itemvalue']")
	public WebElement EnterValue;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AssEnterScore;
	@FindBy(xpath = "//button[@id='additem']//i[contains(@class,'fa fa-plus')]")
	public WebElement ClickAddToGrid;
	@FindBy(xpath = "//button[contains(@class,'pull-right mb-0 mt-2 mr-0')]")
	public WebElement ClickOK;
	@FindBy(xpath = "//div[contains(@class,'col-md-5 ta-r')]//i[contains(@class,'ki ki-plus')]")
	public WebElement clickadd;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[9]/div[1]/div[2]/div[1]/app-score[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterData2;
	@FindBy(xpath = "//button[@id='addvalues']")
	public WebElement ClickValues2;
	@FindBy(xpath = "//input[@id='itemvalue']")
	public WebElement EnterValue2;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterScore2;
	@FindBy(xpath = "//button[@id='additem']//i[contains(@class,'fa fa-plus')]")
	public WebElement ClickAddToGrid2;
	@FindBy(xpath = "//button[contains(@class,'pull-right mb-0 mt-2 mr-0')]")
	public WebElement ClickOK2;
	@FindBy(xpath = "//div[contains(@class,'col-md-5 ta-r')]//i[contains(@class,'ki ki-plus')]")
	public WebElement clickadd2;
	
	
	@FindBy(xpath = "//*[@id=\"[object Object]\"]")
	public WebElement AssScoreName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[9]/div[1]/div[2]/div[1]/app-score[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterRangeFrom0;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[9]/div[1]/div[2]/div[1]/app-score[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterRangeTo0;
	@FindBy(xpath = "//button[@id='addscore']//i[@class='ki ki-plus']")
	public WebElement Add1;
	
	@FindBy(xpath = "//*[@id=\"[object Object]\"]")
	public WebElement EnterScoreName1;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[9]/div[1]/div[2]/div[1]/app-score[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterRangeFrom1;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[9]/div[1]/div[2]/div[1]/app-score[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EnterRangeTo1;
	@FindBy(xpath = "//button[@id='addscore']//i[@class='ki ki-plus']")
	public WebElement Add2;	
	@FindBy(xpath = "//button[@id='servicemastersave']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EntertheServiceName;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement Searchbutton;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement ClickonServiceName;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement EditIcon;
	@FindBy(xpath = "//span[@class='btm-checkbox-group']//span[@class='checkmark']")
	public WebElement UncheckvalidCheckbox;
	@FindBy(xpath = "//button[@id='servicemasterupdate']")
	public WebElement Update;


	
	
	public void VitalAction(String ServiceName,String Data1,String Value1,String Score1,String Data2,String Value2,String Score2,String ScoreName1,String From1,String To1,String ScoreName2,String From2,String To2) throws InterruptedException, IOException, AWTException {
//////////////Enter into service master screen and take vitals and measurement as category
		Hamberger.click();	
		Thread.sleep(500);
		MastersIcon.click();
		Thread.sleep(800);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Service);
		Thread.sleep(800);
		
		Service.click(); 
		Thread.sleep(600);
		ServiceMaster.click();
		Thread.sleep(600);
		EnterBaseCategory.sendKeys("vital");
		Thread.sleep(600);
		SelectBaseCategory.click();
		Thread.sleep(800);
		EnterPercentage.sendKeys("%");
		Thread.sleep(800);
		SelectSubCategory.click();
		Thread.sleep(800);
		EnterServiceName.sendKeys(ServiceName);
		Thread.sleep(600);
		
		{
			
			//WebElement element = driver.findElement(By.xpath("//input[@id='displayorder']"));

			js.executeScript("arguments[0].scrollIntoView(true);", ResultType);
			}
		ResultType.click();
		Thread.sleep(1200);
		SelectResultType.click();
		
	Thread.sleep(1000);
	
	
	{
	
		WebElement element = driver.findElement(By.xpath("//input[@id='displayorder']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
	
//////////////Enter dispaly order details	
	EnterDisplayOrder.sendKeys("2");
	Thread.sleep(600);
	TemplateType.click();
	Thread.sleep(600);
	SelectTemplateType.click();
	Thread.sleep(2000);
	
	//String parent=driver.getWindowHandle();	
	//driver.switchTo().frame("undefined");
	
	//Thread.sleep(1000);
/////////////////Enter assessmeent score details
	AssessEnterData.click();
	Thread.sleep(3000);
	AssessEnterData.sendKeys(Data1);
	ClickValues.click();
	Thread.sleep(800);
	EnterValue.sendKeys(Value1);
	AssEnterScore.sendKeys(Score1);
	ClickAddToGrid.click();
	ClickOK.click();
	Thread.sleep(600);
	clickadd.click();
	Thread.sleep(800);
	
	EnterData2.sendKeys(Data2);
	ClickValues2.click();
	Thread.sleep(800);
	EnterValue2.sendKeys(Value2);
	EnterScore2.sendKeys(Score2);
	ClickAddToGrid2.click();
	Thread.sleep(600);
	ClickOK2.click();
	Thread.sleep(800);
	clickadd2.click();
	Thread.sleep(1000);
	
	AssScoreName.click();
	AssScoreName.sendKeys(ScoreName1);
	Thread.sleep(800);
	EnterRangeFrom0.click();
	EnterRangeFrom0.sendKeys(From1);
	Thread.sleep(500);
	EnterRangeTo0.click();
	EnterRangeTo0.sendKeys(To1);
	Thread.sleep(500);
	Add1.click();
	Thread.sleep(800);
	
	EnterScoreName1.sendKeys(ScoreName2);
	Thread.sleep(800);
	EnterRangeFrom1.click();
	EnterRangeFrom1.sendKeys(From2);
	Thread.sleep(500);
	EnterRangeTo1.click();
	EnterRangeTo1.sendKeys(To2);
	Thread.sleep(500);
	Add2.click();
	Thread.sleep(800);
	Save.click();
	Thread.sleep(800);
	
	//Take the created service for edit and make it as invalid
	EntertheServiceName.clear();
	Thread.sleep(500);
	EntertheServiceName.sendKeys(ServiceName);
	Thread.sleep(500);
	Searchbutton.click();
	Thread.sleep(800);
	ClickonServiceName.click();
	Thread.sleep(800);
	EditIcon.click();
	Thread.sleep(800);
	UncheckvalidCheckbox.click();
	Thread.sleep(800);
	Update.click();
	
	
	
	
	
}
}
