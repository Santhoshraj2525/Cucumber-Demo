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
|Title|Description|Propability|
|Automation 5|Testing with Automation 25|51|
|Automation 3|Testing with Automation 3|20|
|Automation 4|Testing with Automation 4|22|
Then user again navigate to Deals page