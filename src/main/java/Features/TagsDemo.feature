Feature: Tags demo with BDD with CRM eg

@SmokeTest @RegressionTest @EndtoEndTest
Scenario: Login with valid credentials
Given This is a valid scenario

@RegressionTest
Scenario: Login with invalid credentials
Given this is negative scenairo

@RegressionTest
Scenario: Navigation of Home Page
Given user should be in home page

@SmokeTest
Scenario: Validation of Home Page
Given Home page title should be FreeCRM

@RegressionTest
Scenario: Navigation of Contacts page
Given user should be able to navigate to Contacts page

@SmokeTest
Scenario: Validation of Contacts page
Given COntacts page should have contact list

@RegressionTest
Scenario: Addition of contacts
Given user able to add new contacts

@SmokeTest
Scenario: Navigation of Deals page
Given user should be able to navigate to deals page

@EndtoEndTest
Scenario: Validation of Deals page
Given Delas page should have deals list

@EndtoEndTest
Scenario: Addition of Deals
Given Santhosh should able to add the deals