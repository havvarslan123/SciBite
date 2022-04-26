@HomePageTopNavigation
Feature: Verify the list of news in Home page

  Scenario:BBC news home page
    Given the user logs in
    When the page have the title "Home - BBC News"
    And click the search box
    Then search for "Ukraine"
    And verify the first news title is "War In Ukraine"


