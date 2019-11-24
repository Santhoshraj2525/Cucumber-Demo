Feature: New Deals in Free CRM

Scenario: Adding New deals to my account in free CRM

Given user is already on login page
When title of the page is Free CRM
Then user enters username and password
|santhoshraj2525@gmail.com|sandyCrm|
Then user clicks the login button
Then user is on home page
Then user moves to Deals page
Then user click the new deals
Then user enters the Title and Description and Propability
|Automation|Testing with Automation|21|
Then user cliks the Save button
Then user again navigate to Deals page