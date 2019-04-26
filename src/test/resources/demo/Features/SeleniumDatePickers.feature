Feature: Practice DatePickers in Selenium

  Scenario: Test Date Example
    Given I am on sample page
      | bootstrap-date-picker-demo |
    When I select date on input field
    |25/04/2019|
    Then Field should have the selected date



