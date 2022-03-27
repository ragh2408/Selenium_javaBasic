package testngbasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Medium {

	
	@Parameters("sum")
	@Test(groups="B")
	public static void mehtodnamemedium(String val){
		System.out.println("mehtodnamemedium"+val);
	}
	
	
	
	
}
