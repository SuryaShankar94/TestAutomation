Feature: Opportunities
  Background:
    Given User launches UI Application URL
    When User enters valid username and valid password
    Then Should display application home page
  @Test_OpportunitiesManageLeads
  Scenario: Validate Opportunities Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Leads
   # And Should display application manage leads page
    And User wants to click on the add lead button
    And User is able to select the values of company and pipeline stages
    And User is able to fill the add lead details
    And User is able to save lead details
    Then User is able to see list view to campaign view
    Then User is able to click the won leads tile
    And User is able to see campaign view to list view

#########################################################################################################

#
#  @Test_OpportunitiesManageDeals
#  Scenario: Validate Opportunities Details
#    When Verify user is able to mouserHover on Opportunities
#    Then User is able to mouseHover on Manage Deals
#    And User is able to click add a deal button
#    And
#    And User is able to fill the add deal details
#    And USer is able to save deal details
