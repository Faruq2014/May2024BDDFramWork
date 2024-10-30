Feature: Login feature

  @Smoke
  Scenario: As a user I want to develop a login feature so that
    only valid user can log in

    Given I open facebook
    When I enter userName
    And I enter password
    Then I logged in on Facebook
    But I can not validate Facebook title
    And I close the facebook
