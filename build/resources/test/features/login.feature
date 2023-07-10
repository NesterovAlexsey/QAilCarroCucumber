Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome Browser
    When User opens ilCarro HomePage
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies log in message
    And User Quites browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome Browser
    When User opens ilCarro HomePage
    And User clicks on Log in link
    And User enters valid email and wrong password
    |email  |password  |
    |<email>|<password>|
    And User clicks on Yalla button
    Then User verifies error message
    And User Quites browser
    Examples:
      | email | password |
    |nesterov.alex@gmail.com|1234567890qW |
    |nesterov.alex@gmail.com|1234567890qw!|
    |nesterov.alex@gmail.com|aaaaaaaaaaqW!|