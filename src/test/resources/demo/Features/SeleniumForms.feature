Feature: Practice forms in Selenium

  Scenario: Test single input field
    Given I am on sample page
      |basic-first-form-demo|
    When I enter value on input field
    And I click on Show Message
    Then Message should be displayed
      |display|This is test for single field|

  Scenario Outline: Test multiple input field
    Given I am on sample page
      |basic-first-form-demo|
    When I enter value <field1> and <field2>
    And I click on GetTotal
    Then I should be able to see the sum on screen
    Examples:
    |field1|field2|
    |   2  |  3   |

  Scenario: Test Single Checkbox
    Given I am on sample page
      |basic-checkbox-demo|
    When I click on CheckBox
    Then Message should be displayed
      |txtAge|Success - Check box is checked|