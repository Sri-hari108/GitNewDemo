
@tag
Feature: Purchase items from the E-commerce website

Background:
Given I landed on E-commerce Application

  @Regression
  Scenario Outline: Positive Test of submitting order
    Given logged in with username <name> and password <password>
    When I add product <productName> in cart
    And  Checkout <productName> and submit the order
    Then "Thankyou for the order." message is displayed at the ConfirmationPage

    Examples: 
      | name                      | password  | productName  |
      | RadhaKrishna108@gmail.com | Radha@108 | IPHONE 13 PRO |
     
