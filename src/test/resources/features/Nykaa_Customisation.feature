Feature:Customisation of product features

  Background: : User can access the home page.
    Given : User is able to access the home page.

  Scenario: Verify that the user should be able to search a product
    Given : The user navigates to the home page
    When : the user enter the product name
    Then : the products results should be displayed

@Smoke
  Scenario: Verify that the user should be able to search a product
    Given : The user navigates to the home page
    When : the user enter the product name
    Then : the products results should be displayed

  Scenario: Verify that the user should be able to search a product
    Given : The user navigates to the home page
    When : the user enter the product name
    Then : the products results should be displayed

  Scenario: Verify that the user should be able to search a product
    Given : The user navigates to the home page
    When : the user enter the product name
    Then : the products results should be displayed

  Scenario Outline:  User should be able to search two products
    Given : The user navigates to the home page
    When : the user clicks on searchbar and enters "<products>"
    Then : Products gets displayed
    Examples:
      | product |       | Results |
      | face mask |     | We've got 1339 results for face mask |
      | lipstick |      | We've got 1966 results for lipstick  |
