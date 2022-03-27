package webdriverbasic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header_Link {
	
	
	//private static int x=9;
	
	//protected static int x=9;
	
	protected final static int x=9;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(x);
WebDriver    d=Chrome_Cls.openapp("http://localhost:8888/", "FF");
	    
		d.findElement(By.name("user_name")).sendKeys("admin");;
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.name("Login")).click();
		List<WebElement> hdrcoll=d.findElements(By.xpath("//table[@class='hdrTabBg']//td[2]//a"));
		int cnt=hdrcoll.size();
		
		for (int i=0;i<cnt;i++){
			hdrcoll=d.findElements(By.xpath("//table[@class='hdrTabBg']//td[2]//a"));
			WebElement we=hdrcoll.get(i);
			String hdrtxt=we.getText();
			System.out.println(hdrtxt);
			
			we.click();
			
			List<WebElement> inrlnkcoll=d.findElements(By.xpath("//table[@class='level2Bg']//a"));
			
			for (int j=0;j<inrlnkcoll.size();j++){
				inrlnkcoll=d.findElements(By.xpath("//table[@class='level2Bg']//a"));
				WebElement we1=inrlnkcoll.get(j);
				  String inrlnktxt= we1.getText();
				  System.out.println(inrlnktxt);
				  we1.click();
				  String expval=hdrtxt+" > "+inrlnktxt;
				  String acttxt="";
				  try{
					  
					   acttxt= d.findElement(By.xpath("//td[@class='moduleName']")).getText(); 
					  
					  
				  }catch(NoSuchElementException t) {
					 t.printStackTrace();
					String msg= t.getMessage();
					System.out.println("element not found on page");
				  }finally{
					 System.out.println("always execute"); 
				  }
				  
				  if (acttxt.equalsIgnoreCase(expval)){
					  System.out.println("validation pass");
					 
					  
				  }else {
					  
					  System.out.println("validation fail");
					  
					                            TakesScreenshot       tss=(TakesScreenshot) d;
					      File screnshot=tss.getScreenshotAs(OutputType.FILE);
					      
					      
					      File dest     = new File("snap/"+hdrtxt+"_"+inrlnktxt+"image.png");
					      
					    FileUtils.copyFile(screnshot, dest);  
					    
					  
				  }
					  
				  
				
				  
				  System.out.println(acttxt);
				
				  
				  
				  
			}
			
			Thread.sleep(3000);
		
			
			if (i==1){
				break;
			}
		}
		
		
		
		
		
	}
	
	public static int getval(){
		return x;
	}
	
	
	public static void setval(int a){
		 //x=a;
	}
	
	

}
