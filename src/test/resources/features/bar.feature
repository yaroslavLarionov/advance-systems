Feature: Page Navigation Bar

  @FirstTest
  Scenario Outline: Verify following links is displayed
    Then Verify "<Buttons>" links are displayed
    Examples:
    |Buttons|
    |HOME|
    |ABOUT US|
    |SERVICES|
    |CLIENTS |
    |JOIN US |
    |CONTACT US|





