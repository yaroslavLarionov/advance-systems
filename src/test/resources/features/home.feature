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

  @ADVSYS-6
  Scenario Outline: Verify language section User clicks on dropdown & able to see English, Spanish, French
    Then Verify "<linkText>" link is displaed
    Examples:
    | linkText |
    | English  |
    | Spanish  |
    | French   |

  @ADVSYS-6A
  Scenario Outline: Verify General Navigation Bar has following options
    When user clicks on "<link>" button
    And User switches to the next window
    Then Verify "<linkText>" link is displayed
    Examples:
    | link     |  linkText    |
    |About Us  | Get Support |
    |About Us   | Job Career  |
    |About Us  | Feedbacks   |
    |Services  | Get Support |
    |Services    | Job Career  |
    |Services   | Feedbacks   |
    |Clients  | Get Support |
    |Clients    | Job Career  |
    |Clients   | Feedbacks   |
    |Solutions  | Get Support |
    |Solutions    | Job Career  |
    |Solutions   | Feedbacks   |
    |Join Us  | Get Support |
    |Join Us     | Job Career  |
    |Join Us    | Feedbacks   |
    |Contact Us  | Get Support |
    |Contact Us     | Job Career  |
    |Contact Us    | Feedbacks   |

    @ADVSYS-6B
  Scenario Outline: Verify language section User clicks on dropdown & able to see English, Spanish, French
    When user clicks on "<link>" button
    And User switches to the next window
    Then Verify "<linkText>" link is displayed
    Examples:
      | link     | linkText |
      |About Us  | English |
      |About Us  | Spanish  |
      |About Us  | French   |
      |Services  | English |
      |Services    | Spanish  |
      |Services   | French   |
      |Clients  | English |
      |Clients    | Spanish  |
      |Clients   | French   |
      |Solutions  | English |
      |Solutions    | Spanish  |
      |Solutions   | Feedbacks   |
      |Join Us  | French |
      |Join Us     | Spanish  |
      |Join Us    | French |
      |Contact Us  | English |
      |Contact Us     | Spanish  |
      |Contact Us    | French   |

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
