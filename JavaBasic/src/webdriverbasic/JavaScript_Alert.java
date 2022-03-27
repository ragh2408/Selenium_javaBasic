package webdriverbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScript_Alert {

	public static void main(String[] args) throws InterruptedException {
WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "CH");
	    
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Marketing")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(2000);
		String txt=d.switchTo().alert().getText();
		System.out.println(txt);
		d.switchTo().alert().accept();
		//d.switchTo().alert().dismiss();
		d.findElement(By.linkText("Sign Out")).click();
		
		
		

	}

}
