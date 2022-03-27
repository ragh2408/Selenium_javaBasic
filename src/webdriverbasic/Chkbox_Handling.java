package webdriverbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Chkbox_Handling {

	public static void main(String[] args) {
		WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "FF");
	    
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		d.findElement(By.linkText("Marketing")).click();
		List<WebElement> wecoll=d.findElements(By.name("selected_id"));
		
		for (WebElement we: wecoll){
			we.click();
		}
		
	boolean status=	d.findElement(By.name("selectall")).isSelected();
		

	}

}
