Feature: Opportunities
  Background:
    Given User launches xamplify Application URL
    When User enters valid username and valid password
    Then Should display xamplify application home page
  @Functional @Smoke @Regression @Test_VideotoCampaign @toCampaign
  Scenario: Validate Video Campaign Details
#    When Verify user is able to mouserhover on campaign
#    Then User is able to select create campaign
#    And User is able to click create a video campaign
#    And User is able to fill the to partner campaign details
#    And User ia able to perform video selection pagination
#    And User is able to select video for campaign
#    And User ia able to perform email selection pagination
#    And User is able to select email template
#    And User ia able to perform partner selection pagination
#    And User is able to select partner group
#    #And User is able to auto response to website visit
#    #And User is able to auto response to your email
#    And User is able to send a test mail before launch
#    And User is able to perform spam check
#    And User is able to launch video campaign now
#    When Verify user is able to mouserhover on campaign
#    Then User is able to select create campaign
#    And User is able to click create a video campaign
#    And User is able to fill the to partner campaign details
#    And User is able to select video for campaign
#    And User is able to select email template
#    And User is able to select partner group
#    And User is able to save video campaign
    When Verify user is able to mouserhover on campaign
    Then User is able to select create campaign
    And User is able to click create a video campaign
    And User is able to fill the to partner campaign details
    And User is able to select video for campaign
    And User is able to select email template
    And User is able to select partner group
    And User is able to schedule video campaign

