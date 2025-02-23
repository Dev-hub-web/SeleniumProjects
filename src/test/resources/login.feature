Feature: Set Excel Data to the loginPage

  Scenario Outline: Successful Login
    When I am in the loginPage
    And I could register to faceBook using Excel Data
    Then the driver shutsDown