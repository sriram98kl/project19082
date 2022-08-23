package pagesOfYasasiiWeb;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_combinationalPAY_DiscRaise_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public FO_combinationalPAY_DiscRaise_YasassiWeb(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement sEARCHfield;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement sEARCHicon;




	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement patientSelect;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//p[@class='mb-0 ng-star-inserted']")
	public WebElement Expand;

	@FindBy(xpath = "//div[@class='icon-inline']//i[@class='ki ki-pencil ng-star-inserted']")
	public WebElement AdjustEdit;//div[@class='icon-inline']//i[@class='ki ki-pencil ng-star-inserted']

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-adjustment[1]/div[1]/div[2]/div[4]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdjustAmount;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline ml0 ng-star-inserted']")
	public WebElement RaiseRequest;

	@FindBy(xpath = "//label[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Fo;

	@FindBy(xpath = "//li[6]//a[1]")
	public WebElement RCM;

	@FindBy(xpath = "//span[normalize-space()='Approve Request']")//span[normalize-space()='View Request']
	public WebElement viewRequest;

	@FindBy(xpath = "//span[normalize-space()='Adjustment Approval']")
	public WebElement AdjApprove;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkrequest;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement Approve;
	//button[normalize-space()='OK']
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remarks;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement ApproveSuccess;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement Save;

	@FindBy(xpath = "//i[@class='ki ki-debit-card icon-btn-billing btn-dark-green inline']")
	public WebElement debitCard;

	@FindBy(xpath = "//div[@class='row pt-4 ng-star-inserted']//div[@class='col-md-6']//input[1]")
	public WebElement provider;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "//input[@id='cardnoPayType']")
	public WebElement cardNO;

	@FindBy(xpath = "//input[@id='apprnoPayType']")
	public WebElement approveNO;

	@FindBy(xpath = "//div[@class='col-md-2 ta-r ']//i[@class='ki ki-plus']")
	public WebElement CardAdd;


	@FindBy(xpath = "//button[contains(@class,'btn btn-dark-green active')][normalize-space()='OK']")
	public WebElement CardOK;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement authoriser;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement SearchAuth;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	public WebElement Back;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='undefined']")
	public WebElement Remarks;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement TransactionDone;

	@FindBy(xpath = "//span[@class='pay-style']")
	public WebElement payment;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
	public WebElement reqOK;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billsave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement billsaveOK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;




	public void combpay(String MRNO , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL) throws InterruptedException {

		sEARCHfield.click();
		Thread.sleep(1000);
		sEARCHfield.sendKeys(MRNO);
		Thread.sleep(1000);
		sEARCHicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

		//driver.findElement(By.xpath("//span[text()='"+MRNO+"']")).click();

		//patientSelect.click();


		WebElement inputBox = driver.findElement(By.xpath("//input[@id='EncBillingproviders']"));
		String textInsideInputBox = inputBox.getAttribute("value");

		System.out.println(textInsideInputBox);
		// Check whether input field is blank
		if(textInsideInputBox.isEmpty())
		{
			System.out.println("Input field is empty");
			providerName.click();
			Thread.sleep(1000);
			providerName.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
		}
		else {
			clear.click();
			Thread.sleep(1000);
			providerName.click();
			Thread.sleep(1000);
			providerName.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
		}

		//providerName.click();
		//providerName.sendKeys(PROVIDER);
		//driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();
		//Thread.sleep(1000);
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(2000);
		Expand.click();
		Thread.sleep(2000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", payment);

		String netAmount= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();

		//Wait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOf(A));

		//String netAmount = A.getAttribute("value");
		//String netAmount1 = A.getAttribute("value");
		// String netAmount = A.getAttribute(textInsideInputBox);

		System.out.println("total payment is " + netAmount);

		double i = new Double(netAmount);


		double j = new Double(ADJAMOUNT);
		System.out.println("Adjustment amount is "+j);

		double  percentage = (int) (j*100)/i;

		System.out.println("percentage of adjustment is "+percentage+"%");

		//int i = Integer.parseInt(A);
		//int intValue = (int) i;
		//double DV =  (i/1.75); 
		//System.out.println(DV);
		//int Rupee = (int)Math.round (DV) ;
		//String ADJamount = String.valueOf(Rupee)
		//System.out.println(ADJamount);



		AdjustEdit.click();
		String limit =	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-adjustment[1]/div[1]/div[2]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")).getText();
		System.out.println("Actual Allowed ajdusment limit is "+limit);

		//compare = (netAmount > ADJAMOUNT ) ;
		//double  NetAmount= new Double(netAmount);
		//double adjAmount  = new Double(ADJAMOUNT);	

		//	boolean  compare = (NetAmount >= adjAmount) ;
		boolean  compare = (percentage <= 100 ) ;

		System.out.println(compare);

		Assert.assertTrue(compare);



		Thread.sleep(1000);
		AdjustAmount.click();
		AdjustAmount.sendKeys(ADJAMOUNT);
		RaiseRequest.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", payment);	

		if(percentage <= 50)
		{
			System.out.println("Adjustment within the limit ");
			Thread.sleep(1000);
			debitCard.click();
			provider.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='ICICI']")).click();
			Amount.click();
			Thread.sleep(1000);
			Amount.sendKeys(CARDAMOUNT);
			cardNO.click();
			Thread.sleep(1000);
			cardNO.sendKeys(CARDNO);
			approveNO.click();
			approveNO.sendKeys(APPROVENO);
			Thread.sleep(1000);
			CardAdd.click();
			Thread.sleep(2000);
			CardOK.click();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(2000);
			billsave.click();
			Thread.sleep(1000);
			billsaveOK.click();
			Thread.sleep(2000);
		}

		if(percentage > 50) {

			System.out.println("Adjustment exceeds the limit ");
			Thread.sleep(1000);
			debitCard.click();
			provider.click();
			driver.findElement(By.xpath("//li[normalize-space()='ICICI']")).click();
			Amount.click();
			Thread.sleep(1000);
			Amount.sendKeys(CARDAMOUNT);
			cardNO.click();
			Thread.sleep(1000);
			cardNO.sendKeys(CARDNO);
			approveNO.click();
			approveNO.sendKeys(APPROVENO);
			Thread.sleep(1000);
			CardAdd.click();
			Thread.sleep(2000);
			CardOK.click();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(2000);
			authoriser.click();
			Thread.sleep(1000);
			SearchAuth.sendKeys(AUTHPERSON);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@title='Albert Sam(DOCAS)']")).click();
			
			//driver.findElement(By.xpath("//*[contains(text(),'" +AUTHPERSON+ "')]")).click();
			Thread.sleep(1000);
			Back.click();
			Thread.sleep(1000);
			Remarks.click();
			Remarks.sendKeys(REMARK1);
			Thread.sleep(2000);
			reqOK.click();
			Thread.sleep(3000);
			//Save.click();
			Thread.sleep(5000);
			TransactionDone.click();
			Thread.sleep(1000);

			//openNewTab

			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);
			driver.get(URL);
			Thread.sleep(3000);

			//login
			userid.click();
			userid.sendKeys("DOCAS");
			password.click();
			password.sendKeys("Kameda321");
			Thread.sleep(1000);
			site.click();
			driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
			Thread.sleep(5000);

			//request approval
			Hamberger.click();
			Thread.sleep(2000);
			Fo.click();
			Thread.sleep(1000);
			RCM.click();
			Thread.sleep(2000);
			viewRequest.click();
			Thread.sleep(1000);
			AdjApprove.click();
			Thread.sleep(1000);
			MRNOSearch.click();
			Thread.sleep(1000);
			MRNOSearch.sendKeys(MRNO);
			Thread.sleep(1000);
			SearchIcon.click();
			Thread.sleep(1000);
			checkrequest.click();
			Thread.sleep(1000);

			remarks.click();
			remarks.sendKeys(REMARK2);
			Thread.sleep(2000);
			Approve.click();

			Thread.sleep(2000);
			ApproveSuccess.click();


		}

		System.out.println("running successful");


	}




}
