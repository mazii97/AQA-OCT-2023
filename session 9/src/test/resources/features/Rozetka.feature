Feature: Search for product on Rozetka

  Scenario: Search for Iphone 15 Pro
    Given User is on the Rozetka website
    When User searches for "Iphone 15 Pro"
    Then Search results for "Iphone 15 Pro" are displayed
