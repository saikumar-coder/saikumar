
Feature: login

  Scenario: Success
    Given user in home page
    When user enters credentials
    |username|password|
    |krish   |1234   |
    |sai     |3232   |
    And click on login button
    Then Home page is displayed 
    

    