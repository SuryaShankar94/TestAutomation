package stepDefinition;

import base.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.OpportunitiesPage;
import utility.UserActions;

public class OpportunitiesSD extends TestSetup
{
    @When("Verify user is able to mouserHover on Opportunities")
    public void mouserOverOnOpportunities()
    {
        OpportunitiesPage.userMouseOverOnOpportunities();
    }
    @Then("User is able to mouseHover on Manage Leads")
    public void userIsAbleToMouseHoverOnManageLeads()
    {
        OpportunitiesPage.userMouseOverOnManageLeads();
    }

    @And("Should display application manage leads page")
    public void shouldDisplayApplicationManageLeadsPage()
    {
        UserActions.wait_Sec();
        String expectedUrl = userInputProperties.getProperty("manageLeads");
        LoginPage.shouldDisplayExpectedPage(expectedUrl);
    }

    @And("User wants to click on the add lead button")
    public void userWantsToClickOnTheAddLeadButton() {
        try {
            OpportunitiesPage.clickAddLead();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select the values of company and pipeline stages")
    public void userIsAbleToSelectTheValuesOfCompanyAndPipelineStages() {
        try {
            OpportunitiesPage.selectTheValuesOfCompanyPipelineandStages();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to fill the add lead details")
    public void userIsAbleToFillTheAddLeadDetails() {
        try {
            OpportunitiesPage.fillTheAddLeadDetails();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to save lead details")
    public void userIsAbleToSaveLeadDetails() {
        try {
            OpportunitiesPage.SaveLeadButton();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("User is able to see list view to campaign view")
    public void userIsAbleToSeeListViewToCampaignView() {
        try {
            OpportunitiesPage.listViewToCampaignView();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("User is able to click the leads tile")
    public void userIsAbleToClickTheLeadsTile() {
        try {
            OpportunitiesPage.clickTheLeadsTile();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to see campaign view to list view")
    public void userIsAbleToSeeCampaignViewToListView() {
        try {
            OpportunitiesPage.campaignViewToListView();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click view lead icon")
    public void userIsAbleToClickViewLeadIcon() {
        try {
            OpportunitiesPage.clickViewLeadIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click edit lead icon")
    public void userIsAbleToClickEditLeadIcon() {
        try {
            OpportunitiesPage.clickEditLeadIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click comment lead icon")
    public void userIsAbleToClickCommentLeadIcon() {
        try {
            OpportunitiesPage.clickCommentLeadIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click delete lead icon")
    public void userIsAbleToClickDeleteLeadIcon() {
        try {
            OpportunitiesPage.clickDeleteLeadIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click manage leads pagination")
    public void userIsAbleToClickManageLeadsPagination(){
        try {
            OpportunitiesPage.manageLeadsPagination();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click page drop down")
    public void userIsAbleToClickPageDropDown() {
        try {
            OpportunitiesPage.clickPageDropDown();
            UserActions.wait_Sec();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click lead to deal register button")
    public void userIsAbleToClickLeadToDealRegisterButton() {
        try {
            OpportunitiesPage.clickLeadToDealRegisterButton();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Then("User is able to mouseHover on Manage Deals")
    public void userIsAbleToMouseHoverOnManageDeals() {
        try {
            OpportunitiesPage.clickmouseHoverOnManageDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User wants to click on the add Deal button")
    public void userWantsToClickOnTheAddDealButton() {
        try {
            OpportunitiesPage.clickAddaDealButton();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select company pipeline and stages")
    public void userIsAbleToSelectCompanyPipelineAndStages() {
        try {
            OpportunitiesPage.selectCompanyPipelineAndStages();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to add lead or contact to deal")
    public void userIsAbleToAddLeadOrContactToDeal() {
        try {
            OpportunitiesPage.addLeadOrContactToDeal();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to fill the add deal details")
    public void userIsAbleToFillTheAddDealDetails() {
        try {
            OpportunitiesPage.fillDealDetails();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to see list view to campaign view in deals")
    public void userIsAbleToSeeListViewToCampaignViewInDeals() {
        try {
            OpportunitiesPage.listViewToCampaignViewInDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click the deals tile")
    public void userIsAbleToClickTheDealsTile() {
        try {
            OpportunitiesPage.clickTheDealsTile();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to select the lost deals tile")
    public void userIsAbleToSelectTheLostDealsTile() {
        try {
            OpportunitiesPage.clickTheLostDealsTile();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to see campaign view to list view in deals")
    public void userIsAbleToSeeCampaignViewToListViewInDeals() {
        try {
            OpportunitiesPage.clickCampaignViewToListViewInDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click the total deals tile")
    public void userIsAbleToClickTheTotalDealsTile() {
        try {
            OpportunitiesPage.clickTheTotalDealsTile();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click here to email the report")
    public void userIsAbleToClickHereToEmailTheReport() {
        try {
            OpportunitiesPage.clickHereToEmailTheReport();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click view deal icon")
    public void userIsAbleToClickViewDealIcon() {
        try {
            OpportunitiesPage.clickViewDealIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click edit deal icon")
    public void userIsAbleToClickEditDealIcon() {
        try {
            OpportunitiesPage.clickEditDealIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click comment deal icon")
    public void userIsAbleToClickCommentDealIcon() {
        try {
            OpportunitiesPage.clickCommentDealIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click delete deal icon")
    public void userIsAbleToClickDeleteDealIcon() {
        try {
            OpportunitiesPage.clickDeleteDealIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User ia able to click pagination on deals")
    public void userIaAbleToClickPaginationOnDeals() {
        try {
            OpportunitiesPage.clickPaginationOnDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click edit deal stage icon")
    public void userIsAbleToClickEditDealStageIcon() {
        try {
            OpportunitiesPage.editDealStageIcon();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform pagination action on campaigns")
    public void userIsAbleToPerformPaginationActionOnCampaigns() {
        try {
            OpportunitiesPage.performPaginationActionOnCampaigns();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click view Lead for this campaign")
    public void userIsAbleToClickViewLeadForThisCampaign() {
        try {
            OpportunitiesPage.clickViewLeadForThisCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to preview the campaign leads")
    public void userIsAbleToPreviewTheCampaignLeads() {
        try {
            OpportunitiesPage.previewTheCampaignLeads();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to comment the campaign leads")
    public void userIsAbleToCommentTheCampaignLeads() {
        try {
            OpportunitiesPage.commentTheCampaignLeads();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to edit the campaign leads")
    public void userIsAbleToEditTheCampaignLeads() {
        try {
            OpportunitiesPage.editTheCampaignLeads();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to delete the campaign leads")
    public void userIsAbleToDeleteTheCampaignLeads() {
        try {
            OpportunitiesPage.deleteTheCampaignLeads();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to click view deal for this campaign")
    public void userIsAbleToClickViewDealForThisCampaign() {
        try {
            OpportunitiesPage.viewDealForThisCampaign();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to view the campaign deals")
    public void userIsAbleToViewTheCampaignDeals() {
        try {
            OpportunitiesPage.viewTheCampaignDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to comment the campaign Deals")
    public void userIsAbleToCommentTheCampaignDeals() {
        try {
            OpportunitiesPage.commentTheCampaignDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to edit the campaign Deals")
    public void userIsAbleToEditTheCampaignDeals() {
        try {
            OpportunitiesPage.editTheCampaignDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to delete the campaign Deals")
    public void userIsAbleToDeleteTheCampaignDeals() {
        try {
            OpportunitiesPage.deleteTheCampaignDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to change the deal stage in campaign View")
    public void userIsAbleToChangeTheDealStageInCampaignView() {
        try {
            OpportunitiesPage.changeTheDealStageInCampaignView();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to perform pagination on campaign deals")
    public void userIsAbleToPerformPaginationOnCampaignDeals() {
        try {
            OpportunitiesPage.performPaginationOnCampaignDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to filter deals")
    public void userIsAbleToFilterDeals() {
        try {
            OpportunitiesPage.filterDeals();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @And("User is able to apply filter on leads")
    public void userIsAbleToApplyFilterOnLeads() {
        try {
            OpportunitiesPage.applyFilterOnLeads();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
