package com.meadable.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.meadable.qa.util.TestBase;

public class WelcomePage extends TestBase{

	//Page factory
	@FindBy()
	WebElement logo;

	@FindBy()
	WebElement signin_Btn;

	@FindBy()
	WebElement joinstudy_Btn;

	//Initialize the page objects
		public void LoginPage()
		{
			PageFactory.initElements(driver, this);
		}

		//Page actions
		public LoginPage click_signin()
		{
			signin_Btn.click();
			return new LoginPage();
		}

}
