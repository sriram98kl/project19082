package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class ERPatientYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public ERPatientYasasiiWeb(WebDriver driver) {
	
		super(driver);
		
	}
	

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement firstname;
		
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;
	

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[2]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ercheckbox;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement encOk;
	
	@FindBy(xpath= "//input[@id='inchargeproviderdisplayname']")
	WebElement encprovider;
			
    @FindBy(xpath= "//button[contains(text(),'Save')]")
	WebElement encsave;
    
    @FindBy(xpath= "//label[normalize-space()='Emergency']//span[@class='checkmark']")
   	WebElement EmergencyCheckBox;
	
	
	public FOERPatientEncounterYasasiiWeb enterERRegDetails(String myfirstname,String mygender, String myage ) throws InterruptedException, IOException {
	////////////Register an ER patient	
		firstname.sendKeys(myfirstname);
		gender.click();
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\"" + mygender + "\")]")).click();
		age.sendKeys(myage);
		age.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		
	
		

		Thread.sleep(600);
		fosave.click();
///////////Write the MRno. to excel sheet		
		Thread.sleep(3000);
        String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
    	System.out.println(mrno);
		
    	String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);
		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb82190\\src\\test\\resources\\excelYasasiiWeb\\sprint4 testData82.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet ERPatientFlow=wb.getSheetAt(15);	
		int i=ERPatientFlow.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		ERPatientFlow.getRow(i).createCell(4).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		
		Thread.sleep(1000);
		
		encOk.click();
	    return new FOERPatientEncounterYasasiiWeb(driver);

}
	
}