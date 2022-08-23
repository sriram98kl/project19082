package com.baseYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryInitYasasiiWeb {
	public static Actions act;
	protected static WebDriver driver;
	
	public PageFactoryInitYasasiiWeb(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		
		
	}

}
