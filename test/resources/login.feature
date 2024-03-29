Feature: Login Functionality

  Scenario: User login with valid credentials
    Given User is on the login page
    When User enters valid username "username" and password "password"
    Then User clicks the login button
