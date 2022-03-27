package com.wvs.framework.reusableclasses.marketing.leads;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLead_PG {
	
	@FindBy(name="company")
	private WebElement Comname_ED;
	@FindBy(name="lastname")
	private WebElement Lastname_ED;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Save_BTN;
	public void createandsaveled(){
		Comname_ED.sendKeys("Dcompany");
		Lastname_ED.sendKeys("D.ibrahim");
		Save_BTN.click();
		
		
		
	}
	
	
	
}
