Feature: Login
  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    And I click the login button
    And I should be redirected to the Products Page
    And I click on the checkout button
    And I provide checkout with data
    And I click on the continue & Finish button
  Then I should see the message "THANK YOU FOR YOUR ORDER"
