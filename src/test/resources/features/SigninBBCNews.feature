Feature: Users should be able to Sign in BBC News Account

  @Signin
  Scenario:Sign in with username and password
    Given the user in on BBC news home page
    When the user enters username and password
    Then "Home - BBC News" is displayed
