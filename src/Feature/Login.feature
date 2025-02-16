Feature: Login into UI Application
  Background:
    Given User launches UI Application URL
    @Test_001
    Scenario: Successful login with valid admin credentials
      When User enters valid username and valid password
      Then Should display xamplify application home page


