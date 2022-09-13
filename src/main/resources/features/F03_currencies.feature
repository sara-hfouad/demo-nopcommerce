@smoke
Feature: F03_currencies | users could change currency
  Scenario: users could change currency
    Given user change currency to Euro
    Then check all currencies changed to Euro