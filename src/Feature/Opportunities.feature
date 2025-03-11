Feature: Opportunities
  Background:
    Given User launches xamplify application URL
    When User enters valid partner username and valid password
    Then Should display xamplify application home page

  @Functional @Smoke @Regression @Test_OpportunitiesManageLeads
  Scenario: Validate Opportunities Manage Leads Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Leads
    And Should display application manage leads page
    And User is able to apply filter on leads
    And User wants to click on the add lead button
    And User is able to select the values of company and pipeline stages
    And User is able to fill the add lead details
    And User is able to save lead details
    And User is able to click the leads tile
    And User is able to see list view to campaign view
    And User is able to click view Lead for this campaign
    And User is able to preview the campaign leads
    And User is able to comment the campaign leads
    And User is able to edit the campaign leads
    And User is able to delete the campaign leads
    #And User is able to perform pagination action on campaigns
    And User is able to click the leads tile
    And User is able to see campaign view to list view
    And User is able to click view lead icon
    And User is able to click edit lead icon
    And User is able to click comment lead icon
    And User is able to click delete lead icon
    And User is able to click page drop down
   ### And User is able to logout the xamplify application
##########################################################################################################
#   # #Given User launches xamplify Application URL
#  #  #When User enters valid username and valid password
# #  # Then Should display xamplify application home page
#  @Test_OpportunitiesManageDeals
#  Scenario: Validate Opportunities Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Deals
    And User is able to filter deals
    And User wants to click on the add Deal button
    And User is able to select company pipeline and stages
    And User is able to add lead or contact to deal
    And User is able to fill the add deal details
    And User is able to click the deals tile
    And User is able to see list view to campaign view in deals
    And User is able to click view deal for this campaign
    And User is able to view the campaign deals
    And User is able to comment the campaign Deals
    And User is able to edit the campaign Deals
    And User is able to delete the campaign Deals
    And User is able to change the deal stage in campaign View
    And User is able to perform pagination on campaign deals
    And User is able to see campaign view to list view in deals
    And User is able to click view deal icon
    And User is able to click edit deal icon
    And User is able to click edit deal stage icon
    And User is able to click comment deal icon
    And User is able to click delete deal icon
    And User ia able to click pagination on deals
    And User is able to logout the xamplify application
