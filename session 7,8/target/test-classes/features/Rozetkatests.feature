Feature: Search for iPhone 15 Pro on Rozetka

  Scenario: User searches for iPhone 15 Pro
    Given the user is on the main page
    When the user searches for "IPhone 15 Pro"
    Then the search results are displayed
    And the user sees the details of the first iPhone 15 Pro product
