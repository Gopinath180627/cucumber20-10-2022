Feature: To validate login functionality of fb application

  Scenario: To validate login with invalid username and invalid password
    Given user need to be in login page
    When user should enter invalid username and invalid password
    And user should click login button
    Then user will navigated to invalid  credential page
