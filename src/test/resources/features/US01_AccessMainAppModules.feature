Feature: Users should be able to access all main app modules

  User Story: As a user, I should be accessing all the main modules of the app.


  @sales_manager
  Scenario: Login as sales manager
    When the user clicks login as sales manager
    Then user should be able to see expected manager module_names

  @store_manager
  Scenario: Login as store manager
    When the user clicks login as store manager
    Then user should be able to see expected manager module_names

  @Driver
  Scenario: Login as Driver
    When the user clicks login in as driver
    Then user should be able to see expected driver UI Names
