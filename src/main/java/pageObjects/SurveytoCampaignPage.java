package pageObjects;

import base.SurveyCampaignLocators;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UserActions;

import java.util.List;

import static base.TestSetup.driver;
import static base.TestSetup.userInputProperties;

public class SurveytoCampaignPage {
    public static void mouseHoverOnCampaign() {
        UserActions.getMouserOverElement(SurveyCampaignLocators.campaign);
    }

    public static void clickCreatingCampaign() {
        UserActions.click(SurveyCampaignLocators.createCampaign);
    }

    public static void createSurveyTocampaign() {
        UserActions.click(SurveyCampaignLocators.surveyCampaign);
    }

    public static void fillSurveyTocampaignDetails() {
        UserActions.wait_Sec();
        UserActions.enterValueInTextBox(SurveyCampaignLocators.campaignName,"survey"+System.currentTimeMillis());
        UserActions.enterValueInTextBox(SurveyCampaignLocators.description,"Survey To Campaign Description");

        UserActions.getDropDownSelectIndex(SurveyCampaignLocators.folderSelection,1);
        UserActions.click(SurveyCampaignLocators.insertMergeTags);
        UserActions.click(SurveyCampaignLocators.mergeTagName);
        UserActions.getDropDownSelectIndex(SurveyCampaignLocators.fromeMail,1);
        UserActions.enterValueInTextBox(SurveyCampaignLocators.preHeader,"eMail ToCampaign Header");
        UserActions.click(SurveyCampaignLocators.notifyEmailOpend);
        UserActions.click(SurveyCampaignLocators.notifyLinkOpned);
    }

    public static void paginationOnSelectAnEmailTemplate() {
        By nextPg = SurveyCampaignLocators.surveyTemplateNext;
        By firstPg = SurveyCampaignLocators.surveyTemplatePrevious;
        By lastPg = SurveyCampaignLocators.surveyTemplateLast;
        By previousPg = SurveyCampaignLocators.surveyTemplateFirst;
        UserActions.performPagination(nextPg,previousPg,lastPg,firstPg);
        By locator = SurveyCampaignLocators.surveyPaginationDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();UserActions.wait_Sec();
        List<WebElement> webele = UserActions.getListOfElements(locator);
        if(webele.size()>1) {
            UserActions.getDropDownSelectIndex(locator, 2);
        }
        // UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
    }

    public static void selectAnEmailTemplateByUsingSearchAndSort() {
        UserActions.performSorting(SurveyCampaignLocators.sortEmailTemplate);
        String folderName = "automatedvendor-Default-Folder";
        UserActions.performFilterAction(SurveyCampaignLocators.filterButton,SurveyCampaignLocators.clickFolderFilter,SurveyCampaignLocators.applyFilter,SurveyCampaignLocators.closeFilter,folderName);
        UserActions.wait_Sec();
        String searchKey = userInputProperties.getProperty("emailTemplateforSurvey");
        //System.out.println("eMail Template Search KEY==>"+searchKey);
        if (searchKey.isEmpty()){
            UserActions.click(SurveyCampaignLocators.selecteMailTemplate);
        } else {
            // System.out.println("Step1");
            //UserActions.wait_Sec();
            UserActions.searchValue(SurveyCampaignLocators.searchBox,SurveyCampaignLocators.searchIcon,searchKey);
            // System.out.println("Step2");
            By locator = SurveyCampaignLocators.selecteMailTemplate;
            UserActions.waitForElementVisible(locator);
            UserActions.wait_Sec();
            UserActions.click(locator);
            System.out.println("Template Selected");
            locator = SurveyCampaignLocators.editTemplate;
            UserActions.waitForElementVisible(locator);
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.click(locator);
            System.out.println("Template Edited");
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.click(SurveyCampaignLocators.showSurveyBtn);
            System.out.println("Template Survey Button Clicked");
            UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(SurveyCampaignLocators.surveySort,1);
            UserActions.wait_Sec();
            UserActions.searchValue(SurveyCampaignLocators.surveySearchName,SurveyCampaignLocators.surveySerchIcon,searchKey);
            UserActions.wait_Sec();
            UserActions.click(SurveyCampaignLocators.surveyPreview);
            UserActions.wait_Sec();
            UserActions.scrolling(SurveyCampaignLocators.surveyPreviewCloseBtn);
            UserActions.wait_Sec();
            UserActions.click(SurveyCampaignLocators.surveyPreviewCloseBtn);
            UserActions.click(SurveyCampaignLocators.surveyCopyLink);
            UserActions.wait_Sec();
            UserActions.click(SurveyCampaignLocators.surveyFormCloseBtn);
            By frameId = By.id("xamplify-bee-template-container__bee-plugin-frame");
            UserActions.handlingeMailTemplateiFrame(frameId,SurveyCampaignLocators.saveTemplate,SurveyCampaignLocators.closeTemplate);
            UserActions.closeSearch(SurveyCampaignLocators.searchClearButton);
        }
        UserActions.click(SurveyCampaignLocators.sendTesteMailButton);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        UserActions.enterValueInTextBox(SurveyCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(SurveyCampaignLocators.sendTestButton);
        UserActions.click(SurveyCampaignLocators.surveySentSuccessOK);
        UserActions.click(SurveyCampaignLocators.nextButton);
    }

    public static void performPaginationOnGroupOfPartner() {
        By nextPg = SurveyCampaignLocators.partnerGroupNext;
        By firstPg = SurveyCampaignLocators.partnerGroupPrevious;
        By lastPg = SurveyCampaignLocators.partnerGroupLast;
        By previousPg = SurveyCampaignLocators.partnerGroupFirst;
        UserActions.performPagination(nextPg,previousPg,lastPg,firstPg);
        By locator = SurveyCampaignLocators.partnerPaginationDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();UserActions.wait_Sec();
        List<WebElement> webele = UserActions.getListOfElements(locator);
        if(webele.size()>1) {
            UserActions.getDropDownSelectIndex(locator, 2);
        }
        // UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
    }

    public static void selectPartnerGroupforSurveyTocampaign() {
        By locator = SurveyCampaignLocators.sortPartnerGroup;
        UserActions.waitForElementVisible(locator);
        UserActions.performSorting(locator);
        String searchKey = userInputProperties.getProperty("selectPartnerGroup");
        UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        if(searchKey!=null){
            UserActions.wait_Sec();
            UserActions.searchValue(SurveyCampaignLocators.searchPartnerGroup,SurveyCampaignLocators.searchPartnerGroupIcon,searchKey);
            UserActions.click(SurveyCampaignLocators.selectPartnerCheckBox);
            //     System.out.println("partnerSelected==>"+searchKey);
        } else {
            UserActions.click(SurveyCampaignLocators.selectPartnerCheckBox);
        }

        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(SurveyCampaignLocators.selctpartnerGroupPreview);
        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(SurveyCampaignLocators.closePartnerPreview);
        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.closeSearch(SurveyCampaignLocators.cancelSearchPartnerGroup);
    }

    public static void sendATestMailBeforeLaunchSurveyTocampaign() {
        UserActions.click(SurveyCampaignLocators.previousButton);
        UserActions.wait_Sec();
        UserActions.click(SurveyCampaignLocators.nextButton);
        UserActions.click(SurveyCampaignLocators.sendTestMail);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        UserActions.enterValueInTextBox(SurveyCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(SurveyCampaignLocators.sendTestButton);
        UserActions.click(SurveyCampaignLocators.surveySentSuccessOK);
    }

    public static void spamCheckInSurveyTocampaign() {
        UserActions.click(SurveyCampaignLocators.spamCheck);
        UserActions.click(SurveyCampaignLocators.refresh);
        UserActions.wait_Sec();
        UserActions.click(SurveyCampaignLocators.innerSpamCheck);
        UserActions.wait_Sec();
        UserActions.click(SurveyCampaignLocators.closeSpamCheck);
    }

    public static void launchSurveyTocampaignNow() {
        UserActions.click(SurveyCampaignLocators.launchNow);
        UserActions.click(SurveyCampaignLocators.launchButton);
        UserActions.wait_Sec();
    }

    public static void successfullyLaunched() {
        String expectedURL = userInputProperties.getProperty("manageCampaign");
        String currentURL = driver.getCurrentUrl();
        System.out.println("Expected URL ==> "+expectedURL);
        System.out.println("Current URL ==> "+currentURL);
        if (expectedURL.equalsIgnoreCase(currentURL)) {

        } else {
            System.out.println("Campaign Not Launched Successfully");
            ExtentCucumberAdapter.addTestStepLog("Campaign Not Launched Successfully");
        }
    }

    public static void saveSurveyTocampaign() {
//        fillSurveyTocampaignDetails();
//        paginationOnSelectAnEmailTemplate();
//        selectAnEmailTemplateByUsingSearchAndSort();
//        performPaginationOnGroupOfPartner();
//        selectPartnerGroupforSurveyTocampaign();
//        sendATestMailBeforeLaunchSurveyTocampaign();
//        spamCheckInSurveyTocampaign();
        UserActions.click(SurveyCampaignLocators.launchSave);
        UserActions.click(SurveyCampaignLocators.surveySaveButton);
    }

    public static void scheduleEmailCampaign() {
//        fillSurveyTocampaignDetails();
//        paginationOnSelectAnEmailTemplate();
//        selectAnEmailTemplateByUsingSearchAndSort();
//        performPaginationOnGroupOfPartner();
//        selectPartnerGroupforSurveyTocampaign();
//        sendATestMailBeforeLaunchSurveyTocampaign();
//        spamCheckInSurveyTocampaign();
        UserActions.click(SurveyCampaignLocators.launchShedule);
        //UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(SurveyCampaignLocators.scheduleCountry,3);
        UserActions.scheduleDate(SurveyCampaignLocators.scheduleLaunchTime,SurveyCampaignLocators.scheduleDate,SurveyCampaignLocators.scheduleHours,SurveyCampaignLocators.scheduleMins,SurveyCampaignLocators.scheduleButton);
    }
}
