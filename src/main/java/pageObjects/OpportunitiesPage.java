package pageObjects;


import base.OpportunitiesLocators;
import base.TestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.UserActions;

import java.util.List;

public class OpportunitiesPage extends TestSetup{

    public static void userMouseOverOnOpportunities()
    {
        UserActions.getMouserOverElement(OpportunitiesLocators.opportunities);
    }

    public static void userMouseOverOnManageLeads()
    {
        UserActions.getMouserOverElement(OpportunitiesLocators.opportunitiesManageLeads);
        UserActions.click(OpportunitiesLocators.opportunitiesManageLeads);
    }

    public static void clickAddLead()
    {
        UserActions.click(OpportunitiesLocators.addLeadButton);
    }

    public static void selectTheValuesOfCompanyPipelineandStages() {
        By locator = OpportunitiesLocators.leadForCompany;
        List<WebElement>  elementList = UserActions.getListOfElements(locator);
        int index = 1;
        for (WebElement element :elementList) {
            if(!elementList.isEmpty()){
                index++;
                String val1 = element.getText();
                String val2 = userInputProperties.getProperty("companyName");
                if(val2.equalsIgnoreCase(val1)){
                    break;
                }
            }
        }
        UserActions.getDropDownSelectIndex(locator,index);
        UserActions.getDropDownSelectIndex(OpportunitiesLocators.pipelineId,2);
        UserActions.getDropDownSelectIndex(OpportunitiesLocators.pipelineStageId,2);
        UserActions.setValue(OpportunitiesLocators.addleadCommentId,"Added few points regarding to add lead");
    }

    public static void fillTheAddLeadDetails() {
        UserActions.setValue(OpportunitiesLocators.lastNameId,"_"+System.currentTimeMillis());
        UserActions.setValue(OpportunitiesLocators.companyId,"ISRO");
        UserActions.setValue(OpportunitiesLocators.emailId,"nitya.bns@gmail.com");
        UserActions.setValue(OpportunitiesLocators.phoneNumberId,"98806363636");
    }

    public static void SaveLeadButton() {
        UserActions.click(OpportunitiesLocators.saveLead);
    }

    public static void listViewToCampaignView() {
        UserActions.click(OpportunitiesLocators.campaignView);
    }

    public static void clickTheWonLeadsTile() {
        UserActions.click(OpportunitiesLocators.wonLeads);
    }

    public static void campaignViewToListView() {
        UserActions.click(OpportunitiesLocators.listView);
    }

    public static void clickViewLeadIcon() {
        UserActions.click(OpportunitiesLocators.leadView);
//        By locator = OpportunitiesLocators.leadViewComments;
//        UserActions.waitForElementVisible(locator);
//        //UserActions.scrolling(locator);
//        UserActions.wait_Sec();
//        //UserActions.click(locator);
//        UserActions.setValue(locator,"Comment-4444");
//        locator = OpportunitiesLocators.leadViewCommentsSubmit;
//        UserActions.click(locator);
//        locator=OpportunitiesLocators.leadViewCloseButton;

        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.leadViewCloseButton);
    }

    public static void clickEditLeadIcon() {
        UserActions.click(OpportunitiesLocators.leadEdit); //if you want to change the index of the corresponding lead, change in locators file
        //System.out.println("STEP1");
        By locator = OpportunitiesLocators.leadCommentTxtArea;
        //UserActions.wait_Sec();
        UserActions.waitForElementVisible(locator);
        UserActions.setValue(locator,"Comment-1234");

        locator = OpportunitiesLocators.cityId;
        UserActions.waitForElementVisible(locator);
        //System.out.println("STEP2");
        //UserActions.scrolling(locator);
        UserActions.wait_Sec();
        UserActions.setValue(locator,"Amritsar");
        UserActions.setValue(OpportunitiesLocators.stateId,"Punjob");
        UserActions.click(OpportunitiesLocators.leadUpdate);
    }

    public static void clickCommentLeadIcon() {
        UserActions.click(OpportunitiesLocators.leadComments);
        By locator = OpportunitiesLocators.leadCommentTxtArea;
        UserActions.waitForElementVisible(locator);
        UserActions.setValue(locator,"Raise a request to change stage");
        UserActions.click(OpportunitiesLocators.leadCommentSubmit);
        UserActions.click(OpportunitiesLocators.leadCommentWindowClose);
    }

    public static void clickDeleteLeadIcon() {
        UserActions.wait_Sec();
        String delKey = userInputProperties.getProperty("delLead");
        if(delKey.isEmpty()) {
            UserActions.click(OpportunitiesLocators.leadDelete);
            UserActions.wait_Sec();
            UserActions.click((OpportunitiesLocators.leadDeleteReject));
            System.out.println("Delete cancel");
        } else {
            UserActions.searchLeadOrDeal(OpportunitiesLocators.searchLead,OpportunitiesLocators.searchLeadButton,delKey);
            UserActions.click(OpportunitiesLocators.leadDelete);
            UserActions.wait_Sec();
            UserActions.click(OpportunitiesLocators.leadDeleteApprove);
            UserActions.click(OpportunitiesLocators.searchCancel);
        }
    }

    public static void manageLeadsPagination() {
        UserActions.scrolling(OpportunitiesLocators.leadReacordCnt);
        By locator = OpportunitiesLocators.leadNextPage;
        Boolean val = UserActions.isElementDisplayed(locator);
        //System.out.println("VALUE=>"+val);
        if(val) {
            UserActions.waitForElementVisible(locator);
            UserActions.click(locator);
            System.out.println("Next");
            locator = OpportunitiesLocators.leadPreviousPage;
            UserActions.waitForElementVisible(locator);
            UserActions.click(locator);
            System.out.println("Previous");
            locator = OpportunitiesLocators.leadLastPage;
            UserActions.waitForElementVisible(locator);
            UserActions.click(locator);
            System.out.println("Last");
            UserActions.waitForElementVisible(locator);
            locator = OpportunitiesLocators.leadFirstPage;
            //UserActions.wait_Sec();
            UserActions.waitForElementVisible(locator);
            UserActions.click(locator);
            System.out.println("First");
        }
    }

    public static void clickPageDropDown() {
        By locator = OpportunitiesLocators.leadPageCntDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(locator,2);
        UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(locator,1);
    }

    public static void clickLeadToDealRegisterButton() {
        UserActions.wait_Sec();
        By locator = OpportunitiesLocators.registerDeal;
        UserActions.waitForElementVisible(locator);
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();UserActions.wait_Sec();
        //UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.click(locator);
        System.out.println("Step 2");
        locator = OpportunitiesLocators.dealPipeline;
        UserActions.waitForElementVisible(locator);
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();UserActions.wait_Sec();
        UserActions.wait_Sec();UserActions.wait_Sec();
        //UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(locator,2);
        UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealPipeLineStage,2);
        UserActions.setValue(OpportunitiesLocators.dealComment,"Lead to Deal Convertion");
        UserActions.setValue(OpportunitiesLocators.dealName,""+System.currentTimeMillis());
        UserActions.setValue(OpportunitiesLocators.dealAmount,"20000");
        By closeDate = OpportunitiesLocators.selectCloseDate;
        By dealCloseDate = OpportunitiesLocators.dealCloseDate;
        UserActions.selectDate(closeDate,dealCloseDate);
        UserActions.click(OpportunitiesLocators.saveDeal);
    }

    public static void clickmouseHoverOnManageDeals() {
        UserActions.getMouserOverElement(OpportunitiesLocators.opportunitiesManageDeals);
        UserActions.click(OpportunitiesLocators.opportunitiesManageDeals);
    }

    public static void clickAddaDealButton() {
        UserActions.click(OpportunitiesLocators.addDealButton);
    }

    public static void selectCompanyPipelineAndStages() {
        By locator = OpportunitiesLocators.dealCompany;
        List<WebElement>  elementList = UserActions.getListOfElements(locator);
        int index = 1;
        for (WebElement element :elementList) {
            if(!elementList.isEmpty()){
                index++;
                String val1 = element.getText();
                String val2 = userInputProperties.getProperty("companyName");
                System.out.println("VAL1 => "+val1+" ,VAL2=> "+val2+" INDEX=>"+index);
                if(val2.equalsIgnoreCase(val1)){
                    index++;
                    break;
                }
            }
        }
        System.out.println("INDEX=>"+index);
       UserActions.getDropDownSelectIndex(locator,index);
       locator = OpportunitiesLocators.dealPipeline;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.wait_Sec();
        UserActions.wait_Sec();
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.wait_Sec();
       UserActions.getDropDownSelectIndex(locator,2);
        UserActions.wait_Sec();
       UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealPipeLineStage,2);
       UserActions.setValue(OpportunitiesLocators.dealComment,"Added few points regarding to add deal");


    }

    public static void addLeadOrContactToDeal() {
        By locator = OpportunitiesLocators.dealAttachdrpDwn;
        System.out.println("Step 0");
        UserActions.click(locator);
        System.out.println("Step 1");
        boolean val = true; // true indicates Attach a Lead and false indicates Attach a contact
        if(val){
            System.out.println("Step 2");
            UserActions.click(OpportunitiesLocators.attachLead);
            locator = OpportunitiesLocators.dealAttachaLead;
            UserActions.waitForElementVisible(locator);
            List<WebElement>  elementList = UserActions.getListOfElements(locator);
            if(!elementList.isEmpty()) {
                elementList.get(3).click();
                locator = OpportunitiesLocators.attachSelectedLeadButton;
                UserActions.waitForElementVisible(locator);
                UserActions.click(locator);
            } else {
                UserActions.click(OpportunitiesLocators.closeAttachContactWindow);
            }

        } else {
            UserActions.click(OpportunitiesLocators.attachContact);
            locator = OpportunitiesLocators.dealAttachaContact;
            UserActions.waitForElementVisible(locator);
            List<WebElement>  elementList = UserActions.getListOfElements(locator);
            if(!elementList.isEmpty()) {
                elementList.get(3).click();
                locator = OpportunitiesLocators.attachSelectedContactButton;
                UserActions.waitForElementVisible(locator);
                UserActions.click(locator);
            } else {
                UserActions.click(OpportunitiesLocators.closeAttachContactWindow);
            }
        }
    }

    public static void fillDealDetails() {
        UserActions.wait_Sec();
        UserActions.setValue(OpportunitiesLocators.dealName,""+System.currentTimeMillis());
        UserActions.setValue(OpportunitiesLocators.dealAmount,"20000");
        By closeDate = OpportunitiesLocators.selectCloseDate;
        By dealCloseDate = OpportunitiesLocators.dealCloseDate;
        UserActions.selectDate(closeDate,dealCloseDate);
        UserActions.click(OpportunitiesLocators.saveDeal);
    }

    public static void listViewToCampaignViewInDeals() {
        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.dealCampaignView);
    }

    public static void clickTheWonDealsTile() {
        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.wonDeals);
    }

    public static void clickTheLostDealsTile() {
        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.lostDeals);
    }

    public static void clickTheTotalDealsTile() {
        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.totalDeals);
    }

    public static void clickCampaignViewToListViewInDeals() {
        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.dealListView);
    }

    public static void clickHereToEmailTheReport() {
        UserActions.wait_Sec();
        UserActions.click(OpportunitiesLocators.clickHeretoEmailReport);
    }

    public static void clickViewDealIcon() {
        //UserActions.wait_Sec();
        String searchValue = userInputProperties.getProperty("dealSearchKey");
        UserActions.searchLeadOrDeal(OpportunitiesLocators.searchDeals,OpportunitiesLocators.clickSearchDealIcon, searchValue);
        By locator = OpportunitiesLocators.viewDeal;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.click(locator);
        locator =OpportunitiesLocators.closeViewDeal;
        //UserActions.scrolling(locator);
        UserActions.wait_Sec();
        UserActions.click(locator);
        UserActions.closeSearch(OpportunitiesLocators.clickCloseSearchDealIcon);
    }

    public static void clickEditDealIcon() {
        //UserActions.wait_Sec();
        String searchValue = userInputProperties.getProperty("dealSearchKey");
        UserActions.searchLeadOrDeal(OpportunitiesLocators.searchDeals,OpportunitiesLocators.clickSearchDealIcon, searchValue);
        By locator = OpportunitiesLocators.editDeal;
        UserActions.waitForElementVisible(locator);
        UserActions.click(locator);
        UserActions.wait_Sec();
        locator = OpportunitiesLocators.dealComment;
        UserActions.waitForElementVisible(locator);
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.wait_Sec();
        UserActions.wait_Sec();
        UserActions.setValue(locator,"Deal Edited");
        UserActions.click(OpportunitiesLocators.saveDeal);
        UserActions.closeSearch(OpportunitiesLocators.clickCloseSearchDealIcon);
    }

    public static void clickCommentDealIcon() {
        UserActions.wait_Sec();
        String searchValue = userInputProperties.getProperty("dealSearchKey");
        UserActions.searchLeadOrDeal(OpportunitiesLocators.searchDeals,OpportunitiesLocators.clickSearchDealIcon, searchValue);
        By locator = OpportunitiesLocators.commentDeal;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.click(locator);
        UserActions.wait_Sec();
        UserActions.setValue(OpportunitiesLocators.commentHistoryDeal,"Comment History Deal");
        locator =OpportunitiesLocators.dealCloseCommentWindow;
        UserActions.closeSearch(OpportunitiesLocators.clickCloseSearchDealIcon);
    }

    public static void clickDeleteDealIcon() {
        UserActions.wait_Sec();
        String searchValue = userInputProperties.getProperty("dealSearchKey");
        UserActions.searchLeadOrDeal(OpportunitiesLocators.searchDeals,OpportunitiesLocators.clickSearchDealIcon, searchValue);
        By locator = OpportunitiesLocators.deleteDeal;
        UserActions.waitForElementVisible(locator);

        UserActions.click(locator);
        //UserActions.click(OpportunitiesLocators.acceptDeleteDeal);
                            //or
        UserActions.click((OpportunitiesLocators.cancelDeleteDeal));
        locator =OpportunitiesLocators.closeViewDeal;
        UserActions.closeSearch(OpportunitiesLocators.clickCloseSearchDealIcon);
    }

    public static void clickPaginationOnDeals() {
        By locator = OpportunitiesLocators.dealRecordPageCnt;
        UserActions.waitForElementVisible(locator);
        UserActions.scrolling(locator);
        locator = OpportunitiesLocators.dealNextPg;
        Boolean val = UserActions.isElementDisplayed(locator);
        System.out.println("VALUE=>"+val);
        if(val) {
            UserActions.click(locator);
            System.out.println("Next");
            UserActions.wait_Sec();
            UserActions.click(OpportunitiesLocators.dealPreviousPg);
            System.out.println("Previous");
            UserActions.wait_Sec();
            UserActions.click(OpportunitiesLocators.dealLastPg);
            System.out.println("Last");
            UserActions.wait_Sec();
            UserActions.click(OpportunitiesLocators.dealFirstPg);
            System.out.println("First");
        }
    }

    public static void selectPaginationDropDownValueInDealPage() {
        By locator = OpportunitiesLocators.leadPageCntDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(locator,2);
    }
}
