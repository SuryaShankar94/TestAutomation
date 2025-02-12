Feature: Opportunities
  Background:
    Given User launches UI Application URL
    When User enters valid username and valid password
    Then Should display application home page
  @Test_OpportunitiesLeadsActions
  Scenario: Validate Opportunities Details
    When Verify user is able to mouserHover on Opportunities
    Then User is able to mouseHover on Manage Leads
#    And User is able to click view lead icon
    And User is able to click edit lead icon
#    #And User is able to click comment lead icon
#    And User is able to click delete lead icon
#    And User is able to click next last first and previous page lead icon
#    And User is able to click page drop down
