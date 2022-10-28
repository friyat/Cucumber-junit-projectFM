Feature: Etsy search functionality and verification


  Scenario: Etsy search functionality and title verification
    Given user is on etsy home page
    When user types "women bag" in the etsy search box
    And user clicks etsy search button
    Then user sees "women bag" is in the etsy




@wip
  Scenario: Etsy Search Functionality Title Verification
    Given user is on the etsy home page
    When user types "Wooden Spoon" in the search box
    And user clicks search button
    Then user sees "Wooden Spoon" is in the title