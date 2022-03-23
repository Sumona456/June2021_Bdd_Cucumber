$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginDataFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios other login functionality validation driving the data from MySql database",
  "description": "",
  "id": "techfios-other-login-functionality-validation-driving-the-data-from-mysql-database",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DBLogin"
    }
  ]
});
formatter.before({
  "duration": 4154059200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1753439000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-other-login-functionality-validation-driving-the-data-from-mysql-database;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on Dasboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 4249604400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 282903100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 4714795300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_Dasboard_page()"
});
formatter.result({
  "duration": 490397200,
  "status": "passed"
});
formatter.after({
  "duration": 913911000,
  "status": "passed"
});
});