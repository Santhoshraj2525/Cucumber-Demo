Feature: New Contacts Free CRM

Scenario Outline: Adding New contacts to my account in free CRM

Given user is already on login page
When title of the page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks the login button
Then user is on home page
Then user moves to Contacts page
Then user click the new contacts
Then user enters the "<firstname>" and "<lastname>" and "<email>" and "<description>"
Then user cliks the Save button

Examples:

|username|password|firstname|lastname|email|description|
|santhoshraj2525@gmail.com |sandyCrm|cucucu|ber|cucumb@yahoo.com|testing with cucumber 1|
|thouficmessi199510@gmail.com |thoufic@CRM|dududu|ber|dudumb@yahoo.com|testing with cucumber 2|