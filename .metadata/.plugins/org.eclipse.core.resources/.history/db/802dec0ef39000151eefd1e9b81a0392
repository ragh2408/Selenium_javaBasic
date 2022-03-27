package com.wvs.framework.reusableclasses.logingpg.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wvs.framework.reusableclasses.generic.methods.Genric_Cls;
import com.wvs.framework.reusableclasses.navigation.methods.Nav_Cls;

public class Login_PG extends Genric_Cls {

	@FindBy(name="user_name")
	private WebElement Uname_ED;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PWD_ED;
	
	@FindBy(name="Login")
	private WebElement Login_Btn;
	
	
	
	public Nav_Cls  login(){
		Uname_ED.sendKeys("admin");	
		PWD_ED.sendKeys("admin");
		Login_Btn.click();
		Nav_Cls navobj=	PageFactory.initElements(driver, Nav_Cls.class);
		return  navobj;
	}
	
	
	
	

}
