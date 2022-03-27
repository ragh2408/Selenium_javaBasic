package webdriverbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "CH");
	    //By	b=By.name("user_name");
	
		//d.findElement(b).sendKeys("admin");
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		WebElement we=d.findElement(By.linkText("Support"));
		
		Actions actionobj= new Actions(d);
		actionobj.moveToElement(we).build().perform();
		d.findElement(By.linkText("Marketing")).click();
		actionobj.keyDown(Keys.SHIFT);
	WebElement we1=	d.findElement(By.name("search_text"));
		actionobj.moveToElement(we1).sendKeys("ram");
	

	}

}
