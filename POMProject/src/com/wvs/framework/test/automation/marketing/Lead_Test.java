package com.wvs.framework.test.automation.marketing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wvs.framework.reusableclasses.generic.methods.Genric_Cls;
import com.wvs.framework.reusableclasses.logingpg.login.Login_PG;
import com.wvs.framework.reusableclasses.marketing.leads.CreateLead_PG;
import com.wvs.framework.reusableclasses.marketing.leads.Leads_PG;
import com.wvs.framework.reusableclasses.navigation.methods.Nav_Cls;

public class Lead_Test extends Genric_Cls{

	//public static void main(String[] args) {
	     @Test
		public static void m(){	
		Login_PG obj =openapp("http://localhost:8888/", "CH");
		//new Login_PG().login();
		Nav_Cls navobj=obj.login();
		Leads_PG ledobj=navobj.marketinglead();
		CreateLead_PG createledobj=ledobj.clickcreateleadbtn();
		createledobj.createandsaveled();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
