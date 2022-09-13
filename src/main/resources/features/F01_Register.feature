@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter "automation" and "tester"
    And user enter date of birth
    And  user enter email "test3@example.com"
    And user fills Password "P@ssw0rd" "P@ssw0rd"
    And user clicks on register button
    Then  success message is displayed
