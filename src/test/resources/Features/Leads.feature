Feature: leads functionality
  Background:
    Given user should be on login page


  @leads
  Scenario: create lead


    When user enter the valid credentials and click on login button
    Then user should be navigated to home page
    When user enter the mandatories fields and click on save button
      |lastname|company|
      |madhura  |cgate|
      |rupa     |google|
      |pratiksha|atos  |
    Then lead should be created successfully
