Feature: Account Balance Verification

@RegressionTest
Scenario: Verification of number of values displayed
Given User is on accounts page
When the page loaded
Then verify all the values are getting displayed
And values are greater than zero

@RegressionTest
Scenario: Verification total balance matches sum of all values
Given User is on accounts page
When the page loaded
Then verify sum of value matches total balance

@RegressionTest
Scenario: Verification of dollar symbol for all values
Given User is on accounts page
When the page loaded
Then verify all values are associated with dollar symbol

