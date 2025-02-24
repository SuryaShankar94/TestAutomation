package pageObjects;

import base.OpportunitiesLocators;
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
        UserActions.setValue(VideoCampaignLocators.campaignName,""+System.currentTimeMillis());
        UserActions.setValue(VideoCampaignLocators.description,"Automatically Created a Video To Campaign");
        UserActions.click(VideoCampaignLocators.insertMergeTags);
        UserActions.click(VideoCampaignLocators.mergeTagName);
        UserActions.setValue(VideoCampaignLocators.preHeader,"ToCampaign Video");
        UserActions.click(VideoCampaignLocators.notifyeMailOpen);
        UserActions.click(VideoCampaignLocators.notifyLinkOpned);
        UserActions.click(VideoCampaignLocators.notifyVideoPlayed);
    }

    public static void videoSelectionPagination() {
        By locator = VideoCampaignLocators.videoNext;
        //UserActions.scrolling(locator);
        Boolean val = UserActions.isElementDisplayed(locator);
       // System.out.println("Pagination VALUE=>"+val);
        if(val) {
            UserActions.click(locator);
            System.out.println("Next");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.videoPrevious);
            System.out.println("Previous");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.videoLast);
            System.out.println("Last");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.videoFirst);
            System.out.println("First");
            UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(VideoCampaignLocators.videoPagenationDrpDwn,2);
        }

    }
    public static void selectVideoForCampaign() {
        By locator = VideoCampaignLocators.selectVideoCategoryDrpDwn;
        //UserActions.scrolling(locator);
        System.out.println("Step 1");
        UserActions.wait_Sec();
        List<WebElement> vdoCatgoryDrpDwn = UserActions.getListOfElements(locator);
        if (vdoCatgoryDrpDwn.size()>1) {
            System.out.println("Step 1");
            UserActions.getDropDownSelectIndex(locator,2);
        }

        UserActions.getDropDownSelectIndex(VideoCampaignLocators.sortSelectVideoCamp,1);
        String searchKey = userInputProperties.getProperty("videoNameforCapmaign");
        UserActions.wait_Sec();
        if(searchKey!=null){
            //UserActions.wait_Sec();
            UserActions.searchValue(VideoCampaignLocators.searchSelectVideoCamp,VideoCampaignLocators.searchSelectVideoCampButton,searchKey);
           // UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.selectVideoRadioButton);
            UserActions.closeSearch(VideoCampaignLocators.searchClearVideoCampButton);
        } else {
            UserActions.click(VideoCampaignLocators.selectVideoRadioButton);
        }

    }

    public static void emailSelectionPagination() {
        By locator = VideoCampaignLocators.eMailTemplateNext;
        Boolean val = UserActions.isElementDisplayed(locator);
        //System.out.println("Page Nation VALUE=>"+val);
        UserActions.wait_Sec();
        if(val) {
            UserActions.click(locator);
            System.out.println("Next");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.eMailTemplatePrevious);
            System.out.println("Previous");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.eMailTemplateLast);
            System.out.println("Last");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.eMailTemplateFirst);
            System.out.println("First");
            UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(VideoCampaignLocators.eMailPaginationDrpDwn,2);
        }
    }

    public static void selectEmailTemplate() {
        UserActions.getDropDownSelectIndex(VideoCampaignLocators.sortSelecteMailTemplate,1);
        UserActions.click(VideoCampaignLocators.clickFilterButton);
        UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.applyFilter);
        UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.selectFolderFilter);
        UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(VideoCampaignLocators.filterApplyButton);
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
           // System.out.println("Step3");
            UserActions.closeSearch(VideoCampaignLocators.searchCleareMailTemplate);
        }
        UserActions.click(VideoCampaignLocators.sendTestMailButton);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        UserActions.setValue(VideoCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(VideoCampaignLocators.sendTestButton);
        UserActions.click(VideoCampaignLocators.emailSentSuccessOK);
        UserActions.click(VideoCampaignLocators.nextButton);
    }

    public static void partnerSelectionPagination() {
        By locator = VideoCampaignLocators.partnerGroupNext;
        Boolean val = UserActions.isElementDisplayed(locator);
        //System.out.println("Page Nation VALUE=>"+val);
        if(val) {
            UserActions.click(locator);
            //System.out.println("Next");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.partnerGroupPrevious);
            //System.out.println("Previous");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.partnerGroupLast);
           // System.out.println("Last");
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.partnerGroupFirst);
           // System.out.println("First");
            UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(VideoCampaignLocators.partnerPaginationDrpDwn,2);
        }
    }

    public static void selectPartnerGroup() {
        UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(VideoCampaignLocators.partnerGroupSelectionOrder,1);
        String searchKey = userInputProperties.getProperty("selectPartnerGroup");
        UserActions.wait_Sec();
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
        UserActions.setValue(VideoCampaignLocators.entereMailAddress,eMailId);
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

    public static void selectTheAppropriateModeForLaunch() {
        String launchMode = userInputProperties.getProperty("campaignLaunch");
        if(launchMode.equalsIgnoreCase("now")) {
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.launchNow);
            UserActions.click(VideoCampaignLocators.launchButton);
        } else if(launchMode.equalsIgnoreCase("schedule")) {
            UserActions.click(VideoCampaignLocators.launchShedule);
            UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(VideoCampaignLocators.sheduleCountry,3);
            //UserActions.click(VideoCampaignLocators.sheduleLaunchTime);
            UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
            //UserActions.click(VideoCampaignLocators.sheduleDate);
            UserActions.selectDate(VideoCampaignLocators.sheduleLaunchTime,VideoCampaignLocators.sheduleDate);
            UserActions.click(VideoCampaignLocators.sheduleButton);
        }else {
            UserActions.wait_Sec();
            UserActions.click(VideoCampaignLocators.launchSave);
            UserActions.click(VideoCampaignLocators.saveButton);
        }
    }
}
