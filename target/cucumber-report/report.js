$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Verify login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with invalid credentials with examples",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User provides invalid username \"\u003cuname\u003e\" and password \"\u003cpword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the current url",
  "keyword": "Then "
});
formatter.examples({
  "name": "Invalid login data",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname",
        "pword"
      ]
    },
    {
      "cells": [
        "kz",
        "test"
      ]
    },
    {
      "cells": [
        "test",
        "pass"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid credentials with examples",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userIsInLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides invalid username \"kz\" and password \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userProvidesInvalidUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the current url",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyTheCurrentUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid credentials with examples",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userIsInLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides invalid username \"test\" and password \"pass\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userProvidesInvalidUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the current url",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyTheCurrentUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});