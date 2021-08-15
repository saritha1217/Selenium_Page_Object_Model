package com.meadable.qa.stepDefinations;

import java.util.List;

import org.junit.Assert;


import com.meadable.qa.pages.HomePage;
import com.meadable.qa.pages.LoginPage;
import com.meadable.qa.pages.TaskPage;
import com.meadable.qa.pages.WelcomePage;
import com.meadable.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps extends TestBase{

	WelcomePage welcomePage= new WelcomePage();
	LoginPage loginPage= new LoginPage();
	HomePage homePage = new HomePage();
	TaskPage taskPage = new TaskPage();


	@Given("^patient navigate to the welcome study page$")
	public void navigateTo_welcomePage() throws Throwable{
		TestBase.init();

	}

	@When("^patient click on I have an account button in welcome page$")
	public void clickOn_IHaveAnAccount_Btn() throws Throwable{
		welcomePage.click_signin();

	}

	@And("^patient should see the login page$")
	public void verify_loginPage() throws Throwable{
		Assert.assertEquals("Log in to PAWEB QA Automation",loginPage.getText() );

	}

	@And("^patient enter the email in the login page$")
	public void enter_emailID() throws Throwable{
		loginPage.enter_username();
	}

	@And("^patient enter the password in the login page$")
	public void enter_password() throws Throwable{
		loginPage.enter_password();
	}

	@And("^patient click login button in login page$")
	public void clickOn_login_Btn() throws Throwable{
		loginPage.click_login();
	}

	@Then("^patient navigate to the activity list page$")
	public void navigateTo_activityListPage() throws Throwable{
		Assert.assertEquals("Log in to PAWEB QA Automation",loginPage.getText() );
	}

	@Given("^patient navigate to the list$")
	public void navigateTo_listPage() throws Throwable{
		homePage.scrollToElement();
	}
	
	@And("^patient select Form Step Task on activity list page$")
	public void select_fromStepTask() throws Throwable{
		homePage.select_formStepTask();
	}
	
	@And("^patient completes Form step with values$")
	public void complete_formStep(DataTable table) throws Throwable{
		List<List<String>> rows = table.asLists(String.class);
	    
	    for (List<String> columns : rows)  {
	    	taskPage.fillTheForm(columns.get(0),columns.get(1));
		}	
		
	}
	
	@And("^patient clicks next button in step page$")
	public void click_nextBtn() throws Throwable{
		taskPage.submitTheForm();
	}
	
	@And("^patient clicks skip button in step page$")
	public void click_skipBtn() throws Throwable{
		taskPage.skip();
	}
	
	@And("^patient should see the completion step page$")
	public void verify_completeionStepPage() throws Throwable{
		//taskPage.verifyCompletion();
	}
	
	@And("^patient clicks done button in step page$")
	public void click_doneBtn() throws Throwable{
		
	}
	
	@And("^patient should see the Activity list page$")
	public void verify_activityListPage() throws Throwable{
		
	}
	
	@And("^patient should see Forms Step Task completed$")
	public void verify_formStepTask_completion() throws Throwable{
		
	}

}
