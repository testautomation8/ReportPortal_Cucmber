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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"user-message\"}\n  (Session info: chrome\u003d70.0.3538.67)\n  (Driver info: chromedriver\u003d70.0.3538.67 (9ab0cfab84ded083718d3a4ff830726efd38869f),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LTIBUK05115\u0027, ip: \u0027172.21.208.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 70.0.3538.67 (9ab0cfab84ded..., userDataDir: C:\\Users\\168681\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:60998}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.67, webStorageEnabled: true}\nSession ID: 6953671060800e4acb30d082fa427c96\n*** Element info: {Using\u003did, value\u003duser-message}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat demo.stepDefinitions.SeleniumForms.i_enter_value_on_input_field(SeleniumForms.java:38)\r\n\tat ✽.I enter value on input field(classpath:demo/Features/SeleniumForms.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on Show Message",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumForms.i_click_on_Show_Message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "My message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumForms.my_message_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"sum1\"}\n  (Session info: chrome\u003d70.0.3538.67)\n  (Driver info: chromedriver\u003d70.0.3538.67 (9ab0cfab84ded083718d3a4ff830726efd38869f),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LTIBUK05115\u0027, ip: \u0027172.21.208.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 70.0.3538.67 (9ab0cfab84ded..., userDataDir: C:\\Users\\168681\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61078}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.67, webStorageEnabled: true}\nSession ID: d56f9b60a4dacf9cc702db11a9dbfa66\n*** Element info: {Using\u003did, value\u003dsum1}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat demo.stepDefinitions.SeleniumForms.i_enter_value_on_field_and_field(SeleniumForms.java:58)\r\n\tat ✽.I enter value 2 and 3(classpath:demo/Features/SeleniumForms.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click on GetTotal",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumForms.i_click_on_GetTotal()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be able to see the sum on screen",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumForms.i_should_be_able_to_see_the_sum_on_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});