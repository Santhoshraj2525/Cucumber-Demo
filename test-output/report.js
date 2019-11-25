$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/eclipse-workspace/FreeCRMwithBDD/src/main/java/Features/TagsDemo.feature");
formatter.feature({
  "line": 1,
  "name": "Tags demo with BDD with CRM eg",
  "description": "",
  "id": "tags-demo-with-bdd-with-crm-eg",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "tags-demo-with-bdd-with-crm-eg;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "this is negative scenairo",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsDemoWithBDD.this_is_negative_scenairo()"
});
formatter.result({
  "duration": 296407167,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Navigation of Home Page",
  "description": "",
  "id": "tags-demo-with-bdd-with-crm-eg;navigation-of-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user should be in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsDemoWithBDD.user_should_be_in_home_page()"
});
formatter.result({
  "duration": 348160,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Navigation of Contacts page",
  "description": "",
  "id": "tags-demo-with-bdd-with-crm-eg;navigation-of-contacts-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user should be able to navigate to Contacts page",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsDemoWithBDD.user_should_be_able_to_navigate_to_Contacts_page()"
});
formatter.result({
  "duration": 136960,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Addition of contacts",
  "description": "",
  "id": "tags-demo-with-bdd-with-crm-eg;addition-of-contacts",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user able to add new contacts",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsDemoWithBDD.user_able_to_add_new_contacts()"
});
formatter.result({
  "duration": 97707,
  "status": "passed"
});
});