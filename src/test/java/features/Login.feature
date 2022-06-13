Feature: Application Login
  Scenario: Home page default login
    Given User is on NetiBanking lading page
    When User login into appication with username and password
    Then Home page is populated
    And Cards are displayed