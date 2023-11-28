Feature: Login Page
  This login credentials will permission you next step
  Scenario: Go to login page
    Given I navigate to the login page
    When Enter your valid username
    When Enter your valid password
    When Click on the submit button
    Then I should see login page