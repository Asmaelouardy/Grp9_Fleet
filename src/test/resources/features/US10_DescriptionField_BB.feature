
Feature: Description field on Create Calendar Events page.
Agile Story:As a user,I want to type into the Description field when I create a calendar event.
  Background:
    Given the user is on the login page
    Given the user logged in as "sales manager"
  @testBB
  Scenario:User Can Type Messages in the Description Field
    Given user is on the Creat Calendar page BB
    When user clicks on the Description field BB
    When user types a message in the Description BB
    Then the typed message should be displayed BB
