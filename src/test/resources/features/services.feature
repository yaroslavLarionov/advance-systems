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

  @ADVSYS-45
  Scenario Outline: Division button links
    Then Verify "<buttons>" are displayed
    When User clicks on "<buttons>"
    Then User should be taken to the corresponding page "<buttons>"
    Examples:
      | buttons                  |
      | Finance                  |
      | Information Technology   |
      | Healthcare               |
      | Government Projects      |

  @ADVSYS-47
  Scenario Outline: Address and phone information on divisions page
    When User clicks on "<buttons>"
    Then Verify phone and address are displayed on each page
    Examples:
      | buttons                  |
      | Finance                  |
      | Information Technology   |
      | Healthcare               |
      | Government Projects      |