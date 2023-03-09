Feature: user registration functionality

  Scenario: Register user and delete an account
    Given user is on the homepage
    When user clicks on Signup / Login button
    Then user should see "New User Signup!" message is displayed
    When user enters "User" and "myemail@email.com" and clicks Signup button
    Then user should see "ENTER ACCOUNT INFORMATION" message
    When user fills details: Title, "password", date of birth: day "7", month "August", year "1998"
    And user selects checkbox Sign up for our newsletter!
    And user select checkbox Receive special offers from our partners!
    And user fills details: "User", "Unknown", "Company", "50th St, 223314, Company", "United States", "New York", "New York", "234515", "701342632437"
    And user clicks Create Account button
    Then user should see "ACCOUNT CREATED!" message after creating account
    When user clicks Continue button
    Then user should see message contains: "Logged in as "
    When user clicks Delete Account button
    Then user should see "ACCOUNT DELETED!" message and clicks Continue button