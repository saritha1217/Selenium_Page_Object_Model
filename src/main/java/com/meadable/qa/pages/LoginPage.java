package com.meadable.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.meadable.qa.util.TestBase;

public class LoginPage extends TestBase {

	//Page factory
	
	//@FindBy(xpath = "")
	//WebElement logo;

	@FindBy(xpath = "//p[contains(text(),\"Log in to PAWEB QA Automation\")]")
	WebElement text;

	@FindBy(xpath = "//input[@type='username']")
	WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_Btn;

	//@FindBy(xpath = "")
	//WebElement forgotPassword_Link;

	//@FindBy(xpath = "")
	//WebElement  donotHaveAccount_Link;

	//@FindBy(xpath = "")
	//WebElement changeOrganization_Link;

	//Initialize the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	//Page actions
	public void enter_username()
	{
		username.clear();
		username.click();
		username.sendKeys(prop.getProperty("username"));
	}

	public void enter_password()
	{
		password.clear();
		password.click();
		password.sendKeys(prop.getProperty("password"));
	}

	public void click_login()
	{
		login_Btn.click();
	}
	
	public String getText()
	{
		String page_text = text.getText();
		return page_text;
		
	}


}
