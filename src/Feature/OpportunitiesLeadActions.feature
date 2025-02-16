Feature: Opportunities
  Background:
    Given User launches xamplify Application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page
  @Functional @Smoke @Regression @Test_OpportunitiesLeadsActions
  Scenario: Validate Opportunities Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Leads
    And User is able to click view lead icon
    And User is able to click edit lead icon
    And User is able to click comment lead icon
    And User is able to click delete lead icon
    And User is able to click next last first and previous page lead icon
    And User is able to click page drop down
    And User is able to click lead to deal register button
