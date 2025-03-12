Feature: Survey To Campaign
  Tocampaign survey user is able to Creating it
  Background:
    Given User launches xamplify application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page
  @Test_SurveyToCampaign @Priority3 @all @Functional @Smoke @Regression @toCampaign
  Scenario: Launch Survey Campaign Now
    When Verify user is able to mouserHover on Campaign
    Then User is able to click creating campaign
    And User wants to create survey tocampaign
    And User is able to fill survey tocampaign details
    And User is able to perform pagination on select an email template
    And User is able select an email template by using search and sort
    And User is able to perform pagination on group of partner
    And User is able to select partner group to be used in this survey tocampaign
    And User is able to send a test mail before launch survey tocampaign
    And User is able to perform spam check in survey tocampaign
    And User is able to launch survey tocampaign now
    Then Survey tocampaign should successfully launched

 # Scenario: Save Survey Campaign Now
    When Verify user is able to mouserHover on Campaign
    Then User is able to click creating campaign
    And User wants to create survey tocampaign
    And User is able to fill survey tocampaign details
    And User is able to perform pagination on select an email template
    And User is able select an email template by using search and sort
    And User is able to perform pagination on group of partner
    And User is able to select partner group to be used in this survey tocampaign
    And User is able to send a test mail before launch survey tocampaign
    And User is able to perform spam check in survey tocampaign
    And User is able to save survey tocampaign
    Then Survey tocampaign should successfully saved

#  Scenario: Schedule Survey Campaign
    When Verify user is able to mouserHover on Campaign
    Then User is able to click creating campaign
    And User wants to create survey tocampaign
    And User is able to fill survey tocampaign details
    And User is able to perform pagination on select an email template
    And User is able select an email template by using search and sort
    And User is able to perform pagination on group of partner
    And User is able to select partner group to be used in this survey tocampaign
    And User is able to send a test mail before launch survey tocampaign
    And User is able to perform spam check in survey tocampaign
    And User is able to schedule survey tocampaign
    Then Survey tocampaign should successfully schedule
#    And User is able to logout the xamplify application