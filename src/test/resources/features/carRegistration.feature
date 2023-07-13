Feature: Registration users car

  @validCarRegistration
  Scenario: Registration car with valid data
    Given User launches Chrome Browser
    When User opens ilCarro HomePage
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies log in message
    And User click on Ok button in logged in page
    And User click on Let the car work header button
#    And User enters valid data in car registration form
#    And User click submit in registration form
#    Then User verifies car added message
    And User Quites browser
