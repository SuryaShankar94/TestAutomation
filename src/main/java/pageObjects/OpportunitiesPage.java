package pageObjects;


import base.TestSetup;
import org.openqa.selenium.By;
import utility.UserActions;

public class OpportunitiesPage extends TestSetup {

    public static void userMouseOverOnOpportunities()
    {
        UserActions.getMouserOverElement(By.xpath(OpportunitiesProperties.getProperty("opportunitiesXpath")));

    }

    public static void userMouseOverOnManageLeads()
    {
       // UserActions.getMouserOverElement(By.xpath(OpportunitiesProperties.getProperty("opportunitiesXpath")));
        UserActions.getMouserOverElement(By.xpath(OpportunitiesProperties.getProperty("opportunitiesManageLeadsXpath")));
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("opportunitiesManageLeadsXpath")));
    }

    public static void clickAddLead()
    {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("addLeadButtonXpath")));
    }

    public static void selectTheValuesOfCompanyPipelineandStages() {
        UserActions.getDropDownSelectValue(By.xpath(OpportunitiesProperties.getProperty("leadForCompanyXpath")),2);
        UserActions.getDropDownSelectValue(By.id(OpportunitiesProperties.getProperty("pipelineId")),2);
        UserActions.getDropDownSelectValue(By.id(OpportunitiesProperties.getProperty("PipelineStageId")),2);
        UserActions.setValue(By.id(OpportunitiesProperties.getProperty("addleadCommentId")),"Added few points regarding to add lead");
    }

    public static void fillTheAddLeadDetails() {
        //UserActions.scrolling(By.xpath(OpportunitiesProperties.getProperty("stateId")));
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("firstNameId")),"");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("lastNameId")),"_"+System.currentTimeMillis());
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("companyId")),"ISRO");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("emailId")),"nitya.bns@gmail.com");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("phoneNumberId")),"9880767889");
        UserActions.scrolling(By.xpath(OpportunitiesProperties.getProperty("regionID")));
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("countryId")),"INDIA");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("jobTitleId")),"Manager");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("amountId")),"25000");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("industryId")),"Retail");
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("regionID")),"ASIA");

    }

    public static void SaveLeadButton() {
        UserActions.click(By.id(OpportunitiesProperties.getProperty("saveLeadId")));
    }

    public static void listViewToCampaignView() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("campaignViewXpath")));
    }

    public static void clickTheWonLeadsTile() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("wonLeadsXpath")));
    }

    public static void campaignViewToListView() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("listViewXpath")));
    }

    public static void clickViewLeadIcon() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadViewXpath")));
       /* UserActions.scrolling(By.xpath(OpportunitiesProperties.getProperty("leadViewCommentsXpath")));
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("leadViewCommentsXpath")),"Add Comments to change stage111");
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadViewCommentsSubmitXpath")));
       */ UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadViewCloseButtonXpath")));
    }

    public static void clickEditLeadIcon() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadEditXpath")));
        UserActions.wait_Sec();
        UserActions.scrolling(By.xpath(OpportunitiesProperties.getProperty("cityIdXpath")));
        UserActions.wait_Sec();
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("cityIdXpath")),"Hyderabad");
        //UserActions.wait_Sec();
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("stateIdXpath")),"Telangana");
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadUpdateXpath")));
    }

    public static void clickCommentLeadIcon() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadCommentsXpath")));
        UserActions.setValue(By.xpath(OpportunitiesProperties.getProperty("leadCommentTxtAreaXpath")),"Raise a request to change stage");
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadCommentSubmitXpath")));
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadCommentWindowCloseXpath")));
    }

    public static void clickDeleteLeadIcon() {
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadDeletexpath")));
        UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadDeleteApproveXpath"))); //alternatively uncomment below one
        //UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadDeleteRejectXpath")));
    }

    public static void pageNavigations() {
        UserActions.scrolling(By.xpath(OpportunitiesProperties.getProperty("leadReacordCntXpath")));
        Boolean value=UserActions.isElementDisplayed(By.xpath(OpportunitiesProperties.getProperty("leadNextPageXpath")));
        if(true){
            UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadNextPageXpath")));
            UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadPreviousPageXpath")));
            UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadLastPageXpath")));
            UserActions.click(By.xpath(OpportunitiesProperties.getProperty("leadFirstPageXpath")));
        }
    }

    public static void clickPageDropDown() {
        UserActions.getDropDownSelectValue(By.xpath(OpportunitiesProperties.getProperty("leadPageCntDrpDwnXpath")),2);
    }
}
