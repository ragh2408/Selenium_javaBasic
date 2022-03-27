package webdriverbasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Multiple_Window {

	public static void main(String[] args) throws InterruptedException {
WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "IE");
	    
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Help")).click();
		d.findElement(By.linkText("About Us")).click();
		String wnd_main=d.getWindowHandle();
		Set<String>   wndcoll=d.getWindowHandles();
		
		for (String wnd_val:wndcoll){
			System.out.println(wnd_val);
			
			d.switchTo().window(wnd_val);
		  String url=d.getCurrentUrl();
		  System.out.println(url);
		  
		  if (url.contains("vtiger")==true){
			  d.close();
			  System.out.println("close");
		  }else if (url.contains("about_us")){
			 
			  d.findElement(By.linkText("Read License")).click();
			  System.out.println("read");
		  }
			
			//Thread.sleep(3000);
		}
		
		
		d.switchTo().window(wnd_main);
		
		d.findElement(By.linkText("Gmail Bookmarklet")).click();
		
		
		
		

	}

}
