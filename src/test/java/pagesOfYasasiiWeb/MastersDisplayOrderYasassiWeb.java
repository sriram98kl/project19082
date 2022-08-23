package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class MastersDisplayOrderYasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public MastersDisplayOrderYasassiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon;
	
	@FindBy(xpath = "//span[text()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(text(),'Display Order')]")
	public WebElement DisplayOrder;
	
	@FindBy(xpath = "//div[contains(text(),'Laboratory')]")
	public WebElement Laboratory;
	
	@FindBy(xpath = "//div[contains(text(),'QUADRUPLETS -FTS')]")
	public WebElement item1;
	
	@FindBy(xpath = "//label[@title='Move Down']")
	public WebElement downArrow;
	
	@FindBy(xpath = "//button[@id='displayordersave']")
	public WebElement Save;
	
public void DOSelect() throws InterruptedException
{
/////////////Click on dispalyorder screen and shange the position
		Thread.sleep(3000);
		Menutoggle.click();
		Thread.sleep(3000);
		mastericon.click();
		Thread.sleep(3000);
		Service.click();
		Thread.sleep(500);
		DisplayOrder.click();
		Thread.sleep(500);
		Laboratory.click();
		Thread.sleep(500);
		item1.click();
		Thread.sleep(900);
		downArrow.click();
		downArrow.click();
		downArrow.click();
		downArrow.click();
		Thread.sleep(500);
		Save.click();
}
}
