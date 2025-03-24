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
        try {
            EmailToCampaignPage.entereMailtoCampaignDetails();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform pagination on email template")
    public void userIsAbleToPerformPaginationOnEmailTemplate() {
        try {
            EmailToCampaignPage.performPaginationOnEmailTemplate();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able select an email template")
    public void userIsAbleSelectAnEmailTemplate() {
        try {
            EmailToCampaignPage.selectAnEmailTemplate();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform pagination on partner selection")
    public void userIsAbleToPerformPaginationOnPartnerSelection() {
        try {
            EmailToCampaignPage.performPaginationOnPartnerSelection();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select partner group to be used in this campaign")
    public void userIsAbleToSelectPartnerGroupToBeUsedInThisCampaign() {
        try {
            EmailToCampaignPage.selectPartnerGroupToBeUsedInThisCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to send a test mail before launch campaign")
    public void userIsAbleToSendATestMailBeforeLaunchCampaign() {
        try {
            EmailToCampaignPage.sendATestMailBeforeLaunchCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to launch email campaign now")
    public void userIsAbleToLaunchEmailCampaignNow() {
        try {
            EmailToCampaignPage.launchEmailCampaignNow();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform spam check Operation")
    public void userIsAbleToPerformSpamCheckOperation() {
        try {
            EmailToCampaignPage.performSpamCheckOperation();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to save email campaign")
    public void userIsAbleToSaveEmailCampaign() {
        try {
            EmailToCampaignPage.saveEmailCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to schedule email campaign")
    public void userIsAbleToScheduleEmailCampaign() {
        try {
            EmailToCampaignPage.scheduleEmailCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
