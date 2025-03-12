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

    @Then("User is able to click creating campaign")
    public void userIsAbleToClickCreatingCampaign() {
        EmailToCampaignPage.clickCreatingCampaign();
    }

    @And("User wants to create email Campaign")
    public void userWantsToCreateEmailCampaign() {
        EmailToCampaignPage.createEmailCampaign();
    }
    @And("User is able to fill email tocampaign details")
    public void userIsAbleToFillEmailTocampaignDetails() {
        EmailToCampaignPage.entereMailtoCampaignDetails();

    }

    @And("User is able to perform pagination on email template")
    public void userIsAbleToPerformPaginationOnEmailTemplate() {
        EmailToCampaignPage.performPaginationOnEmailTemplate();
    }

    @And("User is able select an email template")
    public void userIsAbleSelectAnEmailTemplate() {
        EmailToCampaignPage.selectAnEmailTemplate();
    }

    @And("User is able to perform pagination on partner selection")
    public void userIsAbleToPerformPaginationOnPartnerSelection() {
        EmailToCampaignPage.performPaginationOnPartnerSelection();
    }


    @And("User is able to select partner group to be used in this campaign")
    public void userIsAbleToSelectPartnerGroupToBeUsedInThisCampaign() {
        EmailToCampaignPage.selectPartnerGroupToBeUsedInThisCampaign();
    }

    @And("User is able to send a test mail before launch campaign")
    public void userIsAbleToSendATestMailBeforeLaunchCampaign() {
        EmailToCampaignPage.sendATestMailBeforeLaunchCampaign();
    }

    @And("User is able to launch email campaign now")
    public void userIsAbleToLaunchEmailCampaignNow() {
        EmailToCampaignPage.launchEmailCampaignNow();
    }

    @And("User is able to perform spam check Operation")
    public void userIsAbleToPerformSpamCheckOperation() {
        EmailToCampaignPage.performSpamCheckOperation();
    }

    @And("User is able to save email campaign")
    public void userIsAbleToSaveEmailCampaign() {
        EmailToCampaignPage.saveEmailCampaign();
    }

    @And("User is able to schedule email campaign")
    public void userIsAbleToScheduleEmailCampaign() {
        EmailToCampaignPage.scheduleEmailCampaign();
    }
}
