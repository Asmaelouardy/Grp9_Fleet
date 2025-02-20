Feature: Description field on Create Calendar Events page.
Agile Story:As a user,I want to type into the Description field when I create a calendar event.
@wip
  Scenario:User Can Type Messages in the Description Field
    Given user is on the Create Calendar Events page
    When user clicks on the Description field
    When user types a message in the Description
    Then the typed message should be displayed
