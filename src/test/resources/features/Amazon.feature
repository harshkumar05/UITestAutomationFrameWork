Feature: To test amazon.com website

  Scenario Outline: Add a product into to a Cart
    Given I am on the amazon home page
    And I Search for the a <product> in the Search box
    When I Click the search button
    Then I should see related or some product on the page Listed
    And I Select the 1st product from the result
    Examples:
      | product  |
      | macbook  |


