Feature: HomePage menu navigation and interaction scenarios

  Scenario: Parallax section automatic information update
    When Information is displayed to the user in the parallax section
    Then Header and description content should update automatically


  Scenario: Parallax section button interaction
    When User clicks on "Read More" button in parallax section
    Then User should see the "Services" page displayed

    @ADVSYS-2
  Scenario: Check the title of the page
    When User open the home page
    Then title should be "Advance Systems - Home"

  @ADVSYS-6
  Scenario Outline: Verify General Navigation Bar has following options
    Then Verify "<linkText>" link is displayed
    Examples:
    | linkText |
    | Get Support |
    | Job Career  |
    | Feedbacks   |

  @ADVSYS-6.1
  Scenario Outline: Verify language section User clicks on dropdown & able to see English, Spanish, French
    Then Verify "<linkText>" link is displaed
    Examples:
    | linkText |
    | English  |
    | Spanish  |
    | French   |
