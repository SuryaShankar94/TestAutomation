package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmailToCampaignPage;
import pageObjects.SurveytoCampaignPage;

public class SurveyToCampaignSD {
//    @When("Verify user is able to mouserHover on Campaign")
//    public void verifyUserIsAbleToMouserHoverOnCampaign() {
//        //SurveytoCampaignPage.mouseHoverOnCampaign();
//        EmailToCampaignPage.mouseHoverOnCampaign();
//    }
//
//    @Then("User is able to click creating campaign")
//    public void userIsAbleToClickCreatingCampaign() {
//        //SurveytoCampaignPage.clickCreatingCampaign();
//        EmailToCampaignPage.clickCreatingCampaign();
//    }

    @And("User wants to create survey tocampaign")
    public void userWantsToCreateSurveyTocampaign() {
        SurveytoCampaignPage.createSurveyTocampaign();
    }

    @And("User is able to fill survey tocampaign details")
    public void userIsAbleToFillSurveyTocampaignDetails() {
        SurveytoCampaignPage.fillSurveyTocampaignDetails();
    }

    @And("User is able to perform pagination on select an email template")
    public void userIsAbleToPerformPaginationOnSelectAnEmailTemplate() {
        SurveytoCampaignPage.paginationOnSelectAnEmailTemplate();

    }

    @And("User is able select an email template by using search and sort")
    public void userIsAbleSelectAnEmailTemplateByUsingSearchAndSort() {
        SurveytoCampaignPage.selectAnEmailTemplateByUsingSearchAndSort();
    }

    @And("User is able to perform pagination on group of partner")
    public void userIsAbleToPerformPaginationOnGroupOfPartner() {
        SurveytoCampaignPage.performPaginationOnGroupOfPartner();
    }

    @And("User is able to select partner group to be used in this survey tocampaign")
    public void userIsAbleToSelectPartnerGroupToBeUsedInThisSurveyTocampaign() {
        SurveytoCampaignPage.selectPartnerGroupforSurveyTocampaign();
    }

    @And("User is able to send a test mail before launch survey tocampaign")
    public void userIsAbleToSendATestMailBeforeLaunchSurveyTocampaign() {
        SurveytoCampaignPage.sendATestMailBeforeLaunchSurveyTocampaign();
    }

    @And("User is able to perform spam check in survey tocampaign")
    public void userIsAbleToPerformSpamCheckInSurveyTocampaign() {
        SurveytoCampaignPage.spamCheckInSurveyTocampaign();
    }

    @And("User is able to launch survey tocampaign now")
    public void userIsAbleToLaunchSurveyTocampaignNow() {
        SurveytoCampaignPage.launchSurveyTocampaignNow();
    }

    @Then("Survey tocampaign should successfully launched")
    public void surveyTocampaignShouldSuccessfullyLaunched() {
        SurveytoCampaignPage.successfullyLaunched();
    }
}
