package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.List;

//import org.apache.commons.math3.ode.events.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_PhysicalExaminationNotes extends PageFactoryInitYasasiiWeb{

	public EMR_PhysicalExaminationNotes(WebDriver driver) {

		super(driver); 

	}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMR;
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement PatientSelection;
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;
	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;
	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement ChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[normalize-space()='Fever']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;

	@FindBy(xpath = "//div[contains(text(),'Physical Examination')]")
	public WebElement ClickonPhysicalExamination;
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//div[@class='column left ng-star-inserted']//i[@class='ki ki-arrow-right']")
	public WebElement Drawline;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Skeleton;
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='fa fa-circle-o']")
	public WebElement Circle;
	@FindBy(xpath = "//i[@class='ki ki-chevron-left']")
	public WebElement Preview;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='fa fa-pencil-square']")
	public WebElement Rectangle;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-undo']")
	public WebElement undo;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[contains(@class,'fa fa-user-times')]")
	public WebElement Clearall;
	
	@FindBy(xpath = "//li[@class='ng-star-inserted']//i[@class='ki ki-redo']")
	public WebElement redo;
	
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-arrow-left']")
	public WebElement left;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//div[@class='column right ng-star-inserted']//i[@class='ki ki-arrow-right']")
	public WebElement right;
	
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-arrow-up']")
	public WebElement up;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-arrow-down']")
	public WebElement down;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-clock-reset']")
	public WebElement rotateclock;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-clock-reset rotate']")
	public WebElement rotateAntiClock;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-zoom-out']")
	public WebElement zoomout;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[contains(@class,'ki-zoom-in')]")
	public WebElement zoomin;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//div[contains(@class,'column left ng-star-inserted')]//i[contains(@class,'ki ki-text')]")
	public WebElement text;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//div[contains(@class,'column right ng-star-inserted')]//i[contains(@class,'ki ki-text')]")
	public WebElement font;
	
	@FindBy(xpath = "//input[@id='fontfamily-drawing-tool-canvas-1']")
	public WebElement fontFamily;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[contains(@class,'fa fa-remove')]")
	public WebElement RemoveSelection;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[contains(@class,'ki ki-minus-circle')]")
	public WebElement StraightLine;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-ellipsis-h']")
	public WebElement dottedline;
	
	@FindBy(xpath = "//li[@class='ng-star-inserted']//i[@class='ki ki-pencil']")
	public WebElement drawline;
	
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//i[@class='ki ki-line-width']")
	public WebElement lineWidth;
	
	
	@FindBy(xpath = "//i[@class='fa fa-circle size-15']")
	public WebElement widthSelect;
	
	@FindBy(css = "body > app-root:nth-child(1) > app-layout:nth-child(4) > main:nth-child(2) > app-emr-homescreen:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-emrtemplateloader:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-custum-template:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > lib-emr-drawing:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > lib-drawing-tool:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > canvas:nth-child(2)")
	public WebElement element1;
	
	
	
	
	public void PhysicalExamination() throws InterruptedException, IOException {
		///////////	Select the patient and create the doctor note

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		Search.sendKeys("G00000023122");
		Thread.sleep(1000);
		PatientSelection.click();
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		UpArrow.click();
		Thread.sleep(1000);
		Lock.click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800);
		ChiefComplaint.clear();
		Thread.sleep(800);
		ChiefComplaint.sendKeys("fever");
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Template.click();
		Thread.sleep(800);
		Template.sendKeys("fe");
		SelectTemplate.click();
		Ok.click();
		Thread.sleep(1000);
		//////Enter the physical examinations

		ClickonPhysicalExamination.click();
		Thread.sleep(1000);
		Drawline.click();
		driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-1']//canvas[contains(@class,'upper-canvas')]")).click();
		//driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-2']//canvas[contains(@class,'upper-canvas')]")).click();
		Thread.sleep(1000);
		Actions builder=new Actions(driver);
		Thread.sleep(1000);
		//WebElement element = driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-layout:nth-child(4) > main:nth-child(2) > app-emr-homescreen:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > app-emrtemplateloader:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-custum-template:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > lib-emr-drawing:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > lib-drawing-tool:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > canvas:nth-child(2)"));
		//Point point = element.getLocation();

		//int Xcord = point.getX();
		//System.out.println(Xcord+"=X");
		//int Ycord = point.getY();
		//System.out.println(Ycord+"=Y");

		Action drawAction=builder.moveToElement(element1)		             
				.click().moveToElement(element1,-5, 5).clickAndHold().moveByOffset(-225,0)
				.click()
				.moveByOffset(123,0)
				.click()
				.build();
		Thread.sleep(1000);
		drawAction.perform();
		Thread.sleep(3000);
		right.click();
		Thread.sleep(3000);
		left.click();
		Thread.sleep(3000);
		up.click();
		Thread.sleep(3000);
		down.click();
		Thread.sleep(3000);
		rotateclock.click();
		Thread.sleep(3000);
		rotateAntiClock.click();
		Thread.sleep(3000);
		zoomin.click();
		Thread.sleep(3000);
		zoomout.click();
		Thread.sleep(3000); 
		
		
		// Skeleton.click();
		Thread.sleep(600);
		Circle.click();
		Thread.sleep(1000);
		Actions builders=new Actions(driver);
		Action drawActon=builders.moveToElement(element1)
				.moveByOffset(125,0).clickAndHold()
				.moveByOffset(30,0)
				.moveByOffset(0,30)
				.doubleClick()
				.build();
		drawActon.perform();
		Thread.sleep(3000);
		Clearall.click();
		
		Thread.sleep(1000);

		Rectangle.click();
		Thread.sleep(1000);
		
		Action REctangle=builders.moveToElement(element1)
				.moveByOffset(-200,0).clickAndHold()
				.moveByOffset(-90,0)
				.moveByOffset(0,-30)
				
				.doubleClick()
				.build();
		REctangle.perform();
		Thread.sleep(3000);
		Clearall.click();
		
		
		text.click();
		Thread.sleep(1000);
		font.click();
		Thread.sleep(1000);
		fontFamily.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Times New Roman']")).click();
		
		Action addText=builders.moveToElement(element1)
				.moveByOffset(125,0).click()
				.sendKeys("Adding Text")
				
				.build();
		addText.perform();
		Thread.sleep(5000);
		RemoveSelection.click();
		
		StraightLine.click();
		driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-1']//canvas[contains(@class,'upper-canvas')]")).click();
		//driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-2']//canvas[contains(@class,'upper-canvas')]")).click();
		Thread.sleep(1000);
		

		Action StghtLine=builder.moveToElement(element1)		             
				.clickAndHold().moveByOffset(-85,0)
				.release()
				.build();
		Thread.sleep(1000);
		StghtLine.perform();
		Thread.sleep(3000);
		Clearall.click();
		
		dottedline.click();
		driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-1']//canvas[contains(@class,'upper-canvas')]")).click();
		
		Thread.sleep(1000);
		

		Action dotline=builder.moveToElement(element1)		             
				.moveByOffset(-295,0)	.clickAndHold().moveByOffset(85,0)
				.release()
				.build();
		Thread.sleep(1000);
		dotline.perform();
		Thread.sleep(3000);
		
		
		drawline.click();
		Thread.sleep(3000);
		lineWidth.click();
		Thread.sleep(3000);
		widthSelect.click();
		driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-1']//canvas[contains(@class,'upper-canvas')]")).click();
		
		Thread.sleep(1000);
		

		Action pencilline=builder.moveToElement(element1)		             
				.moveByOffset(-295,0)	.clickAndHold().moveByOffset(85,0)
				.moveByOffset(0,85).moveByOffset(-85,0).moveByOffset(0,-85)
				.release()
				.build();
		Thread.sleep(1000);
		pencilline.perform();
		Thread.sleep(3000);
		
		undo.click();
		Thread.sleep(3000);
		redo.click();
		Thread.sleep(3000);
		undo.click();
		
		
		Preview.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
	}
}
