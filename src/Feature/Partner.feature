Feature: Partner
  Background:
   Given User launches UI Application URL
   When User enters valid username and valid password
   Then Should display application home page
   @Test_Partner001
    Scenario: Validate Partner Details
      When Verify user is able to mouserHover on Partner
      Then User is able to mouseHover on Onboarding Partner
      And Verify user is able to mouserHover on Partner
      And User is able to mouseHover on Manage Partner
