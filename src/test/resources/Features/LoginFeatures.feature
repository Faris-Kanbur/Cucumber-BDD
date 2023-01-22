Feature: Test the login functionality of OrangeHRM


  Scenario Outline: Tes t the valid login
  
    Given User is on the LoginPage
    When User enters <username> and <password>
    And Click on login button
    Then User should land on HomePage

       Examples: 
      | username 	  	|     password		    |
      | Admin         |     admin123        | 
  