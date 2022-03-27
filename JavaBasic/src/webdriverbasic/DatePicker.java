package webdriverbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "CH");
	    //By	b=By.name("user_name");
	
		//d.findElement(b).sendKeys("admin");
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		d.findElement(By.linkText("Marketing")).click();
		d.findElement(By.xpath("//img[@title='Open Calendar...']")).click();
		String dte="September 2015_15";
		 datepicker(d, dte);
				
		
		
		
		
		
		
		
		
		

	}
	public static void datepicker(WebDriver d,String dte) throws InterruptedException{
          String[] arr=dte.split("_");
          String month_year=d.findElement(By.xpath("(//div[@id='miniCal']//a)[2]")).getText();
		if (month_year.equalsIgnoreCase(arr[0])==true){
			List<WebElement> datecoll=d.findElements(By.xpath("//table[@class='mailClient ']//a[contains(@href,'index.php?module=Calendar&action=index&view=day&hour=')]"));
			System.out.println(datecoll.size());
			for (int i=0;i<=datecoll.size()-1;i++){
				WebElement we=datecoll.get(i);
				String str=we.getText();
				if (str.equalsIgnoreCase(arr[1])==true){
					we.click();
					break;
				}
			}
		}
d.findElement(By.xpath("(//div[@id='miniCal']//a)[3]")).click();
Thread.sleep(4000);
datepicker(d, dte);
		
	}
	

	

}
