Feature: FreeCRM Test with hookdemo

Scenario: Create Contacts
Given user is on contacts page
When user enteed details and click the save button
Then contacts should be created

Scenario: create Deals
Given user is on Deals page
When entered deals details and click the save button
Then deals should be created

Scenario Outline: Email validation
Given user is on mail page
When user enter credentials
Then mail is logged in
Examples:
|Hello|
|Hellllo|
|Theig|