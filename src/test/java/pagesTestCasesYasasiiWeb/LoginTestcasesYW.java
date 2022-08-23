package pagesTestCasesYasasiiWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;



public class LoginTestcasesYW extends TestBaseYasasiiWeb{

	@Test(dataProvider="getData")
	public void userlogin(String username,String password,String loginsite,String expectedcondition,String testtype) throws InterruptedException {
		LoginPageYasasiiWeb addlogin=new LoginPageYasasiiWeb(driver);
		HomePageYasasiiWeb home = addlogin.enterloginDetails(username, password, loginsite);
		Thread.sleep(5000);
		String actualcond = driver.getCurrentUrl();  
		switch(testtype) { 
	
		case "positive" :
			home.clickLogout();
		Thread.sleep(1000);
			Assert.assertTrue(actualcond.contains(expectedcondition));
			break; 

	case "negative": 
			Assert.assertTrue(addlogin.iswarningPresent());
		break;

		case "null value":
			Assert.assertTrue(actualcond.contains(expectedcondition));
			break;

		default:
			System.out.println("Condition not implemented");
		
			
		} 	 
	}


	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("LoginTestcasesYW");
		return data;	
	}



}
