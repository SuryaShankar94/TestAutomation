package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmailToCampaignPage;

public class EmailToCampaignSD {
    @When("Verify user is able to mouserHover on Campaign")
    public void verifyUserIsAbleToMouserHoverOnCampaign() {
        EmailToCampaignPage.mouseHoverOnCampaign();
    }

    @Then("User is able to mouseHover on Creating Campaign")
    public void userIsAbleToMouseHoverOnCreatingCampaign() {
        EmailToCampaignPage.mouseHoverOnCreatingCampaign();
    }

    @And("Verify user is able to mouserHover on email Campaign")
    public void verifyUserIsAbleToMouserHoverOnEmailCampaign() {
        EmailToCampaignPage.mouseHoverOnEmailCampaign();
    }

    @And("User wants to create email Campaign")
    public void userWantsToCreateEmailCampaign() {
        EmailToCampaignPage.createEmailCampaign();
    }

    @And("User enters campaign details")
    public void userEntersCampaignDetails() {
        EmailToCampaignPage.enterCampaignDetails();
    }

    @And("User is able to sort the templates by using dropdown")
    public void userIsAbleToSortTheTemplatesByUsingDropdown() {
        EmailToCampaignPage.sortTemplates();
    }

    @And("User select an email template")
    public void userSelectAnEmailTemplate() {
        EmailToCampaignPage.selectAnEmailTemplate();
    }

    @And("Verify user is able to fill all the manditory fields")
    public void verifyUserIsAbleToFillAllTheManditoryFields() {
        EmailToCampaignPage.ManditoryFildCheck();
    }

    @And("User is able to click the next boutton")
    public void userIsAbleToClickTheNextBoutton() {
        EmailToCampaignPage.clickTheNextButton();
    }

    @And("User is able to sort the Partner list by using dropdown")
    public void userIsAbleToSortThePartnerListByUsingDropdown() {
        EmailToCampaignPage.sortPartnersList();
    }

    @And("Select Group of Partner to be used in this campaign")
    public void selectGroupOfPartnerToBeUsedInThisCampaign() {
        EmailToCampaignPage.selectTheCampaignList();
    }

    @And("User is able to check the launch radio button")
    public void userIsAbleToCheckTheLaunchRadioButton() {
        EmailToCampaignPage.clickTheLaunchRadioButton();
    }

    @And("User is able to click the launch button")
    public void userIsAbleToClickTheLaunchButton() {
        EmailToCampaignPage.clickLaunchButton();
    }

}
