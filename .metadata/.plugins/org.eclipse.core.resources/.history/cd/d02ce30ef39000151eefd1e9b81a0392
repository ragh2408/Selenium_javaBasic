package com.wvs.framework.reusableclasses.navigation.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wvs.framework.reusableclasses.generic.methods.Genric_Cls;
import com.wvs.framework.reusableclasses.marketing.leads.Leads_PG;

public class Nav_Cls extends Genric_Cls{
	
	@FindBy(linkText="Marketing")
	private WebElement Marketing_LK;
	@FindBy(linkText="Leads")
	private WebElement Marketing_Leads_LK;
	
	public Leads_PG marketinglead(){
		Actions obj=	new Actions(driver);
		obj.moveToElement(Marketing_LK).build().perform();
		Marketing_Leads_LK.click();
		Leads_PG	ledobj=PageFactory.initElements(driver,Leads_PG.class );
		return ledobj;
	}
	
	
	
	
	
	
	

}
