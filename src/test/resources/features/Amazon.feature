Feature: To test amazon.com website


  @Smoke
  Scenario: Testing Yaml config
    Given I am on the "HomePage"

  @Search-2
  Scenario Outline: Add a product into to a Cart
    Given I am on the "HomePage"
    And I search for a "<product>" in search box
    When I Click the search button
    Then I should see related or some product on the page Listed
    And I Select the first product from the result
    Examples:
      | product  |
      | macbook  |



