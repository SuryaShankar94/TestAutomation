package stepDefinition;

import base.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PartnerPage;

public class PartnerSD extends TestSetup
{
    @When("Verify user is able to mouserHover on Partner")
    public void mouserOverOnPartner()
    {
        PartnerPage.userMouseOverOnPartner();
    }

    @Then("User is able to mouseHover on Onboarding Partner")
    public void userIsAbleToMouseHoverOnOnboardingPartner()
    {
        PartnerPage.userMouseOverOnboardingPartner();
    }

    @And("User is able to mouseHover on Manage Partner")
    public void userIsAbleToMouseHoverOnManagePartner()
    {
        PartnerPage.userMouseOverManagePartner();
    }
}
