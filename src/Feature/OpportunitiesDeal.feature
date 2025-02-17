Feature: Opportunities
  Background:
    Given User launches xamplify Application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page
  @Functional @Smoke @Regression @Test_OpportunitiesManageDeals
  Scenario: Validate Opportunities Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Deals
#    And User wants to click on the add Deal button
#    And User is able to select company pipeline and stages
#    And User is able to add lead or contact to deal
#    And User is able to fill the add deal details
    And User is able to see list view to campaign view in deals
    And User is able to click the won deals tile
    And User is able to select the lost deals tile
    And User is able to click the total deals tile
    And User is able to see campaign view to list view in deals
    And User is able to click here to email the report
    And User is able to click view deal icon
    And User is able to click edit deal icon
    And User is able to click comment deal icon
    And User is able to click delete deal icon
    And User ia able to click pagination on deals
    And User is able to select pagination drop down value in deal page

