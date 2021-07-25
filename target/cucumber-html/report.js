$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Description: This feature will be used to login to SwagLabs Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify that when user enters correct user name and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PositiveLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User has opened the SwagLabs application",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the username \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on LOGIN button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be landed on the swaglabs product Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that when user enters correct user name and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@PositiveLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has opened the SwagLabs application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_has_opened_the_swaglabs_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_username_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_password_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on LOGIN button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed on the swaglabs product Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_be_landed_on_the_swaglabs_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify that when user enters incorrect user name and password they should see the error message on login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User has opened the SwagLabs application",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the username \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on LOGIN button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the error message \"\u003cError\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Error"
      ]
    },
    {
      "cells": [
        "charu@xyz.com",
        "abc123",
        "Epic sadface: Username and password do not match any user in this service"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that when user enters incorrect user name and password they should see the error message on login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has opened the SwagLabs application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_has_opened_the_swaglabs_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username \"charu@xyz.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_username_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password \"abc123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_the_password_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on LOGIN button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the error message \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_see_the_error_message_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});