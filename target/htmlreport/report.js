$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/sample24.feature");
formatter.feature({
  "name": "signup",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test signup with different sets of ip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens Signup page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter fn as \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters ln as \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters dob as \"\u003cdob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters pd as \"\u003cpd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters cpd as \"\u003ccpd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Signup button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify signup success message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "dob",
        "pd",
        "cpd"
      ]
    },
    {
      "cells": [
        "murali",
        "dharan",
        "22-11-1997",
        "asdf",
        "asdf"
      ]
    },
    {
      "cells": [
        "muralid",
        "haran",
        "22-11-1997",
        "asdf",
        "asdf"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test signup with different sets of ip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens Signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "Signup.user_opens_Signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter fn as \"murali\"",
  "keyword": "When "
});
formatter.match({
  "location": "Signup.user_enter_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters ln as \"dharan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters dob as \"22-11-1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters pd as \"asdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_pd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters cpd as \"asdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_cpd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Signup.click_Signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify signup success message",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.verify_signup_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test signup with different sets of ip",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens Signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "Signup.user_opens_Signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter fn as \"muralid\"",
  "keyword": "When "
});
formatter.match({
  "location": "Signup.user_enter_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters ln as \"haran\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters dob as \"22-11-1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters pd as \"asdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_pd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters cpd as \"asdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.user_enters_cpd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Signup.click_Signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify signup success message",
  "keyword": "And "
});
formatter.match({
  "location": "Signup.verify_signup_success_message()"
});
formatter.result({
  "status": "passed"
});
});