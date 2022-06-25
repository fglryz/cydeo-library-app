Feature: Login app login  feature
  As a user,I shouls be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given user on the login page
  @librarian
  Scenario: Login as a librarian

    When user enters librarian username
    And user enters librarian password
    Then  user  should see dashboard

    @student
    Scenario: Login as a student

      When user enters student username
      And user enters student password
      Then user  should see the dashboard
