Feature: HomePage menu navigation and interaction scenarios

  @ADVSYS-7
  Scenario: Main navigation bar information blocks
    When User is browsing in the main navigation bar
    Then  Verify address is displayed
    And Verify phone is displayed


    @ADVSYS-12
  Scenario: Main header section information
    When User navigates to main header section
    Then Verify header with "Welcome to Advance Systems LLC." text is displayed
    And Verify header with "Our Mission is simple, deliver very honest recruitment services to every customer." text is displayed
    And The description text under headers should be displayed as well


  @ADVSYS-11
  Scenario: Parallax section automatic information update
    When Information is displayed to the user in the parallax section
    Then Header and description content should update automatically


  @ADVSYS-11
  Scenario: Parallax section button interaction
    When User clicks on "Read More" button
    Then User should see the "Services" page displayed


    @ADVSYS-14
  Scenario: Testimonials section information
    When User scrolls down page to testimonials section
    Then This section should have a header "Words from our Clients"
    And Testimonials information should be displayed with the message, person's name and the state
      | John Smith       |
      | Mark Cameron     |
      | Jenifer Addison  |


  @ADVSYS-5
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


  @ADVSYS-6
  Scenario Outline: Verify language section User clicks on dropdown & able to see English, Spanish, French
    When User clicks on "English" button
    Then Verify "<linkText>" link is displayed
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



  @ADVYSY-21
  Scenario: Copyright update
    When User navigates to footer section
    Then Verify title with "Copyright © 2022 Advance Systems LLC. All Rights Reserved." text is displayed


  @ADVSYS-19
  Scenario: Newsletter section information
    When User scrolls down to "Newsletter"
    Then Verify email box with placeholder "Email Address..." is displayed


  @ADVSYS-22
  Scenario: Verify secondary navigation bar buttons
    Given Secondary navigation bar is visible to the user
    When User scrolls down page to testimonials section
    Then Navigation bar should remain visible
    And Verify navigation buttons are displayed
      | Home       |
      | About Us   |
      | Services   |
      | Clients    |
      | Solutions  |
      | Join Us    |
      | Contact Us |


  @ADVSYS-22
  Scenario Outline: Verify secondary navigation take user to the expected page
    Then Verify navigation "<buttons>" takes user to the corresponding page
    Examples:
      | buttons    |
      | Home       |
      | About Us   |
      | Services   |
      | Clients    |
      | Solutions  |
      | Join Us    |
      | Contact Us |


    @ADVSYS-18
  Scenario Outline: User should see social media buttons in the bottom of the page
    When User scrolls down to "Newsletter"
    Then Verify button "<button>" is displayed
    Examples:
      | button    |
      | facebook  |
      | twitter   |
      | skype     |
      | linkedin  |


  @ADVSYS-8
  Scenario: User should be able to interact with "Join US" button
    When User clicks on "Join Now" button
    Then User should see the "Join Us" page displayed