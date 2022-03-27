package webdriverbasic;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_Cls {
	
	public Webdriver_Cls(){
		  System.out.println("ram");
	}
	
	

	
	public Webdriver_Cls(int a){
		  System.out.println("ram"+a);
	}
	
	
	public Webdriver_Cls(String a){
		  System.out.println("ram"+a);
	}

	public static void main(String[] args) {
		FirefoxDriver  driver = new FirefoxDriver();   
		//Webdriver_Cls obj=new Webdriver_Cls("niwas");
	        driver.get("http://localhost:8888/");
	        driver.manage().window().maximize();
	      // Options o= driver.manage();
	      // Window      w= o.window();
	      // w.maximize();
	       WebElement we=driver.findElementByName("user_name");
	       we.clear();
	       we.sendKeys("admin");
	       driver.findElementByXPath("//input[@name='user_password']").sendKeys("admin");;
	       //WebElement we1 =driver.findElementByXPath("//input[@name='user_password']")
	     // we1.sendKeys("admin");
	      
	      driver.findElementByName("Login").click();
	     String txt= driver.findElementByLinkText("Marketing").getText();
	      driver.findElementByLinkText("Marketing").click();
	      String sttxt=driver.findElementByXPath("//span[contains(text(),'Search')]").getText();
	      String attxt=driver.findElementByXPath("//span[text()='Search']").getAttribute("class");
	     System.out.println(sttxt+"  "+txt+"  "+attxt);
	      String str=driver.getCurrentUrl();
	     String str1= driver.getTitle();
	     System.out.println("url-"+str+"title-"+str1);
	     
	    String s= driver.getPageSource();
	    
	   String wnd= driver.getWindowHandle();
	   
	   //System.out.println(s+"  "+wnd);
	   
	   
	  int x= driver.findElementByName("submit").getLocation().getX();
	int y=  driver.findElementByName("submit").getLocation().getY();
	System.out.println(x+"and "+y);
	
	int h=driver.findElementByName("submit").getSize().getHeight();
int w=	driver.findElementByName("submit").getSize().getWidth();
System.out.println(h+"  "+w);
	          
	   boolean  b= driver.findElementByName("submit").isDisplayed();
boolean b1=	   driver.findElementByName("search_text").isEnabled();
boolean b2=driver.findElementByName("selectall").isSelected();

System.out.println(b+"  "+b1+"  "+b2);


driver.navigate().back();
driver.navigate().to("http://google.com");




	     
	      
	      
	      
	        
	        
                
	}

}
