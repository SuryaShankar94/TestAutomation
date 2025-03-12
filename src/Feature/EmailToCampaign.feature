Feature: Email To Campaign
  Background:
    Given User launches xamplify application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page
  @test @Test_EmailToCampaign @Priority1 #@all @Functional @Smoke @Regression @toCampaign
  Scenario: Launch Email Campaign Now
    When Verify user is able to mouserHover on Campaign
    Then User is able to click creating campaign
    And User wants to create email Campaign
    And User is able to fill email tocampaign details
    And User is able to perform pagination on email template
    And User is able select an email template
    And User is able to perform pagination on partner selection
    And User is able to select partner group to be used in this campaign
    And User is able to send a test mail before launch campaign
    And User is able to perform spam check Operation
    And User is able to launch email campaign now
#  @SaveEmailCampaign
#  Scenario: Save Email Campaign
    When Verify user is able to mouserHover on Campaign
    Then User is able to click creating campaign
    And User wants to create email Campaign
    And User is able to fill email tocampaign details
    And User is able select an email template
    And User is able to select partner group to be used in this campaign
    And User is able to save email campaign
#    @ScheduleEmailCampaign
#    Scenario: Schedule Email Campaign
    When Verify user is able to mouserHover on Campaign
    Then User is able to click creating campaign
    And User wants to create email Campaign
    And User is able to fill email tocampaign details
    And User is able select an email template
    And User is able to select partner group to be used in this campaign
    And User is able to schedule email campaign
    And User is able to logout the xamplify application

