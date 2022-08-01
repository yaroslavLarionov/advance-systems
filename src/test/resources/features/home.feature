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


  @ADVSYS-6 @smoke
  Scenario Outline: Verify General Navigation Bar has following options
    Then Verify "<linkText>" link is displayed
    Examples:
    | linkText    |
    | Get Support |
    | Job Career  |
    | Feedback    |


  @ADVSYS-6 @smoke
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
      | Capability Building   |
      | Reward & Benefits     |
      | Employee & Industrial |
      | Delivering Excellent  |



  @ADVSYS-21
  Scenario: Copyright update
    When User navigates to footer section
    Then Verify title with "Copyright © 2022 Advance Systems LLC. All Rights Reserved." text is displayed


  @ADVSYS-19
  Scenario: Newsletter section information
    When User scrolls down to "Newsletter"
    Then Verify email box with placeholder "Email Address..." is displayed


  @ADVSYS-22 @smoke
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


  @ADVSYS-22 @smoke
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
  Scenario: User should see social media buttons in the bottom of the page and they should take the user to the right page
    When User scrolls down to "Newsletter"
    Then Verify button is displayed
      | facebook  |
      | twitter   |
      | skype     |
      | linkedin  |
    And User should see corresponding page displayed after clicking that button
      | facebook  |
      | twitter   |
      | skype     |
      | linkedin  |


  @ADVSYS-15
  Scenario Outline: User should see company names displayed above footer
    Then Verify company "<names>" are displayed
    Examples:
      | names      |
      | company-1  |
      | company-2  |
      | company-3  |
      | company-4  |
      | company-5  |
      | company-6  |

  @ADVSYS-8
  Scenario: User should be able to interact with "Join US" button
    When User is browsing in the main navigation bar
    And User clicks on "Join Now" button
    Then User should see the "Join Us" page displayed


  @ADVSYS-20
  Scenario: User should see button in the bottom right corner and button should scroll the window to top content once clicked
    When User navigates to copyright section
    Then Verify scroll up button is displayed
    And User clicks on scroll up button
    Then Verify window is scrolled up to show top content


  @ADVSYS-10
  Scenario Outline: User should see social media buttons in the main menu and be redirected to corresponding page
    Given User verifies "<socialMedia>" buttons are displayed in main menu
    When User clicks "<socialMedia>" button
    Then Verify "<socialMedia>" button redirects to corresponding page
    Examples:
      | socialMedia |
      | facebook    |
      | twitter     |
      | google      |
      | linkedin    |

  @ADVSYS-16
  Scenario Outline: User should see contact info in the footer
    When User scrolls down to footer
    Then  Verify following "<text>" and "<num>" is displayed
    Examples:
      | text                                    |  num|
      | Address: 10090 Main St, Fairfax, VA 	| 1	  |
      | Phone: +1 703-831-3217           		| 2	  |
      | Email: info@advancesystems.us 	        | 3	  |
      | Mon to Sat: 9.00 am to 5:00 pm		    | 4	  |


  @ADVSYS-17
  Scenario Outline: user should be able to open quick links in footer
    When User scrolls down to footer
    And User clicks on "<links>" button of that page
    Then Verify "<links>" take user to the corresponding page
    Examples:
      | links           |
      | Home            |
      | About Us        |
      | Services        |
      | Clients         |
      | Join Us         |
      | Contact Us      |

