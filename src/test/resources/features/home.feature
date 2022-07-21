Feature: HomePage menu navigation and interaction scenarios

  Scenario: Parallax section automatic information update
    When Information is displayed to the user in the parallax section
    Then Header and description content should update automatically


  Scenario: Parallax section button interaction
    When User clicks on "Read More" button in parallax section
    Then User should see the "Services" page displayed


  Scenario Outline: Verify Social Media buttons are displayed
    Then Verify "<linkText>" link is displayed
    Examples:
      | linkText    |
      | facebook   |
      | twitter |
      | google    |
      | linkedin  |

#  Scenario Outline: Verify Social Media buttons take users to corresponding page
#    When User clicks on:
#      | linkText    |
#      | facebook   |
#      | twitter |
#      | google    |
#      | linkedin  |
#    Then Verify "<linkText>" link is displayed
#    Examples:
#      | linkText    |
#      | facebook   |
#      | twitter |
#      | google    |
#      | linkedin  |