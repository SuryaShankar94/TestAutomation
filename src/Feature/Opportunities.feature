Feature: Opportunities
  Background:
    Given User launches xamplify Application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page


  @Functional @Smoke @Regression @Test_OpportunitiesManageLeads
  Scenario: Validate Opportunities Manage Leads Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Leads
#   # And Should display application manage leads page
#    And User wants to click on the add lead button
#    And User is able to select the values of company and pipeline stages
#    And User is able to fill the add lead details
#    And User is able to save lead details
#    Then User is able to see list view to campaign view
#    Then User is able to click the won leads tile
#    And User is able to see campaign view to list view
   # And User is able to click view lead icon
   # And User is able to click edit lead icon
    #And User is able to click comment lead icon
    #And User is able to click delete lead icon
    #And User is able to click next last first and previous page lead icon
    #And User is able to click page drop down
    And User is able to click lead to deal register button

#########################################################################################################

#
# @Test_OpportunitiesManageDeals
#  Scenario: Validate Opportunities Details
#    When Verify user is able to mouserHover on Opportunities
#    Then User is able to mouseHover on Manage Deals
#    And User is able to click add a deal button
#    And
#    And User is able to fill the add deal details
#    And USer is able to save deal details
