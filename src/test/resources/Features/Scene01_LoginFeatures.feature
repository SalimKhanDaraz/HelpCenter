Feature: Successful Login to Sauce Website
  As a customer
  I want to login to the website
  So that I can shop

  Scenario: Successful login with valid credentials
    Given I am on the Saucedemo login page
    When I enter a valid username
    And I enter a valid password
    And I click the login button
    Then I should be redirected to the homepage