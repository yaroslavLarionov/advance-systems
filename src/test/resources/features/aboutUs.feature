Feature: About Us page related information and interaction
  Background:
    Given User navigates to "About Us" page

    @ADVSYS-42
  Scenario: Our team members information
    When User scrolls down to "Our team" section
    And User should see "Meet Our Experts" header
    Then User should see a picture, title and a quote of each team member

  @ADVSYS-42
  Scenario: Team members social media links
    When User scrolls down to "Our team" section

  @ADVSYS-43
  Scenario: Verify header and button under "Our Experts" section
    Then User should see "We are Recruitment Experts" header under Our Expert section
    Then Verify "Our Services" button is displayed
    And Verify "Our Services" button is clickable
    Then Verify button redirects to "services" page

