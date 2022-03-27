package webdriverbasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows_Alert {

	public static void main(String[] args) throws IOException {
		FirefoxDriver   driver= new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		//ChromeDriver driver	=new ChromeDriver();
		driver.get("https://www.sendspace.com/");
		driver.findElementById("upload_file").sendKeys("ram.txt");
		
		/*driver.findElementById("upload_file").click();
		
		File  f=new File("ram.txt");
		String filepath=f.getAbsolutePath();
		System.out.println(filepath);
		
		String[] arr={"autoitchrome.exe",filepath};
		
		Runtime.getRuntime().exec(arr);*/
		
		
	

	}

}
