
@tag
Feature: Error Validation
  I want to use this template for my feature file

  @ErrorValiadation
  Scenario Outline: Title of your scenario outline
   Given I landed on E-commerce Application
    When logged in with username <name> and password <password>
    Then "Incorrect email or password." error messaged displayed

    Examples: 
       | name                      | password  |
       | RadhaKrishna108@gmail.com | Radha@10 | 
