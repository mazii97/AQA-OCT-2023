Feature: Searching for a product on Rozetka website

  Scenario: User searches for iPhone 15 Pro
    Given User is on the Rozetka website
    When User searches for "iPhone 15 Pro"
    Then Search results for "iPhone 15 Pro" are displayed