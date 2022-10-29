Feature: user should be able to loin with valid credentials

  Background:
    Given user is on the login page of web table app


  Scenario: Login scenario with 1 param

    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders

Scenario: Login scenario with 2 param
  When user enters username "Test" password "Tester"
  Then user should see url contains orders

  @webtableApp
  Scenario: Login scenario with data table
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders