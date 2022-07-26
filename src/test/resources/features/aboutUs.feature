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


  @ADVSYS-44
  Scenario Outline: Why choose us information
    When User scrolls down to "WE ARE BEST" header
    Then Verify "<sections>" and "<text>" are displayed in that area
    Examples:
      | sections        | text |
      | Evaluate Resume | 0    |
      | Interview       | 1    |
      | Screening       | 2    |
      | Process Done    | 3    |


  @ADVSYS-43
  Scenario: Verify header and button under "Our Experts" section
    Then User should see "We are Recruitment Experts" header under Our Expert section
    Then Verify "Our Services" button is displayed
    And Verify "Our Services" button is clickable
    Then Verify button redirects to "services" page


  @ADVSYS-41
  Scenario Outline: Why Us section information
    When User scrolls down to "Why Choose Us"
    Then Verify "<sub-section>" and "<text>" are displayed
    Examples:
      | sub-section        | text |
      | On Time Services   |  0   |
      | Experienced Team   |  1   |
      | Good Track Records |  2   |


  @ADVSYS-40
  Scenario: Main header, name, and title should be displayed
    Then Verify "Welcome to Advance Systems LLC." header is displayed
    Then Verify name "Kuba Z" is displayed
    Then Verify title "CEO & Founder" is displayed

