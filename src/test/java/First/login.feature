
Feature: This is Login functionality test
  This scenario is for loggin in sucessfully

 
  Scenario: Sucessful Login
  Given i Enter user id in the user id field as "saikumar" 
  And   password in the password field as "chandra babu naidu" 
  When  i click login
  Then  the homepage is displayed 
  
  Scenario: Sucessful Login sequel
  Given i Enter user id in the user id field as "sowmya" 
  And   password in the password field as "jagan anna" 
  When  i click login
  Then  the homepage is displayed 
  
  
  
  
   