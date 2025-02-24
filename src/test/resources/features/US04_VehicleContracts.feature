@VehicleContracts
Feature:  Users should access to Vehicle Contracts page.
  User Story:
  As a user,I want to access to Vehicle Contracts page.

  Background: User is already in the log in page
    Given the user is on the login page

  @sales_manager
  Scenario: Login as sales manager
    Given the user logged in as "sales manager"
    When user should be able to see fleet module_AE
    Then user clicks on Fleet modules and lands on Vehicle Contracts page
    Then User sees "All - Vehicle Contract - Entities - System - Car - Entities - System" in the Vehicle Contracts title_AE
    And Then User sees "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract" in the Vehicle Contracts url_AE

  @store_manager
  Scenario: Login as store manager
    Given the user logged in as "store manager"
    When user should be able to see fleet module_AE
    Then user clicks on Fleet modules and lands on Vehicle Contracts page
    Then User sees "All - Vehicle Contract - Entities - System - Car - Entities - System" in the Vehicle Contracts title_AE
    And Then User sees "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract" in the Vehicle Contracts url_AE


  @Driver
  Scenario: Login as Driver
    Given the user logged in as "driver"
    When user should be able to see fleet module_AE
    Then user clicks on Fleet modules and lands on Vehicle Contracts page
    Then user should NOT access the Vehicle Contracts page
    And  user should see "You do not have permission to perform this action."

