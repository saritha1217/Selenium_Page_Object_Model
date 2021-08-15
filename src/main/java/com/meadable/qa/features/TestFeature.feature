Feature: Form Step

Background:

Given patient navigate to the welcome study page
When patient click on I have an account button in welcome page
And patient should see the login page
And patient enter the email in the login page
And patient enter the password in the login page
And patient click login button in login page
Then patient navigate to the activity list page

Scenario: Form - Patient App Web - Basic

Given patient navigate to the list
And patient select Form Step Task on activity list page
And patient should see Form Step Task task ready to start
And patient completes Form step with values
	|Type                 |Value             |
	|Email Step           |a@a.com           |
	|Test Step            |Automation        |
	|Numeric Step         |21                |
	|Value Picker Step    |Option 1          |
	|Boolean Step         |True              |
	|Continuous Scale Step|5.5               |
	|Integer Scale Step   |5                 |
	|Location Step        |Cordoba, Argentina|
	|Text Scale Step      |1                 |
	|Time Interval Step   |2 2               |
	|Time of Day Step     |1 1 PM            |
And patient clicks next button in step page
And patient clicks skip button in step page
And patient should see the completion step page
And patient clicks done button in step page
Then patient should see the Activity list page
And patient should see Forms Step Task completed
