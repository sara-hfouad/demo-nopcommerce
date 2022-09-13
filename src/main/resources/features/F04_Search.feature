@smoke
Feature: F04_Search | user could search using product name or sku
  Scenario Outline: user could search for using product name
    When user searches for "<productname>"
    And user clicks search
    Then user find "<productname>" relative results

    Examples:
    | productname |
    | book |
    | laptop |
    | nike |


  Scenario Outline: user could search for using sku
    When user searches for "<sku>"
    And user clicks search
    And user clicks on the product
    Then user find "<sku>" in product page

    Examples:
      | sku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |

