Feature: Practice forms in Selenium

  Scenario: Test single input field
    Given I am on sample website
    When I enter value on input field
    And I click on Show Message
    Then My message should be displayed

  Scenario Outline: Test multiple input field
    Given I am on sample website
    When I enter value <field1> and <field2>
    And I click on GetTotal
    Then I should be able to see the sum on screen
    Examples:
    |field1|field2|
    |   2  |  3   |