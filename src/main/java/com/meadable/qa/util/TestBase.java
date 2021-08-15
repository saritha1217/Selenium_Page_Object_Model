package com.meadable.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/sarit/OneDrive/Desktop/workspace/MEDABLE_Test/pom"+"/Users/sarit/OneDrive/Desktop/workspace/MEDABLE_Test/src/main/java/com/meadable/qa/config.properties");
		}
		catch(IOException e){
			e.getMessage();
		}
	}

	public static void init()
	{
		String broswer_name = prop.getProperty("browser");

		if(broswer_name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/sarit/OneDrive/Desktop/workspace/MEDABLE_Test/chromedriver");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
