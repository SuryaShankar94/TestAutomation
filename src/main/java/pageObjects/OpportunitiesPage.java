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
        UserActions.getDropDownSelectIndex(OpportunitiesLocators.leadForCompany,2);
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
        By locator = OpportunitiesLocators.leadViewComments;
        UserActions.waitForElementVisible(locator);
        UserActions.scrolling(locator);
        UserActions.click(locator);
        UserActions.setValue(locator,"Comment-3");
        locator = OpportunitiesLocators.leadViewCommentsSubmit;
        UserActions.click(locator);
        UserActions.click(OpportunitiesLocators.leadViewCloseButton);
    }

    public static void clickEditLeadIcon() {
        UserActions.click(OpportunitiesLocators.leadEdit); //if you want to change the index of the corresponding lead, change in locators file
        //System.out.println("STEP1");
        By locator = OpportunitiesLocators.cityId;
        UserActions.waitForElementVisible(locator);
        //System.out.println("STEP2");
        UserActions.scrolling(locator);
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
        UserActions.click(OpportunitiesLocators.leadDelete);
        //UserActions.wait_Sec();
        //UserActions.click(OpportunitiesLocators.leadDeleteApprove);
        UserActions.click((OpportunitiesLocators.leadDeleteReject));
    }

    public static void pageNavigations() {
        UserActions.scrolling(OpportunitiesLocators.leadReacordCnt);
        By locator = OpportunitiesLocators.leadNextPage;
        Boolean val = UserActions.isElementDisplayed(locator);
        System.out.println("VALUE=>"+val);
        if(true) {
            UserActions.click(locator);
            System.out.println("NEst");
            UserActions.click(OpportunitiesLocators.leadPreviousPage);
            System.out.println("Previous");
            //UserActions.click(locator);
            UserActions.click(OpportunitiesLocators.leadLastPage);
            System.out.println("Last");
           // UserActions.click(locator);
            UserActions.click(OpportunitiesLocators.leadFirstPage);
            System.out.println("First");
        }
    }

    public static void clickPageDropDown() {
        By locator = OpportunitiesLocators.leadPageCntDrpDwn;
        UserActions.waitForElementVisible(locator);
        UserActions.getDropDownSelectIndex(locator,2);
    }

    public static void clickLeadToDealRegisterButton() {
        UserActions.click(OpportunitiesLocators.registerDeal);
        By locator = OpportunitiesLocators.dealPipeline;
       // UserActions.wait_Sec();
        UserActions.waitForElementVisible(locator);
        UserActions.wait_Sec();
        UserActions.wait_Sec();
        UserActions.wait_Sec();
        UserActions.getDropDownSelectIndex(locator,1);
        UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealPipeLineStage,2);
        UserActions.setValue(OpportunitiesLocators.dealComment,"Lead to Deal Convertion");
        UserActions.setValue(OpportunitiesLocators.dealName,""+System.currentTimeMillis());
        UserActions.setValue(OpportunitiesLocators.dealAmount,"20000");
        createDealRegistration();
        //UserActions.setValue(OpportunitiesLocators.dealCloseDate,);
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
       UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealCompany,2);
       By locator = OpportunitiesLocators.dealPipeline;
       UserActions.waitForElementVisible(locator);
       UserActions.getDropDownSelectIndex(locator,2);
       UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealPipeLineStage,2);
       UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealAttachaContact,2);
       //UserActions.getDropDownSelectIndex(OpportunitiesLocators.dealAttachLead,1);
       UserActions.setValue(OpportunitiesLocators.dealComment,"Added few points regarding to add deal");
    }

    public static void fillDealDetails() {

    }
    public static void createDealRegistration() {
        UserActions.click(OpportunitiesLocators.selectCloseDate);
        List<WebElement> getCloseDates = UserActions.getListOfElements(OpportunitiesLocators.dealCloseDate);
            if(!getCloseDates.isEmpty()) {
               // System.out.println("CLOSE DATEEEEE---->"+getCloseDates.get(1));
                getCloseDates.get(1).click();
                //UserActions.waitForElementVisible(locator);
        }
    }
}
