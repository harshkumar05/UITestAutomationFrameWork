Feature: To test amazon.com website

  @tag-1
  Scenario Outline: Add a product into to a Cart
    Given I am on the amazon home page
    And I search for a "<product>" in search box
    When I Click the search button
    Then I should see related or some product on the page Listed
    And I Select the 1 st product from the result
    Examples:
      | product  |
      | macbook  |


