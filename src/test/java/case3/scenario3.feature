
Feature: checking of the search bar

  Scenario Outline: Title of your scenario outline
    Given proper url in the field
    When userid in the username field as "<username>" 
    And passcode in the password field as "<password>" 
    Then click the login button
    And you type "<something>" in the search bar
    Then the product is displayed

    Examples: 
      | username  | password     | something  |
      | lalitha   |  password123 | head       |
     