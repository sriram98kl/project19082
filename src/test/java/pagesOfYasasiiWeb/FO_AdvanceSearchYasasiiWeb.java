package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_AdvanceSearchYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public FO_AdvanceSearchYasasiiWeb(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//span[@title='Advanced Search']//i[@class='ki ki-search-advance']")
	public WebElement advanceSearch;
	
	@FindBy(xpath = "//input[@id='customfields']")
	public WebElement AddCriteria;
	
	@FindBy(xpath = "//li[normalize-space()='Mobile Number']")
	public WebElement selectaddcriteris;
	
	@FindBy(xpath = "//div[@class='form-group zero-bottom dark-bg ng-star-inserted']//input[@id='undefined']")
	public WebElement enterdatainthefield;
	
	@FindBy(xpath = "//input[@id='field']")
	public WebElement fieldclick;
	
	@FindBy(xpath = "//button[@id='patadvfetch']")
	public WebElement searchbutton;
	
	
	
	public void Advancesearch(String Criteria,String data,String criteria1,String daata2,String criteria3) throws InterruptedException
	{
/////////////////////click on the advance search icon and enter the add criteria
		advanceSearch.click();
		Thread.sleep(500);
		AddCriteria.click();
		driver.findElement(By.xpath("//*[contains(text(),'" + Criteria + "')]")).click();
		enterdatainthefield.sendKeys(data);
		AddCriteria.click();
		driver.findElement(By.xpath("//*[contains(text(),'" + criteria1 + "')]")).click();
		fieldclick.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + daata2 + "')]")).click();
		Thread.sleep(800);
		searchbutton.click();
		AddCriteria.click();  
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[contains(text(),'" + criteria3 + "')]")).click();
		//li[normalize-space()='DOB From']
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm']")).click();
		Thread.sleep(800);

	}
}
