Feature: Edit car info Icons


  @wip
  Scenario: As a user, I want to see edit car info icons on the Vehicle page.
    Given the user logged in as "sales manager"
    Then Hover over the Fleet module
    Then Click on the Vehicles option from the dropdown
    And Hover the mouse over the 3 dots “...”
    Then User should see "View", "Edit", and "Delete" options
