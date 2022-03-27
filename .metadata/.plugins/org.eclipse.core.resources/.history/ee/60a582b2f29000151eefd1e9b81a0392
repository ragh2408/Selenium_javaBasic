package com.wvs.framework.reusableclasses.generic.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import com.wvs.framework.reusableclasses.logingpg.login.Login_PG;

public class Genric_Cls {
	public static WebDriver driver=null;
	public static Login_PG openapp(String url,String brname){
		
		if (brname.equalsIgnoreCase("FF")==true){
			 driver= new FirefoxDriver();
			
			
		}else if (brname.equalsIgnoreCase("CH")){
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			      driver= new  ChromeDriver() ;
			
		}else if (brname.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
			         driver=  new InternetExplorerDriver();

		}
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
      Login_PG    obj	=PageFactory.initElements(driver, Login_PG.class);
		
		return obj;
		
		
		
	}
	
	
	
	
	
	

}
