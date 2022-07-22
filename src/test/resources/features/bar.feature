Feature: Page Navigation Bar

  @ADVSYS-22
  Scenario Outline: Verify following links is displayed
    Then Verify "<Button>" links are displayed
    Examples:
    |Button|
    |HOME|
    |ABOUT US|
    |SERVICES|
    |CLIENTS |
    |JOIN US |
    |CONTACT US|





