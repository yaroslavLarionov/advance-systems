Feature: About Us page related information and interaction
  Background:
    Given User navigates to "About Us" page

    @ADVSYS-42
  Scenario: Our team members information
    When User scrolls down to "Our team" section
    And User should see "Meet Our Experts" header
    Then User should see a picture, title and a quote of each team member

  @ADVSYS-42
  Scenario Outline: Team members social media links
    When User scrolls down to "Meet Our Experts" section
    And User clicks on social media "<button>"
    Then Verify "<button>" takes user to the corresponding page
    Examples:
      | button   |
      | facebook  |
      | twitter   |
      | skype     |
      | linkedin  |

  @ADVSYS-41
  Scenario Outline: Why Us section information
    When User scrolls down to "Why Choose Us"
    Then Verify "<sub-section>" and "<text>" are displayed
    Examples:
      | sub-section        | text |
      | On Time Services   |  0   |
      | Experienced Team   |  1   |
      | Good Track Records |  2   |
