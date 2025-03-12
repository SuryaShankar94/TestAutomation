package pageObjects;

import base.EmailtoCampaignLocators;
import base.TestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utility.UserActions;

public class EmailToCampaignPage extends TestSetup{

    public static void mouseHoverOnCampaign() {
        UserActions.getMouserOverElement(EmailtoCampaignLocators.campaign);
    }

    public static void clickCreatingCampaign() {
        UserActions.click(EmailtoCampaignLocators.createCampaign);
    }

    public static void createEmailCampaign() {
        UserActions.click(EmailtoCampaignLocators.emailCampaign);
    }

    public static void entereMailtoCampaignDetails() {
        UserActions.setValue(EmailtoCampaignLocators.campaignName,"eMail"+System.currentTimeMillis());
        UserActions.setValue(EmailtoCampaignLocators.description,"eMail To Campaign Description");
       // UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(EmailtoCampaignLocators.folderSelection,1);
        UserActions.click(EmailtoCampaignLocators.insertMergeTags);
        UserActions.click(EmailtoCampaignLocators.mergeTagName);
        UserActions.getDropDownSelectIndex(EmailtoCampaignLocators.fromeMail,1);
        UserActions.setValue(EmailtoCampaignLocators.preHeader,"eMail ToCampaign Header");
        UserActions.click(EmailtoCampaignLocators.notifyEmailOpend);
        UserActions.click(EmailtoCampaignLocators.notifyLinkOpned);
        UserActions.click(EmailtoCampaignLocators.viewinBrowser);
        UserActions.click(EmailtoCampaignLocators.unsubscribeLink);
    }

    public static void performPaginationOnEmailTemplate() {
        By locator = EmailtoCampaignLocators.eMailTemplateNext;
        Boolean val = UserActions.isElementDisplayed(locator);
        System.out.println("VALUE==>"+val);
        if(val) {
            UserActions.click(locator);
            System.out.println("Next");
            UserActions.wait_Sec();
            locator = EmailtoCampaignLocators.eMailTemplatePrevious;
            UserActions.waitForElementVisible(locator);
            UserActions.click(locator);
            System.out.println("Previous");
            UserActions.wait_Sec();
            locator = EmailtoCampaignLocators.eMailTemplateLast;
            UserActions.click(locator);
            System.out.println("Last");
            UserActions.wait_Sec();
            locator = EmailtoCampaignLocators.eMailTemplateFirst;
            UserActions.click(locator);
            System.out.println("First");
            UserActions.wait_Sec();UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(EmailtoCampaignLocators.eMailPaginationDrpDwn,2);
            UserActions.wait_Sec();UserActions.wait_Sec();
        }
    }

    public static void selectAnEmailTemplate() {
        UserActions.performSorting(EmailtoCampaignLocators.sortEmailTemplate);
        String folderName = "automatedvendor-Default-Folder";
        UserActions.performFilterAction(EmailtoCampaignLocators.filterButton,EmailtoCampaignLocators.clickFolderFilter,EmailtoCampaignLocators.applyFilter,EmailtoCampaignLocators.closeFilter,folderName);
        UserActions.wait_Sec();
        String searchKey = userInputProperties.getProperty("emailTemplateforCamp");
        //System.out.println("eMail Template Search KEY==>"+searchKey);
        if (searchKey.isEmpty()){
            UserActions.click(EmailtoCampaignLocators.selecteMailTemplate);
        } else {
            // System.out.println("Step1");
            //UserActions.wait_Sec();
            UserActions.searchValue(EmailtoCampaignLocators.searchBox,EmailtoCampaignLocators.searchIcon,searchKey);
            // System.out.println("Step2");
            By locator = EmailtoCampaignLocators.selecteMailTemplate;
            UserActions.waitForElementVisible(locator);
            UserActions.wait_Sec();
            UserActions.click(locator);
            System.out.println("Template Selected");
            locator = EmailtoCampaignLocators.editTemplate;
            UserActions.waitForElementVisible(locator);
            UserActions.wait_Sec();//UserActions.wait_Sec();
            UserActions.click(locator);
            System.out.println("Template Edited");
            UserActions.wait_Sec();//UserActions.wait_Sec();
            By frameId = By.id("xamplify-bee-template-container__bee-plugin-frame");
            UserActions.handlingeMailTemplateiFrame(frameId,EmailtoCampaignLocators.saveTemplate,EmailtoCampaignLocators.closeTemplate);
            UserActions.closeSearch(EmailtoCampaignLocators.searchClearButton);
        }
        UserActions.click(EmailtoCampaignLocators.sendTesteMailButton);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        UserActions.setValue(EmailtoCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(EmailtoCampaignLocators.sendTestButton);
        UserActions.click(EmailtoCampaignLocators.emailSentSuccessOK);
        UserActions.click(EmailtoCampaignLocators.nextButton);
    }

    public static void performPaginationOnPartnerSelection() {
        By locator = EmailtoCampaignLocators.partnerGroupNext;
        Boolean val = UserActions.isElementDisplayed(locator);
        //System.out.println("Page Nation VALUE=>"+val);
        if(UserActions.isClicked(locator)) {
           // UserActions.click(locator);
            System.out.println("Next");
            UserActions.wait_Sec();
            UserActions.click(EmailtoCampaignLocators.partnerGroupPrevious);
            System.out.println("Previous");
            UserActions.wait_Sec();
            UserActions.click(EmailtoCampaignLocators.partnerGroupLast);
            System.out.println("Last");
            UserActions.wait_Sec();
            UserActions.click(EmailtoCampaignLocators.partnerGroupFirst);
            System.out.println("First");
            UserActions.wait_Sec();
            UserActions.getDropDownSelectIndex(EmailtoCampaignLocators.partnerPaginationDrpDwn,2);
            UserActions.wait_Sec(); UserActions.wait_Sec();
        }
    }

    public static void selectPartnerGroupToBeUsedInThisCampaign() {
        By locator = EmailtoCampaignLocators.partnerGroupSelectionOrder;
        UserActions.waitForElementVisible(locator);
        UserActions.performSorting(locator);
        String searchKey = userInputProperties.getProperty("selectPartnerGroup");
        UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        if(searchKey!=null){
            UserActions.wait_Sec();
            UserActions.searchValue(EmailtoCampaignLocators.searchPartnerGroup,EmailtoCampaignLocators.searchPartnerGroupButton,searchKey);
            UserActions.click(EmailtoCampaignLocators.selectPartnerCheckBox);
       //     System.out.println("Search KEY at partner Module==>"+searchKey);
//            UserActions.wait_Sec();UserActions.wait_Sec();
//            UserActions.click(EmailtoCampaignLocators.selctpartnerGroupPreview);
//            UserActions.wait_Sec();UserActions.wait_Sec();
//            UserActions.click(EmailtoCampaignLocators.closePartnerPreview);
//            UserActions.wait_Sec();UserActions.wait_Sec();
//            UserActions.closeSearch(EmailtoCampaignLocators.cancelSearchPartnerGroup);
        } else {
            UserActions.click(EmailtoCampaignLocators.selectPartnerCheckBox);
        }

        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.waitForElementVisible(EmailtoCampaignLocators.selctpartnerGroupPreview);
        UserActions.click(EmailtoCampaignLocators.selctpartnerGroupPreview);
        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(EmailtoCampaignLocators.closePartnerPreview);
        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.closeSearch(EmailtoCampaignLocators.cancelSearchPartnerGroup);
    }

    public static void sendATestMailBeforeLaunchCampaign() {
        UserActions.click(EmailtoCampaignLocators.previousButton);
        UserActions.wait_Sec();
        UserActions.click(EmailtoCampaignLocators.nextButton);
        UserActions.click(EmailtoCampaignLocators.sendTestMail);
        String eMailId = userInputProperties.getProperty("mailIDforVideoCamp");
        if(eMailId.isEmpty()){
            eMailId = "nitya.bns@gmail.com";
        }
        //UserActions.setValue(EmailtoCampaignLocators.entereMailAddress,eMailId);
        UserActions.enterValueInTextBox(EmailtoCampaignLocators.entereMailAddress,eMailId);
        UserActions.click(EmailtoCampaignLocators.sendTestButton);
        UserActions.click(EmailtoCampaignLocators.emailSentSuccessOK);
    }
    
    public static void performSpamCheckOperation() {
        UserActions.click(EmailtoCampaignLocators.spamCheck);
        UserActions.click(EmailtoCampaignLocators.refresh);
        UserActions.wait_Sec();
        UserActions.click(EmailtoCampaignLocators.innerSpamCheck);
        UserActions.wait_Sec();
        UserActions.click(EmailtoCampaignLocators.closeSpamCheck);
    }
    
    public static void launchEmailCampaignNow() {
        UserActions.click(EmailtoCampaignLocators.launchNow);
        UserActions.click(EmailtoCampaignLocators.launchButton);
        UserActions.wait_Sec();
    }

    public static void saveEmailCampaign() {
        UserActions.click(EmailtoCampaignLocators.launchSave);
        UserActions.click(EmailtoCampaignLocators.saveButton);
    }

    public static void scheduleEmailCampaign() {
        UserActions.click(EmailtoCampaignLocators.launchShedule);
        //UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(EmailtoCampaignLocators.scheduleCountry,3);
        //UserActions.click(EmailtoCampaignLocators.scheduleLaunchTime);
        //UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();UserActions.wait_Sec();
//        UserActions.scheduleDate(VideoCampaignLocators.scheduleLaunchTime,VideoCampaignLocators.scheduleToday,VideoCampaignLocators.scheduleHours,VideoCampaignLocators.scheduleMins,VideoCampaignLocators.scheduleButton);
        UserActions.scheduleDate(EmailtoCampaignLocators.scheduleLaunchTime,EmailtoCampaignLocators.scheduleDate,EmailtoCampaignLocators.scheduleHours,EmailtoCampaignLocators.scheduleMins,EmailtoCampaignLocators.scheduleButton);
       // UserActions.click(EmailtoCampaignLocators.scheduleDate);
      //  System.out.println("VALUE 1");
        // UserActions.selectDate(EmailtoCampaignLocators.sheduleLaunchTime,EmailtoCampaignLocators.sheduleDate);
        //UserActions.sheduleDate(EmailtoCampaignLocators.sheduleLaunchTime,EmailtoCampaignLocators.sheduleDate,EmailtoCampaignLocators.sheduleTime);
    //    UserActions.click(EmailtoCampaignLocators.scheduleButton);
    }
}
