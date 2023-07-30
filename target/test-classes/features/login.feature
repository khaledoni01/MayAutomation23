Feature: Verify login feature

  #Bad practice
  @regression
  Scenario: Login with invalid credentials
    Given User is in login page
    When User provides invalid username "kz" and password "test"
    And User clicks on login button
    Then Verify the current url

        #Best practice
  @regression @smoke
  Scenario Outline: Login with invalid credentials with examples
    Given User is in login page
    When User provides invalid username "<uname>" and password "<pword>"
    And User clicks on login button
    Then Verify the current url

    Examples: Invalid login data
      | uname | pword |
      | kz    | test  |
      | test  | pass  |


    #Worst practice
  @regression
  Scenario: Login with valid credentials
    Given User is in login page
    When User provides valid username and password
    And User clicks on login button
    Then Verify the current url


#ctrl + alt+ l - it will format the .feature file