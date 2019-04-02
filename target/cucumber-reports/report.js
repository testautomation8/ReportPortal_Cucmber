$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:demo/Features/SeleniumForms.feature");
formatter.feature({
  "name": "Practice forms in Selenium",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test single input field",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on sample website",
  "keyword": "Given "
});
formatter.match({
  "location": "SeleniumForms.i_am_on_sample_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter value on input field",
  "keyword": "When "
});
formatter.match({
  "location": "SeleniumForms.i_enter_value_on_input_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Show Message",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumForms.i_click_on_Show_Message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "My message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumForms.my_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test multiple input field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on sample website",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter value \u003cfield1\u003e and \u003cfield2\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on GetTotal",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to see the sum on screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "field1",
        "field2"
      ]
    },
    {
      "cells": [
        "2",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test multiple input field",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on sample website",
  "keyword": "Given "
});
formatter.match({
  "location": "SeleniumForms.i_am_on_sample_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter value 2 and 3",
  "keyword": "When "
});
formatter.match({
  "location": "SeleniumForms.i_enter_value_on_field_and_field(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on GetTotal",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumForms.i_click_on_GetTotal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see the sum on screen",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumForms.i_should_be_able_to_see_the_sum_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});