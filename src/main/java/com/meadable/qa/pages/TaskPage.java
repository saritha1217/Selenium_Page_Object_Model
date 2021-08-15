package com.meadable.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.meadable.qa.util.TestBase;

public class TaskPage extends TestBase{
	
	//Page factory
	@FindBy(xpath = "//input[@id='5f495246a0a6f70100d5e355_email']" )
	WebElement email_ip;
	
	@FindBy(xpath = "//input[@id='5f495246a0a6f70100d5e395_text']" )
	WebElement text_ip;
	
	@FindBy(xpath = "//input[@id='5f495246a0a6f70100d5e3d2_numeric']" )
	WebElement numeric_ip;
	
	@FindBy(xpath = "//div/ul/li[1]" )
	WebElement valuePicker_dropdown;
	
	@FindBy(xpath = "//button[@id='5f495247a0a6f70100d5e518_boolean_0']" )
	WebElement boolean_radioBtn;
	
	@FindBy(xpath = "//*[@id='5f495248a0a6f70100d5e555_continuous_scale']" )
	WebElement ContinousScale_slaider;
	
	@FindBy(xpath = "//*[@id='5f495248a0a6f70100d5e5a0_integer_scale']" )
	WebElement IntegerScale_slaider;
	
	@FindBy(xpath = "//div/input[@placeholder='Search']" )
	WebElement search_location;
	
	@FindBy(xpath = "//button[contains(text(),\"Next\")]" )
	WebElement Next_Btn;
	
	@FindBy(xpath = "//button[contains(text(),\"Skip\")]" )
	WebElement Skip_Btn;
	
	@FindBy(xpath = "//button[contains(text(),\"Skip\")]" )
	WebElement Co0mpletion_Txt;
	
	
	//Initialize the page objects
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Page actions
	public void fillTheForm(String field,String value)
	{
		switch(field)
		{
		case "Email Step":
			email_ip.sendKeys(value);
		case "Test Step":
			text_ip.sendKeys(value);
		case "Numeric Step":
			numeric_ip.sendKeys(value);
		case "Value Picker Step":
			valuePicker_dropdown.sendKeys(value);
		case "Boolean Step":
		case "Continuous Scale Step":
		case "Integer Scale Step":
		case "Location Step":
		case "Text Scale Step":
		case "Time Interval Step":
		case "Time of Day Step":
		}
		
	}
	
	public void submitTheForm()
	{
		Next_Btn.click();
	}
	
	public void skip()
	{
		Skip_Btn.click();
	}
	public void verifyCompletion()
	{
		
	}

}
