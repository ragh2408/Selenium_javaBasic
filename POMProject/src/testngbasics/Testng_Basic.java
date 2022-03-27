package testngbasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Basic {
	
	
	@BeforeMethod
	public static void bdforemehtod1(){
		System.out.println("bdforemehtod");
	}
	
	
	@AfterMethod
	public static void AfterMethod(){
		System.out.println("@AfterMethod");
	}
	@BeforeClass
	public static void BeforeClass(){
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public static void AfterClass(){
		System.out.println("@AfterClass");
	}
	
	
	
	@Test(priority=0,groups="B")
	public static void amehtodname(){
		System.out.println("mehtod");
	}
	
@Test	(priority=2,dependsOnMethods="mehtodname2")
public static void mehtodname1(){
	System.out.println("mehtod1");
	}

//enabled=false
@Test(priority=1)
public static void mehtodname2(){
	System.out.println("mehtod2");
	boolean st=true;
	try{
		Assert.assertTrue(false);
	//Error	
	}catch(Throwable e){
		Reporter.log("validation fail");
		st=false;
	}
	
	try{
		Assert.assertEquals("ram", "niwas");;
	//Error	
	}catch(Throwable e){
		st=false;
		Reporter.log("validation fail");
	}
	
	
	try{
		Assert.assertEquals("ram", "ram");;
	//Error	
	}catch(Throwable e){
		st=false;
		Reporter.log("validation pass");
	}
	
	//Assert.assertTrue(true);
	
	Assert.assertTrue(st);
	
}
	
	
	
	
	
	

}
