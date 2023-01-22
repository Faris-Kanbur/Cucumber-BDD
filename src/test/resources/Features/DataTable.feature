Feature: Test the login functionality of OrangeHRM using DataTable


  Scenario: Tes t the valid login using DataTable
  
    Given User is on the LoginPage
    When User enters credentails using DataTable
    		| Admin         |     admin123        | 
    And Click on login button
    Then User should land on HomePage

