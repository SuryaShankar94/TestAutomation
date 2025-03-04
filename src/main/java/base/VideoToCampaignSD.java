package stepDefinition;

import base.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VideoToCampaignPage;

public class VideoToCampaignSD extends TestSetup {
    @When("Verify user is able to mouserhover on campaign")
    public void verifyUserIsAbleToMouserhoverOnCampaign() {
        VideoToCampaignPage.mouserhoverOnCampaign();
    }

    @Then("User is able to select create campaign")
    public void userIsAbleToSelectCreateCampaign() {
        VideoToCampaignPage.selectCreateCampaign();
    }

    @And("User is able to click create a video campaign")
    public void userIsAbleToClickCreateaVideoCampaign() {
        VideoToCampaignPage.createaVideoCampaign();
    }

    @And("User is able to fill the to partner campaign details")
    public void userIsAbleToFillTheToPartnerCampaignDetails() {
        VideoToCampaignPage.fillTheToPartnerCampaignDetails();
    }

    @And("User ia able to perform video selection pagination")
    public void userIaAbleToPerformVideoSelectionPagination() {
        VideoToCampaignPage.videoSelectionPagination();
    }

    @And("User is able to select video for campaign")
    public void userIsAbleToSelectVideoForCampaign() {
        VideoToCampaignPage.selectVideoForCampaign();
    }

    @And("User ia able to perform email selection pagination")
    public void userIaAbleToPerformEmailSelectionPagination() {
        VideoToCampaignPage.emailSelectionPagination();
    }

    @And("User is able to select email template")
    public void userIsAbleToSelectEmailTemplate() {
        VideoToCampaignPage.selectEmailTemplate();
    }

    @And("User is able to select partner group")
    public void userIsAbleToSelectPartnerGroup() {
        VideoToCampaignPage.selectPartnerGroup();
    }

    @And("User ia able to perform partner selection pagination")
    public void userIaAbleToPerformPartnerSelectionPagination() {
        VideoToCampaignPage.partnerSelectionPagination();
    }

    @And("User is able to send a test mail before launch")
    public void userIsAbleToSendATestMailBeforeLaunch() {
        VideoToCampaignPage.sendATestMailBeforeLaunch();
    }

    @And("User is able to perform spam check")
    public void userIsAbleToPerformSpamCheck() {
        VideoToCampaignPage.performSpamCheck();
    }

    @And("User is able to schedule video campaign")
    public void userIsAbleToScheduleVideoCampaign() {
        VideoToCampaignPage.scheduleVideoCampaign();
    }

    @And("User is able to launch video campaign now")
    public void userIsAbleToLaunchVideoCampaignNow() {
        VideoToCampaignPage.launchVideoCampaignNow();
    }

    @And("User is able to save video campaign")
    public void userIsAbleToSaveVideoCampaign() {
        VideoToCampaignPage.saveVideoCampaign();
    }
}
