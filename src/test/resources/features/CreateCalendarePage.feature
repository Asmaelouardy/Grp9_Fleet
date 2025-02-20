Feature: Create Calendar Page
  Agile Story: User should be able to go to Create Calendar Page directly
Background:
  Given the user is on the login page
  Given the user logged in as "sales manager"

  @wip1
  Scenario: : User is on the home page as any of following: Driver,Store Manager and Sales Manager.
    When the user clicks on Activities module
  And user selects Calendar Events dropdown
    Then user clicks on Create Calendar Events and lands on Calendar Event page