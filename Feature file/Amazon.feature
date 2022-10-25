Feature: To validate search functionality of amazon application

  Scenario: To checking the search functionality 
    Given user need to be in homepage
    When user should enter product name in search box
      | iphone |
    And user clicks search button
    Then user will navigated to products page
