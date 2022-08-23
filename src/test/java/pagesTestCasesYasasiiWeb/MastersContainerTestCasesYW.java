package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersContainerYasassiiWeb;
import pagesOfYasasiiWeb.MastersSpecimenYasassiWeb;


public class MastersContainerTestCasesYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	
	@BeforeClass
	public void navigateMasterContainerPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	
	
	@Test(dataProvider="getData")
	public void addcontainer(String containername)throws InterruptedException, IOException {
		MastersContainerYasassiiWeb containerName = new MastersContainerYasassiiWeb(driver) ;
		containerName.SpecimenContainerSelect(containername);
	}
		
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("ContainerMaster");
		return data;	
	}
	
	


}
