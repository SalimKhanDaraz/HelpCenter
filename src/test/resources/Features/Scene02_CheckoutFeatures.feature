Feature: Checkout Process
  As a customer
  I want to purchase items
  So that I can complete the checkout process successfully

  Scenario: Adding item to the cart and checking out
    Given I am on the Sauce website
    When I add a product to my cart
    And I go to the cart page
    And I click the checkout button
    And I enter my information
    And I click on the continue button
    And I click on the finish button
    Then a success message should be displayed