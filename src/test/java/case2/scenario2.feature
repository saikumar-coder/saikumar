Feature: Login in the test me app
 
  Scenario Outline: Title of your scenario outline
    Given username in the username field as "<username>" 
    And   passwor in the password field as "<password>" 
    Then I click login
    Then home page is displayed

    Examples: 
      | username  | password   |
      |lalitha    |password123 |
     
      