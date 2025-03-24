package stepDefinition;

import base.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VideoToCampaignPage;

public class VideoToCampaignSD extends TestSetup {
    @When("Verify user is able to mouserhover on campaign")
    public void verifyUserIsAbleToMouserhoverOnCampaign() {
        try {
            VideoToCampaignPage.mouserhoverOnCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("User is able to select create campaign")
    public void userIsAbleToSelectCreateCampaign() {
        try {
            VideoToCampaignPage.selectCreateCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click create a video campaign")
    public void userIsAbleToClickCreateaVideoCampaign() {
        try {
            VideoToCampaignPage.createaVideoCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to fill the to partner campaign details")
    public void userIsAbleToFillTheToPartnerCampaignDetails() {
        try {
            VideoToCampaignPage.fillTheToPartnerCampaignDetails();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User ia able to perform video selection pagination")
    public void userIaAbleToPerformVideoSelectionPagination() {
        try {
            VideoToCampaignPage.videoSelectionPagination();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select video for campaign")
    public void userIsAbleToSelectVideoForCampaign() {
        try {
            VideoToCampaignPage.selectVideoForCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User ia able to perform email selection pagination")
    public void userIaAbleToPerformEmailSelectionPagination() {
        try {
            VideoToCampaignPage.emailSelectionPagination();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select email template")
    public void userIsAbleToSelectEmailTemplate() {
        try {
            VideoToCampaignPage.selectEmailTemplate();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select partner group")
    public void userIsAbleToSelectPartnerGroup() {
        try {
            VideoToCampaignPage.selectPartnerGroup();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User ia able to perform partner selection pagination")
    public void userIaAbleToPerformPartnerSelectionPagination() {
        try {
            VideoToCampaignPage.partnerSelectionPagination();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to send a test mail before launch")
    public void userIsAbleToSendATestMailBeforeLaunch() {
        try {
            VideoToCampaignPage.sendATestMailBeforeLaunch();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform spam check")
    public void userIsAbleToPerformSpamCheck() {
        try {
            VideoToCampaignPage.performSpamCheck();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to schedule video campaign")
    public void userIsAbleToScheduleVideoCampaign() {

        try {
            VideoToCampaignPage.scheduleVideoCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to launch video campaign now")
    public void userIsAbleToLaunchVideoCampaignNow() {
        try {
            VideoToCampaignPage.launchVideoCampaignNow();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to save video campaign")
    public void userIsAbleToSaveVideoCampaign() {
        try {
            VideoToCampaignPage.saveVideoCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
