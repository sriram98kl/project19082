package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersRecommendDoseYasasiiWeb;

public class MastersRecommendDoseYW extends TestBaseYasasiiWeb  {
			public static LoginPageYasasiiWeb login;
		public static HomePageYasasiiWeb hm;
		

		@BeforeClass
		public void navigateERPage() throws InterruptedException {
			
			this.login =new LoginPageYasasiiWeb(driver) ;
			this.hm = login.enterloginDetails("admin", "kameda321", "KIMSHEALTH TVM");
			Thread.sleep(3000);
			
		}
		@Test
		   public void recDose() throws InterruptedException {
				Thread.sleep(2000);
				
				MastersRecommendDoseYasasiiWeb recommenddose = new MastersRecommendDoseYasasiiWeb(driver);
				recommenddose.RecommSelect();
				}
		
		
		@AfterClass
		public void logout() throws Exception
		{
			this.hm.clickLogout();
		}
	

}

