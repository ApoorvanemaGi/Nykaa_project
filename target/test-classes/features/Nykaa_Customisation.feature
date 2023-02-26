Feature:Customisation of product features

  Background: : User can access the home page.
    Given : User is able to access the home page.

  Scenario: Verify that the user should be able to search a product
    Given : The user navigates to the home page
    When : the user enter the product name
    Then : the products results should be displayed

@Smoke
  Scenario: Verify that the user is able to click the brands button so that he/she can search different brands inside the dropdown
    Given : The user navigates to the home page
    When : the user clicks on brands Icon
    And :User enters the brand name inside search bar
    Then : the different brands are displayed to the user

  Scenario: Verify that user is able to click on nykaa fashion
    Given : The user navigates to the home page
    When : the user clicks on nykaa fashion
    Then : the different nykaa fashion products are displayed

  Scenario: Verify that user is able to add a product to cart
    Given : The user navigates to the home page
    When : the user click on cart
    Then : User can successfully add a product to cart

  Scenario Outline:  User should be able to search two products
    Given : The user navigates to the home page
    When : the user clicks on searchbar and enters "<products>"
    Then : Products gets displayed
    Examples:
      | product |       | Results |
      | face mask |     | We've got 1339 results for face mask |
      | lipstick |      | We've got 1966 results for lipstick  |
