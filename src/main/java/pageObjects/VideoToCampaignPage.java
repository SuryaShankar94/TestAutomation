package pageObjects;

import base.SurveyCampaignLocators;
import base.TestSetup;
import base.VideoCampaignLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UserActions;

import java.util.List;

public class VideoToCampaignPage extends TestSetup {

    public static void mouserhoverOnCampaign() {
        UserActions.getMouserOverElement(VideoCampaignLocators.campaign);
    }

    public static void selectCreateCampaign() {
        UserActions.click(VideoCampaignLocators.createCampaign);
    }

    public static void createaVideoCampaign() {
        UserActions.click(VideoCampaignLocators.videoCampaign);
    }

    public static void fillTheToPartnerCampaignDetails() {
        UserActions.wait_Sec();
        UserActions.waitForElementVisible(VideoCampaignLocators.campaignName);
        UserActions.waitForElementVisible(VideoCampaignLocators.campaignName);
        UserActions.enterValueInTextBox(VideoCampaignLocators.campaignName,"Video"+System.currentTimeMillis());
        UserActions.enterValueInTextBox(VideoCampaignLocators.description,"Automatically Created a Video To Campaign");
        UserActions.click(VideoCampaignLocators.insertMergeTags);
        UserActions.click(VideoCampaignLocators.mergeTagName);
        UserActions.enterValueInTextBox(VideoCampaignLocators.preHeader,"ToCampaign Video");
        UserActions.click(VideoCampaignLocators.notifyeMailOpen);
        UserActions.click(VideoCampaignLocators.notifyLinkOpned);
        UserActions.click(VideoCampaignLocators.notifyVideoPlayed);
    }

    public static void videoSelectionPagination() {
        By nextPg = VideoCampaignLocators.videoNext;
        By firstPg = VideoCampaignLocators.videoFirst;
        By lastPg = VideoCampaignLocators.videoLast;
        By previousPg = VideoCampaignLocators.videoPrevious;
        By locator = VideoCampaignLocators.videoPagenationDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.performPagination(nextPg, previousPg, lastPg, firstPg);
        UserActions.wait_Sec();//UserActions.wait_Sec();
        List<WebElement> webele = UserActions.getListOfElements(locator);
        System.out.println("Before Pagination function Call =>" + webele.size()+" ==>"+webele);
        if (webele.size() > 1) {
            UserActions.getDropDownSelectIndex(locator, 2);
            System.out.println("After Pagination function Call");
        }
    }
    public static void selectVideoForCampaign() {
        By locator = VideoCampaignLocators.selectVideoCategoryDrpDwn;
        UserActions.waitForElementVisible(locator);
        //UserActions.scrolling(locator);
        System.out.println("Step 1");
        UserActions.wait_Sec();
        List<WebElement> vdoCatgoryDrpDwn = UserActions.getListOfElements(locator);
        if (vdoCatgoryDrpDwn.size()>1) {
            System.out.println("Step 1");
            UserActions.getDropDownSelectIndex(locator,1);
        }
        UserActions.getDropDownSelectIndex(locator,1);
        UserActions.performSorting(VideoCampaignLocators.sortSelectVideoCamp);
        System.out.println("PERFORM !!!!");
        String searchKey = userInputProperties.getProperty("videoNameforCapmaign");
        //UserActions.wait_Sec();
        if(searchKey==null){
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.searchValue(VideoCampaignLocators.searchSelectVideoCamp,VideoCampaignLocators.searchSelectVideoCampButton,searchKey);
           // UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.selectVideoRadioButton);
            UserActions.closeSearch(VideoCampaignLocators.searchClearVideoCampButton);
        } else {
            UserActions.click(VideoCampaignLocators.selectVideoRadioButton);
        }

    }

    public static void emailSelectionPagination() {
        By nextPg = VideoCampaignLocators.eMailTemplateNext;
        By firstPg = VideoCampaignLocators.eMailTemplateFirst;
        By lastPg = VideoCampaignLocators.eMailTemplateLast;
        By previousPg = VideoCampaignLocators.eMailTemplatePrevious;
        By locator = VideoCampaignLocators.eMailPaginationDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.performPagination(nextPg, previousPg, lastPg, firstPg);
        List<WebElement> webele = UserActions.getListOfElements(locator);
        System.out.println("Before Pagination function Call" + webele.size());
        if (webele.size() > 1) {
            UserActions.wait_Sec();//UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(locator, 2);
            System.out.println("After Pagination function Call");
        }
    }

    public static void selectEmailTemplate() {
        UserActions.performSorting(VideoCampaignLocators.sortSelecteMailTemplate);
        String folderName = "automatedvendor-Default-Folder";
        UserActions.performFilterAction(VideoCampaignLocators.clickFilterIcon,VideoCampaignLocators.selectFolder,VideoCampaignLocators.filterApplyButton,VideoCampaignLocators.filterClearButton,folderName);
        UserActions.wait_Sec();
        String searchKey = userInputProperties.getProperty("emailTemplateforCamp");
        //System.out.println("eMail Template Search KEY==>"+searchKey);
        if (searchKey.isEmpty()){
            UserActions.click(VideoCampaignLocators.selectSearchemailTemplate);
        } else {
           // System.out.println("Step1");
            //UserActions.wait_Sec();
            UserActions.searchValue(VideoCampaignLocators.searchSelecteMailTemplate,VideoCampaignLocators.searchSelecteMailTemplateButton,searchKey);
           // System.out.println("Step2");
            UserActions.click(VideoCampaignLocators.selectSearchemailTemplate);

            By locator = VideoCampaignLocators.editTemplate;
            UserActions.waitForElementVisible(locator);
            UserActions.wait_Sec();//UserActions.wait_Sec();
            UserActions.click(locator);
            System.out.println("Template Edited");
            UserActions.wait_Sec();//UserActions.wait_Sec();
            UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
            By frameId = By.id("xamplify-bee-template-container__bee-plugin-frame");
            UserActions.handlingeMailTemplateiFrame(frameId,VideoCampaignLocators.saveTemplate,VideoCampaignLocators.closeTemplate);
        // //   UserActions.closeSearch(VideoCampaignLocators.searchCleareMailTemplate);
        }
        UserActions.click(VideoCampaignLocators.sendTestMailButton);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        UserActions.enterValueInTextBox(VideoCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(VideoCampaignLocators.sendTestButton);
        UserActions.click(VideoCampaignLocators.emailSentSuccessOK);
        UserActions.click(VideoCampaignLocators.nextButton);
    }

    public static void partnerSelectionPagination() {
        By nextPg = VideoCampaignLocators.partnerGroupNext;
        By firstPg = VideoCampaignLocators.partnerGroupFirst;
        By lastPg = VideoCampaignLocators.partnerGroupLast;
        By previousPg = VideoCampaignLocators.partnerGroupPrevious;
        By locator = VideoCampaignLocators.partnerPaginationDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.performPagination(nextPg, previousPg, lastPg, firstPg);
        List<WebElement> webele = UserActions.getListOfElements(locator);
        System.out.println("Before Pagination function Call" + webele.size());
        if (webele.size() > 1) {
            UserActions.wait_Sec();//UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(locator, 2);
            System.out.println("After Pagination function Call");
        }
    }

    public static void selectPartnerGroup() {
        //UserActions.wait_Sec();
        UserActions.performSorting(VideoCampaignLocators.partnerGroupSelectionOrder);
        //UserActions.getDropDownSelectIndex(VideoCampaignLocators.partnerGroupSelectionOrder,1);
        String searchKey = userInputProperties.getProperty("selectPartnerGroup");
       // UserActions.wait_Sec();
        if(searchKey!=null){
            UserActions.searchValue(VideoCampaignLocators.searchPartnerGroup,VideoCampaignLocators.searchPartnerGroupButton,searchKey);
            UserActions.click(VideoCampaignLocators.selectPartnerCheckBox);
            System.out.println("Search KEY at partner Module==>"+searchKey);
            UserActions.click(VideoCampaignLocators.selctpartnerGroupPreview);
            UserActions.click(VideoCampaignLocators.closePartnerPreview);
           // UserActions.closeSearch(VideoCampaignLocators.cancelSearchPartnerGroup);
        } else {
            UserActions.click(VideoCampaignLocators.selectVideoRadioButton);
        }
    }

    public static void sendATestMailBeforeLaunch() {
        UserActions.click(VideoCampaignLocators.previousButton);
        UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.nextButton);
        UserActions.click(VideoCampaignLocators.sendTestMail);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        UserActions.enterValueInTextBox(VideoCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(VideoCampaignLocators.sendTestButton);
        UserActions.click(VideoCampaignLocators.emailSentSuccessOK);
    }

    public static void performSpamCheck() {
        UserActions.click(VideoCampaignLocators.spamCheck);
        UserActions.click(VideoCampaignLocators.refresh);
        UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.innerSpamCheck);
        UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.closeSpamCheck);
    }

    public static void scheduleVideoCampaign() {
        UserActions.click(VideoCampaignLocators.launchShedule);
        //UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(VideoCampaignLocators.sheduleCountry,3);
        UserActions.scheduleDate(VideoCampaignLocators.scheduleLaunchTime,VideoCampaignLocators.scheduleToday,VideoCampaignLocators.scheduleHours,VideoCampaignLocators.scheduleMins,VideoCampaignLocators.scheduleButton);
        //UserActions.click(VideoCampaignLocators.scheduleButton);
        UserActions.wait_Sec();
    }

    public static void launchVideoCampaignNow() {
        UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.launchNow);
        UserActions.click(VideoCampaignLocators.launchButton);
        UserActions.wait_Sec();UserActions.wait_Sec();
    }

    public static void saveVideoCampaign() {
        UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.launchSave);
        UserActions.click(VideoCampaignLocators.saveButton);
        UserActions.wait_Sec();
    }
}
