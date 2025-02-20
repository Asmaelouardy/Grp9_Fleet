Feature: Vehicle Selection from Vehicle Pace

@AP
  Scenario: As a user should be able to select any
    vehicle from the Vehicles page


    Given the user is on the login page
    Then the user clicks the login button
    Then the user clicks the fleet options
    Then the user should be able to select any vehicle from the Vehicles page
    And user can check the first checkbox to select all cars
    Then user clear the checkbox to select any car
    Then user can select any car