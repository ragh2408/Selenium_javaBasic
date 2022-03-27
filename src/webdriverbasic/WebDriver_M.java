package webdriverbasic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_M {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "CH");
	    //By	b=By.name("user_name");
	
		//d.findElement(b).sendKeys("admin");
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		 WebElement we=d.findElement(By.id("qccombo"));
		List<WebElement>  coll=we.findElements(By.xpath("//select[@id='qccombo']//option"));
		int cnt=coll.size();
		System.out.println(coll.size());
		 Select selecobj=new Select(we);
		// for (WebElement we1: coll){
			 
		// }
		for (int i=0;i<=cnt-1;i++){
			WebElement we1=coll.get(i);
			String str=we1.getText();
			System.out.println(str);
			
			selecobj.selectByVisibleText(str);
			
			Thread.sleep(3000);
		}
		
		
		
		
		
		 
		
		 //selecobj.selectByIndex(1);
		// selecobj.selectByValue("Products");
		
		 
		 
	}
	
	
	
	

}
