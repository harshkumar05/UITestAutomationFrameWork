Feature: To test amazon.com website

  @Search-2
  Scenario Outline: Add a product into to a Cart
    Given I am on the amazon home page
    And I search for a "<product>" in search box
    When I Click the search button
    Then I should see related or some product on the page Listed
    And I Select the first product from the result
    Examples:
      | product  |
      | macbook  |


  Scenario
    Given I am on the "Amazon Home" page
