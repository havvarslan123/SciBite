Feature:UK news page
@UkNews
  Scenario:UK news page
    Given the user logs in
    When the page have the title "Home - BBC News"
    And the user navigate to UK news button
    And click the Scotland news
    And click the Glasgow & West news
    Then Glasgow weather is displayed

