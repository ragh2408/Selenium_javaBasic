package webdriverbasic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chrome_Cls {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
		//InternetExplorerDriver          driver=  new InternetExplorerDriver();
		//ChromeDriver      driver= new  ChromeDriver() ;
		//driver.get("http://localhost:8888/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		ChromeDriver 	driver=openapp("http://localhost:8888/");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		

	}
	
	public static ChromeDriver openapp(String url){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
				//System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
				//InternetExplorerDriver          driver=  new InternetExplorerDriver();
				ChromeDriver      driver= new  ChromeDriver() ;
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
		return driver;		
	}
	
	public static WebDriver openapp(String url,String brname){
		WebDriver driver=null;
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
		
		
		
		return driver;
		
	}
	
	
	
	
	
	
	

}
