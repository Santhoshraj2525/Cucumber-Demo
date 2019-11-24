$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/eclipse-workspace/FreeCRMwithBDD/src/main/java/Features/Deal.feature");
formatter.feature({
  "line": 1,
  "name": "New Deals in Free CRM",
  "description": "",
  "id": "new-deals-in-free-crm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Adding New deals to my account in free CRM",
  "description": "",
  "id": "new-deals-in-free-crm;adding-new-deals-to-my-account-in-free-crm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "santhoshraj2525@gmail.com",
        "sandyCrm"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to Deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click the new deals",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters the Title and Description and Propability",
  "rows": [
    {
      "cells": [
        "Automation",
        "Testing with Automation",
        "21"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user cliks the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user again navigate to Deals page",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepsDefinitions.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 10846741695,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.title_of_the_page_is_Free_CRM()"
});
formatter.result({
  "duration": 26414092,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 420631646,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_clicks_the_login_button()"
});
formatter.result({
  "duration": 92481747,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 5186988,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_moves_to_Deals_page()"
});
formatter.result({
  "duration": 5346896788,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_click_the_new_deals()"
});
formatter.result({
  "duration": 333005369,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_enters_Title_and_Description_and_Propability(DataTable)"
});
formatter.result({
  "duration": 10827206753,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_clicks_the_Save_buttons()"
});
formatter.result({
  "duration": 156308973,
  "status": "passed"
});
formatter.match({
  "location": "DealStepsDefinitions.user_again_navigate_Deals_page()"
});
formatter.result({
  "duration": 11008192003,
  "status": "passed"
});
});