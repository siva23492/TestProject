$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/LILT-71/git/TestProject/CucumberPOM/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user log into app",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 213170801,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.util.TestBase.initialization(TestBase.java:30)\r\n\tat com.qa.stepDefinations.HomepageSteps.user_opens_the_browser(HomepageSteps.java:17)\r\n\tat ✽.Given user opens the browser(C:/Users/LILT-71/git/TestProject/CucumberPOM/src/main/java/com/qa/features/freecrm.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomepageSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomepageSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomepageSteps.validate_homepage_title()"
});
formatter.result({
  "status": "skipped"
});
});