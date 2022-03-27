package com.wvs.framework.reusableclasses.marketing.leads;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wvs.framework.reusableclasses.generic.methods.Genric_Cls;

public class Leads_PG extends Genric_Cls{
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement Createled_Btn;
	
	public CreateLead_PG clickcreateleadbtn(){
		
		Createled_Btn.click();
		
		CreateLead_PG createledobj=	PageFactory.initElements(driver, CreateLead_PG.class);
		return  createledobj;
	}
	
	

}
