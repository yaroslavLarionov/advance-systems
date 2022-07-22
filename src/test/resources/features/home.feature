
Feature: HomePage menu navigation and interaction scenarios


  Scenario: address is displayed on the page
    When  Verify user can see address
    Then  address should print

  @ADVSYS-11
  Scenario: Parallax section automatic information update
    When Information is displayed to the user in the parallax section
    Then Header and description content should update automatically

  @ADVSYS-11
  Scenario: Parallax section button interaction
    When User clicks on "Read More" button in parallax section
    Then User should see the "Services" page displayed

    @ADVSYS-14
  Scenario: Testimonials section information
    When User scrolls down page to testimonials section
    Then This section should have a header "Words from our Clients"
    And Testimonials information should be displayed with the message, person's name and the state
      | John Smith       |
      | Mark Cameron     |
      | Jenifer Addison  |



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

  @ADVSYS-13
  Scenario Outline: Verify there are 5 items displayed with headers and descriptions What to Expect section
    Then Verify "<items>" are displayed
    Examples:
      | items |
      | Leadership Development|
      | Capability Building  |
      | Reward & Benefits |
      | Employee & Industrial   |
      | Delivering Excellent  |
