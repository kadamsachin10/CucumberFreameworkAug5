
@regression
Feature: login functionality
  Background:
    Given user should be on login page



Scenario: valid login


When user enter the valid credentials and click on login button
Then user should be navigated to home page
And user can see the logout link right corner


  @invalidlogin @sanity @smoke
  Scenario Outline: Invalid login


    When user enter the Invalid credentials username as "<userid>" and password as "<password>" click on login button
    Then user can see the error message on login page
    Examples:
    |userid | password|
    |ad1    |pass1    |
    |ad2    |pass2    |
    |ad3    |pass3    |

