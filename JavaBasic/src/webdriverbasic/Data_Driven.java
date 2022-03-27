package webdriverbasic;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import excel.Excel_Reading;

public class Data_Driven {

	public static void main(String[] args) throws IOException {
		HashMap[] hmarr=Excel_Reading.storedatainhashmaparr("data.xlsx", "Sheet1");
		WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "FF");
		
		
		
		for (int i=0;i<hmarr.length;i++){
			HashMap<String,String> hm =hmarr[i];
			//String uname=hm.get("uname");
			d.findElement(By.name("user_name")).clear();
		d.findElement(By.name("user_name")).sendKeys(hm.get("uname"));
		d.findElement(By.name("user_password")).clear();
		d.findElement(By.name("user_password")).sendKeys(hm.get("pwd"));
		d.findElement(By.name("Login")).click();
		d.findElement(By.linkText("Sign Out")).click();
		}
	}

}
