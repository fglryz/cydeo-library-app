Feature: Login with parameters


  @librarianParam
  Scenario: Login as librarian 49
    Given User is on the login page
    When user enters  username "librarian49@library"
    And user enters librarian password "8l9bsLAN"
    And click the sign in button
    And there should be 144 users
    Then user should see the dashboard

  @studentParam
  Scenario: Login as student 30
    When user enters  username "student30@library"
    And user enters student password 'QX6FWzj6'
    And click the sign in button
    Then user should see the books

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian49@library" and "8l9bsLAN"
    Then dashboard should be displayed

