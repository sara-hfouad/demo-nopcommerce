@smoke
Feature: F08_Wishlist | users could open followUs links
  Scenario: user gets success message when add item to wishlist
    When user adds item to wishlist
    Then success message wishlist is displayed

  Scenario: wishlist is updated when user adds item to wishlist
    When user adds item to wishlist
    Then wishlist is updated
