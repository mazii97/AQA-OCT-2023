Feature: my web tests

  @severity=critical
  Scenario: my google page test
    Given I load google page
    When I search for "Ben Affleck"
    Then I can see "Ben Affleck" in search results

  @severity=blocker
  Scenario: my google page test 2
    Given I load google page
    When I search for "Margot Robbie"
    Then I can see "Margot Robbie" in search results