Feature: Services (Our Divisions) page related information
  Background: 
    Given User navigates to "Services" page


  @ADVSYS-46
  Scenario Outline: Mini navigation bar buttons
    When User clicks on any button in projects section, for example "Finance" button
    And User should see "Our Divisions" header
    When User clicks on "<button>"
    Then User should be taken to the corresponding page "<button>"
    Examples:
      | button                   |
      | Finance                  |
      | Information Technology   |
      | Healthcare               |
      | Government Projects      |