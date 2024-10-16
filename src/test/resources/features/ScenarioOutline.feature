Feature: Login with scenario outline

  Scenario Outline: As a tester I want build a login test with
    multiple data so that I can test multiple scenarios

    Given I open facebook url with chrome <url>
    When I enter user name for the <userName> in facebook
    And I enter the password <password> for facebook
    Then I click on login button

    Examples: 
      | url                         | userName          | password    |
      | "https://www.facebook.com/" | "hg@bmail.com"    | "success"   |
      | "https://www.facebook.com/" | "gfhgj@bmail.com" | "success1"  |
      | "https://www.facebook.com/" | "bnj@bmail.com"   | "success23" |
      
      
