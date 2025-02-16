Feature: Opportunities
  Background:
    Given User launches xamplify Application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page
  @Functional @Smoke @Regression @Test_OpportunitiesLeadsActions
  Scenario: Validate Opportunities Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Deals
    And User wants to click on the add Deal button
    And User is able to select company pipeline and stages
    And User is able to fill the add deal details
    And User is able to save deal details
    And User is able to see list view to campaign view in deals
    And User is able to click the won deals tile
    And User is able to see campaign view to list view in deals
    And User is able to click total deals tile

