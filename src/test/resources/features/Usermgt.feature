Feature: User-Mgt page tests

@ADVSYS-12
Scenario: Main header is displayed
 When user should scroll to Welcome page
 When Verify Main header is displayed
 Then Print Header

 Scenario: header is visible
  When Header is displyed to the user
  Then Header should print

