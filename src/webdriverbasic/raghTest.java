package webdriverbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class raghTest {

	public static void main(String... args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.skype.com/en/get-skype/?intsrc=client-_-windows-_-7.40-_-go-download&setlang=en");
}
}