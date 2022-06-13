Feature: Application Login

# Happy Path
  Scenario: Home page default login
    Given User is on NetiBanking lading page
    When User login into appication with "Carlos" and "1234"
    Then Home page is populated
    And Cards are displayed "true"

# Negative Scenario
  Scenario: Home page default login
    Given User is on NetiBanking lading page
    When User login into appication with "Jonh" and "123"
    Then Home page is populated
    And Cards are displayed "false"