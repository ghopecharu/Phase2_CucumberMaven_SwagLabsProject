@ProductSelection
Feature: Product feature
  Description: This feature will be used to add product to the cart from SwagLab Product Page

  Background: 
    Given User has opened the SwagLabs application
    When User enters the username "standard_user"
    And User enters the password "secret_sauce"
    And User clicks on LOGIN button
    Then User should be landed on the swaglabs product Page

  Scenario Outline: Verify that user is able to add the single product to the cart
    Given User has landed on the Product page
    When User selects the product "<Product>"
    And Click on the Add To Cart button
    Then Product added successfully to the cart

    Examples: 
      | Product                 |
      | Sauce Labs Bolt T-Shirt |

  @DataTable
  Scenario: Verify that user is able to add multiple products to the cart using datatable
    Given User has landed on the Product page
    When User selects the products
      | Field    | Value                    |
      | Product1 | Sauce Labs Backpack      |
      | Product2 | Sauce Labs Bike Light    |
      | Product3 | Sauce Labs Fleece Jacket |
    And Click on the Add To Cart button
    Then Products added successfully to the cart
