package com.wvs.framework.reusableclasses.generic.methods;




import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class LocalDriverManager {
	
	 public static ThreadLocal<WebDriver> d = new ThreadLocal<WebDriver>();

	    public static WebDriver getDriver() {
	    	
	    	
	    	 
	        return d.get();
	        
	        
	       
	    }

	    static void setWebDriver(WebDriver driver) {
	        d.set(driver);
	    }
	

	   
	

}
