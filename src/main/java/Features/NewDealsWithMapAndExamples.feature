Feature: New Deals in Free CRM for Different Accounts

Scenario Outline: Adding New deals to different accounts in free CRM

Given user is already on login page
When title of the page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks the login button
Then user is on home page
Then user moves to Deals page
Then user click the new deals
Then user enters the Title and Description and Propability
|Title|Description|Propability|
|Automation Testing CU|Testing with Automation 25|51|
|Automation Testing DU|Testing with Automation 35|20|
|Automation Testing EU|Testing with Automation 45|22|
Then user again navigate to Deals page

Examples:
|username|password|
|santhoshraj2525@gmail.com|sandyCrm|
|thouficmessi199510@gmail.com |thoufic@CRM|