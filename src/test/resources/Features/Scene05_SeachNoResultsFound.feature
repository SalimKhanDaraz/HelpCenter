Feature: Search No Results Found Check

  Scenario: Invalid Keyword Search
    When I enter invalid keword in the Searchbox
    Then I should see the No Results Found Message