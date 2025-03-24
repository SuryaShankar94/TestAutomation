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
        try {
            SurveytoCampaignPage.createSurveyTocampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to fill survey tocampaign details")
    public void userIsAbleToFillSurveyTocampaignDetails() {
        try {
            SurveytoCampaignPage.fillSurveyTocampaignDetails();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform pagination on select an email template")
    public void userIsAbleToPerformPaginationOnSelectAnEmailTemplate() {
        try {
            SurveytoCampaignPage.paginationOnSelectAnEmailTemplate();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able select an email template by using search and sort")
    public void userIsAbleSelectAnEmailTemplateByUsingSearchAndSort() {
        try {
            SurveytoCampaignPage.selectAnEmailTemplateByUsingSearchAndSort();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform pagination on group of partner")
    public void userIsAbleToPerformPaginationOnGroupOfPartner() {
        try {
            SurveytoCampaignPage.performPaginationOnGroupOfPartner();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select partner group to be used in this survey tocampaign")
    public void userIsAbleToSelectPartnerGroupToBeUsedInThisSurveyTocampaign() {
        try {
            SurveytoCampaignPage.selectPartnerGroupforSurveyTocampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to send a test mail before launch survey tocampaign")
    public void userIsAbleToSendATestMailBeforeLaunchSurveyTocampaign() {
        try {
            SurveytoCampaignPage.sendATestMailBeforeLaunchSurveyTocampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform spam check in survey tocampaign")
    public void userIsAbleToPerformSpamCheckInSurveyTocampaign() {
        try {
            SurveytoCampaignPage.spamCheckInSurveyTocampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to launch survey tocampaign now")
    public void userIsAbleToLaunchSurveyTocampaignNow() {
        try {
            SurveytoCampaignPage.launchSurveyTocampaignNow();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("Survey tocampaign should successfully launched")
    public void surveyTocampaignShouldSuccessfullyLaunched() {
        try {
            SurveytoCampaignPage.successfullyLaunched();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("Survey tocampaign should successfully saved")
    public void surveyTocampaignShouldSuccessfullySaved() {
        try {
            SurveytoCampaignPage.successfullyLaunched();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("Survey tocampaign should successfully schedule")
    public void surveyTocampaignShouldSuccessfullySchedule() {
        try {
            SurveytoCampaignPage.successfullyLaunched();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to save survey tocampaign")
    public void userIsAbleToSaveSurveyTocampaign() {
        try {
            SurveytoCampaignPage.saveSurveyTocampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to schedule survey tocampaign")
    public void userIsAbleToScheduleSurveyTocampaign() {
        try {
            SurveytoCampaignPage.scheduleEmailCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
