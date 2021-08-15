package com.meadable.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.meadable.qa.util.TestBase;

public class HomePage extends TestBase {

	//Page factory
	
	//@FindBy()
	//WebElement popup_title;
	
	//@FindBy()
	//WebElement popup_text1;
	
	//@FindBy()
	//WebElement popup_text2;
	
	//@FindBy()
	//WebElement popup_text3;

	@FindBy(xpath = "//button[contains(text(),'Ignore')]")
	WebElement popup_ignore_btn;
	
	//@FindBy()
	//WebElement popup_update_btn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div[1]/div/div/div/div[2]/a[20]")
	WebElement formStepTask_RadioBtn;
	

	//Initialize the page objects
	public HomePage()
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
	
	public void scrollToElement()
	{
		formStepTask_RadioBtn.sendKeys(Keys.PAGE_DOWN);
	}

	public void select_formStepTask()
	{
		formStepTask_RadioBtn.click();
	}

}
