Feature: feature to test login functionality

@smoketest
  Scenario: Check login is sucessfully with valid login details
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigate to home page
