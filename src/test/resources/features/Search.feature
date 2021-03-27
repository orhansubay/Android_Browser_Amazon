
Feature: Search box and filter option tests


Background:
  Given user on the Amazon homepage

  Scenario: : Select product from the auto suggest dropdown list
    When user enter a "character" in the search box
    And user select first product from dropdown product list
    Then results should be displayed

  Scenario: Check the number of suggestions on the auto suggest dropdown list
    When user enter a "character" in the search box
    Then 10 suggestions should be displayed


  @NewCase
  Scenario Outline: Search by product name anf filter by price range
    When user search by "<product name>"
    And filter by <min price> and <max price> values
    Then price of products listed should be between the filter range
    Examples:
      | product name | min price | max price |
      | Apple MacBook Pro (16-Inch, 16GB RAM, 512GB Storage) - Space Gray | 2000 | 3000 |
