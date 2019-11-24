Feature: Free CRM Login Scenario


#
#Scenario: Free CRM Login Test Scenarios
#Given user is already on login page
#When title of the page is Free CRM
#Then user enters "santhoshraj2525@gmail.com" and "sandyCrm"
#Then user clicks the login button
#Then user is on home pages

Scenario Outline: Free CRM Login Test Scenarios
Given user is already on login page
When title of the page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks the login button
Then user is on home page

Examples:
|username  				   |password|
|santhoshraj2525@gmail.com |sandyCrm|
|thoufic@gmail.com         |thofic  |