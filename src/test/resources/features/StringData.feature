Feature: Login feature with string data

  @Smoke
  Scenario: As a testesr I want to develop a login test
    with string data so that I can login easily

    Given I open chrome with url "https://www.facebook.com/"
    When I enter userName "kll@dmail.com" on facebook
    And I enter password "kjkkllklk" on facebook
    Then I validate the title "Facebook - log in or sign up" of the page
    And I colose the application

  @Regression
  Scenario: As a testesr I want to develop a invalid login test
    with string data so that I can login easily

    Given I open chrome with url "https://www.facebook.com/"
    When I enter userName "jbm@dmail.com" on facebook
    And I enter password "uiouio" on facebook
    Then I validate the title "Facebook - log in or sign up" of the page
    And I colose the application
