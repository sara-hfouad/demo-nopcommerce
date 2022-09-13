@smoke
Feature: F06_homeSliders | users click on slider
  Scenario: users could click on nokia slider
    When user click on nokia slider
    Then check nokia url

  Scenario: users could click on iphone slider
    When user click on iphone slider
    Then check iphone url
